package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int x;
	 int a;
	 int b = 0;
	 int c = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
		 a = 0;
		 for (j = 1;j <= n;j++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 x = Integer.parseInt(tempVar2);
			 }
		  if (x == 0)
		  {
			  b = b + 1;
		  a = a + 1;
		  }
		 }
		if (a == 2)
		{
		  c = c + 1;
		}
	 }
	System.out.printf("%d",(((b - 2 * c) - 4) / 2) * c);
	return 0;
	}

}

