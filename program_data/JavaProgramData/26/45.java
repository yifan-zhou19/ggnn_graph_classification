package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		final String a = " ";
		for (i = 0;i < 100;i++)
		{
			cin.get(a.charAt(i));
		}
		for (i = 0;i < 100;i++)
		{
			if (((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' ')) || (a.charAt(i) != ' '))
			{
			System.out.print(a.charAt(i));
			}
		}
		return 0;
	}

}
