package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		int j = 0;
		int k = 0;
		int l = 0;
		int[] c = new int[505];
		int sum = 0;
		int max = 2;
		String zichuan = new String(new char[505]);
		char[][] a = new char[505][505];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		zichuan = new Scanner(System.in).nextLine();
		len = zichuan.length();
		for (i = 0;i < len;i++)
		{
			for (j = i;j < n + i;j++)
			{
			   a[k][l] = zichuan.charAt(j);
			   l++;
			}
			a[k][n] = '\0';
			k++;
			l = 0;
		}
		for (i = 0;i < k;i++)
		{
			 for (j = i;j < k;j++)
			 {

				if (strcmp(a[i],a[j]) == 0)
				{
					c[i] = c[i] + 1;
				}

			 }

		}
		 for (i = 0;i < k;i++)
		 {

			 if (c[i] == 1)
			 {
				 sum++;
			 }
		 }
		if (sum == k)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < k;i++)
			{
				if (max <= c[i])
				{
					max = c[i];
				}
				else
				{
					continue;
				}
			}
			System.out.printf("%d\n",max);
			for (i = 0;i < k;i++)
			{
					if (c[i] == max)
					{
						for (j = 0;j < n;j++)
						{
						System.out.printf("%c",a[i][j]);
						}
						System.out.print("\n");
					}

			}
		}

		return 0;
	}
}

