package <missing>;

public class GlobalMembers
{
	public static int max(int(x),int(y))
	{
		if (x >= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int t1 = 0;
		int t2 = 0;
		int t = 0;
		int a;
		int b;
		for (i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a >= 90 && a <= 140) && (b >= 60 && b <= 90))
			{

			t = t + 1;
			t1 = t;
			}
			else
			{


			t1 = max(t, t2);
			t = 0;
			t2 = t1;

			}

		}
		t1 = max(t, t2);
		System.out.print(t1);
		return 0;
	}
}

