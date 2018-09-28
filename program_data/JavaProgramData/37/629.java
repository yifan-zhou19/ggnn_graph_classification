package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		char linshi;
		char diyi;
		int n;
		int i;
		int k;
		int l;
		int m;
		int g = 0;
		int p = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			k = a.length();
			for (l = 0;l <= (k - 1);l++)
			{
				diyi = a.charAt(l);
				for (m = 0;m < k;m++)
				{
					if ((diyi == a.charAt(m)) && (l != m))
					{
						g++;
					}
					if ((g == 0))
					{
						p = 0;
					}
					else
					{
						p = 1;
					}
				}
				if (g == 0)
				{
					break;
				}
				g = 0;
			}
			if ((g == 0) && (p == 0))
			{
				System.out.print(diyi);
				System.out.print("\n");
			}
			g = 0;
			if (p == 1)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			p = 1;

		}

		return 0;
	}

}

