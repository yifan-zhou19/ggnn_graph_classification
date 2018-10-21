package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	int c;
	int[] z = new int[5];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (i = 0,a = n;a > 0;i++)
	{
		 a /= 10;
	}
	b = i;

	for (;i > 0;i--)
	{
			z[i - 1] = n / (int)Math.pow(10,i - 1);
			n -= z[i - 1] * (int)Math.pow(10,i - 1);
	}

	for (c = 0;c < b;c++)
	{
	System.out.printf("%d",z[c]);
	}

	return 0;
	}
}

