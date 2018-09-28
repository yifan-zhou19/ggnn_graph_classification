package <missing>;

public class GlobalMembers
{
	//****************************
	//*???:6.cpp               *
	//*??:??                  *
	//*????:2013?10?30?     *
	//*????:????          *
	//****************************
	public static int Main()
	{
		int n; //????n
		int a;
		int b;
		int t;
		int x;
		int max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = 0;
		max = 0;
		for (int i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t = (a >= 90) && (a <= 140) && (b >= 60) && (b <= 90);
			if (t == 1)
			{
				x = x + 1;
				if (x >= max)
				{
					max = x;
				}
			}
			else
			{
				if (x >= max)
				{
					max = x;
				}
				x = 0;
			}
		}
		System.out.print(max);
		return 0;
	}
}

