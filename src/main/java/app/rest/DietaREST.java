package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de Dieta
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Dieta")
public class DietaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("DietaBusiness")
  private DietaBusiness dietaBusiness;
  
  /**
   * @generated
   */
  @Autowired
  @Qualifier("RegistroBusiness")
  private RegistroBusiness registroBusiness;
  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Dieta post(@Validated @RequestBody final Dieta entity) throws Exception {
    return dietaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Dieta put(@Validated @RequestBody final Dieta entity) throws Exception {
    return dietaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{dietaId}")
  public Dieta put(@Validated @RequestBody final Dieta entity, @PathVariable("dietaId") java.lang.String dietaId) throws Exception {
    return dietaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{dietaId}")
  public void delete(@PathVariable("dietaId") java.lang.String dietaId) throws Exception {
    dietaBusiness.delete(dietaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public HttpEntity<PagedResources<Dieta>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(dietaBusiness.list(pageable)), HttpStatus.OK);    
  }


  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{dietaId}/Registro")    
  public HttpEntity<PagedResources<Registro>> findRegistro(@PathVariable("dietaId") java.lang.String dietaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dietaBusiness.findRegistro(dietaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{dietaId}/Registro/{registroId}")    
  public void deleteRegistro(@PathVariable("registroId") java.lang.String registroId) throws Exception {
    this.registroBusiness.delete(registroId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{dietaId}/Registro")
  public Registro putRegistro(@Validated @RequestBody final Registro entity, @PathVariable("dietaId") java.lang.String dietaId) throws Exception {
    return this.registroBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{dietaId}/Registro")
  public Registro postRegistro(@Validated @RequestBody final Registro entity, @PathVariable("dietaId") java.lang.String dietaId) throws Exception {
    Dieta dieta = this.dietaBusiness.get(dietaId);
    entity.setDieta(dieta);
    return this.registroBusiness.post(entity);
  }   



  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{dietaid}")
  public Dieta get(@PathVariable("dietaid") java.lang.String dietaid) throws Exception {
    return dietaBusiness.get(dietaid);
  }

  /**
   * Foreign Key User
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/User/{userId}")    
  public HttpEntity<PagedResources<Dieta>> findDietasByUser(@PathVariable("userId") java.lang.String userId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(dietaBusiness.findDietasByUser(userId, pageable)), HttpStatus.OK);
  }
  
}
