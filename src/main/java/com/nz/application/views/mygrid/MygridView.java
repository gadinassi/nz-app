package com.nz.application.views.mygrid;

import com.nz.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("mygrid")
@Route(value = "my-view", layout = MainLayout.class)
@Uses(Icon.class)
public class MygridView extends Composite<VerticalLayout> {

    public MygridView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
