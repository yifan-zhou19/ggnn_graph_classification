package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int k;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (;n > 1;)
	{
		if (n % 2 == 1)
		{
			k = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",n,k);
		}
		else
		{
			k = n / 2;
			System.out.printf("%d/2=%d\n",n,k);
		}
		n = k;
	}
	System.out.print("End");
	return 0;
	}
}

