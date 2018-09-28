package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int s;

		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = 0;
		for (i = 1;i <= a;i++)
		{
			k = 0;
			if (i % 7 == 0)
			{
				k++;
			}
			b = i;
			while (b != 0)
			{
				j = b % 10;
				if (j == 7)
				{
					k++;
				}
				b = b / 10;
			}
			if (k == 0)
			{
				s = s + i * i;
			}
		}
		System.out.print(s);
		System.out.print("\n");

		return 0;
	}
}

