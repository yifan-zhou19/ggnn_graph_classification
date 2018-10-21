package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int le;
		int max;
		int s;
		int i;
		int j;
		int k;
		int t;
		final String a = "\0";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		le = a.length();
		max = 0;
		s = 0;
		t = 0;
		while (a.charAt(t) != ',')
		{
			max = max * 10 + a.charAt(t) - '0';
			t++;
		}
		j = 0;
		for (i = t;i <= le-1;i++)
		{
			if (a.charAt(i) != ',')
			{
				k = 1;
			}
			else
			{
				if (j > max)
				{
					if (max > s)
					{
						s = max;
					}
					max = j;
				}
				if ((j > s) && (j != max))
				{
					s = j;
				}
				 j = 0;
				k = 0;
			}
			if (k == 1)
			{
				j = j * 10 + (a.charAt(i) - '0');
			}
		}
		if (j > max)
		{
			if (max > s)
			{
				s = max;
			}
			max = j;
		}
		if ((j > s) && (j != max))
		{
			s = j;
		}
		if (s == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",s);
		}
	}

}

