package kr.co.juvis.common.sender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.juvis.common.base.web.BaseController;
import kr.co.juvis.common.sender.messenger.CONTENT_LEVEL;
import kr.co.juvis.common.sender.messenger.MessengerFactoryProducer;
import kr.co.juvis.common.sender.messenger.jandi.JandiContentBuilder;

@RestController
@RequestMapping("/sender")
public class SenderController extends BaseController {

        @RequestMapping("/test/jandi")
        public String jandiTest() {

            // sender 종류 선언 및 생성.
            Sender sender = MessengerFactoryProducer.getFactory("jandi").create("test");

            // 보낼 메세지 생성.
            Content content =
                    JandiContentBuilder.createContent(CONTENT_LEVEL.ERROR, "에러 body title")     // 필수.
                    .addInfo("title1","desc1")                                                   // 선택.
                    .addInfo("title2","desc2")                                                   // 선택.
                    .build();

            // 생성한 메세지 전송.
            boolean isSuccess = sender.send(content);

            return "send result : "+isSuccess;
        }
}
