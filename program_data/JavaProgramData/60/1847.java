package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int t1;
	  int t2;
	  int k;
	  int a;
	  int b;
	  int s;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  s = 0;
	  for (a = 3;a <= n;a++)
	  {
		 b = a + 2;
		 t1 = 1;
		 t2 = 1;
		 for (i = 2;i < a;i++)
		 {
			 if (a % i == 0)
			 {
				 t1 = 0;
			 }
		 }
		 for (k = 2;k < b;k++)
		 {
			 if (b % k == 0)
			 {
				 t2 = 0;
			 }
		 }
		 if ((t1 * t2 == 1) && (b <= n))
		 {
			 System.out.printf("%d %d\n",a,b);
			 s = 1;
		 }
	  }
	  if (s == 0)
	  {
		  System.out.print("empty");
	  }
	  return 0;
	}
}

