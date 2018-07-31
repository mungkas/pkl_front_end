package com.gmail.nurhida10111.client.resources;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gmail$nurhida10111$client$resources$AppResources$_annotation$$none$$(com.gmail.nurhida10111.client.resources.AppResources injectee) {
    
  }
  
  public void memberInject_Key$type$com$gmail$nurhida10111$client$resources$ResourceLoader$_annotation$$none$$(com.gmail.nurhida10111.client.resources.ResourceLoader injectee) {
    
  }
  
  
  /**
   * Binding for com.gmail.nurhida10111.client.resources.AppResources declared at:
   *   Implicit GWT.create binding for com.gmail.nurhida10111.client.resources.AppResources
   */
  public com.gmail.nurhida10111.client.resources.AppResources get_Key$type$com$gmail$nurhida10111$client$resources$AppResources$_annotation$$none$$() {
    Object created = GWT.create(com.gmail.nurhida10111.client.resources.AppResources.class);
    assert created instanceof com.gmail.nurhida10111.client.resources.AppResources;
    com.gmail.nurhida10111.client.resources.AppResources result = (com.gmail.nurhida10111.client.resources.AppResources) created;
    
    memberInject_Key$type$com$gmail$nurhida10111$client$resources$AppResources$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gmail.nurhida10111.client.resources.ResourceLoader singleton_Key$type$com$gmail$nurhida10111$client$resources$ResourceLoader$_annotation$$none$$ = null;
  
  public com.gmail.nurhida10111.client.resources.ResourceLoader get_Key$type$com$gmail$nurhida10111$client$resources$ResourceLoader$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gmail$nurhida10111$client$resources$ResourceLoader$_annotation$$none$$ == null) {
    com.gmail.nurhida10111.client.resources.ResourceLoader result = com$gmail$nurhida10111$client$resources$ResourceLoader_com$gmail$nurhida10111$client$resources$ResourceLoader_methodInjection(get_Key$type$com$gmail$nurhida10111$client$resources$AppResources$_annotation$$none$$());
    memberInject_Key$type$com$gmail$nurhida10111$client$resources$ResourceLoader$_annotation$$none$$(result);
    
        singleton_Key$type$com$gmail$nurhida10111$client$resources$ResourceLoader$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gmail$nurhida10111$client$resources$ResourceLoader$_annotation$$none$$;
    
  }
  
  public com.gmail.nurhida10111.client.resources.ResourceLoader com$gmail$nurhida10111$client$resources$ResourceLoader_com$gmail$nurhida10111$client$resources$ResourceLoader_methodInjection(com.gmail.nurhida10111.client.resources.AppResources _0) {
    return new com.gmail.nurhida10111.client.resources.ResourceLoader(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit binding for com.gmail.nurhida10111.client.resources.ResourceLoader
    get_Key$type$com$gmail$nurhida10111$client$resources$ResourceLoader$_annotation$$none$$();
    
  }
  
}
