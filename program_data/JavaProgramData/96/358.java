import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String N = new String(new char[101]);
		N = new Scanner(System.in).nextLine();
		int l = N.length();
		int[] quo = new int[101];
		int[] num = new int[101];
		int i;
		int j = 0;
		int r = 0;
		for (i = 0; i < l; i++)
		{
			num[i] = N.charAt(i) - '0';
		}
		for (i = 0; i < l; i++)
		{
			quo[i] = (r * 10 + num[i]) / 13;
			r = (r * 10 + num[i]) % 13;
		}
		int t = 0;
		int temp;
		while (quo[t] == 0)
		{
			t++;
			temp = t;
		}
		if (temp == l)
		{
			System.out.print("0");
		}
		else
		{
			for (; t < l; t++)
			{
				System.out.print(quo[t]);
			}

		}
		System.out.print("\n");
		System.out.print(r);
		System.out.print("\n");
		return 0;
	}
}
