package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		c = Math.log(a) / Math.log(10) + 1;
		i = Math.pow(10,c);
		j = 1;
		b = 0;
		while (i > 1)
		{
			b = b + (a % i) / (i / 10) * j;
			i = i / 10;
			j = j * 10;
		}
		System.out.printf("%ld\n",b);
		return 0;
	}
}

