package cf.paradoxie.observerdemo;

/**
 * Created by xiehehe on 2016/10/24.
 */

public interface Mistakable {//可能会搞事的

    void add(Watcher watcher);//引起一些张眼睛的人注意

    void steal(String s);//搞事
}
