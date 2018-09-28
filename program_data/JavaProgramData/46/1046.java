package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[100][100];
		int shang;
		int xia;
		int zuo;
		int you;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			shang = 0;
			zuo = 0;
			xia = m - 1;
			you = n - 1;
		while (zuo <= you != 0 && (shang <= xia))
		{
			if (zuo != you && shang != xia)
			{

				for (i = shang,j = zuo;j <= you;j++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				for (j = you,i = shang + 1;i <= xia;i++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				for (i = xia,j = you - 1;j >= zuo;j--)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				for (i = xia - 1,j = zuo;i > shang;i--)
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
			else if (zuo == you && shang != xia)
			{
				for (j = zuo,i = shang;i <= xia;i++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
			else if (shang == xia && zuo != you)
			{
				for (i = shang,j = zuo;j <= you;j++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
			else if (shang == xia && zuo == you)
			{
				i = shang;
				j = zuo;
				System.out.printf("%d\n",a[i][j]);
			}
			zuo++,shang++,you--,xia--;


		}


		return 0;
	}


}

