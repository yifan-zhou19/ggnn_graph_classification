package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (int i = 1;i <= n;i++)
		 {
			   int m;
			   float sum = 0F;
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   m = Integer.parseInt(tempVar2);
			   }
			   float p = 2F;
			   float q = 1F;
			   float pq;
			   for (int i = 1;;i++)
			   {
					 float a;
					 a = p / q;
					 sum = sum + a;
					 if (i == m)
					 {
						  System.out.printf("%.3f\n",sum);
						  break;
					 }
					 pq = p;
					 p = p + q;
					 q = pq;
			   }
		 }
	}

}

