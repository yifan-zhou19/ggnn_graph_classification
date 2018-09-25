package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		a = b = c = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		b = n / 10 - a * 10;
		c = n - a * 100 - b * 10;
		System.out.printf("%d\n",a);
		if (b == 9)
		{
		System.out.printf("%d\n",1);
		System.out.printf("%d\n",2);
		System.out.printf("%d\n",0);


		}
		else if (b == 8)
		{
		System.out.printf("%d\n",1);
		System.out.printf("%d\n",1);
		System.out.printf("%d\n",1);


		}
		else if (b == 7)
		{
		System.out.printf("%d\n",1);
		System.out.printf("%d\n",1);
		System.out.printf("%d\n",0);


		}
		else if (b == 6)
		{
		System.out.printf("%d\n",1);
		System.out.printf("%d\n",0);
		System.out.printf("%d\n",1);


		}
		else if (b == 5)
		{
		System.out.printf("%d\n",1);
		System.out.printf("%d\n",0);
		System.out.printf("%d\n",0);


		}
		else if (b == 4)
		{
		System.out.printf("%d\n",0);
		System.out.printf("%d\n",2);
		System.out.printf("%d\n",0);


		}
		else if (b == 3)
		{
		System.out.printf("%d\n",0);
		System.out.printf("%d\n",1);
		System.out.printf("%d\n",1);


		}
		else if (b == 2)
		{
		System.out.printf("%d\n",0);
		System.out.printf("%d\n",1);
		System.out.printf("%d\n",0);


		}
		else if (b == 1)
		{
		System.out.printf("%d\n",0);
		System.out.printf("%d\n",0);
		System.out.printf("%d\n",1);


		}
		else if (b == 0)
		{
		System.out.printf("%d\n",0);
		System.out.printf("%d\n",0);
		System.out.printf("%d\n",0);


		}
		if (c >= 5)
		{
			System.out.printf("%d\n",1);
			c = c - 5;
			System.out.printf("%d\n",c);


		}
		else
		{
			System.out.printf("%d\n",0);
			System.out.printf("%d\n",c);
		}

		return 0;
	}

}

