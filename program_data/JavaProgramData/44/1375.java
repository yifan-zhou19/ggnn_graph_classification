package <missing>;

public class GlobalMembers
{
	public static void go(int a)
	{
		int[] b = new int[100];
		int i;
		int c;
		if (a == 0)
		{
			System.out.print("0");
		}
		if (a > 0)
		{
			c = Math.log10(a);
			for (i = c;i >= 0;i--)
			{
				b[i] = a / (Math.pow(10,i));
				a = a - b[i] * Math.pow(10,i);
			}
			for (i = 0;i <= c;i++)
			{
				a = a + b[c - i] * Math.pow(10,i);
			}
			System.out.printf("%d",a);
		}
		if (a < 0)
		{
			a = (-a);
			c = Math.log10(a);
			for (i = c;i >= 0;i--)
			{
				b[i] = a / (Math.pow(10,i));
				a = a - b[i] * Math.pow(10,i);
			}

			for (i = 0;i <= c;i++)
			{
				a = a + b[c - i] * Math.pow(10,i);
			}
			System.out.printf("%d",-a);
		}
		System.out.print("\n");

	}

	public static int Main()
	{
		int[] a = new int[6];
		int i;
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
			go(a[i]);
		}
		return 0;
	}








}

