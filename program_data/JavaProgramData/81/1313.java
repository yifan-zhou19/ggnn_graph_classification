package <missing>;

public class GlobalMembers
{
	public static void reverse(int[][] a, int b, int c)
	{
		int panduan;
		int k;
		int l;
		int[] tihuan = new int[5];
		if (((b >= 0) && (b < 5)) && ((c < 5) && (c >= 0)))
		{
			panduan = 1;
			for (k = 0;k < 5;k++)
			{
					if (b == c)
					{
						break;
					}
					tihuan[k] = a[b][k];
					a[b][k] = a[c][k];
					a[c][k] = tihuan[k];
			}
		}
		else
		{
			panduan = 0;
		}
		if (panduan != 0)
		{
			for (k = 0;k < 5;k++)
			{
				for (l = 0;l < 4;l++)
				{
					System.out.printf("%d ",a[k][l]);
				}
				System.out.printf("%d\n",a[k][4]);
			}
		}
		else
		{
			System.out.print("error");
		}


	}
	public static void Main(String[] args)
	{
		int[][] su = new int[5][5];
		int hang1;
		int hang2;
		int panduan;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				su[i][j] = Integer.parseInt(tempVar);
			}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			hang1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			hang2 = Integer.parseInt(tempVar3);
		}
		reverse(su, hang1, hang2);
	}
}

