package test;

import org.kosta.model.product.ProductService;
import org.kosta.model.member.MemberService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * 기존 시스템이 서비스가 되고 있는 상황에서
 * 요구사항이 발생했다.
 * 
 * 요구사항은 시스템의 서비스(상품, 회원 등등)가 
 * 실행되기 직전에 실행시간과 어떤 메서드가 실행되는 지
 * 특정파일(c:\\java-kosta\\report.log에 정보를
 * 저장하는것이다.
 * 
 * 파일 입출력 관련 컴포넌트를 이용(컴포넌츠와 라이브러리의 차이점?)
 * 로깅 라이브러리는 아파치에서 제공하는 log4j를 이용하는 것으로
 * 결정->별도의 프로젝트에서 테스트 해본다
 * 
 * log4j test후
 *  maven 에 라이브러리 설정
 *  log4j xml  설정파일에 파일 명 수정
 *  각서비스 클래스에 log4j를 이용해 로깅처리한다
 *  로깅 레벨은 인포 레벨로
 *  
 *  		-->
 *  			log4j라는 라이브러리를 이용해 io코드는 많이 줄였으나,
 *  			실제 서비스 코드에 일일이 import와 코드작성이 필요하다는 부담이 있다.
 *  			이후 요구사항이 추가 수정시에도 역시 별도의 코드작업을 해야하므로 유지보수에도 부담이있다.
 */
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=
				new ClassPathXmlApplicationContext("spring-config.xml");
		MemberService member=(MemberService) factory.getBean("memberService");
		ProductService product = (ProductService) factory.getBean("productService");
		member.findMemberByAddress();
		member.findMemberById();
		product.findProductById();
		product.findProductByMaker();
		member.findmemberList("안녕");
		factory.close();
				
	}
}
