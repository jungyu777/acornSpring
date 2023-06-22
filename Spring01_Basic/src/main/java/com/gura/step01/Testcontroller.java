package com.gura.step01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gura.step01.member.MemberDto;

/**
 * 
 * JSON 문자열 응답하는 방법
 * 
 * 1.pom.xml에 jacjson-databind dependency 를 추가한다.
 * 
 * 2. 컨트롤러 메소드에 @ResponseNodt 에노테이션 을 붙여준다.
 * 
 * 
 * 3.Dtom, List , Map 등을 컨트롤러에서 리턴해주면 해덩 객체에 담긴 정보가 json으로 구성되어서 응답된다.
 *
 */

@Controller
public class Testcontroller {
	
	@ResponseBody//리턴하는걸 응답해달라고 하는 에노테이션 
	@RequestMapping("/test/json1")
	public String json1() {
		
		return "{\"num\":1}";
	}
	@ResponseBody
	@RequestMapping("/test/json2")
	public MemberDto json2() {
		MemberDto dto = new MemberDto();
		dto.setNum(2);
		dto.setName("해골");
		dto.setAddr("원숭이");
		return dto;
	}
	@ResponseBody
	@RequestMapping("/test/json3")
	public Map<String, Object> json3(){
		Map<String, Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "true");
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/test/json4")
	public List<String> json4(){
		List<String> list = new ArrayList<String>();
		list.add("김구라");
		list.add("해골");
		list.add("원숭이");
		return list;
	}
	@ResponseBody
	@RequestMapping("/test/json5")
	public List<MemberDto>  json(){
		List<MemberDto> list = new ArrayList<MemberDto>();
		list.add(new MemberDto(1,"김구라","노량진"));
		list.add(new MemberDto(2,"ㅎ해골","행복동"));
		list.add(new MemberDto(3,"원숭이","정글"));
		return list;
	}
	
	/**
	 * Dto or Map =>{}
	 * 
	 * List => []
	 * 
	 * List<String >=>["xxx","xxx"]
	 * 
	 * List<Dto> or List<Map> => [{},{}...]
	 */
	@ResponseBody
	@RequestMapping("/test/json6")
	public List<Map<String, Object>> json6(){
		List<Map<String, Object>> listMap = new ArrayList<Map<String,Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("num", 1);
		map1.put("name", new MemberDto(1,"불라","불라"));
		map1.put("addr", 3);
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("num", 1);
		map2.put("name", 2);
		map2.put("addr", 3);
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("num", 1);
		map3.put("name", 2);
		map3.put("addr", 3);
		listMap.add(map1);
		listMap.add(map2);
		listMap.add(map3);
		return listMap;
	}
}
