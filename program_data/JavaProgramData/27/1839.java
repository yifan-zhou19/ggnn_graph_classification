package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int j;
		double[][] num = new double[100][100];
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = Math.sqrt(-1);
		for (k = 0;k <= n - 1;k++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 num[k][0] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 num[k][1] = Double.parseDouble(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 num[k][2] = Double.parseDouble(tempVar4);
		 }
		 a = num[k][0];
		 b = num[k][1];
		 c = num[k][2];
		 if ((b * b - 4 * a * c) >= 0)
		 {
		  num[k][3] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		  num[k][4] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		 }
		 else
		 {
		  if (b == 0.00000)
		  {
			  num[k][3] = 0.00000;
		  }
		  else
		  {
		  num[k][3] = (-b) / (2 * a);
		  }
		  num[k][4] = Math.sqrt(4 * a * c - b * b) / (2 * a);
		  num[k][5] = Math.sqrt(4 * a * c - b * b) / (2 * a);
		 }
		 //printf("\n");//
		}
		for (j = 0;j <= n - 1;j++)
		{
		 k = j;
		 if (num[k][1] * num[k][1] - 4 * num[k][0] * num[k][2] >= 0)
		 {
			if (num[k][3] != num[k][4])
			{
				System.out.printf("x1=%.5lf;x2=%.5lf\n",num[k][3],num[k][4]);
			}
			else
			{
				System.out.printf("x1=x2=%.5lf\n",num[k][3]);
			}
		 }
		 else
		 {
			 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",num[k][3],num[k][4],num[k][3],num[k][5]);
		 }
		}
		 System.in.read();
		 System.in.read();
		 return 0;
	}
}

