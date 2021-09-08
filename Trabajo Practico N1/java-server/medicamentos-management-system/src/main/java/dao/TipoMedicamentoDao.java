package dao;

import domain.Medicamento;
import domain.TipoMedicamento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TipoMedicamentoDao {
    public TipoMedicamento findById(int id){

        // We use entity managers to manage our two entities.
        // We use the factory design pattern to get the entity manager.
        // Here we should provide the name of the persistence unit that we provided in the persistence.xml file.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();

        // We can find a record in the database for a given id using the find method.
        // for the find method we have to provide our entity class and the id.
        TipoMedicamento tipoMedicamento = em.find(TipoMedicamento.class, id);

        // If there is no record found with the provided student id, then we throw a NoSuchElement exception.
        if(tipoMedicamento == null){
            throw new NoSuchElementException("NO DATA FOUND WITH THE ID "+id);
        }

        // If everything worked fine, return the result.
        return tipoMedicamento;
    }

    public TipoMedicamento guardarTipo(int id, String nombre, boolean activo){

        // We use entity managers to manage our two entities.
        // We use the factory design pattern to get the entity manager.
        // Here we should provide the name of the persistence unit that we provided in the persistence.xml file.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();

        TipoMedicamento tipo = new TipoMedicamento(id, nombre, activo);

        try {
            em.getTransaction().begin();
            em.persist(tipo);
            em.getTransaction().commit();
        } catch (Exception e) {

            e.printStackTrace();
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

    public List<TipoMedicamento> traerTodos () {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();
        List<TipoMedicamento> listaTipos = em.createNativeQuery("SELECT * FROM tipomedicamento", TipoMedicamento.class).getResultList();

        if (listaTipos == null) {
            throw new NoSuchElementException("NO TRAJO NADA LA CONSULTA ");
        }

        return listaTipos;
    }
}