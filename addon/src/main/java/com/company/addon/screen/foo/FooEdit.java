package com.company.addon.screen.foo;

import com.company.addon.entity.Foo;
import io.jmix.ui.navigation.Route;
import io.jmix.ui.screen.EditedEntityContainer;
import io.jmix.ui.screen.StandardEditor;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("addon_Foo.edit")
@UiDescriptor("foo-edit.xml")
@EditedEntityContainer("fooDc")
@Route(value = "foos/edit", parentPrefix = "foos")
public class FooEdit extends StandardEditor<Foo> {
}