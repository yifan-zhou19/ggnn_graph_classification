package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int a;
		int b;
		int s;
		int tot;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = 0;
		s = 0;
		tot = 0;
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (((a >= 90) && (a <= 140)) && ((b >= 60) && (b <= 90)))
			{
				j++;
				s = j;
			}
			else
			{
			if (j <= tot)
			{
				j = 0;
			}
			else
			{
					tot = j;
					j = 0;
			}


			}
		}
		if (j >= tot)
		{
			tot = j;
		}

		System.out.print(tot);
	}
}

