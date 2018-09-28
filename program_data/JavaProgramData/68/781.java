package <missing>;

public class GlobalMembers
{
	/*
	PG ????????
	?? 1000012760
	*/


	public static int Prime(int x)
	{
		int y = 1;
		int i = 0;

		(float)x;

		for (i = 2; i <= sqrtf(x); i++)
		{
			if (x % i == 0)
			{
				y = 0;
				break;
			}
		}

		return y;
	}
	//?????????


	public static int Main()
	{

		int n;
		int now;
		int a;
		int b;
		int i = 0;
		int j = 0;
	//n??????,now????????,a?b?????now?????,i????

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	//??n

		for (now = 6; now <= n; now++)
		{

			if (now % 2 == 0)
			{
				for (i = 2; i <= now; i++)
				{
					a = i;
					b = now - i;
					if ((Prime(a) == 1) && (Prime(b) == 1))
					{
						break;
					}
				}

				System.out.print(now);
				System.out.print("=");
				System.out.print(a);
				System.out.print("+");
				System.out.print(b);
				System.out.print("\n");
			}
		}

		return 0;
	}
}

