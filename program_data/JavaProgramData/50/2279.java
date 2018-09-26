package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   int m;
	   int w;
	   int d = 13;
	   int i;
	   int b;


	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   w = Integer.parseInt(tempVar);
	   }
		b = w;
	   for (m = 1;m < 13;m++)
	   {
			 w = b;
			 {
			 for (i = 1;i < m;i++)
			 {
			   w += days[i];
			 }
		   w += 12;
			 }
		   if (w % 7 == 5)
		   {
			   System.out.printf("%d\n",m);
		   }
	   }
	}
}

