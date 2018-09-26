package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int[] p;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 if (n < 5)
		 {
			 System.out.print("empty");
		 }
		 else
		 {
			 p = new int[n];
		 for (i = 2;i <= n;i++)
		 {
			 p[i] = 1;
		 }
		 for (i = 2;i <= n / 2;i++)
		 {
			  if (p[i] == 1)
			  {
				   for (j = i + i;j < n;j += i)
				   {
					   p[j] = 0;
				   }
			  }
		 }
		 for (i = 3;i < n - 1;i = 2 + i)
		 {
			 if (p[i] == 1 && p[i + 2] == 1)
			 {
				 System.out.printf("%d %d\n",i,i + 2);
			 }
		 }
		 }

	}
}

