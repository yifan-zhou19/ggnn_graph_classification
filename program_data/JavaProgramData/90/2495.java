package <missing>;

public class GlobalMembers
{
	//***********************
	//*??????         **
	//*??????         **
	//*???2013.11.29     **
	//************************
	public static int put(int a,int b)
	{
		if (b <= 0 || a < 0)
		{
			return 0;
		}
		else
		{
			if (a == 1 || b == 1 || a == 0)
			{
				return 1;
			}
			else
			{
				return (put(a - b, b) + put(a, b - 1));
			}
		}
	}
	public static int Main()
	{
		int k;
		int i;
		int m;
		int n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(put(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

