package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String p;
		int m;
		int n;
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		m = a.length();
		p = a;
		j = m;
		for (i = m - 1;i > -1;i--)
		{
			if (*(p.Substring(i)) == ' ')
			{
				System.out.printf("%s",p.Substring(i) + 1);
				System.out.print(" ");
				*(p.Substring(i)) = '\0';
				j = i;
			}
		}
			for (i = 0;i < j;i++)
			{
				System.out.printf("%c",*(p.Substring(i)));
			}
	}
}
