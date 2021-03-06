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



    /**
     * 来判断是需要哪个data
     */
    private String data;





    public Data(String data){
        this.data = data;
    }

    public  String getData(){
        int resId1 = R.drawable.photo5_one;
        int resId2 = R.drawable.photo5_two;
        int resId3 = R.drawable.photo5_three ;

        //藏族儿女
        int resId4 = R.drawable.zangzu1 ;
        int resId5 = R.drawable.zangzu2 ;
        int resId6 = R.drawable.zangzu3 ;

        //大兴安岭
        int resId7 = R.drawable.daxingan1;
        int resId8 = R.drawable.daxingan2;
        int resId9 = R.drawable.daxingan3 ;
        int resId10 = R.drawable.daxingan4 ;

        int resId11 = R.drawable.hanbian1;
        int resId12 = R.drawable.hanbian2;
        int resId13 = R.drawable.hanbian3 ;
        int resId14 = R.drawable.daqiao1 ;
        int resId15 = R.drawable.daqiao2;
        int resId16 = R.drawable.minzu1;
        int resId17 = R.drawable.minzu2 ;
        int resId18 = R.drawable.jingtu1;
        int resId19 = R.drawable.jingtu2;
        int resId20 = R.drawable.jingtu3 ;
        int resId21 = R.drawable.jingtu4 ;


        String res1 = String .valueOf(resId1);
        String res2 = String .valueOf(resId2);
        String res3 = String .valueOf(resId3);
        String res4 = String .valueOf(resId4);
        String res5 = String .valueOf(resId5);
        String res6 = String .valueOf(resId6);
        String res7 = String .valueOf(resId7);
        String res8 = String .valueOf(resId8);
        String res9 = String .valueOf(resId9);
        String res10 = String .valueOf(resId10);
        String res11 = String .valueOf(resId11);
        String res12 = String .valueOf(resId12);
        String res13 = String .valueOf(resId13);
        String res14 = String .valueOf(resId14);
        String res15 = String .valueOf(resId15);
        String res16 = String .valueOf(resId16);
        String res17 = String .valueOf(resId17);
        String res18 = String .valueOf(resId18);
        String res19 = String .valueOf(resId19);
        String res20 = String .valueOf(resId20);
        String res21 = String .valueOf(resId21);



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

        String data2 =
                "[TITLE]藏族儿女们的信仰"
                        + "[SPACE]"+
                        "[TEXT]1.拉帮结派，一起包车去 "
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]"+ res4
                        + "[SPACE]"
                        + "[TEXT]西藏的话除了拉萨市内的景点，其他地方都比较分散，而且班车很少，一般都需要包车去，青旅的公告栏上一般都贴着这几天内要出发的包车团队，在求捡或求被捡，很多，AA制，可以挑个合适的团队报名。 "
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res5
                        + "[SPACE]"
                        + "[TEXT]在拉萨，甜茶是必须喝的，艳遇墙是一直在呆的，酒吧里的青稞酒是要喝的，遇到藏族姐姐阿佳是可以叫的，扎西德勒是要挂嘴边的，这就是拉萨的生活。艳遇墙是拉漂们的聚集地，每天日落到半夜，都有一堆人在这里唠嗑，扯犊子，装纯，等艳遇，也或者等死。里寻找属于自己的一份拉萨情结。  "
                        + "[SPACE]"
                        + "[TEXT]2.西藏各个地区的情况 "
                        + "[SPACE]"
                        + "[TEXT]⑴那曲地区震撼人心的雪山和动物 "
                        + "[SPACE]"
                        + "[TEXT]坐火车走青藏线倒数第二站就是那曲，主要为高山草原景观，畜牧业为主，比较有名的就是赛马节，大概在7，8月份左右举办，藏历是7月中旬，听说会很热闹，有集会和表演之类的，赶上时间去的话应该会很好玩，感受一下藏民骑马时的彪悍、以及粗犷的民风和气氛。 "
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res6
                        + "[SPACE]"
                        + "[TEXT]⑵林芝地区充满诗意的西藏小江南 "
                        + "[SPACE]"
                        + "[TEXT]被称为西藏的小江南，318川藏线为主要道路，雅鲁藏布大峡谷就在这里，还有神湖巴松措，当然往这里去的也还有徒步墨脱的团队，徒步墨脱的话一定需要有当地的向导带路。重要的是最美的是风景往往都是在路途中，看到美丽的地方不妨让司机停下车，缓解一下坐车的压抑，欣赏下美景。拉萨往林芝的团队一般都是5天左右一个来回。"
                        + "[SPACE]"
                        + "[TEXT]⑶山南地区让灵魂在这里洗礼吧"
                        + "[SPACE]"
                        + "[TEXT]山南地区是藏民族的的发祥地，有着很多的寺庙，最有名的就是西藏第一座寺庙——桑耶寺。到这里体验藏传佛教的渊博与精髓，你可以不信佛，但是佛教中的有些知识及观点是你必须要懂的。还有一个必去的地方就是西藏最具传奇色彩的湖泊“拉姆拉措”，话说在这个湖边可以看到自己的前世今生以及未来，信不信就自己去看看咯，去这个湖需要在海拔 5000多米左右徒步登山一段距离，所以做好大口喘气的准备吧。";
        String data3 =
                "[TITLE]彝族"
                        + "[SPACE]"+
                        "[TEXT]凉山拖乌彝族自治州位于四川省西南部，" +
                        "是西部大开发重点地区——“攀西资源综合开发区”的重要组成部份，" +
                        "也是全国最大的彝族聚居区。 凉山拖乌彝族自治州首府西昌市素有“月城”" +
                        "雅称，是世界闻名的航天城，也是中国古代通商要道“南方丝绸之路”的重" +
                        "要聚散中心。 凉山历史悠久，是一个具有光荣革命传统的地区。凉山资源" +
                        "富集，是一块蕴含巨大开发潜力与投资价值的“宝地”。 春夏季节是游玩" +
                        "的最佳季节。螺髻•九十九里是螺髻山景点最为集中的区域，是螺髻山的" +
                        "核心景区。这里一里一个景，九里一个奇观，共九十九景，故名螺髻" +
                        "九十九里。螺髻•九十九里主要景点有：世界最大温泉瀑布(2013年" +
                        "通过世界纪录协会认证）、螺髻第一峰（古人所称的螺髻山）" +
                        "、螺髻第一海（螺髻山最大的湖泊）、螺髻最后的海子（螺髻" +
                        "山海拔最高的湖泊、海拔4000米）、全球罕见的彩虹瀑布" +
                        "（全年彩虹出现次数超过200次）、百瀑谷（成百上千的大小瀑布）、" +
                        "万亩杜鹃花海（螺髻山最美的索玛花海）……"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]"+ res1
                        + "[SPACE]"
                        + "[TEXT]邛海，古称邛池，属更新世早期断陷湖，至今约180万年。其形状如蜗牛，是四川省第二大淡水湖。秋日天高气爽，落霞孤鹜，秋水天长，使人流连忘返。冬季天净水明，红枫翠柏，倒映湖面。午后起风，海浪奔涌，似白鹅嫱戏于波涛上。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res2
                        + "[SPACE]"
                        + "[TEXT]邛海不仅景色秀美，还有众多美妙的民间传说，更烘托出它的神秘和美丽，如李膺《盖州记》和《太平御览》等著述中均有不少记载。邛海湖内有40多种鱼类，其中有特有的白鱼、鲤鱼、大虾、螃蟹等，秋末冬初有19种候鸟携家眷来此过冬。邛海四周有月亮湾，观海湾，青龙湾等景区。"
                        + "[SPACE]"
                        + "[TEXT]泸沽湖位于云南丽江宁蒗县北部永宁乡和四川省盐源县左侧的万山丛中，泸沽湖大落水村距宁蒗县城有73公里，距丽江古城200公里左右。泸沽湖为川滇两省界湖。为四川云南两省共有，湖岸线四川要比云南的湖岸线长约占2/3。泸沽湖面积50多平方千米，海拔2690米，平均水深45米，最深处达93米，透明度高达11米，最大能见度为12米，湖水清澈蔚蓝，是云南海拔最高的湖泊，也是云南第二深的淡水湖之一。湖中有5个全岛、三个半岛和一个海堤连岛，形态各异，翠绿如玉。";
        String data4 =
                "[TITLE]大兴安岭"
                        + "[SPACE]"+
                        "[TEXT]关于路线的选择，十一这个长假很多人都在出去，可是去哪就很有" +
                        "说道了，个人认为想要玩好就要去地广人稀，景色优美的冷门旅行地~！~！" +
                        "十一金秋时期要看什么，我觉得在北方值得推荐的就是大兴安岭。大兴安" +
                        "岭横跨在东北平原上，从黑龙江到内蒙古，区域非常的大，时间的关系我" +
                        "只能选择其中一块来游览。东北的秋天来的是那么早，秋的痕迹从北向南逐" +
                        "渐过渡，从黑龙江开始，每年的九月中下旬是漠河，满归，加格达奇那边的" +
                        "最佳观赏期，而到十月时，兴安盟，克什克腾旗就是最佳的观赏期，过了十" +
                        "月中旬整个大兴安岭基本已经进入冬季的萧条期了，秋叶之静美只能在这短" +
                        "短不到一个月的时间抓紧观看。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]"+ res7
                        + "[SPACE]"
                        + "[TEXT]按照我的原计划是把兴安盟和克什克腾旗的景色都走了，由于只" +
                        "剩我一个司机，为了避免赶路疲劳驾驶，只能割舍掉一个，我选择留下兴安" +
                        "盟，因为从蘑菇气到阿尔山那条景观公路更加的原生态，风光应该也会更好，" +
                        "事实证明我的英明选择是多么正确。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res8
                        + "[SPACE]"
                        + "[TEXT]整个行程走下来大概2500公里，一共六天，因为拍照耽搁时间再加经验不足，" +
                        "开过两天夜路，但距离都不太远。路况很好，车辆不多，极少会遇见石子路，可" +
                        "能会遇见羊群牛群阻塞交通，一般车辆都能胜任这条" +
                        "路线。整条路线几乎没有门票，只有在月亮天池、国门、白狼峰买了门票。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res9
                        + "[SPACE]"
                        + "[TEXT]行前准备：车辆的检查必不可少，提前了预习了各种可" +
                        "能出现的问题，整理救援电话，深入了解路况，谨慎驾驶，还各自买" +
                        "了意外保险~浪出去容易，还得安全的回来。这段路的精华景色区在蘑菇气镇" +
                        "到阿尔山的蘑阿公路，整条路几乎都是水泥修成的两车道，很平整，两边落叶松" +
                        "景色绝美，是真正的秋叶之路，个人认为走过蘑阿公路根本不用买门票进阿尔" +
                        "山森林公园。自驾的快乐不就是自由随性，不被景区所束缚，这条路真的能满足你所有的需要。 "
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res10;

        String data5 =
                "[TITLE]海边阳光"
                        + "[SPACE]"+
                        "[TEXT]北海是广西壮族自治区地级市，位于广西南端，北部湾东北岸。" +
                        "位于东经108°50′45″～109°47′28″，北纬20°26′～21°55′34″之间，西北距首府南宁200零几公里，辖区面积3337平方公里" +
                        "，辖3个市辖区1个县，户籍大概174万人口。北海是全国14个沿海开放城" +
                        "市之一；是古代“  海上丝绸之路”的重要始发港，著名景点有：涠洲岛、北" +
                        "海银滩、园博园、老街、星岛湖、海滩、冠头岭、红树林自然保护区等等。 "
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]"+ res11
                        + "[SPACE]"
                        + "[TEXT]大家应该先去“银滩”了，银滩是北海市的旅游景点，银滩的" +
                        "门票免费的，从市中心打的20来分钟左右，费用也是20到30来块，如果贵的话" +
                        "也可以搭3路、17路、20路、21路" +
                        "、银滩公共汽车，也可以扫一扫共享单骑去，现在都交通都很方便。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res12
                        + "[SPACE]"
                        + "[TEXT]红树林是热带、亚热带海岸" +
                        "潮间带特有的胎生木本植物群落，素有\"海上森林\"之称、倚海而生，" +
                        "随潮涨而隐、潮退而现，百种鸟类、昆虫、贝类、" +
                        "鱼、虾、蟹等生物在此繁衍栖息。最好乘汽车去，因那里比较偏远。"
                        + "[SPACE]"
                        + "[TEXT]北海“桥港”小吃一条街，现在都也叫桥港美食" +
                        "城，白天吃的不是很多，最好到晚上出来吃海鲜。可以先去其它景点玩到了" +
                        "晚上在回来吃海鲜。园博园是北海市获得2014年园博会主办权，园博园是要门票的" +
                        "，大家要准备好￥，如果白天去的话最好带上雨伞。可乘坐101、" +
                        "102路公交在园博园站下车然后步行至景区即可。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res13
                        + "[SPACE]"
                        + "[TEXT]冠头岭可乘坐6路公交车，6路公交车在北部湾" +
                        "广场乘坐，有汽车的话就方便可以自驾到冠头岭公园。"
                        + "[SPACE]"
                        + "[TEXT]涠洲岛涠洲岛是火山喷发堆凝而成岛屿，有海积、" +
                        "，有“蓬莱岛”之称，是中国地质年龄最年轻的火山岛，是广西最大的海岛。涠洲岛要乘船去，船一百多，还要上岛费" +
                        "一百多，一共是两百多，所以去涠洲岛要考虑一下哦！"
                       ;
        String data6 =
                "[TITLE]脚下这大山中的古桥"
                        + "[SPACE]"+
                "[TITLE]上甘棠古村"
                        + "[SPACE]"+
                        "[TITLE]取名诗经：美好的向往"
                        + "[SPACE]"+
                        "[TEXT]从诗经中取的名字都很美好，上甘棠村也不例外。“蔽芾甘棠，勿剪勿伐，召伯所" +
                        "茇。蔽芾甘棠，勿剪勿败，召伯所憩。蔽芾甘棠；勿剪勿拜，召伯所说。”—《诗经·召南·甘棠》，就" +
                        "像是古时人们因召伯而不忍伐其甘棠，如今的上甘棠也让时光不忍摧残。 "
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]"+ res14
                        + "[SPACE]"
                        + "[TEXT]不大的古村，却是湖南发现的年代最为久远的千年古村落之一，人生" +
                        "不过百年的人类，面对这样已经享有千年生机的庞然大物，总是格外的" +
                        "喜欢和憧憬，不知是羡慕悠长的生命，还是喜欢经历的故事。"
                        + "[SPACE]"
                        +  "[TITLE]明清建筑：古老文明的遗存"
                        + "[SPACE]"
                        + "[TEXT]创建于一千多年前的村庄，还保存着一批明显带有宋代特征的古建筑，而" +
                        "更为知名的是明万历的文昌阁、明弘治的门楼、明嘉靖步瀛桥、民国的石围墙等。"
                        + "[SPACE]"
                        + "[TEXT]令人惊奇的是，在千年风雨之后，村庄的村名、位置、居住家族始终不变。是" +
                        "否千年对这个村落来说只是一瞬，改变的从来都是只是时间，而不是村庄。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res15
                        + "[SPACE]"
                        +  "[TITLE]村落街巷：水村山廓酒旗风"
                        + "[SPACE]"
                        + "[TEXT]商贸从古至今都是社会发展的重要一环，哪怕是过了千百年，曾经繁荣的街道失去了原来" +
                        "的面貌，依旧还是有些痕迹留下来，不肯就这样消散在不知名的岁月中。"
                        + "[SPACE]"
                        + "[TEXT]长长的石板其实并不长，长的是长长的岁月而不是距离；从街头走到路尾，" +
                        "只需要几分钟；而从岁月的那头走到现在，却需要经历一千多年的雨和风。"
                        + "[SPACE]"
                        + "[TEXT]不曾知晓这条路上留下了多少欢声笑语，也许还有悲伤发出过声响又被遗忘掉，" +
                        "如今再走过，能体会的是眼前的心境，是心中向往到达的黎明。"
                        + "[SPACE]"
                        +  "[TITLE]步瀛桥和文昌塔：留住往昔"
                        + "[SPACE]"
                        + "[TEXT]和一般的文昌塔最少七层不同，上甘棠显得更为短小，不知是原" +
                        "本就生的发育不良，还是在历史的流转中被削去了几层。"
                        + "[SPACE]"
                        + "[TEXT]步瀛桥始建于宋靖康元年，是湖南省到目前为止发现的唯一一座宋代古桥" +
                        "。不知如果古桥有灵魂，有思想，是否会觉得骄傲？亦或是孤独呢？"
                        + "[SPACE]"
                        + "[TEXT]都说时间能沉淀情感，步瀛桥和文昌塔在共同经历几百年的岁月后，一" +
                        "定也积累了很深厚的情谊吧，相守相依。看着那一" +
                        "个个从面前经过的人最后都不再经过，能相伴一桥一塔的始终只有对方。"
                ;
        String data8 =
                "[TITLE]丛林深处那一方净土"
                        + "[SPACE]"+
                        "[TEXT]仲夏的时光里，清凉的晚风从遥远的地方赶来，不为别的，只因一份美好的懂得。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]"+ res18
                        + "[SPACE]"
                        + "[TEXT]大寻一个浪漫的清晨，迎着美丽的阳光，在光阴的罅隙间散步。流云漫过" +
                        "天涯，去了海角，亦然相伴，时光知味，岁月静好，花开半夏，光阴留白。西双版纳傣族，" +
                        "云南省最南端，少数民族自治州。古代傣语为“勐巴拉那西”，意思是“理想而神奇的" +
                        "乐土”，这里以神奇的热带雨林自然景观和少数民" +
                        "族风情而闻名于世，热带雨林气候，夏无酷暑，冬无严寒，四季温暖宜人。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res19
                        + "[SPACE]"
                        + "[TEXT]一、如何到达：西双版纳偏居于云南省的最南端。最便捷的到达方式是乘坐飞机，" +
                        "淡季从昆明飞西双版纳的机票，有时会有让人意想不到的极低折扣。另一个经济的方式是从昆" +
                        "明南部客运站乘坐班车到达" +
                        "，客车每日班次众多，昆明到景洪的高速公路已全线贯通，全程约耗时8-9小时。"
                        + "[SPACE]"
                        + "[TEXT]机场交通"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res20
                        + "[SPACE]"
                        + "[TEXT]　1、机场小巴：出机场候机楼就能看到，每位10元即可抵达市区。小巴发车" +
                        "时间不固定，需要等候，人满即走。运营时间：8:00-22:00"
                        + "[SPACE]"
                        + "[TEXT]2、出租车：直接乘出租车前往市区，价格约30元。"
                        + "[SPACE]"
                        + "[TEXT]　3、长途汽车攻略"
                        + "[SPACE]"
                        + "[TEXT]常规线路：昆明市区—西双版纳"
                        + "[SPACE]"
                        + "[TEXT]　　昆明南部汽车客运站每天都有多班开往西双版纳的车次，有卧" +
                        "铺和高速客车可以选择，全程大概需要8-9小时，票价约200元"
                        + "[SPACE]"
                        + "[TEXT]　昆明南部汽车客运站"
                        + "[SPACE]"
                        + "[TEXT]地址：官渡区矣六乡新昆洛路东侧"
                        + "[SPACE]"
                        + "[TEXT]发车方向：发往普洱市（景东县、上允镇除外）、西双版纳州、玉溪市、建水县、" +
                        "石屏县、元阳县、绿春县、红河县" +
                        "及部分国际班车发车方向：发往大理、普洱以及西双版纳境内各县乡的客车"
                        + "[SPACE]"
                        + "[TEXT]、轮船/游轮攻略：景洪港位于景洪市区澜沧江北岸，是国家一类对外开放的水运口岸，由" +
                        "景洪、橄榄坝和关累三个码头组成。澜沧江—湄公河国际航道为联结中国至东南亚的水上大动脉，为著名" +
                        "的黄金旅游线路。目前，已开通了中国景洪至老挝万象国际水运航线。"
                        + "[SPACE]"
                        + "[TEXT]　景洪市内可乘坐2路公交直达景洪港。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res21
                        + "[SPACE]"
                        + "[TEXT]二、关于包车：西双版纳的旅游景点还是有些分散，对于第一次" +
                        "来这里游玩的朋友，推荐在当地包一些车前往，价格也不贵，载着我们游玩的师傅是龚师傅" +
                        "，人很好，做事很认真，还给我们推荐一些食宿的地方，价格一点都不贵，一路开车载" +
                        "着我们游玩，它的电话和微信：13578165872 平时有接机服务和包车玩西双版纳。包车价" +
                        "格：东线景点:植物园、雨林谷、傣族园包车260元/天；大东线:望天树景区 包车500元/天；北" +
                        "线景点:基诺山寨、野象谷、森林公园 包车200元/天；西线:打洛" +
                        "中缅边境 包车450元/天；市区景点:大佛寺、曼听公园、澜沧江漂流、花卉园 包车100元/天 "
                        + "[SPACE]"
                        + "[TEXT]住宿推荐：1。西双十二城雨林之恋主题酒店"
                        + "[SPACE]"
                        + "[TEXT]　在西双版纳，晚上要睡的主题酒店，雨林之恋——海洋天堂，打开房间" +
                        "的大门，只听到音乐从耳边传来，这是每间客房独有的音乐，当然自己也可以用蓝牙播" +
                        "放自己喜欢的音乐，一般在床头有一个开关，点最中间的个按钮，然后就可以用手机或电脑" +
                        "打开蓝牙连接了。感觉又来到了大自然。酒店每一间房都有各自的主题，每种主题就一间" +
                        "房，我入住的海洋天堂，墙壁都是用手绘的，大爱这样的颜色。海洋天堂主题房间洗水池" +
                        "和浴室是分开的，这样美观了不少，房间的灯光是可以调节或关闭的，有各种色调，浪" +
                        "漫，温馨，唯一不足的就是，桌子的椅子有点高了，人总想往后面靠，但后面是空的。"
                ;
        String data7 =
                "[TITLE]少数民族的习俗"
                        + "[SPACE]"+
                        "[TEXT]要问我，肇兴侗寨给人的感觉是怎样的？我会回答，风轻云淡。" +
                        "不商业化、遇到的当地人比游客多、并不多的商铺、地道的黔东南美食，" +
                        "属于大山深处的声音。这里的日子，过得很慢，让你很想与爱的人在这里过慢" +
                        "慢变老的生活。世界上最美好的事情莫过于，彼此都是自己想要相守的人。"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]"+ res16
                        + "[SPACE]"
                        + "[TEXT]清晨的芦笙，响彻，鼓楼里的木锤声，木窗外袅袅炊烟起。“五一”假" +
                        "日的侗寨清晨，一如往常的宁静。一日之计，我最爱清晨，尤其是山中空气清新，让我" +
                        "愿意放弃懒觉，偷这晨曦的美好。鼓楼、风雨桥、干栏式吊脚楼、碧清的都柳江和榕江、一" +
                        "个个鳞次栉比的寨子，黔东南的特色景观一直吸引着我，这一次，我来到富有“中国最" +
                        "美六大乡村之一”美誉的肇兴侗寨，位于贵州 黔东南苗族侗族自治州黎平县东南部" +
                        "。从高铁站到寨子的路上，司机大哥非常自豪地介绍他的家乡，肇兴侗寨目前拥" +
                        "有侗族居民1000余户，6000多人，是全国最大的侗寨，原生民族人文生态系统" +
                        "保存比较完整。黎平县地区以山地为主，肇兴侗寨则处于一狭长谷地，四面环山，" +
                        "寨子建于山中盆地，侗族建筑密集，村寨的稻田依山而建，两条小溪汇成一条小河穿" +
                        "寨而过。肇兴侗寨以鼓楼群最为著名，被誉为\"鼓楼文化艺术之乡\"。寨中房屋为干" +
                        "栏式吊脚楼，鳞次栉比，错落有致，全部" +
                        "用杉木建造，硬山顶覆小青瓦，古朴实用。与所有古镇一样，符合古镇气息的小店，都会存在"
                        + "[SPACE]"
                        + "[DRAWABLE_IMAGE]" + res17
                        + "[SPACE]"
                        + "[TEXT]我极其想入手一支这乐器，仅是因为每每有人弹奏起它，总会吸引我的眼光。这" +
                        "座侗寨面积其实并不大，可逛的地儿一天走完。山中一日，人间数年，在这里你的生活会" +
                        "变得很慢很慢。由于当地的民俗和生活方式保存较好，跟中国很多的旅游城市比起来，" +
                        "肇兴的商业味道并不浓。居民有着自己的日常生活，丝毫不理会外来者好奇的目光和咔嚓咔" +
                        "嚓的快门声。他们，有他们自己的生活，并没有因为外人的到来而改变多少。很久很久以" +
                        "前，当地人的祖先带着族群不断迁徙，来到这个宝地，安居乐业，他们口口相传的一首首" +
                        "当地民谣，侗族大歌、蝉歌、踩堂歌、拦路歌、琵琶歌、牛腿琴歌、酒歌、情歌、山歌、河歌、" +
                        "叙事歌、童声歌等，都呈现了这个民族" +
                        "源远流长的生活状态。开垦荒地，稻田里养鱼，才有了那一道道最当地的美食佳肴。"

                ;



        String dataa[] = new String[20];
        dataa[0] = "再走老路";
        dataa[1] = data1;
        dataa[2] = "藏族儿女们的信仰";
        dataa[3] = data2;
        dataa[4] = "来自大山深处的故事——彝族";
        dataa[5] = data3;
        dataa[6] = "你好 我的名字叫大兴安岭";
        dataa[7] = data4;
        dataa[8] = "海边阳光 热浪沙滩 尽享夏日乐趣";
        dataa[9] = data5;
        dataa[10] = "脚下这大山中的古桥";
        dataa[11] = data6;
        dataa[12] = "少数民族的习惯";
        dataa[13] = data7;
        dataa[14] = "鲜为人知的丛林深处，静谧的那一方净土";
        dataa[15] = data8;

        for (int i = 0;i < dataa.length;i++){
            if (data.equals(dataa[i])){
                return dataa[i + 1];
            }
        }

        return data1;
    }
}
