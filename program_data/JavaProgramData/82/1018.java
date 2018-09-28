package <missing>;

public class GlobalMembers
{
	//***************************************
	//*?????(5-6) ????            **
	//*?????? 1200012945             **
	//*???2012.10.12                    **
	//***************************************

	public static int Main()
	{

		int i;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int x;
		int h;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = 0;
		h = 0;
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] <= 140 && a[i] >= 90 && b[i] <= 90 && b[i] >= 60)
			{
				x = x + 1;
			}
			else if (x >= h)
			{
				h = x;
				x = 0;
			}
			else
			{
				x = 0;
			}
		}
		if (x >= h)
		{
			h = x;
		}
		System.out.print(h);
		System.out.print("\n");
		return 0;

	}
}

