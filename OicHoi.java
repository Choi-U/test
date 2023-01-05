package choiU213;
import java.util.Scanner;
public class OicHoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] product={"수박","딸기","한라봉"};
		int[] price= {100,200,300};

		
		System.out.println("성명 입력:");
		String name=s.next();
		System.out.println("과일 선택:");
		int fruit=s.nextInt();
		System.out.println("과일 수량:");
		int count=s.nextInt();
		
		System.out.println("성명:"+name+" 과일:"+product[fruit]+" 수량:"+count+" 총액"+price[fruit]*count);
	}

}
