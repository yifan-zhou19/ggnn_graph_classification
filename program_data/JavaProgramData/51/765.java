package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][1000];
		String c = new String(new char[1000]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		int len;
		int p = 0;
		int i;
		int j;
		int t = -1;
		len = c.length();
		int[][] count = new int[1000][2];
		int k;
		int o;
		for (i = 0;i < len - n + 1;i++)
		{
			t++;
			for (p = 0;p < n;p++)
			{
				a[i][p] = c.charAt(p + t);
			}
		}
		for (i = 0;i < len - n + 1;i++)
		{
			for (j = i;j < len - n + 1;j++)
			{
				k = 0;
				for (int x = 0;x < n;x++)
				{
					if (a[i][x] == a[j][x])
					{
						k++;
					}
					else
					{
						break;
					}
				}
				if (k == n)
				{
					count[i][0]++;
				}
				count[i][1] = i;

			}
		}
		for (int m = 0;m < len - n;m++)
		{
			for (int s = 0;s < len - n;s++)
			{
				if (count[s][0] < count[s + 1][0])
				{
					o = count[s][0];
					count[s][0] = count[s + 1][0];
					count[s + 1][0] = o;
					o = count[s][1];
					count[s][1] = count[s + 1][1];
					count[s + 1][1] = o;
				}
			}
		}
		if (count[0][0] == 1)
		{
			System.out.print("NO");
		}
		else
		{
				System.out.printf("%d\n",count[0][0]);
				for (int w = 0;w < n;w++)
				{
					System.out.printf("%c",a[count[0][1]][w]);
				}
				System.out.print("\n");
				for (int z = 1;z < len - n;z++)
				{
					if (count[0][0] == count[z][0])
					{
						for (int w = 0;w < n;w++)
						{
							System.out.printf("%c",a[count[z][1]][w]);
						}
						System.out.print("\n");
					}
				}
		}
	}

}

