package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] c = new int[500];
	public static final String d = "";
	public static void Main()
	{
		void gram(char s[500],int i);
		int i;
		int j;
		int k;
		int t = 0;
		int max = 0;
		final String s = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		for (i = 0;i < s.length() - n + 1;i++)
		{
			gram(s, i);
			for (j = i;j < s.length() - n + 1;j++)
			{
				k = 0;
				while ((d.charAt(k) == s.charAt(j + k)) && k < n)
				{
					k = k + 1;
					t = t + 1;
				}
				if (t == n)
				{
					c[i] = c[i] + 1;
					t = 0;
				}
				else
				{
					t = 0;
				}
			}
			for (k = 0;k < 5;k++)
			{
				d = tangible.StringFunctions.changeCharacter(d, k, '\0');
			}
		}
		for (i = 0;i < s.length();i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		for (i = 0;i < s.length();i++)
		{
			if (max == c[i])
			{
				if (max > 1)
				{
					System.out.printf("%d\n",max);
				}
				else
				{
					System.out.print("NO");
				}
				break;
			}
		}
		for (i = 0;i < s.length();i++)
		{
			if ((max == c[i]) && (max > 1))
			{
				for (k = 0;k < n;k++)
				{
					System.out.printf("%c",s.charAt(i + k));
				}
				System.out.print("\n");
			}
		}
	}
	public static void gram(String s, int i)
	{
		int a;
		int b;
		b = i;
		for (a = 0;a < n;a++)
		{
			d = tangible.StringFunctions.changeCharacter(d, a, s[b]);
			b = b + 1;
		}
	}
}

