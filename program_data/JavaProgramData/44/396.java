package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int j;
		int k;
		int sum = 0;
		int s;
		int p;
		int[] u = new int[100];
		if (num >= 0)
		{
		p = num;
		for (i = 0;p > 0;i++)
		{
			u[i] = p % 10;
			p = p / 10;
		}
		s = i;
		for (i = s - 1;i >= 0;i--)
		{
			sum = sum * 10 + u[s - 1 - i];
		}
		return sum;
		}
		if (num < 0)
		{
		p = -num;
		for (i = 0;p > 0;i++)
		{
			u[i] = p % 10;
			p = p / 10;
		}
		s = i;
		for (i = s - 1;i >= 0;i--)
		{
			sum = sum * 10 + u[s - 1 - i];
		}
		return -sum;
		}

	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",reverse(a),reverse(b),reverse(c),reverse(d),reverse(e),reverse(f));
	return 0;
	}
}

