package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int z = 10000;
		int[][] qj = new int[50000][2];
		int y = 0;
		int n;
		int k = 0;
		int m = 0;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 (qj[i][0]) = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 (qj[i][1]) = Integer.parseInt(tempVar3);
						 }
						 if (qj[i][0] < z)
						 {
						 z = qj[i][0];
						 }
						 if (qj[i][1] > y)
						 {
						 y = qj[i][1];
						 }
		}
		for (s = z;s <= y;s += 0.5)
		{
							 for (i = 0;i < n;i++)
							 {
											  if ((s >= qj[i][0]) && (s <= qj[i][1]))
											  {
											  k++;
											  }
							 }
							 if (k == 0)
							 {
							 m++;
							 }
							 k = 0;
		}
		if (m != 0)
		{
				 System.out.print("no");
		}
				 else
				 {
					   System.out.printf("%d %d",z,y);
				 }

					   return 0;
	}




}

