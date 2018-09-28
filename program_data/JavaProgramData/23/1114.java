package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[128]);
		String p;
		int n;
		int i;
		int j;
		int k;
		int m;
		int x = 0;
		str = new Scanner(System.in).nextLine();
		p = str;
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				x++;
			}
		}
		if (x == 0)
		{
			for (i = 0;i < n;i++)
			{
				System.out.printf("%c",*(p.Substring(i)));
			}
		}
		else
		{
		   for (i = n - 1;i > -1;i--)
		   {
			   if (*(p.Substring(i)) == ' ')
			   {
				m = i;
				for (j = i + 1; * (p.Substring(j)) != ' ' && *(p.Substring(j)) != '\0';j++)
				{
					System.out.printf("%c",*(p.Substring(j)));
				}
				System.out.printf("%c",' ');
			   }
		   }
		for (k = 0;k < m;k++)
		{
			System.out.printf("%c",*(p.Substring(k)));
		}
		}
	}
}
