package <missing>;

public class GlobalMembers
{
	/*
	 * ????jishuxulie.cpp
	 * ??????
	 * ?????2012 11 10
	 * ?????????
	 */



	public static int Main()
	{
		int n;
		int i;
		int a;
		int j;
		int k;
		int p;
		k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m = new int[n]; //????
		for (i = 0;i < n;i++)
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0,p = 0;i < n;p++,i++)
		{
			if (m[p] % 2 == 0)
			{
				for (j = p;j < n - k;j++)
				{
					m[j] = m[j + 1];
				}
				p--;
				k++; //????
			}
		}
		for (j = 0;j < (n - k);j++)
		{
			for (i = 0;i < (n - k - 1 - j);i++)
			{
				if (m[i] > m[i + 1])
				{
					a = m[i];
					m[i] = m[i + 1];
					m[i + 1] = a; //??
				}
			}
		}
		for (i = 0;i < (n - k);i++)
		{
			if (i == (n - k - 1))
			{
				System.out.print(m[i]);
			}
			else
			{
				System.out.print(m[i]);
				System.out.print(",");
			}
		}
	return 0;
	}

}

