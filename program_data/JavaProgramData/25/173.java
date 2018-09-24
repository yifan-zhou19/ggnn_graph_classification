package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		double s = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		if (n == 0)
		{
			s = 1;
		}
		if (n == 1)
		{
			s = 2;
		}
		if (n >= 2)
		{
		  for (i = 2;i <= n;i++)
		  {
			  s = s * 2;
		  }
		}
		System.out.printf("%.0lf",s);
	}

}

