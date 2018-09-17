package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int sum;
		int n = 0;
		int[] k = new int[13];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		k[0] = 0;
		k[1] = k[3] = k[5] = k[7] = k[8] = k[10] = k[12] = 31;
		k[4] = k[6] = k[9] = k[11] = 30;
		if (y % 4 != 0)
		{
		   if (y % 100 != 0)
		   {
				if (y % 400 != 0)
				{
					k[2] = 28;
				}
				else
				{
					k[2] = 29;
				}
		   }
		   else
		   {
			   k[2] = 28;
		   }
		}
		else
		{
			k[2] = 29;
		}
		 for (i = 0; i < m; i++)
		 {
			n = n + k[i];
		 }
		 sum = n + d;
		 System.out.printf("%d\n", sum);
		 return 0;
	}

}

