package <missing>;

public class GlobalMembers
{
	public static int fenjie(int num, int min)
	{
		   int j;
		   int jieguo = 1;

		  if (num < min)
		  {
			 return 0;
		  }

		  for (j = min;j < num;j++)
		  {

			 if (num % j == 0)
			 {

				jieguo += fenjie(num / j, j);
			 }
		  }
		  return jieguo;
	}
	public static int k = 2;
	public static int Main()
	{
		 int n;
		 int i;
		 int jieguo;
		 int num;
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
				  num = Integer.parseInt(tempVar2);
			  }
			 jieguo = fenjie(num, 2);
			 System.out.printf("%d\n",jieguo);
		 }
		 return 0;
	}
}

