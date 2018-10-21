package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int y;
		int x;
		int[] thirteen = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 12;i++)
		{
			y = thirteen[i] % 7;
			a = 8 - y;
			x = n - a;
			if (x == 5 || x == -2)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}









}

