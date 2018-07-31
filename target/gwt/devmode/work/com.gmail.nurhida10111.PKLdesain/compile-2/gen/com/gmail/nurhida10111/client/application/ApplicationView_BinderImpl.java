// .ui.xml template last modified: 1532936134000
package com.gmail.nurhida10111.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ApplicationView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.gmail.nurhida10111.client.application.ApplicationView>, com.gmail.nurhida10111.client.application.ApplicationView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.gmail.nurhida10111.client.application.ApplicationView owner) {


    return new Widgets(owner).get_f_MaterialPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.gmail.nurhida10111.client.application.ApplicationView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onAdd((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.gmail.nurhida10111.client.application.ApplicationView owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.gmail.nurhida10111.client.application.ApplicationView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.gmail.nurhida10111.client.application.ApplicationView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.gmail.nurhida10111.client.application.ApplicationView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.gmail.nurhida10111.client.application.ApplicationView_BinderImpl_GenBundle) GWT.create(com.gmail.nurhida10111.client.application.ApplicationView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for res called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.gmail.nurhida10111.client.resources.AppResources get_res() {
      return build_res();
    }
    private com.gmail.nurhida10111.client.resources.AppResources build_res() {
      // Creation section.
      final com.gmail.nurhida10111.client.resources.AppResources res = (com.gmail.nurhida10111.client.resources.AppResources) GWT.create(com.gmail.nurhida10111.client.resources.AppResources.class);
      // Setup section.

      return res;
    }

    /**
     * Getter for f_MaterialPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private gwt.material.design.client.ui.MaterialPanel get_f_MaterialPanel1() {
      return build_f_MaterialPanel1();
    }
    private gwt.material.design.client.ui.MaterialPanel build_f_MaterialPanel1() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialPanel f_MaterialPanel1 = (gwt.material.design.client.ui.MaterialPanel) GWT.create(gwt.material.design.client.ui.MaterialPanel.class);
      // Setup section.
      f_MaterialPanel1.add(get_f_MaterialHeader2());
      f_MaterialPanel1.add(get_f_MaterialSideNavPush26());
      f_MaterialPanel1.add(get_container());
      f_MaterialPanel1.add(get_f_MaterialFAB119());

      return f_MaterialPanel1;
    }

    /**
     * Getter for f_MaterialHeader2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialHeader get_f_MaterialHeader2() {
      return build_f_MaterialHeader2();
    }
    private gwt.material.design.client.ui.MaterialHeader build_f_MaterialHeader2() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialHeader f_MaterialHeader2 = (gwt.material.design.client.ui.MaterialHeader) GWT.create(gwt.material.design.client.ui.MaterialHeader.class);
      // Setup section.
      f_MaterialHeader2.add(get_navBar());
      f_MaterialHeader2.add(get_f_MaterialDropDown13());
      f_MaterialHeader2.add(get_f_MaterialRow17());

      return f_MaterialHeader2;
    }

    /**
     * Getter for navBar called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialNavBar get_navBar() {
      return build_navBar();
    }
    private gwt.material.design.client.ui.MaterialNavBar build_navBar() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavBar navBar = (gwt.material.design.client.ui.MaterialNavBar) GWT.create(gwt.material.design.client.ui.MaterialNavBar.class);
      // Setup section.
      navBar.add(get_f_MaterialNavBrand3());
      navBar.add(get_f_MaterialNavSection6());
      navBar.setBackgroundColor(gwt.material.design.client.constants.Color.WHITE);
      navBar.setActivates("sidenav");

      return navBar;
    }

    /**
     * Getter for f_MaterialNavBrand3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialNavBrand get_f_MaterialNavBrand3() {
      return build_f_MaterialNavBrand3();
    }
    private gwt.material.design.client.ui.MaterialNavBrand build_f_MaterialNavBrand3() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavBrand f_MaterialNavBrand3 = (gwt.material.design.client.ui.MaterialNavBrand) GWT.create(gwt.material.design.client.ui.MaterialNavBrand.class);
      // Setup section.
      f_MaterialNavBrand3.add(get_f_MaterialLink4());
      f_MaterialNavBrand3.add(get_f_MaterialLink5());
      f_MaterialNavBrand3.setFontSize("1.2em");

      return f_MaterialNavBrand3;
    }

    /**
     * Getter for f_MaterialLink4 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink4() {
      return build_f_MaterialLink4();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink4() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink4 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink4.setIconType(gwt.material.design.client.constants.IconType.HOME);
      f_MaterialLink4.setIconColor(gwt.material.design.client.constants.Color.BLUE_GREY);

      return f_MaterialLink4;
    }

    /**
     * Getter for f_MaterialLink5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink5() {
      return build_f_MaterialLink5();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink5() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink5 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink5.setText("DASHBOARD");
      f_MaterialLink5.setTextColor(gwt.material.design.client.constants.Color.BLUE_GREY);

      return f_MaterialLink5;
    }

    /**
     * Getter for f_MaterialNavSection6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialNavSection get_f_MaterialNavSection6() {
      return build_f_MaterialNavSection6();
    }
    private gwt.material.design.client.ui.MaterialNavSection build_f_MaterialNavSection6() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavSection f_MaterialNavSection6 = (gwt.material.design.client.ui.MaterialNavSection) GWT.create(gwt.material.design.client.ui.MaterialNavSection.class);
      // Setup section.
      f_MaterialNavSection6.add(get_f_MaterialLink7());
      f_MaterialNavSection6.add(get_f_MaterialLink9());
      f_MaterialNavSection6.add(get_f_MaterialLink11());
      f_MaterialNavSection6.add(get_f_MaterialLink12());
      f_MaterialNavSection6.setFloat(com.google.gwt.dom.client.Style.Float.RIGHT);

      return f_MaterialNavSection6;
    }

    /**
     * Getter for f_MaterialLink7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink7() {
      return build_f_MaterialLink7();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink7() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink7 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink7.add(get_f_MaterialBadge8());
      f_MaterialLink7.setLayoutPosition(com.google.gwt.dom.client.Style.Position.RELATIVE);
      f_MaterialLink7.setIconType(gwt.material.design.client.constants.IconType.SETTINGS);
      f_MaterialLink7.setIconPosition(gwt.material.design.client.constants.IconPosition.NONE);
      f_MaterialLink7.setIconColor(gwt.material.design.client.constants.Color.BLUE_GREY);

      return f_MaterialLink7;
    }

    /**
     * Getter for f_MaterialBadge8 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialBadge get_f_MaterialBadge8() {
      return build_f_MaterialBadge8();
    }
    private gwt.material.design.client.ui.MaterialBadge build_f_MaterialBadge8() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialBadge f_MaterialBadge8 = (gwt.material.design.client.ui.MaterialBadge) GWT.create(gwt.material.design.client.ui.MaterialBadge.class);
      // Setup section.
      f_MaterialBadge8.setBackgroundColor(gwt.material.design.client.constants.Color.BLUE);
      f_MaterialBadge8.setText("4");
      f_MaterialBadge8.setCircle(true);

      return f_MaterialBadge8;
    }

    /**
     * Getter for f_MaterialLink9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink9() {
      return build_f_MaterialLink9();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink9() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink9 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink9.add(get_f_MaterialBadge10());
      f_MaterialLink9.setLayoutPosition(com.google.gwt.dom.client.Style.Position.RELATIVE);
      f_MaterialLink9.setIconType(gwt.material.design.client.constants.IconType.NOTIFICATIONS);
      f_MaterialLink9.setIconPosition(gwt.material.design.client.constants.IconPosition.NONE);
      f_MaterialLink9.setIconColor(gwt.material.design.client.constants.Color.BLUE_GREY);

      return f_MaterialLink9;
    }

    /**
     * Getter for f_MaterialBadge10 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialBadge get_f_MaterialBadge10() {
      return build_f_MaterialBadge10();
    }
    private gwt.material.design.client.ui.MaterialBadge build_f_MaterialBadge10() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialBadge f_MaterialBadge10 = (gwt.material.design.client.ui.MaterialBadge) GWT.create(gwt.material.design.client.ui.MaterialBadge.class);
      // Setup section.
      f_MaterialBadge10.setBackgroundColor(gwt.material.design.client.constants.Color.RED);
      f_MaterialBadge10.setText("1");
      f_MaterialBadge10.setCircle(true);

      return f_MaterialBadge10;
    }

    /**
     * Getter for f_MaterialLink11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink11() {
      return build_f_MaterialLink11();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink11() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink11 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink11.setIconType(gwt.material.design.client.constants.IconType.APPS);
      f_MaterialLink11.setIconColor(gwt.material.design.client.constants.Color.BLUE_GREY);

      return f_MaterialLink11;
    }

    /**
     * Getter for f_MaterialLink12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink12() {
      return build_f_MaterialLink12();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink12() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink12 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink12.setIconType(gwt.material.design.client.constants.IconType.PERSON);
      f_MaterialLink12.setIconPosition(gwt.material.design.client.constants.IconPosition.RIGHT);
      f_MaterialLink12.setIconColor(gwt.material.design.client.constants.Color.BLUE_GREY);
      f_MaterialLink12.setText("ADMIN");
      f_MaterialLink12.setTextColor(gwt.material.design.client.constants.Color.BLUE_GREY);
      f_MaterialLink12.setActivates("dp-3");

      return f_MaterialLink12;
    }

    /**
     * Getter for f_MaterialDropDown13 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialDropDown get_f_MaterialDropDown13() {
      return build_f_MaterialDropDown13();
    }
    private gwt.material.design.client.ui.MaterialDropDown build_f_MaterialDropDown13() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialDropDown f_MaterialDropDown13 = new gwt.material.design.client.ui.MaterialDropDown("dp-3");
      // Setup section.
      f_MaterialDropDown13.add(get_f_MaterialLink14());
      f_MaterialDropDown13.add(get_f_MaterialLink15());
      f_MaterialDropDown13.add(get_f_MaterialLink16());
      f_MaterialDropDown13.setConstrainWidth(true);

      return f_MaterialDropDown13;
    }

    /**
     * Getter for f_MaterialLink14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink14() {
      return build_f_MaterialLink14();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink14() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink14 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink14.setText("First");
      f_MaterialLink14.setTextColor(gwt.material.design.client.constants.Color.BLUE_GREY);
      f_MaterialLink14.setSeparator(true);

      return f_MaterialLink14;
    }

    /**
     * Getter for f_MaterialLink15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink15() {
      return build_f_MaterialLink15();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink15() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink15 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink15.setText("Second");
      f_MaterialLink15.setTextColor(gwt.material.design.client.constants.Color.BLUE_GREY);
      f_MaterialLink15.setSeparator(true);

      return f_MaterialLink15;
    }

    /**
     * Getter for f_MaterialLink16 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink16() {
      return build_f_MaterialLink16();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink16() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink16 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink16.setText("Third");
      f_MaterialLink16.setTextColor(gwt.material.design.client.constants.Color.BLUE_GREY);
      f_MaterialLink16.setSeparator(true);

      return f_MaterialLink16;
    }

    /**
     * Getter for f_MaterialRow17 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialRow get_f_MaterialRow17() {
      return build_f_MaterialRow17();
    }
    private gwt.material.design.client.ui.MaterialRow build_f_MaterialRow17() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialRow f_MaterialRow17 = (gwt.material.design.client.ui.MaterialRow) GWT.create(gwt.material.design.client.ui.MaterialRow.class);
      // Setup section.
      f_MaterialRow17.add(get_f_MaterialColumn18());
      f_MaterialRow17.setBackgroundColor(gwt.material.design.client.constants.Color.BLUE_GREY_LIGHTEN_5);
      f_MaterialRow17.setShadow(1);

      return f_MaterialRow17;
    }

    /**
     * Getter for f_MaterialColumn18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn18() {
      return build_f_MaterialColumn18();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn18() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn18 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn18.add(get_f_MaterialTab19());
      f_MaterialColumn18.setGrid("l6 m6 s12");

      return f_MaterialColumn18;
    }

    /**
     * Getter for f_MaterialTab19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialTab get_f_MaterialTab19() {
      return build_f_MaterialTab19();
    }
    private gwt.material.design.client.ui.MaterialTab build_f_MaterialTab19() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTab f_MaterialTab19 = (gwt.material.design.client.ui.MaterialTab) GWT.create(gwt.material.design.client.ui.MaterialTab.class);
      // Setup section.
      f_MaterialTab19.add(get_f_MaterialTabItem20());
      f_MaterialTab19.add(get_f_MaterialTabItem22());
      f_MaterialTab19.add(get_f_MaterialTabItem24());
      f_MaterialTab19.setBackgroundColor(gwt.material.design.client.constants.Color.BLUE_GREY_LIGHTEN_5);
      f_MaterialTab19.setIndicatorColor(gwt.material.design.client.constants.Color.GREEN_LIGHTEN_3);
      f_MaterialTab19.setType(gwt.material.design.client.constants.TabType.ICON);

      return f_MaterialTab19;
    }

    /**
     * Getter for f_MaterialTabItem20 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialTabItem get_f_MaterialTabItem20() {
      return build_f_MaterialTabItem20();
    }
    private gwt.material.design.client.ui.MaterialTabItem build_f_MaterialTabItem20() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTabItem f_MaterialTabItem20 = (gwt.material.design.client.ui.MaterialTabItem) GWT.create(gwt.material.design.client.ui.MaterialTabItem.class);
      // Setup section.
      f_MaterialTabItem20.add(get_f_MaterialLink21());
      f_MaterialTabItem20.setWaves(gwt.material.design.client.constants.WavesType.YELLOW);

      return f_MaterialTabItem20;
    }

    /**
     * Getter for f_MaterialLink21 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink21() {
      return build_f_MaterialLink21();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink21() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink21 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink21.setText("METRICS");
      f_MaterialLink21.setHref("#tab1");
      f_MaterialLink21.setTextColor(gwt.material.design.client.constants.Color.BLUE_GREY_DARKEN_3);

      return f_MaterialLink21;
    }

    /**
     * Getter for f_MaterialTabItem22 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialTabItem get_f_MaterialTabItem22() {
      return build_f_MaterialTabItem22();
    }
    private gwt.material.design.client.ui.MaterialTabItem build_f_MaterialTabItem22() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTabItem f_MaterialTabItem22 = (gwt.material.design.client.ui.MaterialTabItem) GWT.create(gwt.material.design.client.ui.MaterialTabItem.class);
      // Setup section.
      f_MaterialTabItem22.add(get_f_MaterialLink23());
      f_MaterialTabItem22.setWaves(gwt.material.design.client.constants.WavesType.YELLOW);

      return f_MaterialTabItem22;
    }

    /**
     * Getter for f_MaterialLink23 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink23() {
      return build_f_MaterialLink23();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink23() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink23 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink23.setText("HEADMAPS");
      f_MaterialLink23.setHref("#tab2");
      f_MaterialLink23.setTextColor(gwt.material.design.client.constants.Color.BLUE_GREY_DARKEN_3);

      return f_MaterialLink23;
    }

    /**
     * Getter for f_MaterialTabItem24 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialTabItem get_f_MaterialTabItem24() {
      return build_f_MaterialTabItem24();
    }
    private gwt.material.design.client.ui.MaterialTabItem build_f_MaterialTabItem24() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialTabItem f_MaterialTabItem24 = (gwt.material.design.client.ui.MaterialTabItem) GWT.create(gwt.material.design.client.ui.MaterialTabItem.class);
      // Setup section.
      f_MaterialTabItem24.add(get_f_MaterialLink25());
      f_MaterialTabItem24.setWaves(gwt.material.design.client.constants.WavesType.YELLOW);

      return f_MaterialTabItem24;
    }

    /**
     * Getter for f_MaterialLink25 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink25() {
      return build_f_MaterialLink25();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink25() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink25 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink25.setText("CONFIG HISTORY");
      f_MaterialLink25.setHref("#tab3");
      f_MaterialLink25.setTextColor(gwt.material.design.client.constants.Color.BLUE_GREY_DARKEN_3);

      return f_MaterialLink25;
    }

    /**
     * Getter for f_MaterialSideNavPush26 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialSideNavPush get_f_MaterialSideNavPush26() {
      return build_f_MaterialSideNavPush26();
    }
    private gwt.material.design.client.ui.MaterialSideNavPush build_f_MaterialSideNavPush26() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialSideNavPush f_MaterialSideNavPush26 = (gwt.material.design.client.ui.MaterialSideNavPush) GWT.create(gwt.material.design.client.ui.MaterialSideNavPush.class);
      // Setup section.
      f_MaterialSideNavPush26.add(get_f_sideprofile$MaterialSideProfile27());
      f_MaterialSideNavPush26.add(get_f_MaterialLink30());
      f_MaterialSideNavPush26.add(get_f_MaterialCollapsible31());
      f_MaterialSideNavPush26.add(get_f_MaterialLink41());
      f_MaterialSideNavPush26.add(get_f_MaterialLink42());
      f_MaterialSideNavPush26.add(get_f_MaterialCollapsible43());
      f_MaterialSideNavPush26.setBackgroundColor(gwt.material.design.client.constants.Color.GREY_DARKEN_4);
      f_MaterialSideNavPush26.setWidth("280");
      f_MaterialSideNavPush26.setId("sidenav");

      return f_MaterialSideNavPush26;
    }

    /**
     * Getter for f_sideprofile$MaterialSideProfile27 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.addins.client.sideprofile.MaterialSideProfile get_f_sideprofile$MaterialSideProfile27() {
      return build_f_sideprofile$MaterialSideProfile27();
    }
    private gwt.material.design.addins.client.sideprofile.MaterialSideProfile build_f_sideprofile$MaterialSideProfile27() {
      // Creation section.
      final gwt.material.design.addins.client.sideprofile.MaterialSideProfile f_sideprofile$MaterialSideProfile27 = (gwt.material.design.addins.client.sideprofile.MaterialSideProfile) GWT.create(gwt.material.design.addins.client.sideprofile.MaterialSideProfile.class);
      // Setup section.
      f_sideprofile$MaterialSideProfile27.add(get_f_MaterialNavBrand28());
      f_sideprofile$MaterialSideProfile27.setPaddingTop(35);

      return f_sideprofile$MaterialSideProfile27;
    }

    /**
     * Getter for f_MaterialNavBrand28 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialNavBrand get_f_MaterialNavBrand28() {
      return build_f_MaterialNavBrand28();
    }
    private gwt.material.design.client.ui.MaterialNavBrand build_f_MaterialNavBrand28() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavBrand f_MaterialNavBrand28 = (gwt.material.design.client.ui.MaterialNavBrand) GWT.create(gwt.material.design.client.ui.MaterialNavBrand.class);
      // Setup section.
      f_MaterialNavBrand28.add(get_f_MaterialLink29());

      return f_MaterialNavBrand28;
    }

    /**
     * Getter for f_MaterialLink29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink29() {
      return build_f_MaterialLink29();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink29() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink29 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink29.setBackgroundColor(gwt.material.design.client.constants.Color.GREY_DARKEN_4);
      f_MaterialLink29.setPaddingBottom(20);
      f_MaterialLink29.setFontSize("0.8em");
      f_MaterialLink29.setText("YAVA Ambari");
      f_MaterialLink29.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink29;
    }

    /**
     * Getter for f_MaterialLink30 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink30() {
      return build_f_MaterialLink30();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink30() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink30 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink30.setIconType(gwt.material.design.client.constants.IconType.HOME);
      f_MaterialLink30.setIconColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);
      f_MaterialLink30.setText("Dashboard");
      f_MaterialLink30.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink30;
    }

    /**
     * Getter for f_MaterialCollapsible31 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialCollapsible get_f_MaterialCollapsible31() {
      return build_f_MaterialCollapsible31();
    }
    private gwt.material.design.client.ui.MaterialCollapsible build_f_MaterialCollapsible31() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsible f_MaterialCollapsible31 = (gwt.material.design.client.ui.MaterialCollapsible) GWT.create(gwt.material.design.client.ui.MaterialCollapsible.class);
      // Setup section.
      f_MaterialCollapsible31.add(get_f_MaterialCollapsibleItem32());

      return f_MaterialCollapsible31;
    }

    /**
     * Getter for f_MaterialCollapsibleItem32 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleItem get_f_MaterialCollapsibleItem32() {
      return build_f_MaterialCollapsibleItem32();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleItem build_f_MaterialCollapsibleItem32() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleItem f_MaterialCollapsibleItem32 = (gwt.material.design.client.ui.MaterialCollapsibleItem) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleItem.class);
      // Setup section.
      f_MaterialCollapsibleItem32.add(get_f_MaterialCollapsibleHeader33());
      f_MaterialCollapsibleItem32.add(get_f_MaterialCollapsibleBody35());

      return f_MaterialCollapsibleItem32;
    }

    /**
     * Getter for f_MaterialCollapsibleHeader33 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleHeader get_f_MaterialCollapsibleHeader33() {
      return build_f_MaterialCollapsibleHeader33();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleHeader build_f_MaterialCollapsibleHeader33() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleHeader f_MaterialCollapsibleHeader33 = (gwt.material.design.client.ui.MaterialCollapsibleHeader) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleHeader.class);
      // Setup section.
      f_MaterialCollapsibleHeader33.add(get_f_MaterialLink34());

      return f_MaterialCollapsibleHeader33;
    }

    /**
     * Getter for f_MaterialLink34 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink34() {
      return build_f_MaterialLink34();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink34() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink34 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink34.setIconType(gwt.material.design.client.constants.IconType.BUSINESS_CENTER);
      f_MaterialLink34.setIconColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);
      f_MaterialLink34.setText("Service");
      f_MaterialLink34.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink34;
    }

    /**
     * Getter for f_MaterialCollapsibleBody35 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleBody get_f_MaterialCollapsibleBody35() {
      return build_f_MaterialCollapsibleBody35();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleBody build_f_MaterialCollapsibleBody35() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleBody f_MaterialCollapsibleBody35 = (gwt.material.design.client.ui.MaterialCollapsibleBody) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleBody.class);
      // Setup section.
      f_MaterialCollapsibleBody35.add(get_f_html$UnorderedList36());

      return f_MaterialCollapsibleBody35;
    }

    /**
     * Getter for f_html$UnorderedList36 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.html.UnorderedList get_f_html$UnorderedList36() {
      return build_f_html$UnorderedList36();
    }
    private gwt.material.design.client.ui.html.UnorderedList build_f_html$UnorderedList36() {
      // Creation section.
      final gwt.material.design.client.ui.html.UnorderedList f_html$UnorderedList36 = (gwt.material.design.client.ui.html.UnorderedList) GWT.create(gwt.material.design.client.ui.html.UnorderedList.class);
      // Setup section.
      f_html$UnorderedList36.add(get_f_MaterialLink37());
      f_html$UnorderedList36.add(get_f_MaterialLink38());
      f_html$UnorderedList36.add(get_f_MaterialLink39());
      f_html$UnorderedList36.add(get_f_MaterialLink40());
      f_html$UnorderedList36.setBackgroundColor(gwt.material.design.client.constants.Color.GREY_DARKEN_4);

      return f_html$UnorderedList36;
    }

    /**
     * Getter for f_MaterialLink37 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink37() {
      return build_f_MaterialLink37();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink37() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink37 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink37.setText("HDFS");
      f_MaterialLink37.setTextColor(gwt.material.design.client.constants.Color.RED);

      return f_MaterialLink37;
    }

    /**
     * Getter for f_MaterialLink38 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink38() {
      return build_f_MaterialLink38();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink38() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink38 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink38.setWaves(gwt.material.design.client.constants.WavesType.DEFAULT);
      f_MaterialLink38.setText("YARN");
      f_MaterialLink38.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink38;
    }

    /**
     * Getter for f_MaterialLink39 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink39() {
      return build_f_MaterialLink39();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink39() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink39 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink39.setWaves(gwt.material.design.client.constants.WavesType.DEFAULT);
      f_MaterialLink39.setText("MapsReduce2");
      f_MaterialLink39.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink39;
    }

    /**
     * Getter for f_MaterialLink40 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink40() {
      return build_f_MaterialLink40();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink40() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink40 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink40.setWaves(gwt.material.design.client.constants.WavesType.DEFAULT);
      f_MaterialLink40.setText("ZooKeeper");
      f_MaterialLink40.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink40;
    }

    /**
     * Getter for f_MaterialLink41 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink41() {
      return build_f_MaterialLink41();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink41() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink41 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink41.setIconType(gwt.material.design.client.constants.IconType.STORAGE);
      f_MaterialLink41.setIconColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);
      f_MaterialLink41.setText("Hosts");
      f_MaterialLink41.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink41;
    }

    /**
     * Getter for f_MaterialLink42 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink42() {
      return build_f_MaterialLink42();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink42() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink42 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink42.setIconType(gwt.material.design.client.constants.IconType.NOTIFICATIONS);
      f_MaterialLink42.setIconColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);
      f_MaterialLink42.setText("Alerts");
      f_MaterialLink42.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink42;
    }

    /**
     * Getter for f_MaterialCollapsible43 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialCollapsible get_f_MaterialCollapsible43() {
      return build_f_MaterialCollapsible43();
    }
    private gwt.material.design.client.ui.MaterialCollapsible build_f_MaterialCollapsible43() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsible f_MaterialCollapsible43 = (gwt.material.design.client.ui.MaterialCollapsible) GWT.create(gwt.material.design.client.ui.MaterialCollapsible.class);
      // Setup section.
      f_MaterialCollapsible43.add(get_f_MaterialCollapsibleItem44());

      return f_MaterialCollapsible43;
    }

    /**
     * Getter for f_MaterialCollapsibleItem44 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleItem get_f_MaterialCollapsibleItem44() {
      return build_f_MaterialCollapsibleItem44();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleItem build_f_MaterialCollapsibleItem44() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleItem f_MaterialCollapsibleItem44 = (gwt.material.design.client.ui.MaterialCollapsibleItem) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleItem.class);
      // Setup section.
      f_MaterialCollapsibleItem44.add(get_f_MaterialCollapsibleHeader45());
      f_MaterialCollapsibleItem44.add(get_f_MaterialCollapsibleBody47());

      return f_MaterialCollapsibleItem44;
    }

    /**
     * Getter for f_MaterialCollapsibleHeader45 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleHeader get_f_MaterialCollapsibleHeader45() {
      return build_f_MaterialCollapsibleHeader45();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleHeader build_f_MaterialCollapsibleHeader45() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleHeader f_MaterialCollapsibleHeader45 = (gwt.material.design.client.ui.MaterialCollapsibleHeader) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleHeader.class);
      // Setup section.
      f_MaterialCollapsibleHeader45.add(get_f_MaterialLink46());
      f_MaterialCollapsibleHeader45.setWaves(gwt.material.design.client.constants.WavesType.DEFAULT);

      return f_MaterialCollapsibleHeader45;
    }

    /**
     * Getter for f_MaterialLink46 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink46() {
      return build_f_MaterialLink46();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink46() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink46 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink46.setIconType(gwt.material.design.client.constants.IconType.BUILD);
      f_MaterialLink46.setIconColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);
      f_MaterialLink46.setText("Cluster Admin");
      f_MaterialLink46.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink46;
    }

    /**
     * Getter for f_MaterialCollapsibleBody47 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCollapsibleBody get_f_MaterialCollapsibleBody47() {
      return build_f_MaterialCollapsibleBody47();
    }
    private gwt.material.design.client.ui.MaterialCollapsibleBody build_f_MaterialCollapsibleBody47() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCollapsibleBody f_MaterialCollapsibleBody47 = (gwt.material.design.client.ui.MaterialCollapsibleBody) GWT.create(gwt.material.design.client.ui.MaterialCollapsibleBody.class);
      // Setup section.
      f_MaterialCollapsibleBody47.add(get_f_html$UnorderedList48());

      return f_MaterialCollapsibleBody47;
    }

    /**
     * Getter for f_html$UnorderedList48 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.html.UnorderedList get_f_html$UnorderedList48() {
      return build_f_html$UnorderedList48();
    }
    private gwt.material.design.client.ui.html.UnorderedList build_f_html$UnorderedList48() {
      // Creation section.
      final gwt.material.design.client.ui.html.UnorderedList f_html$UnorderedList48 = (gwt.material.design.client.ui.html.UnorderedList) GWT.create(gwt.material.design.client.ui.html.UnorderedList.class);
      // Setup section.
      f_html$UnorderedList48.add(get_f_MaterialLink49());
      f_html$UnorderedList48.add(get_f_MaterialLink50());
      f_html$UnorderedList48.setBackgroundColor(gwt.material.design.client.constants.Color.GREY_DARKEN_4);

      return f_html$UnorderedList48;
    }

    /**
     * Getter for f_MaterialLink49 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink49() {
      return build_f_MaterialLink49();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink49() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink49 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink49.setWaves(gwt.material.design.client.constants.WavesType.DEFAULT);
      f_MaterialLink49.setText("Child 1");
      f_MaterialLink49.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink49;
    }

    /**
     * Getter for f_MaterialLink50 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink50() {
      return build_f_MaterialLink50();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink50() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink50 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink50.setText("Child 2");
      f_MaterialLink50.setTextColor(gwt.material.design.client.constants.Color.GREY_DARKEN_1);

      return f_MaterialLink50;
    }

    /**
     * Getter for container called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialContainer get_container() {
      return build_container();
    }
    private gwt.material.design.client.ui.MaterialContainer build_container() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialContainer container = (gwt.material.design.client.ui.MaterialContainer) GWT.create(gwt.material.design.client.ui.MaterialContainer.class);
      // Setup section.
      container.add(get_f_MaterialRow51());
      container.add(get_f_MaterialRow78());
      container.add(get_f_MaterialRow97());

      this.owner.container = container;

      return container;
    }

    /**
     * Getter for f_MaterialRow51 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialRow get_f_MaterialRow51() {
      return build_f_MaterialRow51();
    }
    private gwt.material.design.client.ui.MaterialRow build_f_MaterialRow51() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialRow f_MaterialRow51 = (gwt.material.design.client.ui.MaterialRow) GWT.create(gwt.material.design.client.ui.MaterialRow.class);
      // Setup section.
      f_MaterialRow51.add(get_f_MaterialColumn52());
      f_MaterialRow51.add(get_f_MaterialColumn55());
      f_MaterialRow51.add(get_f_MaterialColumn60());
      f_MaterialRow51.add(get_f_MaterialColumn65());
      f_MaterialRow51.add(get_f_MaterialColumn70());
      f_MaterialRow51.add(get_f_MaterialColumn73());
      f_MaterialRow51.setPaddingTop(120);
      f_MaterialRow51.setId("tab1");

      return f_MaterialRow51;
    }

    /**
     * Getter for f_MaterialColumn52 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn52() {
      return build_f_MaterialColumn52();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn52() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn52 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn52.add(get_card1());
      f_MaterialColumn52.setGrid("l5 m6 s12");

      return f_MaterialColumn52;
    }

    /**
     * Getter for card1 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card1() {
      return build_card1();
    }
    private gwt.material.design.client.ui.MaterialCard build_card1() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card1 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card1.add(get_circLabel());
      card1.add(get_f_MaterialLabel53());
      card1.add(get_f_MaterialLabel54());
      card1.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card1;
    }

    /**
     * Getter for circLabel called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.addins.client.circularprogress.MaterialCircularProgress get_circLabel() {
      return build_circLabel();
    }
    private gwt.material.design.addins.client.circularprogress.MaterialCircularProgress build_circLabel() {
      // Creation section.
      final gwt.material.design.addins.client.circularprogress.MaterialCircularProgress circLabel = (gwt.material.design.addins.client.circularprogress.MaterialCircularProgress) GWT.create(gwt.material.design.addins.client.circularprogress.MaterialCircularProgress.class);
      // Setup section.
      circLabel.setSize(166);
      circLabel.setFontSize("2em");
      circLabel.setPaddingTop(15);
      circLabel.setValue(0.75);

      return circLabel;
    }

    /**
     * Getter for f_MaterialLabel53 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel53() {
      return build_f_MaterialLabel53();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel53() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel53 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel53.setFontSize("2em");
      f_MaterialLabel53.setText("PKLdesain");
      f_MaterialLabel53.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel53;
    }

    /**
     * Getter for f_MaterialLabel54 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel54() {
      return build_f_MaterialLabel54();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel54() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel54 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel54.setFontSize("0.8em");
      f_MaterialLabel54.setText("PKLdesain");
      f_MaterialLabel54.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel54;
    }

    /**
     * Getter for f_MaterialColumn55 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn55() {
      return build_f_MaterialColumn55();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn55() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn55 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn55.add(get_card2());
      f_MaterialColumn55.setGrid("16 m4 s12");

      return f_MaterialColumn55;
    }

    /**
     * Getter for card2 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card2() {
      return build_card2();
    }
    private gwt.material.design.client.ui.MaterialCard build_card2() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card2 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card2.add(get_f_MaterialCardAction56());
      card2.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card2;
    }

    /**
     * Getter for f_MaterialCardAction56 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialCardAction get_f_MaterialCardAction56() {
      return build_f_MaterialCardAction56();
    }
    private gwt.material.design.client.ui.MaterialCardAction build_f_MaterialCardAction56() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCardAction f_MaterialCardAction56 = (gwt.material.design.client.ui.MaterialCardAction) GWT.create(gwt.material.design.client.ui.MaterialCardAction.class);
      // Setup section.
      f_MaterialCardAction56.add(get_f_MaterialIcon57());
      f_MaterialCardAction56.add(get_f_MaterialLabel58());
      f_MaterialCardAction56.add(get_f_MaterialLabel59());

      return f_MaterialCardAction56;
    }

    /**
     * Getter for f_MaterialIcon57 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialIcon get_f_MaterialIcon57() {
      return build_f_MaterialIcon57();
    }
    private gwt.material.design.client.ui.MaterialIcon build_f_MaterialIcon57() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialIcon f_MaterialIcon57 = (gwt.material.design.client.ui.MaterialIcon) GWT.create(gwt.material.design.client.ui.MaterialIcon.class);
      // Setup section.
      f_MaterialIcon57.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialIcon57.setIconSize(gwt.material.design.client.constants.IconSize.LARGE);
      f_MaterialIcon57.setTextColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      f_MaterialIcon57.setMarginTop(50);

      return f_MaterialIcon57;
    }

    /**
     * Getter for f_MaterialLabel58 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel58() {
      return build_f_MaterialLabel58();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel58() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel58 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel58.setFontSize("2em");
      f_MaterialLabel58.setText("PKLdesain");
      f_MaterialLabel58.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel58;
    }

    /**
     * Getter for f_MaterialLabel59 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel59() {
      return build_f_MaterialLabel59();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel59() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel59 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel59.setFontSize("0.8em");
      f_MaterialLabel59.setText("PKLdesain");
      f_MaterialLabel59.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel59;
    }

    /**
     * Getter for f_MaterialColumn60 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn60() {
      return build_f_MaterialColumn60();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn60() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn60 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn60.add(get_card3());
      f_MaterialColumn60.setGrid("16 m3 s12");

      return f_MaterialColumn60;
    }

    /**
     * Getter for card3 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card3() {
      return build_card3();
    }
    private gwt.material.design.client.ui.MaterialCard build_card3() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card3 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card3.add(get_f_MaterialCardAction61());
      card3.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card3;
    }

    /**
     * Getter for f_MaterialCardAction61 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialCardAction get_f_MaterialCardAction61() {
      return build_f_MaterialCardAction61();
    }
    private gwt.material.design.client.ui.MaterialCardAction build_f_MaterialCardAction61() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCardAction f_MaterialCardAction61 = (gwt.material.design.client.ui.MaterialCardAction) GWT.create(gwt.material.design.client.ui.MaterialCardAction.class);
      // Setup section.
      f_MaterialCardAction61.add(get_f_MaterialIcon62());
      f_MaterialCardAction61.add(get_f_MaterialLabel63());
      f_MaterialCardAction61.add(get_f_MaterialLabel64());

      return f_MaterialCardAction61;
    }

    /**
     * Getter for f_MaterialIcon62 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialIcon get_f_MaterialIcon62() {
      return build_f_MaterialIcon62();
    }
    private gwt.material.design.client.ui.MaterialIcon build_f_MaterialIcon62() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialIcon f_MaterialIcon62 = (gwt.material.design.client.ui.MaterialIcon) GWT.create(gwt.material.design.client.ui.MaterialIcon.class);
      // Setup section.
      f_MaterialIcon62.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialIcon62.setIconSize(gwt.material.design.client.constants.IconSize.LARGE);
      f_MaterialIcon62.setTextColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      f_MaterialIcon62.setMarginTop(50);

      return f_MaterialIcon62;
    }

    /**
     * Getter for f_MaterialLabel63 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel63() {
      return build_f_MaterialLabel63();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel63() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel63 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel63.setFontSize("2em");
      f_MaterialLabel63.setText("PKLdesain");
      f_MaterialLabel63.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel63;
    }

    /**
     * Getter for f_MaterialLabel64 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel64() {
      return build_f_MaterialLabel64();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel64() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel64 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel64.setFontSize("0.8em");
      f_MaterialLabel64.setText("PKLdesain");
      f_MaterialLabel64.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel64;
    }

    /**
     * Getter for f_MaterialColumn65 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn65() {
      return build_f_MaterialColumn65();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn65() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn65 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn65.add(get_card4());
      f_MaterialColumn65.setGrid("14");

      return f_MaterialColumn65;
    }

    /**
     * Getter for card4 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card4() {
      return build_card4();
    }
    private gwt.material.design.client.ui.MaterialCard build_card4() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card4 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card4.add(get_f_MaterialCardAction66());
      card4.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card4;
    }

    /**
     * Getter for f_MaterialCardAction66 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialCardAction get_f_MaterialCardAction66() {
      return build_f_MaterialCardAction66();
    }
    private gwt.material.design.client.ui.MaterialCardAction build_f_MaterialCardAction66() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCardAction f_MaterialCardAction66 = (gwt.material.design.client.ui.MaterialCardAction) GWT.create(gwt.material.design.client.ui.MaterialCardAction.class);
      // Setup section.
      f_MaterialCardAction66.add(get_f_MaterialIcon67());
      f_MaterialCardAction66.add(get_f_MaterialLabel68());
      f_MaterialCardAction66.add(get_f_MaterialLabel69());

      return f_MaterialCardAction66;
    }

    /**
     * Getter for f_MaterialIcon67 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialIcon get_f_MaterialIcon67() {
      return build_f_MaterialIcon67();
    }
    private gwt.material.design.client.ui.MaterialIcon build_f_MaterialIcon67() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialIcon f_MaterialIcon67 = (gwt.material.design.client.ui.MaterialIcon) GWT.create(gwt.material.design.client.ui.MaterialIcon.class);
      // Setup section.
      f_MaterialIcon67.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialIcon67.setIconSize(gwt.material.design.client.constants.IconSize.LARGE);
      f_MaterialIcon67.setTextColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      f_MaterialIcon67.setMarginTop(50);

      return f_MaterialIcon67;
    }

    /**
     * Getter for f_MaterialLabel68 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel68() {
      return build_f_MaterialLabel68();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel68() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel68 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel68.setFontSize("2em");
      f_MaterialLabel68.setText("PKLdesain");
      f_MaterialLabel68.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel68;
    }

    /**
     * Getter for f_MaterialLabel69 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel69() {
      return build_f_MaterialLabel69();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel69() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel69 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel69.setFontSize("0.8em");
      f_MaterialLabel69.setText("PKLdesain");
      f_MaterialLabel69.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel69;
    }

    /**
     * Getter for f_MaterialColumn70 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn70() {
      return build_f_MaterialColumn70();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn70() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn70 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn70.add(get_card6());
      f_MaterialColumn70.setGrid("l5 m6 s12");

      return f_MaterialColumn70;
    }

    /**
     * Getter for card6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card6() {
      return build_card6();
    }
    private gwt.material.design.client.ui.MaterialCard build_card6() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card6 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card6.add(get_circLabel1());
      card6.add(get_f_MaterialLabel71());
      card6.add(get_f_MaterialLabel72());
      card6.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card6;
    }

    /**
     * Getter for circLabel1 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.addins.client.circularprogress.MaterialCircularProgress get_circLabel1() {
      return build_circLabel1();
    }
    private gwt.material.design.addins.client.circularprogress.MaterialCircularProgress build_circLabel1() {
      // Creation section.
      final gwt.material.design.addins.client.circularprogress.MaterialCircularProgress circLabel1 = (gwt.material.design.addins.client.circularprogress.MaterialCircularProgress) GWT.create(gwt.material.design.addins.client.circularprogress.MaterialCircularProgress.class);
      // Setup section.
      circLabel1.setSize(166);
      circLabel1.setFontSize("2em");
      circLabel1.setPaddingTop(15);
      circLabel1.setValue(0.75);

      return circLabel1;
    }

    /**
     * Getter for f_MaterialLabel71 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel71() {
      return build_f_MaterialLabel71();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel71() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel71 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel71.setFontSize("2em");
      f_MaterialLabel71.setText("PKLdesain");
      f_MaterialLabel71.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel71;
    }

    /**
     * Getter for f_MaterialLabel72 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel72() {
      return build_f_MaterialLabel72();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel72() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel72 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel72.setFontSize("0.8em");
      f_MaterialLabel72.setText("PKLdesain");
      f_MaterialLabel72.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel72;
    }

    /**
     * Getter for f_MaterialColumn73 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn73() {
      return build_f_MaterialColumn73();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn73() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn73 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn73.add(get_card5());
      f_MaterialColumn73.setGrid("14");

      return f_MaterialColumn73;
    }

    /**
     * Getter for card5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card5() {
      return build_card5();
    }
    private gwt.material.design.client.ui.MaterialCard build_card5() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card5 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card5.add(get_f_MaterialCardAction74());
      card5.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card5;
    }

    /**
     * Getter for f_MaterialCardAction74 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialCardAction get_f_MaterialCardAction74() {
      return build_f_MaterialCardAction74();
    }
    private gwt.material.design.client.ui.MaterialCardAction build_f_MaterialCardAction74() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCardAction f_MaterialCardAction74 = (gwt.material.design.client.ui.MaterialCardAction) GWT.create(gwt.material.design.client.ui.MaterialCardAction.class);
      // Setup section.
      f_MaterialCardAction74.add(get_f_MaterialIcon75());
      f_MaterialCardAction74.add(get_f_MaterialLabel76());
      f_MaterialCardAction74.add(get_f_MaterialLabel77());

      return f_MaterialCardAction74;
    }

    /**
     * Getter for f_MaterialIcon75 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialIcon get_f_MaterialIcon75() {
      return build_f_MaterialIcon75();
    }
    private gwt.material.design.client.ui.MaterialIcon build_f_MaterialIcon75() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialIcon f_MaterialIcon75 = (gwt.material.design.client.ui.MaterialIcon) GWT.create(gwt.material.design.client.ui.MaterialIcon.class);
      // Setup section.
      f_MaterialIcon75.setIconType(gwt.material.design.client.constants.IconType.HOME);
      f_MaterialIcon75.setIconSize(gwt.material.design.client.constants.IconSize.LARGE);
      f_MaterialIcon75.setTextColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      f_MaterialIcon75.setMarginTop(50);

      return f_MaterialIcon75;
    }

    /**
     * Getter for f_MaterialLabel76 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel76() {
      return build_f_MaterialLabel76();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel76() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel76 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel76.setFontSize("2em");
      f_MaterialLabel76.setText("PKLdesain");
      f_MaterialLabel76.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel76;
    }

    /**
     * Getter for f_MaterialLabel77 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel77() {
      return build_f_MaterialLabel77();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel77() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel77 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel77.setFontSize("0.8em");
      f_MaterialLabel77.setText("PKLdesain");
      f_MaterialLabel77.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel77;
    }

    /**
     * Getter for f_MaterialRow78 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialRow get_f_MaterialRow78() {
      return build_f_MaterialRow78();
    }
    private gwt.material.design.client.ui.MaterialRow build_f_MaterialRow78() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialRow f_MaterialRow78 = (gwt.material.design.client.ui.MaterialRow) GWT.create(gwt.material.design.client.ui.MaterialRow.class);
      // Setup section.
      f_MaterialRow78.add(get_f_MaterialColumn79());
      f_MaterialRow78.add(get_f_MaterialColumn82());
      f_MaterialRow78.add(get_f_MaterialColumn87());
      f_MaterialRow78.add(get_f_MaterialColumn92());
      f_MaterialRow78.setPaddingTop(120);
      f_MaterialRow78.setId("tab2");

      return f_MaterialRow78;
    }

    /**
     * Getter for f_MaterialColumn79 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn79() {
      return build_f_MaterialColumn79();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn79() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn79 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn79.add(get_card7());
      f_MaterialColumn79.setGrid("l5 m6 s12");

      return f_MaterialColumn79;
    }

    /**
     * Getter for card7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card7() {
      return build_card7();
    }
    private gwt.material.design.client.ui.MaterialCard build_card7() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card7 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card7.add(get_circLabel2());
      card7.add(get_f_MaterialLabel80());
      card7.add(get_f_MaterialLabel81());
      card7.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card7;
    }

    /**
     * Getter for circLabel2 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.addins.client.circularprogress.MaterialCircularProgress get_circLabel2() {
      return build_circLabel2();
    }
    private gwt.material.design.addins.client.circularprogress.MaterialCircularProgress build_circLabel2() {
      // Creation section.
      final gwt.material.design.addins.client.circularprogress.MaterialCircularProgress circLabel2 = (gwt.material.design.addins.client.circularprogress.MaterialCircularProgress) GWT.create(gwt.material.design.addins.client.circularprogress.MaterialCircularProgress.class);
      // Setup section.
      circLabel2.setSize(166);
      circLabel2.setFontSize("2em");
      circLabel2.setPaddingTop(15);
      circLabel2.setValue(0.75);

      return circLabel2;
    }

    /**
     * Getter for f_MaterialLabel80 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel80() {
      return build_f_MaterialLabel80();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel80() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel80 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel80.setFontSize("2em");
      f_MaterialLabel80.setText("PKLdesain");
      f_MaterialLabel80.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel80;
    }

    /**
     * Getter for f_MaterialLabel81 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel81() {
      return build_f_MaterialLabel81();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel81() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel81 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel81.setFontSize("0.8em");
      f_MaterialLabel81.setText("PKLdesain");
      f_MaterialLabel81.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel81;
    }

    /**
     * Getter for f_MaterialColumn82 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn82() {
      return build_f_MaterialColumn82();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn82() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn82 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn82.add(get_card8());
      f_MaterialColumn82.setGrid("16 m4 s12");

      return f_MaterialColumn82;
    }

    /**
     * Getter for card8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card8() {
      return build_card8();
    }
    private gwt.material.design.client.ui.MaterialCard build_card8() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card8 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card8.add(get_f_MaterialCardAction83());
      card8.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card8;
    }

    /**
     * Getter for f_MaterialCardAction83 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialCardAction get_f_MaterialCardAction83() {
      return build_f_MaterialCardAction83();
    }
    private gwt.material.design.client.ui.MaterialCardAction build_f_MaterialCardAction83() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCardAction f_MaterialCardAction83 = (gwt.material.design.client.ui.MaterialCardAction) GWT.create(gwt.material.design.client.ui.MaterialCardAction.class);
      // Setup section.
      f_MaterialCardAction83.add(get_f_MaterialIcon84());
      f_MaterialCardAction83.add(get_f_MaterialLabel85());
      f_MaterialCardAction83.add(get_f_MaterialLabel86());

      return f_MaterialCardAction83;
    }

    /**
     * Getter for f_MaterialIcon84 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialIcon get_f_MaterialIcon84() {
      return build_f_MaterialIcon84();
    }
    private gwt.material.design.client.ui.MaterialIcon build_f_MaterialIcon84() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialIcon f_MaterialIcon84 = (gwt.material.design.client.ui.MaterialIcon) GWT.create(gwt.material.design.client.ui.MaterialIcon.class);
      // Setup section.
      f_MaterialIcon84.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialIcon84.setIconSize(gwt.material.design.client.constants.IconSize.LARGE);
      f_MaterialIcon84.setTextColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      f_MaterialIcon84.setMarginTop(50);

      return f_MaterialIcon84;
    }

    /**
     * Getter for f_MaterialLabel85 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel85() {
      return build_f_MaterialLabel85();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel85() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel85 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel85.setFontSize("2em");
      f_MaterialLabel85.setText("PKLdesain");
      f_MaterialLabel85.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel85;
    }

    /**
     * Getter for f_MaterialLabel86 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel86() {
      return build_f_MaterialLabel86();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel86() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel86 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel86.setFontSize("0.8em");
      f_MaterialLabel86.setText("PKLdesain");
      f_MaterialLabel86.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel86;
    }

    /**
     * Getter for f_MaterialColumn87 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn87() {
      return build_f_MaterialColumn87();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn87() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn87 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn87.add(get_card9());
      f_MaterialColumn87.setGrid("16 m3 s12");

      return f_MaterialColumn87;
    }

    /**
     * Getter for card9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card9() {
      return build_card9();
    }
    private gwt.material.design.client.ui.MaterialCard build_card9() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card9 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card9.add(get_f_MaterialCardAction88());
      card9.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card9;
    }

    /**
     * Getter for f_MaterialCardAction88 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialCardAction get_f_MaterialCardAction88() {
      return build_f_MaterialCardAction88();
    }
    private gwt.material.design.client.ui.MaterialCardAction build_f_MaterialCardAction88() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCardAction f_MaterialCardAction88 = (gwt.material.design.client.ui.MaterialCardAction) GWT.create(gwt.material.design.client.ui.MaterialCardAction.class);
      // Setup section.
      f_MaterialCardAction88.add(get_f_MaterialIcon89());
      f_MaterialCardAction88.add(get_f_MaterialLabel90());
      f_MaterialCardAction88.add(get_f_MaterialLabel91());

      return f_MaterialCardAction88;
    }

    /**
     * Getter for f_MaterialIcon89 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialIcon get_f_MaterialIcon89() {
      return build_f_MaterialIcon89();
    }
    private gwt.material.design.client.ui.MaterialIcon build_f_MaterialIcon89() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialIcon f_MaterialIcon89 = (gwt.material.design.client.ui.MaterialIcon) GWT.create(gwt.material.design.client.ui.MaterialIcon.class);
      // Setup section.
      f_MaterialIcon89.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialIcon89.setIconSize(gwt.material.design.client.constants.IconSize.LARGE);
      f_MaterialIcon89.setTextColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      f_MaterialIcon89.setMarginTop(50);

      return f_MaterialIcon89;
    }

    /**
     * Getter for f_MaterialLabel90 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel90() {
      return build_f_MaterialLabel90();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel90() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel90 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel90.setFontSize("2em");
      f_MaterialLabel90.setText("PKLdesain");
      f_MaterialLabel90.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel90;
    }

    /**
     * Getter for f_MaterialLabel91 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel91() {
      return build_f_MaterialLabel91();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel91() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel91 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel91.setFontSize("0.8em");
      f_MaterialLabel91.setText("PKLdesain");
      f_MaterialLabel91.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel91;
    }

    /**
     * Getter for f_MaterialColumn92 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn92() {
      return build_f_MaterialColumn92();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn92() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn92 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn92.add(get_card10());
      f_MaterialColumn92.setGrid("14");

      return f_MaterialColumn92;
    }

    /**
     * Getter for card10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card10() {
      return build_card10();
    }
    private gwt.material.design.client.ui.MaterialCard build_card10() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card10 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card10.add(get_f_MaterialCardAction93());
      card10.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card10;
    }

    /**
     * Getter for f_MaterialCardAction93 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialCardAction get_f_MaterialCardAction93() {
      return build_f_MaterialCardAction93();
    }
    private gwt.material.design.client.ui.MaterialCardAction build_f_MaterialCardAction93() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCardAction f_MaterialCardAction93 = (gwt.material.design.client.ui.MaterialCardAction) GWT.create(gwt.material.design.client.ui.MaterialCardAction.class);
      // Setup section.
      f_MaterialCardAction93.add(get_f_MaterialIcon94());
      f_MaterialCardAction93.add(get_f_MaterialLabel95());
      f_MaterialCardAction93.add(get_f_MaterialLabel96());

      return f_MaterialCardAction93;
    }

    /**
     * Getter for f_MaterialIcon94 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialIcon get_f_MaterialIcon94() {
      return build_f_MaterialIcon94();
    }
    private gwt.material.design.client.ui.MaterialIcon build_f_MaterialIcon94() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialIcon f_MaterialIcon94 = (gwt.material.design.client.ui.MaterialIcon) GWT.create(gwt.material.design.client.ui.MaterialIcon.class);
      // Setup section.
      f_MaterialIcon94.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialIcon94.setIconSize(gwt.material.design.client.constants.IconSize.LARGE);
      f_MaterialIcon94.setTextColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      f_MaterialIcon94.setMarginTop(50);

      return f_MaterialIcon94;
    }

    /**
     * Getter for f_MaterialLabel95 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel95() {
      return build_f_MaterialLabel95();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel95() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel95 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel95.setFontSize("2em");
      f_MaterialLabel95.setText("PKLdesain");
      f_MaterialLabel95.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel95;
    }

    /**
     * Getter for f_MaterialLabel96 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel96() {
      return build_f_MaterialLabel96();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel96() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel96 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel96.setFontSize("0.8em");
      f_MaterialLabel96.setText("PKLdesain");
      f_MaterialLabel96.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel96;
    }

    /**
     * Getter for f_MaterialRow97 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialRow get_f_MaterialRow97() {
      return build_f_MaterialRow97();
    }
    private gwt.material.design.client.ui.MaterialRow build_f_MaterialRow97() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialRow f_MaterialRow97 = (gwt.material.design.client.ui.MaterialRow) GWT.create(gwt.material.design.client.ui.MaterialRow.class);
      // Setup section.
      f_MaterialRow97.add(get_f_MaterialColumn98());
      f_MaterialRow97.add(get_f_MaterialColumn101());
      f_MaterialRow97.add(get_f_MaterialColumn106());
      f_MaterialRow97.add(get_f_MaterialColumn111());
      f_MaterialRow97.add(get_f_MaterialColumn116());
      f_MaterialRow97.setPaddingTop(120);
      f_MaterialRow97.setId("tab3");

      return f_MaterialRow97;
    }

    /**
     * Getter for f_MaterialColumn98 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn98() {
      return build_f_MaterialColumn98();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn98() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn98 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn98.add(get_card11());
      f_MaterialColumn98.setGrid("l5 m6 s12");

      return f_MaterialColumn98;
    }

    /**
     * Getter for card11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card11() {
      return build_card11();
    }
    private gwt.material.design.client.ui.MaterialCard build_card11() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card11 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card11.add(get_circLabel3());
      card11.add(get_f_MaterialLabel99());
      card11.add(get_f_MaterialLabel100());
      card11.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card11;
    }

    /**
     * Getter for circLabel3 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.addins.client.circularprogress.MaterialCircularProgress get_circLabel3() {
      return build_circLabel3();
    }
    private gwt.material.design.addins.client.circularprogress.MaterialCircularProgress build_circLabel3() {
      // Creation section.
      final gwt.material.design.addins.client.circularprogress.MaterialCircularProgress circLabel3 = (gwt.material.design.addins.client.circularprogress.MaterialCircularProgress) GWT.create(gwt.material.design.addins.client.circularprogress.MaterialCircularProgress.class);
      // Setup section.
      circLabel3.setSize(166);
      circLabel3.setFontSize("2em");
      circLabel3.setPaddingTop(15);
      circLabel3.setValue(0.75);

      return circLabel3;
    }

    /**
     * Getter for f_MaterialLabel99 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel99() {
      return build_f_MaterialLabel99();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel99() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel99 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel99.setFontSize("2em");
      f_MaterialLabel99.setText("PKLdesain");
      f_MaterialLabel99.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel99;
    }

    /**
     * Getter for f_MaterialLabel100 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel100() {
      return build_f_MaterialLabel100();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel100() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel100 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel100.setFontSize("0.8em");
      f_MaterialLabel100.setText("PKLdesain");
      f_MaterialLabel100.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel100;
    }

    /**
     * Getter for f_MaterialColumn101 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn101() {
      return build_f_MaterialColumn101();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn101() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn101 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn101.add(get_card12());
      f_MaterialColumn101.setGrid("16 m4 s12");

      return f_MaterialColumn101;
    }

    /**
     * Getter for card12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card12() {
      return build_card12();
    }
    private gwt.material.design.client.ui.MaterialCard build_card12() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card12 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card12.add(get_f_MaterialCardAction102());
      card12.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card12;
    }

    /**
     * Getter for f_MaterialCardAction102 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialCardAction get_f_MaterialCardAction102() {
      return build_f_MaterialCardAction102();
    }
    private gwt.material.design.client.ui.MaterialCardAction build_f_MaterialCardAction102() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCardAction f_MaterialCardAction102 = (gwt.material.design.client.ui.MaterialCardAction) GWT.create(gwt.material.design.client.ui.MaterialCardAction.class);
      // Setup section.
      f_MaterialCardAction102.add(get_f_MaterialIcon103());
      f_MaterialCardAction102.add(get_f_MaterialLabel104());
      f_MaterialCardAction102.add(get_f_MaterialLabel105());

      return f_MaterialCardAction102;
    }

    /**
     * Getter for f_MaterialIcon103 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialIcon get_f_MaterialIcon103() {
      return build_f_MaterialIcon103();
    }
    private gwt.material.design.client.ui.MaterialIcon build_f_MaterialIcon103() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialIcon f_MaterialIcon103 = (gwt.material.design.client.ui.MaterialIcon) GWT.create(gwt.material.design.client.ui.MaterialIcon.class);
      // Setup section.
      f_MaterialIcon103.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialIcon103.setIconSize(gwt.material.design.client.constants.IconSize.LARGE);
      f_MaterialIcon103.setTextColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      f_MaterialIcon103.setMarginTop(50);

      return f_MaterialIcon103;
    }

    /**
     * Getter for f_MaterialLabel104 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel104() {
      return build_f_MaterialLabel104();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel104() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel104 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel104.setFontSize("2em");
      f_MaterialLabel104.setText("PKLdesain");
      f_MaterialLabel104.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel104;
    }

    /**
     * Getter for f_MaterialLabel105 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel105() {
      return build_f_MaterialLabel105();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel105() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel105 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel105.setFontSize("0.8em");
      f_MaterialLabel105.setText("PKLdesain");
      f_MaterialLabel105.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel105;
    }

    /**
     * Getter for f_MaterialColumn106 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn106() {
      return build_f_MaterialColumn106();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn106() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn106 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn106.add(get_card13());
      f_MaterialColumn106.setGrid("16 m3 s12");

      return f_MaterialColumn106;
    }

    /**
     * Getter for card13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card13() {
      return build_card13();
    }
    private gwt.material.design.client.ui.MaterialCard build_card13() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card13 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card13.add(get_f_MaterialCardAction107());
      card13.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card13;
    }

    /**
     * Getter for f_MaterialCardAction107 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialCardAction get_f_MaterialCardAction107() {
      return build_f_MaterialCardAction107();
    }
    private gwt.material.design.client.ui.MaterialCardAction build_f_MaterialCardAction107() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCardAction f_MaterialCardAction107 = (gwt.material.design.client.ui.MaterialCardAction) GWT.create(gwt.material.design.client.ui.MaterialCardAction.class);
      // Setup section.
      f_MaterialCardAction107.add(get_f_MaterialIcon108());
      f_MaterialCardAction107.add(get_f_MaterialLabel109());
      f_MaterialCardAction107.add(get_f_MaterialLabel110());

      return f_MaterialCardAction107;
    }

    /**
     * Getter for f_MaterialIcon108 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialIcon get_f_MaterialIcon108() {
      return build_f_MaterialIcon108();
    }
    private gwt.material.design.client.ui.MaterialIcon build_f_MaterialIcon108() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialIcon f_MaterialIcon108 = (gwt.material.design.client.ui.MaterialIcon) GWT.create(gwt.material.design.client.ui.MaterialIcon.class);
      // Setup section.
      f_MaterialIcon108.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialIcon108.setIconSize(gwt.material.design.client.constants.IconSize.LARGE);
      f_MaterialIcon108.setTextColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      f_MaterialIcon108.setMarginTop(50);

      return f_MaterialIcon108;
    }

    /**
     * Getter for f_MaterialLabel109 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel109() {
      return build_f_MaterialLabel109();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel109() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel109 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel109.setFontSize("2em");
      f_MaterialLabel109.setText("PKLdesain");
      f_MaterialLabel109.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel109;
    }

    /**
     * Getter for f_MaterialLabel110 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel110() {
      return build_f_MaterialLabel110();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel110() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel110 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel110.setFontSize("0.8em");
      f_MaterialLabel110.setText("PKLdesain");
      f_MaterialLabel110.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel110;
    }

    /**
     * Getter for f_MaterialColumn111 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn111() {
      return build_f_MaterialColumn111();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn111() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn111 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn111.add(get_card14());
      f_MaterialColumn111.setGrid("14");

      return f_MaterialColumn111;
    }

    /**
     * Getter for card14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card14() {
      return build_card14();
    }
    private gwt.material.design.client.ui.MaterialCard build_card14() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card14 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card14.add(get_f_MaterialCardAction112());
      card14.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card14;
    }

    /**
     * Getter for f_MaterialCardAction112 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialCardAction get_f_MaterialCardAction112() {
      return build_f_MaterialCardAction112();
    }
    private gwt.material.design.client.ui.MaterialCardAction build_f_MaterialCardAction112() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCardAction f_MaterialCardAction112 = (gwt.material.design.client.ui.MaterialCardAction) GWT.create(gwt.material.design.client.ui.MaterialCardAction.class);
      // Setup section.
      f_MaterialCardAction112.add(get_f_MaterialIcon113());
      f_MaterialCardAction112.add(get_f_MaterialLabel114());
      f_MaterialCardAction112.add(get_f_MaterialLabel115());

      return f_MaterialCardAction112;
    }

    /**
     * Getter for f_MaterialIcon113 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialIcon get_f_MaterialIcon113() {
      return build_f_MaterialIcon113();
    }
    private gwt.material.design.client.ui.MaterialIcon build_f_MaterialIcon113() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialIcon f_MaterialIcon113 = (gwt.material.design.client.ui.MaterialIcon) GWT.create(gwt.material.design.client.ui.MaterialIcon.class);
      // Setup section.
      f_MaterialIcon113.setIconType(gwt.material.design.client.constants.IconType.POLYMER);
      f_MaterialIcon113.setIconSize(gwt.material.design.client.constants.IconSize.LARGE);
      f_MaterialIcon113.setTextColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      f_MaterialIcon113.setMarginTop(50);

      return f_MaterialIcon113;
    }

    /**
     * Getter for f_MaterialLabel114 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel114() {
      return build_f_MaterialLabel114();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel114() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel114 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel114.setFontSize("2em");
      f_MaterialLabel114.setText("PKLdesain");
      f_MaterialLabel114.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel114;
    }

    /**
     * Getter for f_MaterialLabel115 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel115() {
      return build_f_MaterialLabel115();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel115() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel115 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel115.setFontSize("0.8em");
      f_MaterialLabel115.setText("PKLdesain");
      f_MaterialLabel115.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel115;
    }

    /**
     * Getter for f_MaterialColumn116 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialColumn get_f_MaterialColumn116() {
      return build_f_MaterialColumn116();
    }
    private gwt.material.design.client.ui.MaterialColumn build_f_MaterialColumn116() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialColumn f_MaterialColumn116 = (gwt.material.design.client.ui.MaterialColumn) GWT.create(gwt.material.design.client.ui.MaterialColumn.class);
      // Setup section.
      f_MaterialColumn116.add(get_card16());
      f_MaterialColumn116.setGrid("l5 m6 s12");

      return f_MaterialColumn116;
    }

    /**
     * Getter for card16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialCard get_card16() {
      return build_card16();
    }
    private gwt.material.design.client.ui.MaterialCard build_card16() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialCard card16 = (gwt.material.design.client.ui.MaterialCard) GWT.create(gwt.material.design.client.ui.MaterialCard.class);
      // Setup section.
      card16.add(get_circLabel4());
      card16.add(get_f_MaterialLabel117());
      card16.add(get_f_MaterialLabel118());
      card16.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);

      return card16;
    }

    /**
     * Getter for circLabel4 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.addins.client.circularprogress.MaterialCircularProgress get_circLabel4() {
      return build_circLabel4();
    }
    private gwt.material.design.addins.client.circularprogress.MaterialCircularProgress build_circLabel4() {
      // Creation section.
      final gwt.material.design.addins.client.circularprogress.MaterialCircularProgress circLabel4 = (gwt.material.design.addins.client.circularprogress.MaterialCircularProgress) GWT.create(gwt.material.design.addins.client.circularprogress.MaterialCircularProgress.class);
      // Setup section.
      circLabel4.setSize(166);
      circLabel4.setFontSize("2em");
      circLabel4.setPaddingTop(15);
      circLabel4.setValue(0.75);

      return circLabel4;
    }

    /**
     * Getter for f_MaterialLabel117 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel117() {
      return build_f_MaterialLabel117();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel117() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel117 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel117.setFontSize("2em");
      f_MaterialLabel117.setText("PKLdesain");
      f_MaterialLabel117.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel117;
    }

    /**
     * Getter for f_MaterialLabel118 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel118() {
      return build_f_MaterialLabel118();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel118() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel118 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel118.setFontSize("0.8em");
      f_MaterialLabel118.setText("PKLdesain");
      f_MaterialLabel118.setTextColor(gwt.material.design.client.constants.Color.BLUE);

      return f_MaterialLabel118;
    }

    /**
     * Getter for f_MaterialFAB119 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialFAB get_f_MaterialFAB119() {
      return build_f_MaterialFAB119();
    }
    private gwt.material.design.client.ui.MaterialFAB build_f_MaterialFAB119() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialFAB f_MaterialFAB119 = (gwt.material.design.client.ui.MaterialFAB) GWT.create(gwt.material.design.client.ui.MaterialFAB.class);
      // Setup section.
      f_MaterialFAB119.add(get_btnAdd());

      return f_MaterialFAB119;
    }

    /**
     * Getter for btnAdd called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialButton get_btnAdd() {
      return build_btnAdd();
    }
    private gwt.material.design.client.ui.MaterialButton build_btnAdd() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialButton btnAdd = (gwt.material.design.client.ui.MaterialButton) GWT.create(gwt.material.design.client.ui.MaterialButton.class);
      // Setup section.
      btnAdd.setBackgroundColor(gwt.material.design.client.constants.Color.BLUE_DARKEN_1);
      btnAdd.setSize(gwt.material.design.client.constants.ButtonSize.LARGE);
      btnAdd.setIconType(gwt.material.design.client.constants.IconType.ADD);
      btnAdd.setType(gwt.material.design.client.constants.ButtonType.FLOATING);
      btnAdd.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.btnAdd = btnAdd;

      return btnAdd;
    }
  }
}
