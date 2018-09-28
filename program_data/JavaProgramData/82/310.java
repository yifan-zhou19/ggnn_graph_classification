package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] q = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int a;
		int b;
		int max = 0;
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				q[j]++;
			}
			else
			{
				j++;
			}
		}
		for (i = 0;i < 100;i++)
		{
			if (q[i] > max)
			{
				max = q[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

