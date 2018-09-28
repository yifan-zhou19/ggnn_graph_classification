package <missing>;

public class GlobalMembers
{
	public static int reverse(int x)
	{
		int back = 0;
		int i;
		int qiang1; // change the type of double->int
		int qiang2;
		int w; // digit number
		int m = 1; // control + or -
		if (x < 0)
		{
			m = -1;
			x = -x;
		}
		for (w = 0;1;w++)
		{
			if (x / (Math.pow(10,w)) < 10)
			{
				break;
			}
		}
		for (i = 0;i <= w;i++)
		{
			qiang2 = (int)Math.pow(10,w - i);
			back += (x % 10) * qiang2;
			x = x / 10;
		}
		return back * m;
	}

	public static int Main()
	{
		int a;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(a));
		}
		return 0;
	}

}

