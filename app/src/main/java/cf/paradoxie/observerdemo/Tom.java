package cf.paradoxie.observerdemo;/**
 * Created by xiehehe on 2016/10/24.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * User: xiehehe
 * Date: 2016-10-24
 * Time: 18:48
 * FIXME
 */
public class Tom implements Mistakable {
    // 技术不行，可能被好多人看到
    private List<Watcher> mWatchers = new ArrayList<>();

    @Override
    public void add(Watcher watcher) {
        mWatchers.add(watcher);//被看到了
    }

    @Override
    public void steal(String s) {//开始偷东西的时候被发现
        for (Watcher watcher : mWatchers) {
            watcher.Discover(s);
        }

    }
}
