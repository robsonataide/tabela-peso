package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("DietaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface DietaDAO extends JpaRepository<Dieta, java.lang.String> {

  /**
   * Obtém a instância de Dieta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Dieta entity WHERE entity.id = :id")
  public Dieta findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Dieta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Dieta entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Dieta c")
  public Page<Dieta> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Registro entity WHERE entity.dieta.id = :id")
  public Page<Registro> findRegistro(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key User
   * @generated
   */
  @Query("SELECT entity FROM Dieta entity WHERE entity.user.id = :id")
  public Page<Dieta> findDietasByUser(@Param(value="id") java.lang.String id, Pageable pageable);

}