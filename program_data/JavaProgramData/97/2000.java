package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int i = 0;
		int l = 0;
		int k = 0;
		int q = 0;
		int x = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n >= 100)
		{
			n = n - 100;
			i++;
			a1 = i;
		}

		System.out.printf("%d\n",a1);
		while (n >= 50 && n < 100)
		{
			n = n - 50;
			l++;
			a2 = l;
		}

		System.out.printf("%d\n",a2);
		while (n >= 20 && n < 50)
		{
			n = n - 20;
			k++;
			a3 = k;
		}

			System.out.printf("%d\n",a3);
		while (n >= 10 && n < 20)
		{
			n = n - 10;
			x++;
			a4 = x;
		}

			System.out.printf("%d\n",a4);
		while (n >= 5 && n < 10)
		{
			n = n - 5;
			q++;
			a5 = q;
		}

			System.out.printf("%d\n",a5);
		while (n > 0 && n < 5)
		{
			n = n - 1;
			y++;
			a6 = y;
		}

			System.out.printf("%d\n",a6);

			return 0;
	}



}

