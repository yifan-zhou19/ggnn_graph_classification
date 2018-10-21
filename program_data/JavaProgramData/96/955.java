package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] re = new int[100];
		int i = 0;
		int j;
		int k = 0;
		int m = 0;
		int n = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (a.charAt(i) != 0)
		{
			i++;
		}
		for (j = 0; j < i; j++)
		{
			re[j] = (k * 10 + a.charAt(j) - '0') / 13;
			m++;
			k = (k * 10 + a.charAt(j) - '0') % 13;
		}
		while (re[n] == 0)
		{
			n++;
		}
		if (n == m)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			for (; n < m; n++)
			{
				System.out.print(re[n]);
			}
			System.out.print("\n");
		}
		System.out.print(k);
		System.out.print("\n");
		return 0;
	}
}

