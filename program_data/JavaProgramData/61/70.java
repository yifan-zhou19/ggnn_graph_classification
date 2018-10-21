package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int k;
		if (n == 1 || n == 2)
		{
		k = 1;
		}
		else
		{
		k = f(n - 1) + f(n - 2);
		}
		return k;
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int k;
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
				   k = Integer.parseInt(tempVar2);
			   }
			   System.out.printf("%d\n",f(k));
		  }
		  System.in.read();
		  System.in.read();
		  return 0;
	}

}

