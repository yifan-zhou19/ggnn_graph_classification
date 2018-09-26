package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int flag;
		int n1;
		int f = int n;

		for (i = 1;i <= 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 0)
		{
			flag = 1;
		}
		else
		{
			flag = -1;
			n = -n;
		}
		n1 = f(n);
		System.out.printf("%d\n",flag * n1);
		}
	}
	public static int f(int n)
	{
	  int s;
	  int nn;

	  s = n;
	  nn = 0;
	  while (s > 0)
	  {
		nn = nn * 10 + s % 10;
		s = s / 10;
	  }

	  return nn;
	}

}

