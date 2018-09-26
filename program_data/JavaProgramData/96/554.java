import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int l;
		int[] num = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //?????????
		int[] num1 = new int[101]; //????
		a = new Scanner(System.in).nextLine();
		l = a.length(); //???????
		for (i = 0;i < l;i++)
		{
			num[i] = (int)a.charAt(i) - '0';
		}
		if (l == 1) //????
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(num[0]);
			System.out.print("\n");
		}
		else if (l == 2 && 10 * num[0] + num[1] < 13)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(10 * num[0] + num[1]);
			System.out.print("\n");
		}
		else //????
		{
		for (i = 0;i < l - 1;i++)
		{
			num1[i] = (10 * num[i] + num[i + 1]) / 13;
			num[i + 1] = (10 * num[i] + num[i + 1]) % 13;
		}
		if (num1[0] != 0)
		{
			System.out.print(num1[0]);
		}
		for (i = 1;i < l - 1;i++)
		{
		System.out.print(num1[i]);
		}
		System.out.print("\n");
		System.out.print(num[l - 1]);
		System.out.print("\n");
		}
		System.in.read();
		return 0;
	}

}
