package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int h = 0;
		int k = 1;
		int b = 0;
		char[][] a = new char[120][20];
		char[][] c = new char[120][20];
		int[] y = new int[120];
		int[][] Z = new int[155][100];
		int[] cy = new int[120];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 60;i <= 150;i++)
		{
			for (j = 1;j <= n;j++)
			{
				Z[i][h] = 0;
				if (i == y[j])
				{
					Z[i][h] = j;
					h++;
				}
			}
			h = 0;

		}
		for (i = 1;i <= n;i++)
		{
			if (y[i] < 60)
			{
				c[k] = a[i];
				cy[k] = y[i];
				b = k;
				k++;
			}
		}

		h = 0;
		for (i = 150;i >= 60;i--)
		{
			for (h = 0;h <= 10;h++)
			{
				if (Z[i][h] == 0)
				{
					break;
				}
				else
				{
					System.out.printf("%s\n",a[Z[i][h]]);
				}
			}
		}
		for (i = 1;i <= b;i++)
		{
			System.out.printf("%s\n",c[i]);
		}
		return 0;











	}


}

