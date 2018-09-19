package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != -1)
		{
			int[] s = new int[15];
		int l = 1;
		int m = 0;
		s[0] = a;
		do
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[l] = a;
			l++;
		}while (a != 0);
		for (int i = 0;i < 15;i++)
		{
			for (int j = 0;j < 15;j++)
			{
				if (s[j] == 2 * s[i] && s[i] != 0)
				{
					m++;
				}
			}
		}
		System.out.print(m);
		System.out.print("\n");
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}

}

