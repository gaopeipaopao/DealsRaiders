package com.example.gaope.dealsraiders.ToolHomeFragmentClass;

import com.example.gaope.dealsraiders.R;

/**
 * 返回图文混排的文字和图片的数据
 * Created by gaope on 2018/6/6.
 */


public class Data {


    /**
     * 标题，TITLRE
     */
    public static String TAG_TITLE = "[TITLE]";

    /**
     * 文本，含有TAG_TEXT，则说明为文字
     */
    public static String TAG_TEXT = "[TEXT]";

    /**
     * 网络图片地址，含有TAG_URL_IMAGE，则说明为网络图片
     */
    public static String TAG_URL_IMAGE = "[URL_IMAGE]";

    /**
     * 本地图片，含有TAG_DRAWABLE_IMAGE，则说明为本地图片
     */
    public static String TAG_DRAWABLE_IMAGE = "[DRAWABLE_IMAGE]";

    /**
     * 分隔，通过TAG_SPACE来区分数据，分开图片与文字
     */
    public static String TAG_SPACE = "\\[SPACE\\]";

    private String data1;
    private String data2;
    private String data3;
    private String data4;
    private String data5;

    /**
     * 来判断是需要哪个data
     */
    private String data;





    public Data(String data){
        this.data = data;
    }

    public static String getData(){
        int resId1 = R.drawable.photo5_one;
        int resId2 = R.drawable.photo5_two;
        int resId3 = R.drawable.photo5_three ;
        int resId4 ;
        int resId5 ;
        int resId6 ;
        int resId7 ;
        int resId8 ;
        int resId9 ;
        int resId10 ;
        String res1 = String .valueOf(resId1);
        String res2 = String .valueOf(resId2);
        String res3 = String .valueOf(resId3);
//        String res4 = String .valueOf(resId4);
//        String res5 = String .valueOf(resId5);
//        String res6 = String .valueOf(resId6);
//        String res7 = String .valueOf(resId7);
//        String res8 = String .valueOf(resId8);
//        String res9 = String .valueOf(resId9);
//        String res10 = String .valueOf(resId10);
        String data1 =
                "[TITLE]再走老路"
                        + "[SPACE]"+
                "[TEXT]南浔，江南水乡六大古镇之一，浙江省15个历史文化名镇之首。南 浔建镇多年，这里人文景观和古迹众多：小桥流水人家的明代建筑 百间楼；驰名全国的嘉业藏书楼；江南园林佳作小莲庄；张静江、 张石铭等名人故居；丝业会馆、明清石拱古桥等，与自然景观融为 一体，成为浙江文化之瑰宝。同时，南浔所产“辑里湖丝”驰名中 外，成为“耕桑之富，甲于浙右”。在中国近代史上，南浔还是罕 见的一个巨富之镇，有被称为“四象八牛七十二金黄狗”的百余家 丝商巨富，以清代著名的政治家、书法家刘镛为代表。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]"+ res1
                        + "[SPACE]"
                        + "[TEXT]南浔古镇一年四季皆宜旅游，相对而言，以春暖花开或秋风送爽之 时为最佳。南浔的春天，水暖花开，阳光明媚，沿河两岸新绿的柳 树分外迷人，是水上游古镇镇的最好时节。秋季凉风习习，行走于 古镇细长的石板路，感受百间楼无穷的古朴与温美，让人沉醉其中。 然而，夏冬两季也各有看点。夏天是赏小莲庄荷花的最好时候，满 池盛开的荷花掩映与宅院古楼阁之中，美不可言。冬季，古镇春节 的热闹气氛与古建筑散发的浓厚文化气息，会让人流连忘返。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res2
                        + "[SPACE]"
                        + "[TEXT]嘉业堂藏书楼 "
                        + "[SPACE]"
                        + "[TEXT]嘉业堂藏书楼与小莲庄毗邻，因清帝溥仪所赠“钦若嘉业”九龙金 匾而得名。是中国近代著名的私家藏书楼之一。  "
                        + "[SPACE]"
                        + "[TEXT]小莲庄 "
                        + "[SPACE]"
                        + "[TEXT]小莲庄紧挨着藏书楼，是清光禄大夫刘镛的庄园，以义庄、家庙和 园林三部分组成，始建于光绪十一年，是刘镛三代用了40多年的时 间建成的。 "
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res3
                        + "[SPACE]"
                        + "[TEXT]张石铭旧宅 "
                        + "[SPACE]"
                        + "[TEXT]张石铭旧宅是江南巨富、南浔“四象”之一张颂贤之孙张均衡所建 的大宅院，是江南罕见的基本保持明清历史旧貌的豪门巨宅之一， 是一座中西合璧式楼群的经典建筑，被称为“江南第一民宅”。 "
                        + "[SPACE]"
                        + "[TEXT]南浔古镇住宿非常丰富，这里不仅有现代的大酒店、快捷酒店等， 还有不少家庭旅馆，入住家庭旅馆可以切身体会古镇生活。其中， 百间楼古宅住宿是南浔古镇的最大特色，洋隘着水乡居居的灵气。 这里沿河是长街，沿街房屋大多为前店后宅。大户人家内有前、后 花园，是体验南浔特色的最佳住宿点。价格基本在150元左右，环 境优雅，十分惬意  "
                        + "[SPACE]"
                        + "[TEXT]建议穿着运动舒适的鞋，镇上的景区地面是石板路，穿高跟鞋很累。 ";


        return data1;
    }
}
