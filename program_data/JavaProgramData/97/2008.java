package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int rmb;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rmb = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		while (rmb >= 100)
		{
						rmb -= 100;
						a++;
		}
		while (rmb >= 50)
		{
						rmb -= 50;
						b++;
		}
		while (rmb >= 20)
		{
						rmb -= 20;
						c++;
		}
		while (rmb >= 10)
		{
						rmb -= 10;
						d++;
		}
		while (rmb >= 5)
		{
						rmb -= 5;
						e++;
		}
		while (rmb >= 1)
		{
						if (rmb == 0)
						{
								   break;
						}
						rmb -= 1;
						f++;
		}

		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
		return 0;
	}
}

