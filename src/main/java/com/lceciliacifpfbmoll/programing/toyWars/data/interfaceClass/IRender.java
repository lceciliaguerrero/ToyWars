package com.lceciliacifpfbmoll.programing.toyWars.data.interfaceClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.RenderType;

public interface IRender {

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //-----> clase LifeBeing <-----
    //doRender();
    //String doRender(RenderType renderType);
    String doRender(RenderType renderType);

    //RenderType
    //printHtml();
    String printHtml();

    //printJson();
    String printJson();

    //printConsole();
    String printConsole();

    //printError();
    String printError();
}
