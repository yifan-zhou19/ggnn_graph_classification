package <missing>;

public class GlobalMembers
{
	//**************************
	//**??                  **
	//**??:??? 1100012914**
	//**??:2011.11.6        **
	public static int Main()
	{
		int a;
		int hu;
		int fif;
		int tw;
		int te;
		int fiv;
		int one;
		int i;
		int t;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = a % 10;
			if (t >= 5)
			{
				fiv = 1;
				one = t - 5;
			}
			else
			{
				fiv = 0;
				one = t;
			}
			a = a / 10;
		t = a % 10;
		if (t >= 5)
		{
			fif = 1;
			t = t - 5;
		if (t > 3)
		{
		tw = 2;
		te = t - 4;
		}
		else
		{
			if (t > 1)
			{

				tw = 1;
				te = t - 2;
			}
			else
			{

			tw = 0;
			te = t;
			}
		}
		}
		else
		{
			if (t > 3)
			{
			fif = 0;
		tw = 2;
		te = t - 4;
			}
		else
		{
			if (t > 1)
			{
				fif = 0;
				tw = 1;
				te = t - 2;
			}
			else
			{
			fif = 0;
			tw = 0;
			te = t;
			}
		}
		}

		a = a / 10;
		t = a % 10;
		hu = t;
		System.out.print(hu);
		System.out.print("\n");
		System.out.print(fif);
		System.out.print("\n");
		System.out.print(tw);
		System.out.print("\n");
		System.out.print(te);
		System.out.print("\n");
		System.out.print(fiv);
		System.out.print("\n");
		System.out.print(one);
		System.out.print("\n");

		return 0;
	}

}

