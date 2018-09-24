package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] aa = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int m = 0;
		for (int i = 0;i <= 11;i++)
		{
			for (int j = 0;j <= i;j++)
			{
				m = m + aa[j];
			}
			m = m - (aa[i] - 13 + 1);
			if ((m + (w - 5)) % 7 == 0)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
			m = 0;
		}
		return 0;
	}
}

