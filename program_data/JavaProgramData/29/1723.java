package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int[] n = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   int i;
	   int j;
	   float sum;
	   int a;
	   int b;
	   int t;
	   for (i = 0;i < m;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n[i] = Integer.parseInt(tempVar2);
		 }
		 sum = 0F;
		 a = 1;
		 b = 2;
		 for (j = 1;j <= n[i];j++)
		 {
		   sum = sum + (float)b / a;
		   t = a + b;
		   a = b;
		   b = t;
		 }
		 System.out.printf("%.3f\n",sum);
	   }

	}
}

