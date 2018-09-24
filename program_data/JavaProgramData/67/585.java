package <missing>;

public class GlobalMembers
{
	/*
	 *2.cpp
	 *??: 2010-12-19
	 *??:??
	 *????????
	 */
	public static void f(float a,float b)
	{
		if (b - a > 0.05F)
		{
			System.out.print("better");
			System.out.print("\n");
		}
		else if (a - b > 0.05F)
		{
			System.out.print("worse");
			System.out.print("\n");
		}
		else
		{
			System.out.print("same");
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int n;
		float x;
		float y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		y = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		while (n - 1 > 0)
		{
			float a;
			float b;
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			f(y / x, b / a);
			n--;
		}
		return 0;
	}
}

