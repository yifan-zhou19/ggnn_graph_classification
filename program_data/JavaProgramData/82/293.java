package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t = 0;
		int i;
		int n;
		int shou;
		int shu;
		int health;
		int max = 0;
		int[] bp = new int[100 + 10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			shou = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			shu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (90 <= shou != 0 && shou <= 140 && 60 <= shu != 0 && shu <= 90)
			{
				bp[i] = 1;
			}
		}
		System.out.print("\n");
		for (i = 0; i < n; i++)
		{
			if (bp[i] == 0)
			{
				max = max > t != 0 ? max : t;
				t = 0;
			}
			else
			{
				t++;
			}
		}

		max = max > t != 0 ? max : t;
		System.out.print(max);
		System.out.print("\n");
	}
}

