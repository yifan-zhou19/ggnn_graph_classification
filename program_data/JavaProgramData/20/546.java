package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		String c = new String(new char[16]);
		int i;
		int n;
		int max;
		int maxi;
		while (scanf("%s%s",a,b) != EOF)
		{
			n = 0;
			max = 0;
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				n++;
			}
			for (i = 0;i <= n - 1;i++)
			{
				if (a.charAt(i) > max)
				{
					max = a.charAt(i);
					maxi = i;
				}
			}
			for (i = 0;i <= maxi;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
			}
			for (i = maxi + 1;i <= maxi + 3;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, b.charAt(i - maxi - 1));
			}
			for (i = maxi + 4;i <= n + 2;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i - 3));
			}
			c = tangible.StringFunctions.changeCharacter(c, n + 3, '\0');
			System.out.printf("%s\n",c);
		}
	}
}

