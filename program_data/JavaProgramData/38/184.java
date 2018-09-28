package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] num = new double[10000];
		double sum;
		double s;
		int n;
		int m;
		int i;
		int j;
		int flag = 0;
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
							 m = Integer.parseInt(tempVar2);
						 }
						 for (j = 1,sum = 0;j <= m;j++)
						 {
										  String tempVar3 = ConsoleInput.scanfRead();
										  if (tempVar3 != null)
										  {
											  num + j = tempVar3;
										  }
										  sum += num[j];
						 }
						 sum /= m;
						 for (j = 1,s = 0;j <= m;j++)
						 {
											  s += d(num[j] - sum);
						 }
						 s /= m;
						 s = Math.sqrt(s);
						 if (flag == 1)
						 {
						 System.out.print("\n");
						 }
						 flag = 1;
						 System.out.printf("\n%.5lf",s);
		}
	   // getch();
		return 0;
	}


}

