package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[32]);
		str = new Scanner(System.in).nextLine();
		String p = str;
		int i;
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
			{
				System.out.print(*(p.Substring(i)));
			}
			else if (*(p.Substring(i) - 1) >= '0' && *(p.Substring(i) - 1) <= '9')
			{
				System.out.print('\n');
			}
		}
	}
}
