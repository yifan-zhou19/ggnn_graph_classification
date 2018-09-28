import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[110]);
		int[] a = new int[110];
		int i = 0;
		int j = 0;
		int k = 0;
		int len = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		if (len == 1) //??????
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(str);
			System.out.print("\n");
		}
		else
		{
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				a[i] = str.charAt(i) - '0'; //???????????????
			}
			k = a[0] * 10 + a[1];
			a[1] = k % 13; //?????????????
			if (k > 13)
			{
				System.out.print(k / 13);
			}
			else if (len == 2)
			{
				System.out.print("0");
			}
			for (i = 1;i < len - 1;i++) //???>2?????????
			{
				k = a[i] * 10 + a[i + 1];
				a[i + 1] = k % 13;
				System.out.print(k / 13);
			}
			System.out.print("\n");
			System.out.print(a[i]);
			System.out.print("\n");
		}
		return 0;
	}

}
