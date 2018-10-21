package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[20][2];
		int[] a = new int[300];
		int i = -1;
		int j;
		int t;
		int d;
		int k;
		do
		{
			i++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][1] = Integer.parseInt(tempVar2);
			}
		}while (s[i][1] != 0);
		t = i - 1;
		System.out.print("\n");
		for (i = 0;i <= t;i++)
		{
			if (s[i][1] != 1)
			{
			for (j = 0;j < s[i][0];j++)
			{
			a[j] = j + 1;
			}
			d = 0;
			k = 0;
			while (d < s[i][0] - 1)
			{
				for (j = 0;j < s[i][0];j++)
				{
				if (a[j] != 0)
				{
					k++;
					{
							if (k == s[i][1])
							{
								k = 0;
								a[j] = 0;
								d++;
							}
					}
				}
				}


			}
			for (j = 0;j < s[i][0];j++)
			{
			if (a[j] != 0)
			{
				System.out.printf("%d\n",a[j]);
			}
			}
			}

		else
		{
			System.out.printf("%d\n",s[i][0]);
		}
		}
	}
}

