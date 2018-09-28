package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100000]);
		int i;
		int c = 0;
		int m = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			m++;
		}
		for (i = 0;i < m + 1;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != '\0')
			{
				c++;
			}
			if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ')
			{
				System.out.printf("%d,",c);
				c = 0;
			}
			if (a.charAt(i) == '\0')
			{
				System.out.printf("%d",c);
				c = 0;
			}
		}
	}
}
