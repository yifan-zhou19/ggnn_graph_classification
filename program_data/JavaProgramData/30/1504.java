package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int s;
		double i0;
		i = 1,s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= n)
		{
			if (i % 7 == 0 || Math.floor(i / 10) == 7 || i - Math.floor(i / 10) * 10 == 7)
			{
				i = i + 1;
			}
			else
			{
				s = s + i * i,i = i + 1;
			}
		}
		System.out.print(s);
		return 0;
	}

}

