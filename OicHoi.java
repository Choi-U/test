package choiU213;
import java.util.Scanner;
public class OicHoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] product={"����","����","�Ѷ��"};
		int[] price= {100,200,300};

		
		System.out.println("���� �Է�:");
		String name=s.next();
		System.out.println("���� ����:");
		int fruit=s.nextInt();
		System.out.println("���� ����:");
		int count=s.nextInt();
		
		System.out.println("����:"+name+" ����:"+product[fruit]+" ����:"+count+" �Ѿ�"+price[fruit]*count);
	}

}
