package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 100)
		{
		do
		{
			n -= 100;
			a += 1;
		}while (n >= 100);
		}
		if (n >= 50)
		{
		do
		{
			n -= 50;
			b += 1;
		}while (n >= 50);
		}
		if (n >= 20)
		{
		do
		{
			n -= 20;
			c += 1;
		}while (n >= 20);
		}
		if (n >= 10)
		{
		do
		{
			n -= 10;
			e += 1;
		}while (n >= 10);
		}
		if (n >= 5)
		{
		do
		{
			n -= 5;
			f += 1;
		}while (n >= 5);
		}
		if (n >= 1)
		{
		do
		{
			n -= 1;
			g += 1;
		}while (n >= 1);
		}
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",f);
		System.out.printf("%d\n",g);
		return 0;
	}

}

