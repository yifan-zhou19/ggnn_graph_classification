package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int n;
	int s = 0;
	int a = 1;
	int b = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (int q = 1;q <= k;q++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 if (n == 1 || n == 2)
	 {
	  s = 1;
	 }
	else
	{
		for (int w = 1;w < n - 1;w++)
		{
		s = a + b;
		a = b;
		b = s;
		}
	}
	System.out.printf("%d\n",s);
	s = 0;
	a = 1;
	b = 1;
	}
	return 0;
	}

}

