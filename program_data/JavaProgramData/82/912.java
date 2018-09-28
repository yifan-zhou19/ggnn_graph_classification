package <missing>;

public class GlobalMembers
{
	/*???????
	  ??????1200012829
	  ???2012.10.9*/
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int x = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (90 <= a != 0 && a <= 140 && 60 <= b != 0 && b <= 90)
			{
				x = x + 1;
			}
			else
			{
				if (k < x)
				{
					k = x;
				}
				x = 0;
			}
		}
		if (k >= x)
		{
			System.out.print(k);
			System.out.print("\n");
		}
		else
		{
			System.out.print(x);
			System.out.print("\n");
		}
		return 0;
	}

}

