package modeling.greedy;

import java.util.*;

/*
假设存在如下表的需要付费的广播台，以及广播台信号可以覆盖的地区。 如何选择最少的广播台，让所有的地区都可以接收到信号。
广播台	覆盖地区
K1	ID,NV,UT
K2	WA,ID,MT
K3	OR,NV,CA
K4	NV,UT
K5	CA,AZ
...	...
 */
public class CollectionCoverage {
    public static void main(String ... args) {
        HashMap<String, HashSet<String>> initData = new HashMap<>();
        initData.put("K1", new HashSet<>(Arrays.asList(new String[]{
                "ID", "NV", "UT"
        })));
        //todo initData
        HashSet<String> target = new HashSet<>(Arrays.asList(new String[]{"ID","NV","UT","WA","MT","OR","CA","AZ"}));
        List<String> result = new ArrayList<>();
        HashSet<String> tmp = new HashSet<>();//临时变量
        /*
            当target不为空
            for initData 取 覆盖最大的列表
            当前最大列表对应key存入result
            target去掉覆盖的元素
         */
    }

}
