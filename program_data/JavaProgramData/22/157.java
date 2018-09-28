package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1500]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = 0;
		j = 0;
		k = 0;
		l = 0;
		for (i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				j = j * 10 + s.charAt(i) - '0';
			}
				else
				{
					n++;
					if (j > k)
					{
						l = k;
						k = j;
					}
					else if (j < k && j> l)
					{
						l = j;
					}
					j = 0;
				}
		}
		if (j > k)
		{
			l = k;
			k = j;
		}
					else if (j < k && j> l)
					{
						l = j;
					}
		if (l == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",l);
		}
	}
}

