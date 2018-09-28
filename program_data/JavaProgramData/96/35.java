package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int n;
		int i;
		int[] b = new int[100];
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();

		for (i = 0;i < n;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
	if (n == 1)
	{
			System.out.printf("0\n%d\n",b[0]);
	}
	else if ((n == 2) && (b[0] * 10 + b[1] < 13))
	{
			System.out.printf("0\n%d%d\n",b[0],b[1]);
	}
	else
	{
		for (i = 1;i < n;i++)
		{
			c[i] = (b[i - 1] * 10 + b[i]) / 13;
			b[i] = (b[i - 1] * 10 + b[i]) % 13;
		}
	if (c[1] == 0)
	{
		for (i = 2;i < n;i++)
		{
		System.out.printf("%d",c[i]);
		}
		System.out.print("\n");
		System.out.printf("%d\n",b[n - 1]);
	}
	else
	{
		for (i = 1;i < n;i++)
		{
		System.out.printf("%d",c[i]);
		}
		System.out.print("\n");
		System.out.printf("%d\n",b[n - 1]);

	}
	}
	return 0;
	}
}

