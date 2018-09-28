import java.util.*;

package <missing>;

public class GlobalMembers
{
	//???????
	//1000062701
	//???

	public static int Main()
	{
		String qp = new String(new char[200]);
		qp = new Scanner(System.in).nextLine();
		int i;
		int k;
		int str;
		char ch;
		char temp;
		str = qp.length(); //????
		ch = qp.charAt(0);
		for (i = 0; i < str - 1; i++)
		{
			qp.charAt(i) += qp.charAt(i + 1);
		}
		qp.charAt(str - 1) += ch; //?????????
		System.out.print(qp);
		return 0;
	}
}
