package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela DIETA
 * @generated
 */
@Entity
@Table(name = "\"DIETA\"")
@XmlRootElement
public class Dieta implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "peso_inicial", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double pesoInicial;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "inicio", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date inicio;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private User user;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
   * Construtor
   * @generated
   */
  public Dieta(){
  }

  /**
   * Obtém id
   * 
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Dieta setId(java.lang.String id){
    this.id = id;
    return this;
  }
  /**
   * Obtém pesoInicial
   * 
   * return pesoInicial
   * @generated
   */
  public java.lang.Double getPesoInicial(){
    return this.pesoInicial;
  }
  
  /**
   * Define pesoInicial
   * @param pesoInicial pesoInicial
   * @generated
   */
  public Dieta setPesoInicial(java.lang.Double pesoInicial){
    this.pesoInicial = pesoInicial;
    return this;
  }
  /**
   * Obtém inicio
   * 
   * return inicio
   * @generated
   */
  public java.util.Date getInicio(){
    return this.inicio;
  }
  
  /**
   * Define inicio
   * @param inicio inicio
   * @generated
   */
  public Dieta setInicio(java.util.Date inicio){
    this.inicio = inicio;
    return this;
  }
  /**
   * Obtém user
   * 
   * return user
   * @generated
   */
  public User getUser(){
    return this.user;
  }
  
  /**
   * Define user
   * @param user user
   * @generated
   */
  public Dieta setUser(User user){
    this.user = user;
    return this;
  }
  /**
   * Obtém nome
   * 
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Dieta setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Dieta object = (Dieta)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}