package dao;

import domain.Medicamento;
import domain.TipoMedicamento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

import java.util.List;
import java.util.NoSuchElementException;

public class MedicamentoDao {
    public Medicamento findById(int id){

        // We use entity managers to manage our two entities.
        // We use the factory design pattern to get the entity manager.
        // Here we should provide the name of the persistence unit that we provided in the persistence.xml file.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();

        // We can find a record in the database for a given id using the find method.
        // for the find method we have to provide our entity class and the id.
        Medicamento medicamento = em.find(Medicamento.class, id);

        // If there is no record found with the provided student id, then we throw a NoSuchElement exception.
        if(medicamento == null){
            throw new NoSuchElementException("NO DATA FOUND WITH THE ID "+id);
        }

        // If everything worked fine, return the result.
        return medicamento;
    }


    public Medicamento guardarMedicamento(String codigo, String nombreComercial, String nombreDroga, String tipo){

        // We use entity managers to manage our two entities.
        // We use the factory design pattern to get the entity manager.
        // Here we should provide the name of the persistence unit that we provided in the persistence.xml file.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();

        String medicamentoTable = "Medicamento";
        String e = "id";
        Query query = em.createQuery("Select " + e + " from " + medicamentoTable + " order by " + e + " desc");
        List<Integer> list = (List<Integer>) query.setMaxResults(1).getResultList();

        int ultimoId = 0;

        if(list != null){

            // OBTENER EL ULTIMO ID DE LA BD
            for( Integer i:list )
            {
                ultimoId = i + 1;
            }

        }

        Medicamento medicamento = new Medicamento(ultimoId, codigo, nombreComercial, nombreDroga, tipo);

        try {
            em.getTransaction().begin();
            em.persist(medicamento);
            em.getTransaction().commit();
        } catch (Exception excepcion) {
            excepcion.printStackTrace();
        }finally {
            em.close();
        }


        // If everything worked fine, return the result.
        return medicamento;
    }

    public List<Medicamento> buscarPorTipo(String tipo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();

        List<Medicamento> medicamentos = em.createNativeQuery("SELECT * FROM medicamento WHERE tipo = '" + tipo + "'", Medicamento.class)
                .getResultList();

        if (medicamentos == null) {
            throw new NoSuchElementException("NO TRAJO NADA LA CONSULTA " + tipo);
        }

        return medicamentos;
    }
    
    public List<Medicamento> buscarPorLetraNombreComercial(String letra) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();

        List<Medicamento> medicamentos = em.createNativeQuery("SELECT * FROM medicamento WHERE nombreComercial LIKE '" + letra +  "%'", Medicamento.class)
                .getResultList();

        if (medicamentos == null) {
            throw new NoSuchElementException("NO TRAJO NADA LA CONSULTA POR LETRA" + letra);
        }

        return medicamentos;
    }
    
    public List<Medicamento> traerTodos () {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("medicamentos-management-system");
        EntityManager em = emf.createEntityManager();
        List<Medicamento> lista = em.createNativeQuery("SELECT * FROM medicamento;", Medicamento.class).getResultList();

        return lista;
    }

}