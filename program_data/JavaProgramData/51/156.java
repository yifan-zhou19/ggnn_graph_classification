package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[500]);
		String a = new String(new char[500]);
		int i;
		int j;
		int t;
		int l;
		int n;
		int k;
		int max;
		int sig;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i <= (l - n);i++)
		{
			a = a.substring(0, i);
			for (j = i;j <= (l - n);j++)
			{
				sig = 1;
				for (k = 0;k < n;k++)
				{
					if (s.charAt(i + k) == s.charAt(j + k))
					{
						t = 1;
					}
					else
					{
						t = 0;
					}
					sig = (1 * t * sig);
				}
				if (sig == 1)
				{
					a.charAt(i)++;
				}
			}
		}
		max = 1;
		for (i = 0;i <= (l - n);i++)
		{
			if (a.charAt(i) >= max)
			{
				max = a.charAt(i);
			}
		}
		if (max != 1)
		{
		System.out.printf("%d\n",max);
		for (i = 0;i <= (l - n);i++)
		{
			if (a.charAt(i) == max)
			{
				for (k = 0;k < n;k++)
				{
					System.out.printf("%c",s.charAt(i + k));
				}
				System.out.print("\n");
			}
		}
		}
		else
		{
			System.out.print("NO\n");
		}
	}

}

