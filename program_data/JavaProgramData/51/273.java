package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int s;
		int t;
		int[] c = new int[500];
		int x;
		String a = new String(new char[500]);
		String b = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		for (m = 0;a.charAt(m + n - 1) != '\0';m++)
		{
			for (t = 0;t < n;t++)
			{
			b = tangible.StringFunctions.changeCharacter(b, t, a.charAt(m + t));
			}
			b = tangible.StringFunctions.changeCharacter(b, t, '\0');
			for (s = m + 1,c[m] = 1;a.charAt(s + n - 2) != '\0';s++)
			{
			for (t = 0;t < n;t++)
			{
				if (b.charAt(t) != a.charAt(s + t))
				{
					break;
				}
			}
			if (t == n)
			{
				c[m]++;
			}
			}
		}
		for (t = 0,x = 0;a.charAt(t + n - 1) != '\0';t++)
		{
		if (x < c[t])
		{
			x = c[t];
		}
		}
		if (x <= 1)
		{
			System.out.print("NO");
		}
			else
			{
				System.out.printf("%d\n",x);
			for (t = 0;a.charAt(t + n - 1) != '\0';t++)
			{
				if (c[t] == x)
				{
					for (m = 0;m < n;m++)
					{
				if (m != n - 1)
				{
					System.out.print(a.charAt(t + m));
				}
			else
			{
				System.out.printf("%c\n",a.charAt(t + m));
			}
					}
				}
			}
			}
		return 0;
	}
}

