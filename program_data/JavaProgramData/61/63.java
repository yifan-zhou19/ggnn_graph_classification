package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a == 1 || a == 2)
		{
		return 1;
		}
		else
		{
		return (f(a - 1) + f(a - 2));
		}
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
	  int[] a = new int[n];
	  int[] b = new int[n];
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		b[i] = f(a[i]);
		System.out.printf("%d\n",b[i]);
	  }
	  System.in.read();
	  System.in.read();
	}
}

