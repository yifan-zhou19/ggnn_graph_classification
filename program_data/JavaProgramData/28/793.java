package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int s = 0;
		int i;
		int n;
		String p;
		String a = new String(new char[10000]);
		p = a;
		p = new Scanner(System.in).nextLine();
		n = p.length();
		for (i = 0;i < n;i++)
		{
			if ((*(p.Substring(i)) != ' ') && (*(p.Substring(i)) != '\0'))
			{
				s = s + 1;
			}
			if ((*(p.Substring(i)) == ' ') && (*(p.Substring(i)) != '\0'))
			{
				if (s > 0)
				{
					System.out.printf("%d,",s);
				}
				s = 0;
			}
			if (*(p.Substring(i)) == '\0')
			{
				break;
			}
		}
		System.out.printf("%d",s);
	}
}
