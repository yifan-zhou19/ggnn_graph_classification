package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int l;
		char c;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		c = System.in.read();
		i = 0;
		j = 0;
		l = 0;
		while (c != '\n')
		{
			if (c >= 'A' && c <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, c);
				i++;
				l++;
			}
			if (c >= 'a' && c <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, c);
				j++;
				l++;
			}
			c = System.in.read();
		}
		m = i;
		n = j;
		for (i = 65;i <= 90;i++)
		{
			for (j = 0,k = 0;j < m;j++)
			{
				if (a.charAt(j) == i)
				{
					k++;
				}
			}
			if (k != 0)
			{
				System.out.printf("%c=%d\n",i,k);
			}
		}
			for (i = 97;i <= 122;i++)
			{
			for (j = 0,k = 0;j < n;j++)
			{
				if (b.charAt(j) == i)
				{
					k++;
				}
			}
			if (k != 0)
			{
				System.out.printf("%c=%d\n",i,k);
			}
			}
			if (l == 0)
			{
				System.out.print("No\n");
			}
		return 0;
	}
}

