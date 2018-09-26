package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k;
		int i;
		int j;
		int l;
		int[] s = new int[100];
		int r;
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
				System.out.print("60\n");
			}
			if (m != 0)
			{
				k = 0;
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						s[j] = Integer.parseInt(tempVar3);
					}
					if (s[j] <= 60 - (j + 1) * 3)
					{
						continue;
					}
					if ((s[j] > 60 - (j + 1) * 3) && k == 0)
					{
						k = 1;
						l = j;
					}
				}
				if (k == 0)
				{
					r = 60 - j * 3;
				}
				if (k == 1)
				{
					if (s[l] > 60 - (l + 1) * 3 + 3)
					{
						r = 60 - l * 3;
					}
				   if (s[l] > 60 - (l + 1) * 3 && s[l] <= 60 - (l + 1) * 3 + 3)
				   {
						r = s[l];
				   }
				}
				System.out.printf("%d\n",r);
			}
		}
		return 0;
	}
}

