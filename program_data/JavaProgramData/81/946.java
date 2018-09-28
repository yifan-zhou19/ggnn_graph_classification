package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int[] t = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		 if (m < 5 && n < 5)
		 {
			 for (i = 0;i < 5;i++)
			 {
				 t[i] = a[m][i];
				 a[m][i] = a[n][i];
				 a[n][i] = t[i];
			 }
		 for (i = 0;i < 5;i++)
		 {
			for (j = 0;j < 5;j++)
			{
				System.out.printf("%d%c",a[i][j],j < 4?' ':'\n');
			}
		 }
		 }
		else
		{
			System.out.print("error\n");
		}
	}
}

