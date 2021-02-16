package com.lceciliacifpfbmoll.programing.toyWars.data.interfaceClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.RenderType;

public interface IRender {

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //-----> clase LifeBeing <-----
    //doRender();
    //String doRender(RenderType renderType);
    void doRender(RenderType renderType);

    //RenderType
    //printHtml();
    void printHtml();

    //printJson();
    void printJson();

    //printConsole();
    void printConsole();

    //printError();
    void printError();
}
