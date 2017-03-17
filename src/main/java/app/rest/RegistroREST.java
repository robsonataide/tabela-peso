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
 * Controller para expor serviços REST de Registro
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Registro")
public class RegistroREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
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
  public Registro post(@Validated @RequestBody final Registro entity) throws Exception {
    return registroBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Registro put(@Validated @RequestBody final Registro entity) throws Exception {
    return registroBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{registroId}")
  public Registro put(@Validated @RequestBody final Registro entity, @PathVariable("registroId") java.lang.String registroId) throws Exception {
    return registroBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{registroId}")
  public void delete(@PathVariable("registroId") java.lang.String registroId) throws Exception {
    registroBusiness.delete(registroId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public HttpEntity<PagedResources<Registro>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(registroBusiness.list(pageable)), HttpStatus.OK);    
  }



  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{registroid}")
  public Registro get(@PathVariable("registroid") java.lang.String registroid) throws Exception {
    return registroBusiness.get(registroid);
  }

  /**
   * Foreign Key Dieta
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Dieta/{dietaId}")    
  public HttpEntity<PagedResources<Registro>> findRegistrosByDieta(@PathVariable("dietaId") java.lang.String dietaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(registroBusiness.findRegistrosByDieta(dietaId, pageable)), HttpStatus.OK);
  }
  
}
