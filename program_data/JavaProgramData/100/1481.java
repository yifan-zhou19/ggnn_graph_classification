package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int p;
		int[] t = new int[300];
		int i;
		int j;
		int k;
		String c = new String(new char[300]);
		char a;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0,p = 0;i < n,(a = c.charAt(i)) != '\0';i++)
		{
			if (a >= 'a' && a <= 'z')
			{
				for (j = 0,t[i] = 0;j < n;j++)
				{
					if (c.charAt(j) == a)
					{
						t[i]++;
					}
				}
			}
			else if (a >= 'A' && a <= 'Z')
			{
				for (j = 0,t[i] = 0;j < n;j++)
				{
					if (c.charAt(j) == a)
					{
						t[i]++;
					}
				}
			}
			else
			{
				p++;
				t[i] = 0;
			}
		}
		if (p < n)
		{
			for (i = 0;i < n;i++)
			{
				for (j = i;j < n;j++)
				{
					if (c.charAt(i) > c.charAt(j))
					{
						a = c.charAt(i);
						k = t[i];
						c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(j));
						t[i] = t[j];
						c = tangible.StringFunctions.changeCharacter(c, j, a);
						t[j] = k;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (c.charAt(j) == c.charAt(i))
					{
						t[j] = 0;
					}
				}
				if (t[i] != 0)
				{
					System.out.printf("%c=%d\n",c.charAt(i),t[i]);
				}
			}
		}
		else
		{
			System.out.print("No");
		}
	}
}

