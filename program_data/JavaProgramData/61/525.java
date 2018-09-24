package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int m;
		int n;
		int k;
		int i;
		int j;
		int p;
		int q;
		int[] s = new int[30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s[1] = 1;
		s[2] = 1;
		for (i = 3;i <= 25;i++)
		{
		s[i] = s[i - 1] + s[i - 2];
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",s[p]);
		}

	return 0;
	}

}

