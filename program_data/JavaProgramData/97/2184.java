package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		{
			t = n / 100;
			if (t > 0)
			{
			System.out.printf("%d\n",t);
			}
			else
			{
			System.out.print("0\n");
			}
			n = n - 100 * t;
			t = n / 50;
			if (t > 0)
			{
			System.out.printf("%d\n",t);
			}
			else
			{
			System.out.print("0\n");
			}
			n = n - 50 * t;
			t = n / 20;
			if (t > 0)
			{
			System.out.printf("%d\n",t);
			}
			else
			{
			System.out.print("0\n");
			}
			n = n - 20 * t;
			t = n / 10;
			if (t > 0)
			{
			System.out.printf("%d\n",t);
			}
			else
			{
			System.out.print("0\n");
			}
			n = n - 10 * t;
			t = n / 5;
			if (t > 0)
			{
			System.out.printf("%d\n",t);
			}
			else
			{
			System.out.print("0\n");
			}
			n = n - 5 * t;
			if (n > 0)
			{
			System.out.printf("%d\n",n);
			}
			else
			{
			System.out.print("0\n");
			}
			return 0;
	}
	}

}

