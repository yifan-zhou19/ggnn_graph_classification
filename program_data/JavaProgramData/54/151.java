package <missing>;

public class GlobalMembers
{
	/*?????????*/
	public static void Main()
	{
		 int n;
		 int m;
		 int k;
		 int i;
		 int j;
		 int s;
		 int t;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 k = Integer.parseInt(tempVar2);
		 }
		 t = n - 1;
		 s = 0;
		 for (j = 1;s < n;j++)
		 {
			  s = 0;
			  m = j * t;
			  for (i = 1;i <= n;i++)
			  {
				   if (m % (n - 1) == 0)
				   {
				   m = m / (n - 1) * n + k;
				   s = s + 1;
				   }
			  }
		 }
		 System.out.printf("%d\n",m);
	}

}

