package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int i;
		int x = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 20000;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != '\0')
			{
				x = x + 1;
			}
			if (a.charAt(i) == ' ')
			{
				if (x != 0)
				{
					System.out.printf("%d,",x);
				}
				x = 0;
			}
			if (a.charAt(i) == '\0')
			{
				if (x != 0)
				{
					System.out.printf("%d",x);
				}
				break;
			}
		}
	}
}
