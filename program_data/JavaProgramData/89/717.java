package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[10000][2];
		int i;
		int j;
		int t = 0;
		int s;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i][0] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 a[i][1] = Integer.parseInt(tempVar3);
			 }
			 t++;
			 if ((a[i][0] == 0) && (a[i][1] == 0))
			 {
				 break;
			 }
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			for (j = 0;j < t - 1;j++)
			{
				if (a[j][0] != i)
				{
				   if (a[j][1] == i)
				   {
					  s++;
				   }
				}
				else
				{
					break;
				}
			}
			if (s == n - 1)
			{
				k++;
				System.out.printf("%d\n",i);
			}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

