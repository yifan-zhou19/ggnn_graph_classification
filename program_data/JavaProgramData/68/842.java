package <missing>;

public class GlobalMembers
{
	public static int pp(int a)
	{
		int x;
		int y;
		y = 0;
		for (x = 2;x * x <= a;x++)
		{
			if (a % x == 0)
			{
			y = 1;
			break;
			}
		}
		return y;
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n;i = i + 2)
		{
		   for (j = 3;j <= i;j = j + 2)
		   {
			 if (pp(j) == 0 && pp(i - j) == 0)
			 {
				System.out.print(i);
				System.out.print("=");
				System.out.print(j);
				System.out.print("+");
				System.out.print(i - j);
				System.out.print("\n");
				break;
			 }
		   }
		}
					  return 0;
	}
}

