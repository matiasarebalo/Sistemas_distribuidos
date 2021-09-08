package dao;

import domain.TipoMedicamento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.NoSuchElementException;




public class TipoMedicamentoDao {
    public TipoMedicamento findById(int id) {

        // We use entity managers to manage our two entities.
        // We use the factory design pattern to get the entity manager.
        // Here we should provide the name of the persistence unit that we provided in the persistence.xml file.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();


        TipoMedicamento tipoMedicamento = em.find(TipoMedicamento.class, id);

        // If there is no record found with the provided student id, then we throw a NoSuchElement exception.
        if(tipoMedicamento == null){
            throw new NoSuchElementException("NO DATA FOUND WITH THE ID "+id);
        }

        // If everything worked fine, return the result.
        return tipoMedicamento;
    }

    public TipoMedicamento guardarTipo(String nombre, boolean activo){

        // We use entity managers to manage our two entities.
        // We use the factory design pattern to get the entity manager.
        // Here we should provide the name of the persistence unit that we provided in the persistence.xml file.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();

        String tipomedicamento = "TipoMedicamento";
        String e = "id";
        Query query = em.createQuery("Select " + e + " from " + tipomedicamento + " order by " + e + " desc");
        List<Integer> list = (List<Integer>) query.setMaxResults(1).getResultList();

        int ultimoId = 0;

        if(list != null){

            // OBTENER EL ÚLTIMO ID DE LA BD
            for( Integer i:list )
            {
                ultimoId = i + 1;
            }

        }

        TipoMedicamento tipo = new TipoMedicamento(ultimoId, nombre, activo);

        try {
            em.getTransaction().begin();
            em.persist(tipo);
            em.getTransaction().commit();
        } catch (Exception excepcion) {

            excepcion.printStackTrace();
        }finally {
            em.close();
        }


        // If everything worked fine, return the result.
        return tipo;
    }



    public int bajaTipo(int id){

        // We use entity managers to manage our two entities.
        // We use the factory design pattern to get the entity manager.
        // Here we should provide the name of the persistence unit that we provided in the persistence.xml file.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();


        TipoMedicamento tipo = this.findById(id);
        tipo.setActivo(false);

        try {
            em.getTransaction().begin();
            em.merge(tipo);
            em.getTransaction().commit();
        } catch (Exception e) {

            e.printStackTrace();
        }finally {
            em.close();
        }


        // If everything worked fine, return the result.
        return 1;
    }


}