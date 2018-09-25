import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int l;
		int i;
		int[] num = new int[100];
		int[] sh = new int[100];
		int r;
		int j;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0; i < l;i++)
		{
			num[i] = str.charAt(i) - '0';
		}
		r = num[0];
		sh[0] = 0;
		for (i = 1; i < l;i++)
		{
			sh[i] = (r * 10 + num[i]) / 13;
			r = (r * 10 + num[i]) % 13;

		}
		if (l == 1)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else if (l == 2)
		{
			System.out.print(sh[1]);
			System.out.print("\n");
		}
		else
		{
			i = 0;
		while (sh[i] == 0)
		{
			i++;
		}


		for (j = i; j < l;j++)
		{
		System.out.print(sh[j]);
		}

		System.out.print("\n");
		}
	System.out.print(r);
	return 0;
	}




}
