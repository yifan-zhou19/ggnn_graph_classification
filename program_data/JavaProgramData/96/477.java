import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??: ??13                         **
	//*????? 1100012816                **
	//*???2011.11.8                      **
	//****************************************
	public static int Main() //???
	{ //?????
		int i; //????
		int c;
		int t;
		int flag = 0;
		int[] a = new int[101];
		int[] b = new int[101];
		String num = new String(new char[101]); //????????
		num = new Scanner(System.in).nextLine(); //????
		c = num.length(); //???????
		for (i = 0;i < c;i++)
		{
			a[i] = num.charAt(i) - '0'; //?????????????
		}
		for (i = 0;i < c;i++) //??????????13?????
		{
			t = b[i] + a[i];
			b[i] = t / 13;
			b[i + 1] += (t % 13) * 10; //?????????????????13???????10
		}
		for (i = 0;i < c - 1;i++)
		{
			if (b[i] != 0 || (b[i] == 0 && flag == 1))
			{
				flag = 1;
				System.out.print(b[i]);
			}
			if (flag == 0)
			{
				continue;
			}
		}
		System.out.print(b[c - 1]);
		System.out.print("\n");
		System.out.print(b[c] / 10);
		System.out.print("\n");
		return 0;
	} //?????


}
