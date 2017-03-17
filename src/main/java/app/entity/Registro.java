package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela REGISTRO
 * @generated
 */
@Entity
@Table(name = "\"REGISTRO\"")
@XmlRootElement
public class Registro implements Serializable {

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
  @Temporal(TemporalType.DATE)
  @Column(name = "data_registro", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dataRegistro;
  
  /**
  * @generated
  */
  @Column(name = "pesoRegistrado", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Double pesoRegistrado;
  
  /**
  * @generated
  */
  @Column(name = "imc", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Double imc;
  
  /**
  * @generated
  */
  @Column(name = "perda_no_dia", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Double perdaNoDia;
  
  /**
  * @generated
  */
  @Column(name = "perda_acumulada", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double perdaAcumulada;
  
  /**
  * @generated
  */
  @Column(name = "media_diaria", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double mediaDiaria;
  
  /**
  * @generated
  */
  @Column(name = "media_mensal", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double mediaMensal;
  
  /**
  * @generated
  */
  @Column(name = "peso_restante", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double pesoRestante;
  
  /**
  * @generated
  */
  @Column(name = "dias_restantes", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer diasRestantes;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_fim_provavel", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataFimProvavel;
  
  /**
  * @generated
  */
  @Column(name = "perda_imc_no_dia", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double perdaImcNoDia;
  
  /**
  * @generated
  */
  @Column(name = "perda_imc_acumulada", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double perdaImcAcumulada;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_dieta", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Dieta dieta;
  
  /**
   * Construtor
   * @generated
   */
  public Registro(){
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
  public Registro setId(java.lang.String id){
    this.id = id;
    return this;
  }
  /**
   * Obtém dataRegistro
   * 
   * return dataRegistro
   * @generated
   */
  public java.util.Date getDataRegistro(){
    return this.dataRegistro;
  }
  
  /**
   * Define dataRegistro
   * @param dataRegistro dataRegistro
   * @generated
   */
  public Registro setDataRegistro(java.util.Date dataRegistro){
    this.dataRegistro = dataRegistro;
    return this;
  }
  /**
   * Obtém pesoRegistrado
   * 
   * return pesoRegistrado
   * @generated
   */
  public java.lang.Double getPesoRegistrado(){
    return this.pesoRegistrado;
  }
  
  /**
   * Define pesoRegistrado
   * @param pesoRegistrado pesoRegistrado
   * @generated
   */
  public Registro setPesoRegistrado(java.lang.Double pesoRegistrado){
    this.pesoRegistrado = pesoRegistrado;
    return this;
  }
  /**
   * Obtém imc
   * 
   * return imc
   * @generated
   */
  public java.lang.Double getImc(){
    return this.imc;
  }
  
  /**
   * Define imc
   * @param imc imc
   * @generated
   */
  public Registro setImc(java.lang.Double imc){
    this.imc = imc;
    return this;
  }
  /**
   * Obtém perdaNoDia
   * 
   * return perdaNoDia
   * @generated
   */
  public java.lang.Double getPerdaNoDia(){
    return this.perdaNoDia;
  }
  
  /**
   * Define perdaNoDia
   * @param perdaNoDia perdaNoDia
   * @generated
   */
  public Registro setPerdaNoDia(java.lang.Double perdaNoDia){
    this.perdaNoDia = perdaNoDia;
    return this;
  }
  /**
   * Obtém perdaAcumulada
   * 
   * return perdaAcumulada
   * @generated
   */
  public java.lang.Double getPerdaAcumulada(){
    return this.perdaAcumulada;
  }
  
  /**
   * Define perdaAcumulada
   * @param perdaAcumulada perdaAcumulada
   * @generated
   */
  public Registro setPerdaAcumulada(java.lang.Double perdaAcumulada){
    this.perdaAcumulada = perdaAcumulada;
    return this;
  }
  /**
   * Obtém mediaDiaria
   * 
   * return mediaDiaria
   * @generated
   */
  public java.lang.Double getMediaDiaria(){
    return this.mediaDiaria;
  }
  
  /**
   * Define mediaDiaria
   * @param mediaDiaria mediaDiaria
   * @generated
   */
  public Registro setMediaDiaria(java.lang.Double mediaDiaria){
    this.mediaDiaria = mediaDiaria;
    return this;
  }
  /**
   * Obtém mediaMensal
   * 
   * return mediaMensal
   * @generated
   */
  public java.lang.Double getMediaMensal(){
    return this.mediaMensal;
  }
  
  /**
   * Define mediaMensal
   * @param mediaMensal mediaMensal
   * @generated
   */
  public Registro setMediaMensal(java.lang.Double mediaMensal){
    this.mediaMensal = mediaMensal;
    return this;
  }
  /**
   * Obtém pesoRestante
   * 
   * return pesoRestante
   * @generated
   */
  public java.lang.Double getPesoRestante(){
    return this.pesoRestante;
  }
  
  /**
   * Define pesoRestante
   * @param pesoRestante pesoRestante
   * @generated
   */
  public Registro setPesoRestante(java.lang.Double pesoRestante){
    this.pesoRestante = pesoRestante;
    return this;
  }
  /**
   * Obtém diasRestantes
   * 
   * return diasRestantes
   * @generated
   */
  public java.lang.Integer getDiasRestantes(){
    return this.diasRestantes;
  }
  
  /**
   * Define diasRestantes
   * @param diasRestantes diasRestantes
   * @generated
   */
  public Registro setDiasRestantes(java.lang.Integer diasRestantes){
    this.diasRestantes = diasRestantes;
    return this;
  }
  /**
   * Obtém dataFimProvavel
   * 
   * return dataFimProvavel
   * @generated
   */
  public java.util.Date getDataFimProvavel(){
    return this.dataFimProvavel;
  }
  
  /**
   * Define dataFimProvavel
   * @param dataFimProvavel dataFimProvavel
   * @generated
   */
  public Registro setDataFimProvavel(java.util.Date dataFimProvavel){
    this.dataFimProvavel = dataFimProvavel;
    return this;
  }
  /**
   * Obtém perdaImcNoDia
   * 
   * return perdaImcNoDia
   * @generated
   */
  public java.lang.Double getPerdaImcNoDia(){
    return this.perdaImcNoDia;
  }
  
  /**
   * Define perdaImcNoDia
   * @param perdaImcNoDia perdaImcNoDia
   * @generated
   */
  public Registro setPerdaImcNoDia(java.lang.Double perdaImcNoDia){
    this.perdaImcNoDia = perdaImcNoDia;
    return this;
  }
  /**
   * Obtém perdaImcAcumulada
   * 
   * return perdaImcAcumulada
   * @generated
   */
  public java.lang.Double getPerdaImcAcumulada(){
    return this.perdaImcAcumulada;
  }
  
  /**
   * Define perdaImcAcumulada
   * @param perdaImcAcumulada perdaImcAcumulada
   * @generated
   */
  public Registro setPerdaImcAcumulada(java.lang.Double perdaImcAcumulada){
    this.perdaImcAcumulada = perdaImcAcumulada;
    return this;
  }
  /**
   * Obtém dieta
   * 
   * return dieta
   * @generated
   */
  public Dieta getDieta(){
    return this.dieta;
  }
  
  /**
   * Define dieta
   * @param dieta dieta
   * @generated
   */
  public Registro setDieta(Dieta dieta){
    this.dieta = dieta;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Registro object = (Registro)obj;
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