package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int g;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		g = 0;
		for (i = 0;i < a.length();i++)
		{
			if (g == 0)
			{
				if (a.charAt(i) != ' ')
				{
					System.out.print(a.charAt(i));
				}
				else
				{
					g = 1;
					System.out.print(a.charAt(i));
				}
			}
			else
			{
				if (a.charAt(i) == ' ')
				{
					continue; //????????????????????
				}
				else
				{
					g = 0;
					System.out.print(a.charAt(i));
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}
