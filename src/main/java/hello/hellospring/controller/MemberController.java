package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    // private final MemberService memberService = new MemberService();
    // => spring이 관리를 하게 되면, 다 스프링 컨테이너에 등록을 하고 스프링 컨테이너에서 받아서 쓰도록 바꾸어야함!

    private final MemberService memberService;

    // @Autowired라고 어노테이션을 작성할 경우, 스프링이 스프링 컨테이너 안에 있는 memberService를 가져다 연결을 시켜준다!
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
