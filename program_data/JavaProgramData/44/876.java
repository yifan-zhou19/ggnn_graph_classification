package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int reverse = int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		a = reverse(a);
		b = reverse(b);
		c = reverse(c);
		d = reverse(d);
		e = reverse(e);
		f = reverse(f);
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",f);
	}
	public static int reverse(int a)
	{
		int[] b = new int[10];
		int i = 0;
		int j;
		if (a > 0)
		{
		while (a > 0)
		{
			b[i] = a % 10;
			a = (a - b[i]) / 10;
			i = i + 1;
		}
		for (j = 0;j < i;j++)
		{
			a = a * 10 + b[j];
		}
		}
		else if (a == 0)
		{
			a = 0;
		}
		else if (a < 0)
		{
		a = -a;
		while (a > 0)
		{
			b[i] = a % 10;
			a = (a - b[i]) / 10;
			i = i + 1;
		}
		for (j = 0;j < i;j++)
		{
			a = a * 10 + b[j];
		}
		a = -a;
		}
		return (a);
	}
}

