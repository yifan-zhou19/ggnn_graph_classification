package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int m;
		 int n;
		 int i = 0;
		 int j = 0;
		 double a = 1;
		 double b = 2;
		 double c;
		 double sum = 0;

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < m;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 n = Integer.parseInt(tempVar2);
			 }
			 for (j = 0;j < n;j++)
			 {
				 sum += b / a;
				 c = b;
				 b = a + b;
				 a = c;
			 }
			 System.out.printf("%.3lf\n",sum);
			 sum = 0;
			 a = 1;
			 b = 2;
		 }



		 return 0;
	}

}

