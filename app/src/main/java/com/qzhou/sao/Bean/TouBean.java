package com.qzhou.sao.Bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TouBean {


    /**
     * count : 20
     * action_label : click_search
     * return_count : 19
     * has_more : 1
     * page_id : /search/
     * request_id : 201807131448421720162510688286E2
     * cur_tab : 1
     * tokens : ["视频"]
     * tab : {"tab_list":[{"tab_name":"综合","tab_id":1,"tab_code":"news"},{"tab_name":"视频","tab_id":2,"tab_code":"video"},{"tab_name":"图集","tab_id":3,"tab_code":"gallery"},{"tab_name":"用户","tab_id":4,"tab_code":"pgc"},{"tab_name":"问答","tab_id":5,"tab_code":"wenda"}],"cur_tab":1}
     * offset : 20
     * action_label_web : click_search
     * show_tabs : 1
     * data : [{"cell_type":26,"key_info":{"keyword":"视频"},"keyinfo":{"keyword":"视频"},"display":{"hits":[{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=7fed8ecbef4a4170b742f59e0da26252&line=0&app_id=13","title":"当面包遇到看了冰淇淋","detail_schema":"sslocal://awemevideo?group_id=6532311445277773059&group_source=19&item_id=6532311445277773059&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=0&from_req_id=201807131448421720162510688286E2","digg_count":37629,"large_thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6dc500026305510822d5~375x375.jpeg","play_count":715063,"thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6dc500026305510822d5~240x240.jpeg","group_id":"6532311445277773059"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=594ffd06d9b6444db0a16c2a7066f08a&line=0&app_id=13","title":"兄弟相差12岁，二宝3个月了","detail_schema":"sslocal://awemevideo?group_id=6480516181055769869&group_source=19&item_id=6480516181055769869&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=1&from_req_id=201807131448421720162510688286E2","digg_count":70414,"large_thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/412f000c4944871c4275~375x375.jpeg","play_count":5423512,"thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/412f000c4944871c4275~240x240.jpeg","group_id":"6480516181055769869"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=15c1f3af6ded4539b73ddb58963ae90e&line=0&app_id=13","title":"丫头加油哟😘😘","detail_schema":"sslocal://awemevideo?group_id=6483005397127925005&group_source=19&item_id=6483005397127925005&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=2&from_req_id=201807131448421720162510688286E2","digg_count":27829,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/422e0004457d0f16a95c~375x375.jpeg","play_count":122103,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/422e0004457d0f16a95c~240x240.jpeg","group_id":"6483005397127925005"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=5540d0030fbf41d49d0451c9b3e7bee2&line=0&app_id=13","title":"狗狗几天没见到它的好朋友，他还在过马路，狗狗看见就冲上斑马线对他亲热，激动的对着他一直撒娇，看得我很感动","detail_schema":"sslocal://awemevideo?group_id=6529025839516880142&group_source=19&item_id=6529025839516880142&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=3&from_req_id=201807131448421720162510688286E2","digg_count":73624,"large_thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/6aa5000825ef795511b1~375x375.jpeg","play_count":899817,"thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/6aa5000825ef795511b1~240x240.jpeg","group_id":"6529025839516880142"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=3af722d2bd304730afd1d153408961d0&line=0&app_id=13","title":"神奇的PS，竟把老年夫妇还原到年轻时的模样，郎才女貌惊艳众人！","detail_schema":"sslocal://awemevideo?group_id=6519714636630068488&group_source=19&item_id=6519714636630068488&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=4&from_req_id=201807131448421720162510688286E2","digg_count":97603,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/60a9000e629578131bca~375x375.jpeg","play_count":3501113,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/60a9000e629578131bca~240x240.jpeg","group_id":"6519714636630068488"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=7ba60cdf307b4837ac089312b4dde55a&line=0&app_id=13","title":"好久不更新。摔下来的仙女🧚♀️@没刘海的妹子","detail_schema":"sslocal://awemevideo?group_id=6512298051955068173&group_source=19&item_id=6512298051955068173&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=5&from_req_id=201807131448421720162510688286E2","digg_count":46242,"large_thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/59e4000ee41e3253e2f7~375x375.jpeg","play_count":1268186,"thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/59e4000ee41e3253e2f7~240x240.jpeg","group_id":"6512298051955068173"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=5134f50b79b7493ba401c58257344da2&line=0&app_id=13","title":"公司流浪汪带崽，天天煮鸡蛋来喂","detail_schema":"sslocal://awemevideo?group_id=6517112720985165063&group_source=19&item_id=6517112720985165063&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=6&from_req_id=201807131448421720162510688286E2","digg_count":48329,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/5f01000c3abef7a2b06e~375x375.jpeg","play_count":395462,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/5f01000c3abef7a2b06e~240x240.jpeg","group_id":"6517112720985165063"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=01a3f3266fdc47a4963faa8df0f4eb87&line=0&app_id=13","title":"草莓果冻蛋糕，想吃的请举手🙋，教程戳微博","detail_schema":"sslocal://awemevideo?group_id=6533365560737008903&group_source=19&item_id=6533365560737008903&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=7&from_req_id=201807131448421720162510688286E2","digg_count":7513,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/6e5c00106a89d83892f2~375x375.jpeg","play_count":84048,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/6e5c00106a89d83892f2~240x240.jpeg","group_id":"6533365560737008903"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=9b3bab900bc04032a82f395b7a4efcd4&line=0&app_id=13","title":"高一最666的班🙈🙈🙈","detail_schema":"sslocal://awemevideo?group_id=6503409767178833166&group_source=19&item_id=6503409767178833166&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=8&from_req_id=201807131448421720162510688286E2","digg_count":33694,"large_thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/51d8000ed2f3482150cd~375x375.jpeg","play_count":2696445,"thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/51d8000ed2f3482150cd~240x240.jpeg","group_id":"6503409767178833166"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=2c98ba859be4454f8d2e4b1e8b70eb99&line=0&app_id=13","title":"一秒变脸的塑料姐妹友谊哈哈哈哈哈@OhmyLady花花 @抖音小助手","detail_schema":"sslocal://awemevideo?group_id=6528972381061385480&group_source=19&item_id=6528972381061385480&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=9&from_req_id=201807131448421720162510688286E2","digg_count":12799,"large_thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6a960013f3d7864c29fb~375x375.jpeg","play_count":184493,"thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6a960013f3d7864c29fb~240x240.jpeg","group_id":"6528972381061385480"}],"abtest":1,"fromIndex":0,"headers":{},"statusCodeValue":200,"hitCount":10,"query":"视频","total":1000000,"statusCode":"OK"},"tokens":["视频"],"id_str":"3646832802","ala_src":"hotsoon_video","id":3646832802},{"play_effective_count":"15","open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577201427783877123%2C%22source%22%3A%22%E7%99%BE%E5%8D%83%E5%A8%B1%E4%B9%90%E4%B8%96%E7%95%8C%22%7D&gd_label=click_search&group_flags=64&groupid=6577201427783877123&item_id=6577201427783877123","media_name":"百千娱乐世界","show_play_effective_count":1,"media_url":"http://toutiao.com/m1597643702197255/","item_source_url":"/group/6577201427783877123/","labels":[],"image_list":[{"url":"//p9.pstatp.com/list/982200144345940ef122"}],"media_avatar_url":"//p1.pstatp.com/medium/6ee3000142dfe33a6228","datetime":"2018-07-13 12:10:00","more_mode":false,"create_time":"1531455000","has_gallery":false,"video_duration":28,"id":"6577201427783877123","user_id":52098330240,"title":"看了这个视频，以后你还敢赌博吗？（电影：至尊无上）","has_video":true,"share_url":"http://toutiao.com/group/6577201427783877123/","source":"百千娱乐世界","comment_count":0,"article_url":"http://toutiao.com/group/6577201427783877123/","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"看了这个视频，以后你还敢赌博吗？","large_image_url":"http://p1.pstatp.com/large/982200144345940ef122","display_time":"1531455000","publish_time":"1531455000","middle_mode":true,"media_creator_id":52098330240,"tag_id":6577201427783877123,"source_url":"/group/6577201427783877123/","video_duration_str":"00:28","item_id":"6577201427783877123","user_auth_info":{},"seo_url":"/group/6577201427783877123/","keyword":"视频","middle_image_url":"http://p3.pstatp.com/list/300x196/982200144345940ef122","behot_time":"1531455000","tag":"video_movie","image_url":"//p9.pstatp.com/list/982200144345940ef122","has_image":true,"highlight":{"source":[],"abstract":[[4,2]],"title":[[4,2]]},"group_id":"6577201427783877123","image_count":0},{"play_effective_count":"185","open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577546645846622727%2C%22source%22%3A%22%E5%BD%B1%E8%A7%86%E5%8A%9F%E5%A4%AB%E7%89%87%22%7D&gd_label=click_search&group_flags=64&groupid=6577546645846622727&item_id=6577546645846622727","media_name":"影视功夫片","show_play_effective_count":1,"media_url":"http://toutiao.com/m1593800396751885/","item_source_url":"/group/6577546645846622727/","labels":[],"image_list":[{"url":"//p3.pstatp.com/list/pgc-image/15314543208931b7f48754a"}],"media_avatar_url":"//p3.pstatp.com/medium/66be0005443cbda12e48","datetime":"2018-07-13 12:00:19","more_mode":false,"create_time":"1531454419","has_gallery":false,"video_duration":261,"id":"6577546645846622727","user_id":94303634868,"title":"你还在怀疑少林功夫？来看看这个视频吧！","has_video":true,"share_url":"http://toutiao.com/group/6577546645846622727/","source":"影视功夫片","comment_count":2,"article_url":"http://toutiao.com/group/6577546645846622727/","single_mode":true,"comments_count":2,"large_mode":false,"abstract":"河南省郑州市登封市，少林寺德武禅院副院长释延杰，习武20多年，少林功夫太厉害了，空翻做得太漂亮了，这才是真正的中国功夫，真正的武林高手，真功夫，配上《射雕英雄传》郭靖的音乐，太震撼了，比功夫电影还好看！","large_image_url":"http://p3.pstatp.com/large/pgc-image/15314543208931b7f48754a","display_time":"1531454419","publish_time":"1531454419","middle_mode":true,"media_creator_id":94303634868,"tag_id":6577546645846622727,"source_url":"/group/6577546645846622727/","video_duration_str":"04:21","item_id":"6577546645846622727","user_auth_info":{"auth_type":"0","other_auth":{"pgc":"头条影视视频原创作者"},"auth_info":"头条影视视频原创作者"},"seo_url":"/group/6577546645846622727/","keyword":"视频","middle_image_url":"http://p3.pstatp.com/list/300x196/pgc-image/15314543208931b7f48754a","behot_time":"1531454419","tag":"video_movie","image_url":"//p3.pstatp.com/list/pgc-image/15314543208931b7f48754a","has_image":true,"highlight":{"source":[],"abstract":[],"title":[[15,2]]},"group_id":"6577546645846622727","image_count":0},{"play_effective_count":"3719","open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6549028279989305859%2C%22source%22%3A%22%E6%83%8A%E5%A5%87%E5%A4%A7%E6%9D%82%E7%83%A9%22%7D&gd_label=click_search&group_flags=64&groupid=6549028279989305859&item_id=6549028279989305859","media_name":"惊奇大杂烩","show_play_effective_count":1,"media_url":"http://toutiao.com/m6814807952/","item_source_url":"/group/6549028279989305859/","labels":[],"image_list":[{"url":"//p3.pstatp.com/list/7dc50001521f6e0bf863"}],"media_avatar_url":"//p1.pstatp.com/medium/78f0004592c5bbaab15","datetime":"2018-04-27 15:34:29","more_mode":false,"create_time":"1524814469","has_gallery":false,"video_duration":205,"id":"6549028279989305859","user_id":6814827485,"title":"广场舞视频 广场舞教学视频","has_video":true,"share_url":"http://toutiao.com/group/6549028279989305859/","source":"惊奇大杂烩","comment_count":0,"article_url":"http://toutiao.com/group/6549028279989305859/","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"广场舞视频 广场舞教学视频","large_image_url":"http://p1.pstatp.com/large/7dc50001521f6e0bf863","display_time":"1524814469","publish_time":"1524814469","middle_mode":true,"media_creator_id":6814827485,"tag_id":6549028279989305859,"source_url":"/group/6549028279989305859/","video_duration_str":"03:25","item_id":"6549028279989305859","user_auth_info":{},"seo_url":"/group/6549028279989305859/","keyword":"视频","middle_image_url":"http://p9.pstatp.com/list/300x196/7dc50001521f6e0bf863","behot_time":"1524814469","tag":"video_squaredance","image_url":"//p3.pstatp.com/list/7dc50001521f6e0bf863","has_image":true,"highlight":{"source":[],"abstract":[[3,2],[11,2]],"title":[[3,2],[11,2]]},"group_id":"6549028279989305859","image_count":0},{"cell_type":26,"key_info":{"keyword":"视频"},"keyinfo":{"keyword":"视频"},"display":{"items":[{"reason":"简单便捷找您想看的片","name":"影视大全","img":"http://p1.pstatp.com/large/5e3700172e691673c489"},{"reason":"安卓手机视频下载软件","name":"视频下载","img":"http://p1.pstatp.com/large/5e380004fe3f4e97c0bf"},{"reason":"最大中文视频搜索引擎","name":"百度视频","img":"http://p1.pstatp.com/large/5e3c00038e7870f27411"},{"reason":"免费视频在线观看软件","name":"乐视影视","img":"http://p1.pstatp.com/large/5e3b0006fb9571f99cae"},{"reason":"软件视频或音频文件","name":"播放器","img":"http://p1.pstatp.com/large/5e410000a03fa7b9bd31"},{"reason":"一款本地视频软件","name":"爱奇艺万能播放器","img":"http://p1.pstatp.com/large/5e380007fc43b241655b"},{"reason":"P2P在线影视点播软件","name":"风行电影","img":"http://p1.pstatp.com/large/5e37001937e3ce44d946"},{"reason":"手机在线影视客户端","name":"免费高清视频","img":"http://p1.pstatp.com/large/5e3d0018c5763b917edf"},{"reason":"体育赛事直播服务网站","name":"电视直播","img":"http://p1.pstatp.com/large/5e390008adda9debac24"},{"reason":"支持多种格式的播放器","name":"全能播放器","img":"http://p1.pstatp.com/large/5e380005347ba038f0e4"},{"reason":"娱乐视频资源软件","name":"2345影视大全","img":"http://p1.pstatp.com/large/5e3b001e19b147a08f9e"}],"rank":12,"title":"视频-相关软件"},"tokens":["视频"],"id_str":"3947747820","ala_src":"knowledge_graph","id":3947747820},{"cell_type":51,"key_info":{},"keyinfo":{},"display":{"status":1,"term":"视频","search_url":"https://image.toutiao.com/toutiao/search?&term=%E8%A7%86%E9%A2%91&search_from=toutiaosearch&search_id=496B74E024A49C9E7207EB399DA76342","title":"鹰视频免费下载 鹰视频素材 鹰视频 飞鹰视频素材 动物视频素材 高清 在视频被传播出去的时候，有网友出来解惑，称这种鱼叫做龙趸，学名中巨石斑鱼，是海洋中的一种名贵鱼类，不轻易露面，有经验的渔民采用延绳钓、手钓或底拖网方可捕获，偶尔捕获便成为罕见之物。 狗贩子上吊式杀狗视频,害狗杀狗的残忍女人图,狗贩子怎么杀狗照 璀璨焰火 放烟花视频 高清烟花视频 马年烟花视频素材 烟花爆竹视频 趴在地上打屁股视频资讯 美女内急尿裤子视频 美女脱裤子打屁屁视频","total_count":3431246,"abtest":29,"queryLabel":"","results":[{"original_image_url":"","original_page_url":"http://www.58pic.com/shipin/13381193.html","img":"https://sf3-ttcdn-tos.pstatp.com/img/labis/7d061e23fb6ce3cb646283aca099bad0~640x640.jpeg","extra":"{\"iid\":\"345783178973995185\"}","text":"鹰视频免费下载 鹰视频素材 鹰视频 飞鹰视频素材 动物视频素材 高清","thumbnail":"https://sf3-ttcdn-tos.pstatp.com/img/labis/7d061e23fb6ce3cb646283aca099bad0~320x320.jpeg","iid":"345783178973995185","label":"站外","width":1018,"score":23.257433,"height":570,"img_url":"https://sf3-ttcdn-tos.pstatp.com/img/labis/7d061e23fb6ce3cb646283aca099bad0~320x320.jpeg","id":"7d061e23fb6ce3cb646283aca099bad0","page_url":"https://image.toutiao.com/toutiao/search?&term=%E8%A7%86%E9%A2%91&search_from=toutiaosearch&search_id=496B74E024A49C9E7207EB399DA76342&from_img_id=7d061e23fb6ce3cb646283aca099bad0"},{"original_image_url":"","original_page_url":"http://www.toutiao.com/a6395065384051523842","img":"https://p3.pstatp.com/w640/18560001eebab28c5ee7","extra":"{\"iid\":\"291533572172703318\"}","text":"在视频被传播出去的时候，有网友出来解惑，称这种鱼叫做龙趸，学名中巨石斑鱼，是海洋中的一种名贵鱼类，不轻易露面，有经验的渔民采用延绳钓、手钓或底拖网方可捕获，偶尔捕获便成为罕见之物。","thumbnail":"https://p3.pstatp.com/w240/18560001eebab28c5ee7","iid":"291533572172703318","label":"","width":678,"score":17.547686,"height":606,"img_url":"https://p3.pstatp.com/w240/18560001eebab28c5ee7","id":"18560001eebab28c5ee7","page_url":"https://image.toutiao.com/toutiao/search?&term=%E8%A7%86%E9%A2%91&search_from=toutiaosearch&search_id=496B74E024A49C9E7207EB399DA76342&from_img_id=18560001eebab28c5ee7"},{"original_image_url":"","original_page_url":"http://www.gzxuhao.com/read/d3EzNE1GMTVrTU1kRTlvV25Ucw.html","img":"https://sf6-ttcdn-tos.pstatp.com/img/labis/1bdf329f755834de9c4bc364c343aeb6~640x640.jpeg","extra":"{\"iid\":\"668804409079236167\"}","text":"狗贩子上吊式杀狗视频,害狗杀狗的残忍女人图,狗贩子怎么杀狗照","thumbnail":"https://sf6-ttcdn-tos.pstatp.com/img/labis/1bdf329f755834de9c4bc364c343aeb6~320x320.jpeg","iid":"668804409079236167","label":"站外","width":228,"score":18.269684,"height":287,"img_url":"https://sf6-ttcdn-tos.pstatp.com/img/labis/1bdf329f755834de9c4bc364c343aeb6~320x320.jpeg","id":"1bdf329f755834de9c4bc364c343aeb6","page_url":"https://image.toutiao.com/toutiao/search?&term=%E8%A7%86%E9%A2%91&search_from=toutiaosearch&search_id=496B74E024A49C9E7207EB399DA76342&from_img_id=1bdf329f755834de9c4bc364c343aeb6"},{"original_image_url":"","original_page_url":"http://www.58pic.com/shipin/13030204.html","img":"https://sf6-ttcdn-tos.pstatp.com/img/labis/beeeeedcdf8c33476a40107f2faf047a~640x640.jpeg","extra":"{\"iid\":\"1078051205103423250\"}","text":"璀璨焰火 放烟花视频 高清烟花视频 马年烟花视频素材 烟花爆竹视频","thumbnail":"https://sf6-ttcdn-tos.pstatp.com/img/labis/beeeeedcdf8c33476a40107f2faf047a~320x320.jpeg","iid":"1078051205103423250","label":"站外","width":650,"score":19.654224,"height":365,"img_url":"https://sf6-ttcdn-tos.pstatp.com/img/labis/beeeeedcdf8c33476a40107f2faf047a~320x320.jpeg","id":"beeeeedcdf8c33476a40107f2faf047a","page_url":"https://image.toutiao.com/toutiao/search?&term=%E8%A7%86%E9%A2%91&search_from=toutiaosearch&search_id=496B74E024A49C9E7207EB399DA76342&from_img_id=beeeeedcdf8c33476a40107f2faf047a"},{"original_image_url":"http://www.anjisq.com/images/aHR0cDovL3MxNC5zaW5haW1nLmNuL2JtaWRkbGUvNGMwODI0NDd0NTU3ZGYyMTcwYjZk.jpg","original_page_url":"http://www.anjisq.com/system/011931/","img":"https://sf3-ttcdn-tos.pstatp.com/img/labis/db65069e44dcc73140cb5de6d7ec342e~640x640.jpeg","extra":"{\"iid\":\"429700601613326806\"}","text":"趴在地上打屁股视频资讯 美女内急尿裤子视频 美女脱裤子打屁屁视频","thumbnail":"https://sf3-ttcdn-tos.pstatp.com/img/labis/db65069e44dcc73140cb5de6d7ec342e~320x320.jpeg","iid":"429700601613326806","label":"站外","width":389,"score":18.540907,"height":260,"img_url":"https://sf3-ttcdn-tos.pstatp.com/img/labis/db65069e44dcc73140cb5de6d7ec342e~320x320.jpeg","id":"db65069e44dcc73140cb5de6d7ec342e","page_url":"https://image.toutiao.com/toutiao/search?&term=%E8%A7%86%E9%A2%91&search_from=toutiaosearch&search_id=496B74E024A49C9E7207EB399DA76342&from_img_id=db65069e44dcc73140cb5de6d7ec342e"}],"intention":-1,"queryLabelVector":null,"queryLabelID":-1,"message":""},"tokens":["视频"],"id_str":"2856647980","ala_src":"image","id":2856647980},{"play_effective_count":"442","open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577558700322456077%2C%22source%22%3A%22%E7%8E%8B%E8%80%85%E6%8E%92%E8%A1%8C%22%7D&gd_label=click_search&group_flags=64&groupid=6577558700322456077&item_id=6577558700322456077","media_name":"王者排行","show_play_effective_count":1,"media_url":"http://toutiao.com/m1585646042929166/","item_source_url":"/group/6577558700322456077/","labels":[],"image_list":[{"url":"//p3.pstatp.com/list/994900002c7848cff9a4"}],"media_avatar_url":"//p3.pstatp.com/medium/6ee0000396a53c64e7fe","datetime":"2018-07-13 12:47:05","more_mode":false,"create_time":"1531457225","has_gallery":false,"video_duration":161,"id":"6577558700322456077","user_id":78454189417,"title":"搞笑王者荣耀：这个视频告诉你，鲁班为什么必须死！","has_video":true,"share_url":"http://toutiao.com/group/6577558700322456077/","source":"王者排行","comment_count":0,"article_url":"http://toutiao.com/group/6577558700322456077/","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"搞笑王者荣耀：这个视频告诉你，为什么鲁班必须死！","large_image_url":"http://p3.pstatp.com/large/994900002c7848cff9a4","display_time":"1531457225","publish_time":"1531457225","middle_mode":true,"media_creator_id":78454189417,"tag_id":6577558700322456077,"source_url":"/group/6577558700322456077/","video_duration_str":"02:41","item_id":"6577558700322456077","user_auth_info":{},"seo_url":"/group/6577558700322456077/","keyword":"视频","middle_image_url":"http://p3.pstatp.com/list/300x196/994900002c7848cff9a4","behot_time":"1531457225","tag":"video_game","image_url":"//p3.pstatp.com/list/994900002c7848cff9a4","has_image":true,"highlight":{"source":[],"abstract":[[9,2]],"title":[[9,2]]},"group_id":"6577558700322456077","image_count":0},{"play_effective_count":"26","open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577280271228338691%2C%22source%22%3A%22%E9%99%95%E8%A5%BF1%E9%A2%91%E9%81%93%22%7D&gd_label=click_search&group_flags=64&groupid=6577280271228338691&item_id=6577280271228338691","media_name":"陕西1频道","show_play_effective_count":1,"media_url":"http://toutiao.com/m7007442379/","item_source_url":"/group/6577280271228338691/","labels":[],"image_list":[{"url":"//p3.pstatp.com/list/pgc-image/1531392158561e035a53f99"}],"media_avatar_url":"//p1.pstatp.com/medium/bc2000cf1e458f64543","datetime":"2018-07-13 12:00:00","more_mode":false,"create_time":"1531454400","has_gallery":false,"video_duration":149,"id":"6577280271228338691","user_id":6973812638,"title":"人能多纠结？看完这段视频，你绝对会佩服他！","has_video":true,"share_url":"http://toutiao.com/group/6577280271228338691/","source":"陕西1频道","comment_count":0,"article_url":"http://toutiao.com/group/6577280271228338691/","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"陕西1频道《约吧！大学生》 记者在超市做测试，遇最纠结大哥，这表现绝了！","large_image_url":"http://p9.pstatp.com/large/pgc-image/1531392158561e035a53f99","display_time":"1531454400","publish_time":"1531454400","middle_mode":true,"media_creator_id":6973812638,"tag_id":6577280271228338691,"source_url":"/group/6577280271228338691/","video_duration_str":"02:29","item_id":"6577280271228338691","user_auth_info":{},"seo_url":"/group/6577280271228338691/","keyword":"视频","middle_image_url":"http://p1.pstatp.com/list/300x196/pgc-image/1531392158561e035a53f99","behot_time":"1531454400","tag":"video_car_evaluating","image_url":"//p3.pstatp.com/list/pgc-image/1531392158561e035a53f99","has_image":true,"highlight":{"source":[],"abstract":[],"title":[[10,2]]},"group_id":"6577280271228338691","image_count":0},{"play_effective_count":"0","open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577587553350713860%2C%22source%22%3A%22%E4%BE%9D%E7%81%B5%E4%B9%8B%E8%88%9E%E8%B9%88%22%7D&gd_label=click_search&group_flags=64&groupid=6577587553350713860&item_id=6577587553350713860","media_name":"依灵之舞蹈","show_play_effective_count":1,"media_url":"http://toutiao.com/m1605239325069326/","item_source_url":"/group/6577587553350713860/","labels":[],"image_list":[{"url":"//p3.pstatp.com/list/994c0006941d7eb104b3"}],"media_avatar_url":"//p3.pstatp.com/medium/986a0000eb1cde149444","datetime":"2018-07-13 14:39:03","more_mode":false,"create_time":"1531463943","has_gallery":false,"video_duration":119,"id":"6577587553350713860","user_id":101341143438,"title":"舞蹈是如何炼成的？看完这个视频就知道了","has_video":true,"share_url":"http://toutiao.com/group/6577587553350713860/","source":"依灵之舞蹈","comment_count":0,"article_url":"http://toutiao.com/group/6577587553350713860/","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"舞蹈表演","large_image_url":"http://p1.pstatp.com/large/994c0006941d7eb104b3","display_time":"1531463943","publish_time":"1531463943","middle_mode":true,"media_creator_id":101341143438,"tag_id":6577587553350713860,"source_url":"/group/6577587553350713860/","video_duration_str":"01:59","item_id":"6577587553350713860","user_auth_info":{},"seo_url":"/group/6577587553350713860/","keyword":"视频","middle_image_url":"http://p9.pstatp.com/list/300x196/994c0006941d7eb104b3","behot_time":"1531463943","tag":"news","image_url":"//p3.pstatp.com/list/994c0006941d7eb104b3","has_image":true,"highlight":{"source":[],"abstract":[],"title":[[13,2]]},"group_id":"6577587553350713860","image_count":0},{"cell_type":26,"key_info":{},"keyinfo":{},"display":{"url":"https://baike.sogou.com/m/fullLemma?ch=jrtt.search.item&cid=xm.click&lid=65528","source":"搜狗百科","pic":"https://pic.baike.soso.com/ugc/baikepic2/13467/cut-20180410104138-1261146485_jpg_443_295_18689.jpg/800","lemmaTitle":"视频","picAbs":"视频（Video）泛指将一系列静态影像以电信号的方式加以捕捉、纪录、处理、储存、传送与重现的各种技术。连续的图像变化每秒超过24帧（frame）画面以上时，根据视觉暂留原理，人眼无法辨别单幅的静态画面；看上去是平滑连续的视觉效果，这样连续的画面叫做视频。视频技术最早是为了电视系统而发展，但现在已经发展为各种不同的格式以利消费者将视频记录下来。网络技术的发达也促使视频的纪录片段以串流媒体的形式存在于因特网之上并可被电脑接收与播放。视频与电影属于不同的技术，后者是利用照相术将动态的影像捕捉为一系列的静态照片。"},"tokens":["视频"],"id_str":"3844281804","ala_src":"sogou_baike","id":3844281804},{"open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577580772608180740%2C%22source%22%3A%22%E7%9F%B3%E9%97%A8%E5%AE%9E%E8%AF%9D%22%7D&gd_label=click_search&groupid=6577580772608180740&item_id=6577580772608180740","media_name":"石门实话","show_play_effective_count":0,"media_url":"http://toutiao.com/m1600444823101444/","item_source_url":"/group/6577580772608180740/","labels":[],"image_list":[{"url":"//p1.pstatp.com/list/pgc-image/153146260085964532c79d4"},{"url":"//p1.pstatp.com/list/pgc-image/1531462649513477930966f"},{"url":"//p3.pstatp.com/list/pgc-image/1531462672068c9c89e5f42"}],"media_avatar_url":"//p3.pstatp.com/medium/6eee0000ec454625ee3b","datetime":"2018-07-13 14:18:52","more_mode":true,"create_time":"1531462732","has_gallery":false,"id":"6577580772608180740","user_id":96583977938,"title":"三农自媒体作者们不是炖肉就是摸鱼？农村的农民真的如此悠闲？","has_video":false,"share_url":"http://toutiao.com/group/6577580772608180740/","source":"石门实话","comment_count":0,"article_url":"http://toutiao.com/group/6577580772608180740/","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"根据头条的推机制可能是你越是看哪方面的它就给你推荐哪方面的多，所以看了好多所谓的头条三农红人和三农达人大V，最后发现了一个有趣的问题，就是这么多的三农达人和作者们，发表的内容和视频几乎都是一个模式。","large_image_url":"http://p9.pstatp.com/large/pgc-image/153146260085964532c79d4","display_time":"1531462732","publish_time":"1531462732","middle_mode":false,"media_creator_id":96583977938,"tag_id":6577580772608180740,"source_url":"/group/6577580772608180740/","item_id":"6577580772608180740","user_auth_info":{},"seo_url":"/group/6577580772608180740/","keyword":"视频","middle_image_url":"http://p3.pstatp.com/list/300x196/pgc-image/153146260085964532c79d4","behot_time":"1531462732","summary":"视频几乎都是一个模式，不是天天在想着法子变着花样的在吃，就是下河摸个鱼地里摘个瓜，但","tag":"news_agriculture","image_url":"//p1.pstatp.com/list/pgc-image/153146260085964532c79d4","has_image":true,"highlight":{"source":[],"abstract":[[88,2]],"title":[],"summary":[[0,2]]},"group_id":"6577580772608180740","image_count":3},{"open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577582143478694414%2C%22source%22%3A%22%E5%AD%A6%E6%8B%8D%E8%A7%86%E9%A2%91%E5%89%AA%E8%BE%91%22%7D&gd_label=click_search&groupid=6577582143478694414&item_id=6577582143478694414","media_name":"学拍视频剪辑","show_play_effective_count":0,"media_url":"http://toutiao.com/m1560087777414145/","item_source_url":"/group/6577582143478694414/","labels":[],"image_list":[{"url":"//p3.pstatp.com/list/pgc-image/153146236112825216cabca"},{"url":"//p1.pstatp.com/list/pgc-image/15314623611484eec1ce159"},{"url":"//p1.pstatp.com/list/pgc-image/153146236154692ab1d5daa"}],"media_avatar_url":"//p1.pstatp.com/medium/6ed40004f6455c643556","datetime":"2018-07-13 14:18:04","more_mode":true,"create_time":"1531462684","has_gallery":false,"id":"6577582143478694414","user_id":56281965513,"title":"视频剪辑小妙招 让你的视频具有电影感 构图更好看","has_video":false,"share_url":"http://toutiao.com/group/6577582143478694414/","source":"学拍视频剪辑","comment_count":0,"article_url":"http://toutiao.com/group/6577582143478694414/","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"如何通过edius软件为视频增加电影感将视频导入edius 把素材拖到轨道中点击右上角窗口中的特效点击系统预设点击视频滤镜找到宽银幕效果拖到素材轨道上然后开始设置遮幅信息面板中双击打开手绘遮罩点击画面上的框 在边缘光标变化的地方拖拽改变它的大小改变遮幅颜色双击打开手绘遮罩找到边缘","large_image_url":"http://p1.pstatp.com/large/pgc-image/153146236112825216cabca","display_time":"1531462684","publish_time":"1531462684","middle_mode":false,"media_creator_id":56281965513,"tag_id":6577582143478694414,"source_url":"/group/6577582143478694414/","item_id":"6577582143478694414","user_auth_info":{"auth_type":"3","auth_info":"泰安市微爱文化传媒有限公司总经理"},"seo_url":"/group/6577582143478694414/","keyword":"视频","middle_image_url":"http://p1.pstatp.com/list/300x196/pgc-image/153146236112825216cabca","behot_time":"1531462684","tag":"news_photography","image_url":"//p3.pstatp.com/list/pgc-image/153146236112825216cabca","has_image":true,"highlight":{"source":[[2,2]],"abstract":[[12,2],[20,2],[57,2]],"title":[[0,2],[11,2]]},"group_id":"6577582143478694414","image_count":16},{"screen_name":"视频","cell_type":38,"media_id":"6510383496","description":"喜欢就关注：视频。每日分享经典视频","user_id":"6020990796","gender":"2","follow_count":14312,"no_display_pgc_icon":"0","user_type":"1","is_pgc":1,"verified_content":"","avatar_url":"//p1.pstatp.com/medium/4110011eb2ea21e32f0","create_time":"1455957016","user_decoration":{},"highlight":{"name":[[0,2]]},"source_url":"http://www.toutiao.com/c/user/6020990796/","id":"6020990796","user_verified":"0","name":"视频"},{"play_effective_count":"0","open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577587380792852996%2C%22source%22%3A%22%E5%A5%87%E5%A6%99%E5%8A%A8%E7%89%A9%E4%B9%90%E5%9B%AD%22%7D&gd_label=click_search&group_flags=64&groupid=6577587380792852996&item_id=6577587380792852996","media_name":"奇妙动物乐园","show_play_effective_count":1,"media_url":"http://toutiao.com/m1588452697124878/","item_source_url":"/group/6577587380792852996/","labels":[],"image_list":[{"url":"//p9.pstatp.com/list/993b000b9a243b39e29e"}],"media_avatar_url":"//p1.pstatp.com/medium/53f9000144d610a0f224","datetime":"2018-07-13 14:38:23","more_mode":false,"create_time":"1531463903","has_gallery":false,"video_duration":57,"id":"6577587380792852996","user_id":72463719659,"title":"摩托车这个角度拍摄的视频真心很炫酷","has_video":true,"share_url":"http://toutiao.com/group/6577587380792852996/","source":"奇妙动物乐园","comment_count":0,"article_url":"http://toutiao.com/group/6577587380792852996/","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"摩托车这个角度拍摄的视频真心很炫酷","large_image_url":"http://p3.pstatp.com/large/993b000b9a243b39e29e","display_time":"1531463903","publish_time":"1531463903","middle_mode":true,"media_creator_id":72463719659,"tag_id":6577587380792852996,"source_url":"/group/6577587380792852996/","video_duration_str":"00:57","item_id":"6577587380792852996","user_auth_info":{},"seo_url":"/group/6577587380792852996/","keyword":"视频","middle_image_url":"http://p1.pstatp.com/list/300x196/993b000b9a243b39e29e","behot_time":"1531463903","tag":"video_car","image_url":"//p9.pstatp.com/list/993b000b9a243b39e29e","has_image":true,"highlight":{"source":[],"abstract":[[10,2]],"title":[[10,2]]},"group_id":"6577587380792852996","image_count":0},{"play_effective_count":"38万","open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6442507966741479949%2C%22source%22%3A%22%E5%84%BF%E7%AB%A5%E7%AE%80%E7%AC%94%E7%94%BB%22%7D&gd_label=click_search&group_flags=64&groupid=6442507966741479949&item_id=6442507966741479949","media_name":"儿童简笔画","show_play_effective_count":1,"media_url":"http://toutiao.com/m51663841361/","item_source_url":"/group/6442507966741479949/","labels":[],"image_list":[{"url":"//p9.pstatp.com/list/2d4100030df921b4b12d"}],"media_avatar_url":"//p3.pstatp.com/medium/2bd7002d24994c8e17cb","datetime":"2017-07-14 14:23:02","more_mode":false,"create_time":"1500013382","has_gallery":false,"video_duration":156,"id":"6442507966741479949","user_id":51663841361,"title":"游泳教学视频 学游泳视频","has_video":true,"share_url":"http://toutiao.com/group/6442507966741479949/","source":"儿童简笔画","comment_count":33,"article_url":"http://toutiao.com/group/6442507966741479949/","single_mode":true,"comments_count":33,"large_mode":false,"abstract":"","large_image_url":"http://p3.pstatp.com/large/2d4100030df921b4b12d","display_time":"1500013382","publish_time":"1500013277","middle_mode":true,"media_creator_id":51663841361,"tag_id":6442507966741479949,"source_url":"/group/6442507966741479949/","video_duration_str":"02:36","item_id":"6442507966741479949","user_auth_info":{},"seo_url":"/group/6442507966741479949/","keyword":"视频","middle_image_url":"http://p3.pstatp.com/list/300x196/2d4100030df921b4b12d","behot_time":"1500013382","tag":"video_sports","image_url":"//p9.pstatp.com/list/2d4100030df921b4b12d","has_image":true,"highlight":{"source":[],"abstract":[],"title":[[4,2],[10,2]]},"group_id":"6442507966741479949","image_count":0},{"open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577581395596542471%2C%22source%22%3A%22%E4%BA%B2%E5%AE%9D%E6%96%87%E5%8C%96%22%7D&gd_label=click_search&groupid=6577581395596542471&item_id=6577581395596542471","media_name":"亲宝文化","show_play_effective_count":0,"media_url":"http://toutiao.com/m1558924865616897/","item_source_url":"/group/6577581395596542471/","labels":[],"image_list":[{"url":"//p3.pstatp.com/list/pgc-image/1531462457990a5a6b94a30"},{"url":"//p3.pstatp.com/list/pgc-image/15314624579403b479cceb4"},{"url":"//p1.pstatp.com/list/pgc-image/153146245803503525e69b7"}],"media_avatar_url":"//p1.pstatp.com/medium/6c2d000177e1cd77218d","datetime":"2018-07-13 14:15:10","more_mode":true,"create_time":"1531462510","has_gallery":false,"id":"6577581395596542471","user_id":55449019428,"title":"20年前没空调，我们是这样过夏天的！满满的回忆\u2026\u2026","has_video":false,"share_url":"http://toutiao.com/group/6577581395596542471/","source":"亲宝文化","comment_count":0,"article_url":"http://toutiao.com/group/6577581395596542471/","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"20年前的那个夏天没有空调，没有冰箱，连风扇都用得很少，但是依然过得很快乐\u2026↓↓或者就直接把西瓜放进水井里冰镇，这就是\u201c天然的冰箱\u201d~午觉睡醒之后吃上一块，爽！","large_image_url":"http://p1.pstatp.com/large/pgc-image/1531462457990a5a6b94a30","display_time":"1531462510","publish_time":"1531462510","middle_mode":false,"media_creator_id":55449019428,"tag_id":6577581395596542471,"source_url":"/group/6577581395596542471/","item_id":"6577581395596542471","user_auth_info":{"auth_type":"3","auth_info":"亲宝儿歌动画官方帐号"},"seo_url":"/group/6577581395596542471/","keyword":"视频","middle_image_url":"http://p3.pstatp.com/list/300x196/pgc-image/1531462457990a5a6b94a30","behot_time":"1531462510","summary":"视频。好习惯的养成除了说教是不够的，更需要辅助教育工具，就像同样的一件事情会出现父母","tag":"news","image_url":"//p3.pstatp.com/list/pgc-image/1531462457990a5a6b94a30","has_image":true,"highlight":{"source":[],"abstract":[],"title":[],"summary":[[0,2]]},"group_id":"6577581395596542471","image_count":27},{"open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577588350922785284%2C%22source%22%3A%22%E4%B8%9C%E5%8C%97%E7%BD%91%22%7D&gd_label=click_search&groupid=6577588350922785284&item_id=6577588350922785284","media_name":"东北网","show_play_effective_count":0,"media_url":"http://toutiao.com/m3812321401/","item_source_url":"/group/6577588350922785284/","labels":[],"image_list":[{"url":"//p1.pstatp.com/list/pgc-image/15314641279128521ad4d46"},{"url":"//p9.pstatp.com/list/pgc-image/153146412891597265ec821"}],"media_avatar_url":"//p9.pstatp.com/medium/1891/6270338996","datetime":"2018-07-13 14:42:09","more_mode":false,"create_time":"1531464129","has_gallery":false,"id":"6577588350922785284","user_id":3812116387,"title":"江疏影艺考视流出 本人留言\u201c不敢点\u201d看","has_video":false,"share_url":"http://entertainment.dbw.cn/system/2018/07/13/058033700.shtml","source":"东北网","comment_count":0,"article_url":"http://entertainment.dbw.cn/system/2018/07/13/058033700.shtml","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"日前，江疏影昔日艺考视频片段遭起底，美声清唱引发网友爆笑不断。彩蛋中，十年前的江疏影长发披肩，一身白色休闲西服出镜，即便是隔着渣画质仍旧能感受到其青涩感。","large_image_url":"http://p1.pstatp.com/large/pgc-image/15314641279128521ad4d46","display_time":"1531464129","publish_time":"1531464129","middle_mode":true,"media_creator_id":3812116387,"tag_id":6577588350922785284,"source_url":"/group/6577588350922785284/","item_id":"6577588350922785284","user_auth_info":{"auth_type":"0","auth_info":"东北网官方帐号"},"seo_url":"/group/6577588350922785284/","keyword":"视频","middle_image_url":"http://p1.pstatp.com/list/300x196/pgc-image/15314641279128521ad4d46","behot_time":"1531464129","summary":"日前，江疏影昔日艺考视频片段遭起底，美声清唱引发网友爆笑不断。引得网友纷纷留言，婴儿","tag":"news_entertainment","image_url":"//p1.pstatp.com/list/pgc-image/15314641279128521ad4d46","has_image":true,"highlight":{"source":[],"abstract":[[10,2]],"title":[],"summary":[[10,2]]},"group_id":"6577588350922785284","image_count":2},{"play_effective_count":"0","open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577584886746448392%2C%22source%22%3A%22%E5%B0%8F%E7%A4%BC%E8%A7%A3%E8%AF%B4%22%7D&gd_label=click_search&group_flags=64&groupid=6577584886746448392&item_id=6577584886746448392","media_name":"小礼解说","show_play_effective_count":1,"media_url":"http://toutiao.com/m1594095883022339/","item_source_url":"/group/6577584886746448392/","labels":[],"image_list":[{"url":"//p1.pstatp.com/list/pgc-image/15314623052884a43e4ef78"}],"media_avatar_url":"//p3.pstatp.com/medium/933100049e7726840c18","datetime":"2018-07-13 14:28:42","more_mode":false,"create_time":"1531463322","has_gallery":false,"video_duration":148,"id":"6577584886746448392","user_id":78972798900,"title":"穿越火线：生化模式M4A1-千变实战视频，原来千变手感这么棒","has_video":true,"share_url":"http://toutiao.com/group/6577584886746448392/","source":"小礼解说","comment_count":0,"article_url":"http://toutiao.com/group/6577584886746448392/","single_mode":true,"comments_count":0,"large_mode":false,"abstract":"穿越火线：生化模式M4A1-千变实战视频，原来千变手感这么棒","large_image_url":"http://p9.pstatp.com/large/pgc-image/15314623052884a43e4ef78","display_time":"1531463322","publish_time":"1531463322","middle_mode":true,"media_creator_id":78972798900,"tag_id":6577584886746448392,"source_url":"/group/6577584886746448392/","video_duration_str":"02:28","item_id":"6577584886746448392","user_auth_info":{},"seo_url":"/group/6577584886746448392/","keyword":"视频","middle_image_url":"http://p3.pstatp.com/list/300x196/pgc-image/15314623052884a43e4ef78","behot_time":"1531463322","tag":"video_game","image_url":"//p1.pstatp.com/list/pgc-image/15314623052884a43e4ef78","has_image":true,"highlight":{"source":[],"abstract":[[18,2]],"title":[[18,2]]},"group_id":"6577584886746448392","image_count":0},{"play_effective_count":"11","open_url":"sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577583929031655940%2C%22source%22%3A%22%E5%86%9C%E6%9D%91%E9%80%80%E4%BC%8D%E5%85%B5%E5%B0%8F%E9%99%88%22%7D&gd_label=click_search&group_flags=64&groupid=6577583929031655940&item_id=6577583929031655940","media_name":"农村退伍兵小陈","show_play_effective_count":1,"media_url":"http://toutiao.com/m1575938616338446/","item_source_url":"/group/6577583929031655940/","labels":[],"image_list":[{"url":"//p3.pstatp.com/list/pgc-image/1531463091677b9af0a09b3"}],"media_avatar_url":"//p9.pstatp.com/medium/6edf0005add2ef4a7984","datetime":"2018-07-13 14:24:59","more_mode":false,"create_time":"1531463099","has_gallery":false,"video_duration":188,"id":"6577583929031655940","user_id":60155095574,"title":"九妹两位老乡交流三农视频经验，希望有更大的发展！","has_video":true,"share_url":"http://toutiao.com/group/6577583929031655940/","source":"农村退伍兵小陈","comment_count":1,"article_url":"http://toutiao.com/group/6577583929031655940/","single_mode":true,"comments_count":1,"large_mode":false,"abstract":"农民、农村、三农视频人，广西三农小陈和小诗面对面交流，两人相见恨晚！","large_image_url":"http://p3.pstatp.com/large/pgc-image/1531463091677b9af0a09b3","display_time":"1531463099","publish_time":"1531463099","middle_mode":true,"media_creator_id":60155095574,"tag_id":6577583929031655940,"source_url":"/group/6577583929031655940/","video_duration_str":"03:08","item_id":"6577583929031655940","user_auth_info":{"auth_type":"0","other_auth":{"pgc":"头条三农视频原创作者"},"auth_info":"头条三农视频原创作者"},"seo_url":"/group/6577583929031655940/","keyword":"视频","middle_image_url":"http://p1.pstatp.com/list/300x196/pgc-image/1531463091677b9af0a09b3","behot_time":"1531463099","tag":"video_agriculture","image_url":"//p3.pstatp.com/list/pgc-image/1531463091677b9af0a09b3","has_image":true,"highlight":{"source":[],"abstract":[[8,2]],"title":[[10,2]]},"group_id":"6577583929031655940","image_count":0}]
     * message : success
     * action_label_pgc : click_search
     */

    private int count;
    private String action_label;
    private int return_count;
    private int has_more;
    private String page_id;
    private String request_id;
    private int cur_tab;
    private TabBean tab;
    private int offset;
    private String action_label_web;
    private int show_tabs;
    private String message;
    private String action_label_pgc;
    private List<String> tokens;
    private List<DataBean> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAction_label() {
        return action_label;
    }

    public void setAction_label(String action_label) {
        this.action_label = action_label;
    }

    public int getReturn_count() {
        return return_count;
    }

    public void setReturn_count(int return_count) {
        this.return_count = return_count;
    }

    public int getHas_more() {
        return has_more;
    }

    public void setHas_more(int has_more) {
        this.has_more = has_more;
    }

    public String getPage_id() {
        return page_id;
    }

    public void setPage_id(String page_id) {
        this.page_id = page_id;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public int getCur_tab() {
        return cur_tab;
    }

    public void setCur_tab(int cur_tab) {
        this.cur_tab = cur_tab;
    }

    public TabBean getTab() {
        return tab;
    }

    public void setTab(TabBean tab) {
        this.tab = tab;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getAction_label_web() {
        return action_label_web;
    }

    public void setAction_label_web(String action_label_web) {
        this.action_label_web = action_label_web;
    }

    public int getShow_tabs() {
        return show_tabs;
    }

    public void setShow_tabs(int show_tabs) {
        this.show_tabs = show_tabs;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAction_label_pgc() {
        return action_label_pgc;
    }

    public void setAction_label_pgc(String action_label_pgc) {
        this.action_label_pgc = action_label_pgc;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class TabBean {
        /**
         * tab_list : [{"tab_name":"综合","tab_id":1,"tab_code":"news"},{"tab_name":"视频","tab_id":2,"tab_code":"video"},{"tab_name":"图集","tab_id":3,"tab_code":"gallery"},{"tab_name":"用户","tab_id":4,"tab_code":"pgc"},{"tab_name":"问答","tab_id":5,"tab_code":"wenda"}]
         * cur_tab : 1
         */

        private int cur_tab;
        private List<TabListBean> tab_list;

        public int getCur_tab() {
            return cur_tab;
        }

        public void setCur_tab(int cur_tab) {
            this.cur_tab = cur_tab;
        }

        public List<TabListBean> getTab_list() {
            return tab_list;
        }

        public void setTab_list(List<TabListBean> tab_list) {
            this.tab_list = tab_list;
        }

        public static class TabListBean {
            /**
             * tab_name : 综合
             * tab_id : 1
             * tab_code : news
             */

            private String tab_name;
            private int tab_id;
            private String tab_code;

            public String getTab_name() {
                return tab_name;
            }

            public void setTab_name(String tab_name) {
                this.tab_name = tab_name;
            }

            public int getTab_id() {
                return tab_id;
            }

            public void setTab_id(int tab_id) {
                this.tab_id = tab_id;
            }

            public String getTab_code() {
                return tab_code;
            }

            public void setTab_code(String tab_code) {
                this.tab_code = tab_code;
            }
        }
    }

    public static class DataBean {
        /**
         * cell_type : 26
         * key_info : {"keyword":"视频"}
         * keyinfo : {"keyword":"视频"}
         * display : {"hits":[{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=7fed8ecbef4a4170b742f59e0da26252&line=0&app_id=13","title":"当面包遇到看了冰淇淋","detail_schema":"sslocal://awemevideo?group_id=6532311445277773059&group_source=19&item_id=6532311445277773059&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=0&from_req_id=201807131448421720162510688286E2","digg_count":37629,"large_thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6dc500026305510822d5~375x375.jpeg","play_count":715063,"thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6dc500026305510822d5~240x240.jpeg","group_id":"6532311445277773059"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=594ffd06d9b6444db0a16c2a7066f08a&line=0&app_id=13","title":"兄弟相差12岁，二宝3个月了","detail_schema":"sslocal://awemevideo?group_id=6480516181055769869&group_source=19&item_id=6480516181055769869&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=1&from_req_id=201807131448421720162510688286E2","digg_count":70414,"large_thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/412f000c4944871c4275~375x375.jpeg","play_count":5423512,"thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/412f000c4944871c4275~240x240.jpeg","group_id":"6480516181055769869"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=15c1f3af6ded4539b73ddb58963ae90e&line=0&app_id=13","title":"丫头加油哟😘😘","detail_schema":"sslocal://awemevideo?group_id=6483005397127925005&group_source=19&item_id=6483005397127925005&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=2&from_req_id=201807131448421720162510688286E2","digg_count":27829,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/422e0004457d0f16a95c~375x375.jpeg","play_count":122103,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/422e0004457d0f16a95c~240x240.jpeg","group_id":"6483005397127925005"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=5540d0030fbf41d49d0451c9b3e7bee2&line=0&app_id=13","title":"狗狗几天没见到它的好朋友，他还在过马路，狗狗看见就冲上斑马线对他亲热，激动的对着他一直撒娇，看得我很感动","detail_schema":"sslocal://awemevideo?group_id=6529025839516880142&group_source=19&item_id=6529025839516880142&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=3&from_req_id=201807131448421720162510688286E2","digg_count":73624,"large_thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/6aa5000825ef795511b1~375x375.jpeg","play_count":899817,"thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/6aa5000825ef795511b1~240x240.jpeg","group_id":"6529025839516880142"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=3af722d2bd304730afd1d153408961d0&line=0&app_id=13","title":"神奇的PS，竟把老年夫妇还原到年轻时的模样，郎才女貌惊艳众人！","detail_schema":"sslocal://awemevideo?group_id=6519714636630068488&group_source=19&item_id=6519714636630068488&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=4&from_req_id=201807131448421720162510688286E2","digg_count":97603,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/60a9000e629578131bca~375x375.jpeg","play_count":3501113,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/60a9000e629578131bca~240x240.jpeg","group_id":"6519714636630068488"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=7ba60cdf307b4837ac089312b4dde55a&line=0&app_id=13","title":"好久不更新。摔下来的仙女🧚♀️@没刘海的妹子","detail_schema":"sslocal://awemevideo?group_id=6512298051955068173&group_source=19&item_id=6512298051955068173&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=5&from_req_id=201807131448421720162510688286E2","digg_count":46242,"large_thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/59e4000ee41e3253e2f7~375x375.jpeg","play_count":1268186,"thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/59e4000ee41e3253e2f7~240x240.jpeg","group_id":"6512298051955068173"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=5134f50b79b7493ba401c58257344da2&line=0&app_id=13","title":"公司流浪汪带崽，天天煮鸡蛋来喂","detail_schema":"sslocal://awemevideo?group_id=6517112720985165063&group_source=19&item_id=6517112720985165063&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=6&from_req_id=201807131448421720162510688286E2","digg_count":48329,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/5f01000c3abef7a2b06e~375x375.jpeg","play_count":395462,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/5f01000c3abef7a2b06e~240x240.jpeg","group_id":"6517112720985165063"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=01a3f3266fdc47a4963faa8df0f4eb87&line=0&app_id=13","title":"草莓果冻蛋糕，想吃的请举手🙋，教程戳微博","detail_schema":"sslocal://awemevideo?group_id=6533365560737008903&group_source=19&item_id=6533365560737008903&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=7&from_req_id=201807131448421720162510688286E2","digg_count":7513,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/6e5c00106a89d83892f2~375x375.jpeg","play_count":84048,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/6e5c00106a89d83892f2~240x240.jpeg","group_id":"6533365560737008903"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=9b3bab900bc04032a82f395b7a4efcd4&line=0&app_id=13","title":"高一最666的班🙈🙈🙈","detail_schema":"sslocal://awemevideo?group_id=6503409767178833166&group_source=19&item_id=6503409767178833166&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=8&from_req_id=201807131448421720162510688286E2","digg_count":33694,"large_thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/51d8000ed2f3482150cd~375x375.jpeg","play_count":2696445,"thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/51d8000ed2f3482150cd~240x240.jpeg","group_id":"6503409767178833166"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=2c98ba859be4454f8d2e4b1e8b70eb99&line=0&app_id=13","title":"一秒变脸的塑料姐妹友谊哈哈哈哈哈@OhmyLady花花 @抖音小助手","detail_schema":"sslocal://awemevideo?group_id=6528972381061385480&group_source=19&item_id=6528972381061385480&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=9&from_req_id=201807131448421720162510688286E2","digg_count":12799,"large_thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6a960013f3d7864c29fb~375x375.jpeg","play_count":184493,"thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6a960013f3d7864c29fb~240x240.jpeg","group_id":"6528972381061385480"}],"abtest":1,"fromIndex":0,"headers":{},"statusCodeValue":200,"hitCount":10,"query":"视频","total":1000000,"statusCode":"OK"}
         * tokens : ["视频"]
         * id_str : 3646832802
         * ala_src : hotsoon_video
         * id : 3646832802
         * play_effective_count : 15
         * open_url : sslocal://detail?aggr_type=0&article_type=0&gd_ext_json=%7B%22city%22%3A%22%22%2C%22log_pb%22%3A%7B%22impr_id%22%3A%22201807131448421720162510688286E2%22%7D%2C%22query%22%3A%22%E8%A7%86%E9%A2%91%22%2C%22search_result_id%22%3A6577201427783877123%2C%22source%22%3A%22%E7%99%BE%E5%8D%83%E5%A8%B1%E4%B9%90%E4%B8%96%E7%95%8C%22%7D&gd_label=click_search&group_flags=64&groupid=6577201427783877123&item_id=6577201427783877123
         * media_name : 百千娱乐世界
         * show_play_effective_count : 1
         * media_url : http://toutiao.com/m1597643702197255/
         * item_source_url : /group/6577201427783877123/
         * labels : []
         * image_list : [{"url":"//p9.pstatp.com/list/982200144345940ef122"}]
         * media_avatar_url : //p1.pstatp.com/medium/6ee3000142dfe33a6228
         * datetime : 2018-07-13 12:10:00
         * more_mode : false
         * create_time : 1531455000
         * has_gallery : false
         * video_duration : 28
         * user_id : 52098330240
         * title : 看了这个视频，以后你还敢赌博吗？（电影：至尊无上）
         * has_video : true
         * share_url : http://toutiao.com/group/6577201427783877123/
         * source : 百千娱乐世界
         * comment_count : 0
         * article_url : http://toutiao.com/group/6577201427783877123/
         * single_mode : true
         * comments_count : 0
         * large_mode : false
         * abstract : 看了这个视频，以后你还敢赌博吗？
         * large_image_url : http://p1.pstatp.com/large/982200144345940ef122
         * display_time : 1531455000
         * publish_time : 1531455000
         * middle_mode : true
         * media_creator_id : 52098330240
         * tag_id : 6577201427783877123
         * source_url : /group/6577201427783877123/
         * video_duration_str : 00:28
         * item_id : 6577201427783877123
         * user_auth_info : {}
         * seo_url : /group/6577201427783877123/
         * keyword : 视频
         * middle_image_url : http://p3.pstatp.com/list/300x196/982200144345940ef122
         * behot_time : 1531455000
         * tag : video_movie
         * image_url : //p9.pstatp.com/list/982200144345940ef122
         * has_image : true
         * highlight : {"source":[],"abstract":[[4,2]],"title":[[4,2]]}
         * group_id : 6577201427783877123
         * image_count : 0
         * summary : 视频几乎都是一个模式，不是天天在想着法子变着花样的在吃，就是下河摸个鱼地里摘个瓜，但
         * screen_name : 视频
         * media_id : 6510383496
         * description : 喜欢就关注：视频。每日分享经典视频
         * gender : 2
         * follow_count : 14312
         * no_display_pgc_icon : 0
         * user_type : 1
         * is_pgc : 1
         * verified_content :
         * avatar_url : //p1.pstatp.com/medium/4110011eb2ea21e32f0
         * user_decoration : {}
         * user_verified : 0
         * name : 视频
         */

        private int cell_type;
        private KeyInfoBean key_info;
        private KeyinfoBean keyinfo;
        private DisplayBean display;
        private String id_str;
        private String ala_src;
        private long id;
        private String play_effective_count;
        private String open_url;
        private String media_name;
        private int show_play_effective_count;
        private String media_url;
        private String item_source_url;
        private String media_avatar_url;
        private String datetime;
        private boolean more_mode;
        private String create_time;
        private boolean has_gallery;
        private int video_duration;
        private long user_id;
        private String title;
        private boolean has_video;
        private String share_url;
        private String source;
        private int comment_count;
        private String article_url;
        private boolean single_mode;
        private int comments_count;
        private boolean large_mode;
        @SerializedName("abstract")
        private String abstractX;
        private String large_image_url;
        private String display_time;
        private String publish_time;
        private boolean middle_mode;
        private long media_creator_id;
        private long tag_id;
        private String source_url;
        private String video_duration_str;
        private String item_id;
        private UserAuthInfoBean user_auth_info;
        private String seo_url;
        private String keyword;
        private String middle_image_url;
        private String behot_time;
        private String tag;
        private String image_url;
        private boolean has_image;
        private HighlightBean highlight;
        private String group_id;
        private int image_count;
        private String summary;
        private String screen_name;
        private String media_id;
        private String description;
        private String gender;
        private int follow_count;
        private String no_display_pgc_icon;
        private String user_type;
        private int is_pgc;
        private String verified_content;
        private String avatar_url;
        private UserDecorationBean user_decoration;
        private String user_verified;
        private String name;
        private List<String> tokens;
        private List<?> labels;
        private List<ImageListBean> image_list;

        public int getCell_type() {
            return cell_type;
        }

        public void setCell_type(int cell_type) {
            this.cell_type = cell_type;
        }

        public KeyInfoBean getKey_info() {
            return key_info;
        }

        public void setKey_info(KeyInfoBean key_info) {
            this.key_info = key_info;
        }

        public KeyinfoBean getKeyinfo() {
            return keyinfo;
        }

        public void setKeyinfo(KeyinfoBean keyinfo) {
            this.keyinfo = keyinfo;
        }

        public DisplayBean getDisplay() {
            return display;
        }

        public void setDisplay(DisplayBean display) {
            this.display = display;
        }

        public String getId_str() {
            return id_str;
        }

        public void setId_str(String id_str) {
            this.id_str = id_str;
        }

        public String getAla_src() {
            return ala_src;
        }

        public void setAla_src(String ala_src) {
            this.ala_src = ala_src;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getPlay_effective_count() {
            return play_effective_count;
        }

        public void setPlay_effective_count(String play_effective_count) {
            this.play_effective_count = play_effective_count;
        }

        public String getOpen_url() {
            return open_url;
        }

        public void setOpen_url(String open_url) {
            this.open_url = open_url;
        }

        public String getMedia_name() {
            return media_name;
        }

        public void setMedia_name(String media_name) {
            this.media_name = media_name;
        }

        public int getShow_play_effective_count() {
            return show_play_effective_count;
        }

        public void setShow_play_effective_count(int show_play_effective_count) {
            this.show_play_effective_count = show_play_effective_count;
        }

        public String getMedia_url() {
            return media_url;
        }

        public void setMedia_url(String media_url) {
            this.media_url = media_url;
        }

        public String getItem_source_url() {
            return item_source_url;
        }

        public void setItem_source_url(String item_source_url) {
            this.item_source_url = item_source_url;
        }

        public String getMedia_avatar_url() {
            return media_avatar_url;
        }

        public void setMedia_avatar_url(String media_avatar_url) {
            this.media_avatar_url = media_avatar_url;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public boolean isMore_mode() {
            return more_mode;
        }

        public void setMore_mode(boolean more_mode) {
            this.more_mode = more_mode;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public boolean isHas_gallery() {
            return has_gallery;
        }

        public void setHas_gallery(boolean has_gallery) {
            this.has_gallery = has_gallery;
        }

        public int getVideo_duration() {
            return video_duration;
        }

        public void setVideo_duration(int video_duration) {
            this.video_duration = video_duration;
        }

        public long getUser_id() {
            return user_id;
        }

        public void setUser_id(long user_id) {
            this.user_id = user_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isHas_video() {
            return has_video;
        }

        public void setHas_video(boolean has_video) {
            this.has_video = has_video;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public String getArticle_url() {
            return article_url;
        }

        public void setArticle_url(String article_url) {
            this.article_url = article_url;
        }

        public boolean isSingle_mode() {
            return single_mode;
        }

        public void setSingle_mode(boolean single_mode) {
            this.single_mode = single_mode;
        }

        public int getComments_count() {
            return comments_count;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
        }

        public boolean isLarge_mode() {
            return large_mode;
        }

        public void setLarge_mode(boolean large_mode) {
            this.large_mode = large_mode;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public String getLarge_image_url() {
            return large_image_url;
        }

        public void setLarge_image_url(String large_image_url) {
            this.large_image_url = large_image_url;
        }

        public String getDisplay_time() {
            return display_time;
        }

        public void setDisplay_time(String display_time) {
            this.display_time = display_time;
        }

        public String getPublish_time() {
            return publish_time;
        }

        public void setPublish_time(String publish_time) {
            this.publish_time = publish_time;
        }

        public boolean isMiddle_mode() {
            return middle_mode;
        }

        public void setMiddle_mode(boolean middle_mode) {
            this.middle_mode = middle_mode;
        }

        public long getMedia_creator_id() {
            return media_creator_id;
        }

        public void setMedia_creator_id(long media_creator_id) {
            this.media_creator_id = media_creator_id;
        }

        public long getTag_id() {
            return tag_id;
        }

        public void setTag_id(long tag_id) {
            this.tag_id = tag_id;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getVideo_duration_str() {
            return video_duration_str;
        }

        public void setVideo_duration_str(String video_duration_str) {
            this.video_duration_str = video_duration_str;
        }

        public String getItem_id() {
            return item_id;
        }

        public void setItem_id(String item_id) {
            this.item_id = item_id;
        }

        public UserAuthInfoBean getUser_auth_info() {
            return user_auth_info;
        }

        public void setUser_auth_info(UserAuthInfoBean user_auth_info) {
            this.user_auth_info = user_auth_info;
        }

        public String getSeo_url() {
            return seo_url;
        }

        public void setSeo_url(String seo_url) {
            this.seo_url = seo_url;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        public String getMiddle_image_url() {
            return middle_image_url;
        }

        public void setMiddle_image_url(String middle_image_url) {
            this.middle_image_url = middle_image_url;
        }

        public String getBehot_time() {
            return behot_time;
        }

        public void setBehot_time(String behot_time) {
            this.behot_time = behot_time;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public boolean isHas_image() {
            return has_image;
        }

        public void setHas_image(boolean has_image) {
            this.has_image = has_image;
        }

        public HighlightBean getHighlight() {
            return highlight;
        }

        public void setHighlight(HighlightBean highlight) {
            this.highlight = highlight;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public int getImage_count() {
            return image_count;
        }

        public void setImage_count(int image_count) {
            this.image_count = image_count;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getScreen_name() {
            return screen_name;
        }

        public void setScreen_name(String screen_name) {
            this.screen_name = screen_name;
        }

        public String getMedia_id() {
            return media_id;
        }

        public void setMedia_id(String media_id) {
            this.media_id = media_id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getFollow_count() {
            return follow_count;
        }

        public void setFollow_count(int follow_count) {
            this.follow_count = follow_count;
        }

        public String getNo_display_pgc_icon() {
            return no_display_pgc_icon;
        }

        public void setNo_display_pgc_icon(String no_display_pgc_icon) {
            this.no_display_pgc_icon = no_display_pgc_icon;
        }

        public String getUser_type() {
            return user_type;
        }

        public void setUser_type(String user_type) {
            this.user_type = user_type;
        }

        public int getIs_pgc() {
            return is_pgc;
        }

        public void setIs_pgc(int is_pgc) {
            this.is_pgc = is_pgc;
        }

        public String getVerified_content() {
            return verified_content;
        }

        public void setVerified_content(String verified_content) {
            this.verified_content = verified_content;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public UserDecorationBean getUser_decoration() {
            return user_decoration;
        }

        public void setUser_decoration(UserDecorationBean user_decoration) {
            this.user_decoration = user_decoration;
        }

        public String getUser_verified() {
            return user_verified;
        }

        public void setUser_verified(String user_verified) {
            this.user_verified = user_verified;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getTokens() {
            return tokens;
        }

        public void setTokens(List<String> tokens) {
            this.tokens = tokens;
        }

        public List<?> getLabels() {
            return labels;
        }

        public void setLabels(List<?> labels) {
            this.labels = labels;
        }

        public List<ImageListBean> getImage_list() {
            return image_list;
        }

        public void setImage_list(List<ImageListBean> image_list) {
            this.image_list = image_list;
        }

        public static class KeyInfoBean {
            /**
             * keyword : 视频
             */

            private String keyword;

            public String getKeyword() {
                return keyword;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }
        }

        public static class KeyinfoBean {
            /**
             * keyword : 视频
             */

            private String keyword;

            public String getKeyword() {
                return keyword;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }
        }

        public static class DisplayBean {
            /**
             * hits : [{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=7fed8ecbef4a4170b742f59e0da26252&line=0&app_id=13","title":"当面包遇到看了冰淇淋","detail_schema":"sslocal://awemevideo?group_id=6532311445277773059&group_source=19&item_id=6532311445277773059&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=0&from_req_id=201807131448421720162510688286E2","digg_count":37629,"large_thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6dc500026305510822d5~375x375.jpeg","play_count":715063,"thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6dc500026305510822d5~240x240.jpeg","group_id":"6532311445277773059"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=594ffd06d9b6444db0a16c2a7066f08a&line=0&app_id=13","title":"兄弟相差12岁，二宝3个月了","detail_schema":"sslocal://awemevideo?group_id=6480516181055769869&group_source=19&item_id=6480516181055769869&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=1&from_req_id=201807131448421720162510688286E2","digg_count":70414,"large_thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/412f000c4944871c4275~375x375.jpeg","play_count":5423512,"thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/412f000c4944871c4275~240x240.jpeg","group_id":"6480516181055769869"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=15c1f3af6ded4539b73ddb58963ae90e&line=0&app_id=13","title":"丫头加油哟😘😘","detail_schema":"sslocal://awemevideo?group_id=6483005397127925005&group_source=19&item_id=6483005397127925005&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=2&from_req_id=201807131448421720162510688286E2","digg_count":27829,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/422e0004457d0f16a95c~375x375.jpeg","play_count":122103,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/422e0004457d0f16a95c~240x240.jpeg","group_id":"6483005397127925005"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=5540d0030fbf41d49d0451c9b3e7bee2&line=0&app_id=13","title":"狗狗几天没见到它的好朋友，他还在过马路，狗狗看见就冲上斑马线对他亲热，激动的对着他一直撒娇，看得我很感动","detail_schema":"sslocal://awemevideo?group_id=6529025839516880142&group_source=19&item_id=6529025839516880142&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=3&from_req_id=201807131448421720162510688286E2","digg_count":73624,"large_thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/6aa5000825ef795511b1~375x375.jpeg","play_count":899817,"thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/6aa5000825ef795511b1~240x240.jpeg","group_id":"6529025839516880142"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=3af722d2bd304730afd1d153408961d0&line=0&app_id=13","title":"神奇的PS，竟把老年夫妇还原到年轻时的模样，郎才女貌惊艳众人！","detail_schema":"sslocal://awemevideo?group_id=6519714636630068488&group_source=19&item_id=6519714636630068488&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=4&from_req_id=201807131448421720162510688286E2","digg_count":97603,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/60a9000e629578131bca~375x375.jpeg","play_count":3501113,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/60a9000e629578131bca~240x240.jpeg","group_id":"6519714636630068488"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=7ba60cdf307b4837ac089312b4dde55a&line=0&app_id=13","title":"好久不更新。摔下来的仙女🧚♀️@没刘海的妹子","detail_schema":"sslocal://awemevideo?group_id=6512298051955068173&group_source=19&item_id=6512298051955068173&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=5&from_req_id=201807131448421720162510688286E2","digg_count":46242,"large_thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/59e4000ee41e3253e2f7~375x375.jpeg","play_count":1268186,"thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/59e4000ee41e3253e2f7~240x240.jpeg","group_id":"6512298051955068173"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=5134f50b79b7493ba401c58257344da2&line=0&app_id=13","title":"公司流浪汪带崽，天天煮鸡蛋来喂","detail_schema":"sslocal://awemevideo?group_id=6517112720985165063&group_source=19&item_id=6517112720985165063&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=6&from_req_id=201807131448421720162510688286E2","digg_count":48329,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/5f01000c3abef7a2b06e~375x375.jpeg","play_count":395462,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/5f01000c3abef7a2b06e~240x240.jpeg","group_id":"6517112720985165063"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=01a3f3266fdc47a4963faa8df0f4eb87&line=0&app_id=13","title":"草莓果冻蛋糕，想吃的请举手🙋，教程戳微博","detail_schema":"sslocal://awemevideo?group_id=6533365560737008903&group_source=19&item_id=6533365560737008903&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=7&from_req_id=201807131448421720162510688286E2","digg_count":7513,"large_thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/6e5c00106a89d83892f2~375x375.jpeg","play_count":84048,"thumbnail_url":"http://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/6e5c00106a89d83892f2~240x240.jpeg","group_id":"6533365560737008903"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=9b3bab900bc04032a82f395b7a4efcd4&line=0&app_id=13","title":"高一最666的班🙈🙈🙈","detail_schema":"sslocal://awemevideo?group_id=6503409767178833166&group_source=19&item_id=6503409767178833166&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=8&from_req_id=201807131448421720162510688286E2","digg_count":33694,"large_thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/51d8000ed2f3482150cd~375x375.jpeg","play_count":2696445,"thumbnail_url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/51d8000ed2f3482150cd~240x240.jpeg","group_id":"6503409767178833166"},{"video_url":"https://aweme.snssdk.com/aweme/v1/play/?video_id=2c98ba859be4454f8d2e4b1e8b70eb99&line=0&app_id=13","title":"一秒变脸的塑料姐妹友谊哈哈哈哈哈@OhmyLady花花 @抖音小助手","detail_schema":"sslocal://awemevideo?group_id=6528972381061385480&group_source=19&item_id=6528972381061385480&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=9&from_req_id=201807131448421720162510688286E2","digg_count":12799,"large_thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6a960013f3d7864c29fb~375x375.jpeg","play_count":184493,"thumbnail_url":"http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6a960013f3d7864c29fb~240x240.jpeg","group_id":"6528972381061385480"}]
             * abtest : 1
             * fromIndex : 0
             * headers : {}
             * statusCodeValue : 200
             * hitCount : 10
             * query : 视频
             * total : 1000000
             * statusCode : OK
             */

            private int abtest;
            private int fromIndex;
            private HeadersBean headers;
            private int statusCodeValue;
            private int hitCount;
            private String query;
            private int total;
            private String statusCode;
            private List<HitsBean> hits;

            public int getAbtest() {
                return abtest;
            }

            public void setAbtest(int abtest) {
                this.abtest = abtest;
            }

            public int getFromIndex() {
                return fromIndex;
            }

            public void setFromIndex(int fromIndex) {
                this.fromIndex = fromIndex;
            }

            public HeadersBean getHeaders() {
                return headers;
            }

            public void setHeaders(HeadersBean headers) {
                this.headers = headers;
            }

            public int getStatusCodeValue() {
                return statusCodeValue;
            }

            public void setStatusCodeValue(int statusCodeValue) {
                this.statusCodeValue = statusCodeValue;
            }

            public int getHitCount() {
                return hitCount;
            }

            public void setHitCount(int hitCount) {
                this.hitCount = hitCount;
            }

            public String getQuery() {
                return query;
            }

            public void setQuery(String query) {
                this.query = query;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public String getStatusCode() {
                return statusCode;
            }

            public void setStatusCode(String statusCode) {
                this.statusCode = statusCode;
            }

            public List<HitsBean> getHits() {
                return hits;
            }

            public void setHits(List<HitsBean> hits) {
                this.hits = hits;
            }

            public static class HeadersBean {
            }

            public static class HitsBean {
                /**
                 * video_url : https://aweme.snssdk.com/aweme/v1/play/?video_id=7fed8ecbef4a4170b742f59e0da26252&line=0&app_id=13
                 * title : 当面包遇到看了冰淇淋
                 * detail_schema : sslocal://awemevideo?group_id=6532311445277773059&group_source=19&item_id=6532311445277773059&request_id=1531464522.91&log_pb=%7B%22impr_id%22%3A%221531464522.91%22%7D&gd_ext_json=%7B%22impr_id%22%3A%221531464522.91%22%7D&category_name=__search__&load_more=7&keyword=%E8%A7%86%E9%A2%91&size=10&offset=0&from_req_id=201807131448421720162510688286E2
                 * digg_count : 37629
                 * large_thumbnail_url : http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6dc500026305510822d5~375x375.jpeg
                 * play_count : 715063
                 * thumbnail_url : http://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/6dc500026305510822d5~240x240.jpeg
                 * group_id : 6532311445277773059
                 */

                private String video_url;
                private String title;
                private String detail_schema;
                private int digg_count;
                private String large_thumbnail_url;
                private int play_count;
                private String thumbnail_url;
                private String group_id;

                public String getVideo_url() {
                    return video_url;
                }

                public void setVideo_url(String video_url) {
                    this.video_url = video_url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDetail_schema() {
                    return detail_schema;
                }

                public void setDetail_schema(String detail_schema) {
                    this.detail_schema = detail_schema;
                }

                public int getDigg_count() {
                    return digg_count;
                }

                public void setDigg_count(int digg_count) {
                    this.digg_count = digg_count;
                }

                public String getLarge_thumbnail_url() {
                    return large_thumbnail_url;
                }

                public void setLarge_thumbnail_url(String large_thumbnail_url) {
                    this.large_thumbnail_url = large_thumbnail_url;
                }

                public int getPlay_count() {
                    return play_count;
                }

                public void setPlay_count(int play_count) {
                    this.play_count = play_count;
                }

                public String getThumbnail_url() {
                    return thumbnail_url;
                }

                public void setThumbnail_url(String thumbnail_url) {
                    this.thumbnail_url = thumbnail_url;
                }

                public String getGroup_id() {
                    return group_id;
                }

                public void setGroup_id(String group_id) {
                    this.group_id = group_id;
                }
            }
        }

        public static class UserAuthInfoBean {
        }

        public static class HighlightBean {
            private List<?> source;
            @SerializedName("abstract")
            private List<List<Integer>> abstractX;
            private List<List<Integer>> title;

            public List<?> getSource() {
                return source;
            }

            public void setSource(List<?> source) {
                this.source = source;
            }

            public List<List<Integer>> getAbstractX() {
                return abstractX;
            }

            public void setAbstractX(List<List<Integer>> abstractX) {
                this.abstractX = abstractX;
            }

            public List<List<Integer>> getTitle() {
                return title;
            }

            public void setTitle(List<List<Integer>> title) {
                this.title = title;
            }
        }

        public static class UserDecorationBean {
        }

        public static class ImageListBean {
            /**
             * url : //p9.pstatp.com/list/982200144345940ef122
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
