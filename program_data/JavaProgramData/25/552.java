package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int b;
		int[] m = new int[10000];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
		}
		if (n == 1)
		{
			System.out.print(2);
		}
		if (n > 1)
		{
			m[0] = 2;
	for (i = 1;i <= n - 1;i++)
	{
			for (j = 0;j < 9999;j++)
			{
		  m[j] = m[j] * 2;
			}
		for (j = 0;j < 9999;j++)
		{
			if (m[j] > 9)
			{
				m[j] = m[j] % 10;
				m[j + 1]++;
			}
		}


	}
	for (i = 9999;i >= 0;i--)
	{
		if (m[i] != 0)
		{
				k = i;
				break;
		}
	}
	for (b = k;b >= 0;b--)
	{
			System.out.print(m[b]);
	}
		}
	 return 0;
	}



}

