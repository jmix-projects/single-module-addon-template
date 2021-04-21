package com.company.addon.screen.foo;

import com.company.addon.entity.Foo;
import io.jmix.ui.navigation.Route;
import io.jmix.ui.screen.*;

@UiController("addon_Foo.browse")
@UiDescriptor("foo-browse.xml")
@LookupComponent("foosTable")
@Route("foos")
public class FooBrowse extends StandardLookup<Foo> {
}