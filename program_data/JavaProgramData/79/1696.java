package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int a;
		if (n == 1)
		{
			a = 1;
		}
		else
		{
			a = (f(m, n - 1) + m) % n;
		}
		if (a == 0)
		{
			a = n;
		}

		return a;
	}

	public static int Main()
	{
		int i;
		int m;
		int n;
		for (i = 1;;i++)
		{
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  String tempVar2 = ConsoleInput.scanfRead(" ");
			  if (tempVar2 != null)
			  {
				  m = Integer.parseInt(tempVar2);
			  }
			  if (m != 0)
			  {
				  System.out.printf("%d\n",f(m, n));
			  }
			  else
			  {
				  break;
			  }
		}

	}

}

