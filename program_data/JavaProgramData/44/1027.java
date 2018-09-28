package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[6];
	int i;
	int reverse = int num;
	for (i = 0;i < 6;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}
	}
	for (i = 0;i < 6;i++)
	{
	System.out.printf("%d\n",reverse(a[i]));
	}
	return 0;
	}
	public static int reverse(int z)
	{
	int b = 0;
	if (z >= 10 || z <= -10)
	{
	while (z >= 10 || z <= -10)
	{
			b = b * 10 + z % 10;
			z /= 10;
	}
		b = b * 10 + z;
	return (b);
	}
	else
	{
	b = z;
	return (b);
	}
	}

}

