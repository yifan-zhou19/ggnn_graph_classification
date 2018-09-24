package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
	  int[] num = new int[21];
	  if (a == 1)
	  {
		  num[1] = 1;
	  }
	  if (a == 2)
	  {
		  num[2] = 1;
	  }
	  if (a > 2)
	  {
		  num[a] = f(a - 1) + f(a - 2);
	  }
	  return (num[a]);
	}
	public static int Main()
	{
	  int i;
	  int n;
	  int a;
	  int r;
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
			a = Integer.parseInt(tempVar2);
		}
		r = f(a);
		System.out.printf("%d\n",r);
	  }
	}

}

