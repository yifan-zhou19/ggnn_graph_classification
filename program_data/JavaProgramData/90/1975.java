package <missing>;

public class GlobalMembers
{
	public static int place(int m,int n)
	{
		if (m == 1 || n == 1 || m == 0 || n == 0)
		{
		return 1;
		}
		else
		{
			  if (m - n >= 0)
			  {
				  return place(m, n - 1) + place(m - n, n);
			  }
			  else
			  {
				  return place(m, n - 1);
			  }
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d\n",place(m, n));
		}

	}

}

