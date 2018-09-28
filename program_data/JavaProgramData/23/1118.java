package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		String str = new String(new char[10000]);
		String p = str;
		p = new Scanner(System.in).nextLine();
		n = p.length();
		*(p.Substring(n)) = ' ';
		for (i = n - 1;i >= 0;i--)
		{
			if (*(p.Substring(i)) == ' ')
			{
				for (j = i + 1; * (p.Substring(j)) != ' ';j++)
				{
					System.out.printf("%c",*(p.Substring(j)));
				}
				System.out.print(" ");
			}
		}
		for (j = 0; * (p.Substring(j)) != ' ';j++)
		{
			System.out.printf("%c",*(p.Substring(j)));
		}
	}
}
