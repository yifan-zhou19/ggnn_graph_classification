package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t1;
		int t2;
		int k;
		int m;
		int[] s = new int[20];
		int a = 60;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
	if (m == 0)
	{
		System.out.printf("%d\n",a);
	}
	else
	{
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[j] = Integer.parseInt(tempVar3);
				}
				t1 = s[j] + 3 * (j - 1);
				t2 = s[j] + 3 * j;
				if (t2 <= 60)
				{
					k = s[j] + 60 - t2;
				}
				else if (t1 <= 60)
				{
					k = s[j];
				}
			}
			System.out.printf("%d\n",k);
	}
		}
		return 0;
	}

}

