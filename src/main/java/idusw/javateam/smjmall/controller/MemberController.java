package idusw.javateam.smjmall.controller;

import idusw.javateam.smjmall.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @GetMapping("/members/{id}")
    public String getById(@PathVariable("id") String id, Model model) {
        Member member = new Member();

        member.setId(id);

        model.addAttribute("member", member);

        return "/main/test/index";
    }

    @GetMapping("/members/login")
    public String getLogin() {

        return "/main/login";
    }

    @PostMapping("/members/login")
    public String postLogin(@ModelAttribute("member")Member member, Model model) {
        String id = member.getId();
        String pw = member.getPw();

        Member m = new Member();

        if(id.equals("induk") && pw.equals("comso")) {
            m.setId("성공");
            model.addAttribute("member", m);
        }
        else {
            m.setId("실패");
            model.addAttribute("member", m);
        }

        return "/main/index2";
    }
}
