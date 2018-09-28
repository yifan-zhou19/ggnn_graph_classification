package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int a;
	 int b;
	 int n;
	 int t;
	 int w;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 if (n <= 4)
	 {
	 System.out.print("empty\n");
	 }
	 else
	 {
	 t = 0;
	 w = 0;
	 for (i = 3;i <= (n - 2);i += 2)
	 {
		 for (j = 3;j < i;j += 2)
		 {
				if (i % j == 0)
				{
				  t = 1;
				}
		 }
		 if (t == 0)
		 {
				  a = i;
			   b = (i + 2);
			   for (k = 3;k < b;k += 2)
			   {
				   if (b % k == 0)
				   {
					 w = 1;
				   }
			   }
			   if (w == 0)
			   {
				   System.out.printf("%d %d\n",a,b);
			   }
		 }
			t = 0;
			w = 0;

	 }
	 }


	return 0;
	}

}

