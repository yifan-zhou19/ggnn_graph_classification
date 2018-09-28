package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String p;
		int n;
		int m = 0;
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		p = a;
		n = a.length();
		for (i = n - 1;i >= 0;i--)
		{
			if (*(p.Substring(i)) != ' ')
			{
				m = m + 1;
			}
			if (*(p.Substring(i)) == ' ')
			{
				for (j = i + 1;j < i + m + 1;j++)
				{
					System.out.printf("%c",*(p.Substring(j)));
				}
				System.out.print(" ");
				m = 0;
			}
		}
		for (i = 0; * (p.Substring(i)) != ' ' && *(p.Substring(i)) != '\0';i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
	}

}
