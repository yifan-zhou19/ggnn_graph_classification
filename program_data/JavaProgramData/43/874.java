package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int m; //????
		int i;
		int j;
		int l;
		int k;
		int s;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = 0;
		for (i = 2,s = 0;i <= m / 2;i++) //??
		{
			for (j = 2,s = 0;j < i;j++) //??
			{
				if (i % j == 0)
				{
					s = s + 1; //??i??j,s=s+1
				}
			}
			if (s == 0)
			{
				l = m - i; //??s=0,??l
				for (k = 2,s = 0;k < l;k++) //??
				{
					if (l % k == 0)
					{
						s = s + 1; //??l??k?s=s+1
					}
				}
			}
			if (s == 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(l);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

