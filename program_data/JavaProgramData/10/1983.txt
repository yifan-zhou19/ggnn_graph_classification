package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[26];
	public static int f(int j)
	{
		int z;
		int i;
		int t;
		if (j == 1)
		{
			z = 1;
		}
		else
		{
			for (t = 0,i = 1;i < j;i++)
			{
				if (s[i] >= s[j] != 0 && f(i) > t)
				{
					t = f(i);
				}
			}
			   z = t + 1;
		}
		return z;
	}

	public static void Main()
	{
		int i;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		for (t = 0,i = 1;i <= k;i++)
		{
			if (f(i) > t)
			{
				t = f(i);
			}
		}
		System.out.printf("%d\n",t);
	}
}

