package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();

		int flag = 0;
		int i;

		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (flag == 0)
			{
				System.out.print(a.charAt(i));
				if (a.charAt(i) == ' ')
				{
					flag = 1;
				}
			}
			else if ((flag == 1) && (a.charAt(i) != ' '))
			{
				System.out.print(a.charAt(i));
				flag = 0;
			}
		}

		System.out.print("\n");
		return 0;
	}

}
