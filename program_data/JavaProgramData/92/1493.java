package <missing>;

public class GlobalMembers
{
	public static int paixu(int[] s, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (s[j] > s[j + 1])
				{
					t = s[j];
					s[j] = s[j + 1];
					s[j + 1] = t;
				}
			}
		}
		return 0;
	}
	public static int Main()
	{
		while (true)
		{
		int a = 0;
		int b = 0;
		int m;
		int n = 0;
		int i;
		int j;
		int k;
		int[] s = new int[1001];
		int[] t = new int[1001];
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t[i] = Integer.parseInt(tempVar3);
		}
		}
		paixu(s, n);
		paixu(t, n);
		for (i = 0,j = 0;i < n;i++)
		{
			if (s[i] > t[j])
			{
				j++;
				a++;
			}
			else if (s[i] == t[j])
			{
				for (k = i + 1,x = 0;k < n;k++)
				{
					if (s[k] <= t[k - i + j] != 0 && s[k]> s[i])
					{
						x = 1;
						break;
					}
				}
				if (x == 0)
				{
					j++;
					b++;
				}
				else
				{
					j++;
					a++;
					s[k] = 0;
				}
			}
		}
		m = 200 * (a - (n - a - b));
		System.out.printf("%d\n",m);
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}


}

