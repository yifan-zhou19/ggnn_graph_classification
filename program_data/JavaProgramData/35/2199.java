package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[8][8];
	   int m;
	   int n;
	   int i;
	   int j;
	   int maxhang;
	   int hang;
	   int i1;
	   int flag = 0;
	   char c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar2 != null)
	   {
		   c = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   n = Integer.parseInt(tempVar3);
	   }
	   for (i = 0;i <= m - 1;i++)
	   {
	   for (j = 0;j <= n - 1;j++)
	   {
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar4);
	   }
	   }
	   }
	   for (i = 0;i <= m - 1;i++)
	   {
		   flag = 0;
			maxhang = 0;
			hang = 0;
			for (j = 0;j <= n - 1;j++)
			{
				if (a[i][j] > maxhang)
				{
					maxhang = a[i][j];
					hang = j;
				}
			}
			for (i1 = 0;i1 <= m - 1;i1++)
			{
				if (a[i1][hang] < maxhang)
				{
				flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.printf("%d+%d",i,hang);
			flag = 2;
			break;
			}

	   }
		if (flag != 2)
		{
			System.out.print("No");
		}
	return 0;
	}

}

