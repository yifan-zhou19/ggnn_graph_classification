package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;n != 1;i++)
		{
		  if (n != 1 && n % 2 == 1)
		  {
			  int a = n;
			  n = n * 3 + 1;
			  System.out.printf("%d*3+1=%d\n", a, n);
		  }
		  else if (n % 2 == 0)
		  {
			  int b = n;
			  n = n / 2;
			  System.out.printf("%d/2=%d\n", b, n);
		  }
		}
		System.out.print("End");
		return 0;
	}
}

