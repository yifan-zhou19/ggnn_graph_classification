package <missing>;

public class GlobalMembers
{
	public static int[] queue = new int[110];
	public static int l;
	public static int[] num = new int[110];
	public static void f(int[] x, int y)
	{
		int j;
		int k = 0;
		for (j = 0;j < y;j++)
		{
			if (x[j] == 1)
			{
				num[k] = j;
				k++;
			}
			else if (x[j] == 0)
			{
				k--;
				System.out.print(num[k]);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{
		String game = new String(new char[110]);
		int i;
		game = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = game.length();
		for (i = 0;game.charAt(i) != 0;i++)
		{
			if (game.charAt(i) == game.charAt(0))
			{
				queue[i] = 1;
			}
			else
			{
				queue[i] = 0;
			}
		}
		f(queue, l);
		return 0;
	}
}

