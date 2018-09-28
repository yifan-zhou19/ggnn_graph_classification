package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[31]);
	public static void number(int position)
	{
		int i;
		if (!*(str.Substring(position)))
		{
			return;
		}
		else if (*(str.Substring(position)) <= '9' && *(str.Substring(position)) >= '0' && *(str.Substring(position) - 1) != '-')
		{
			for (i = position; * (str.Substring(i)) <= '9' && *(str.Substring(i)) >= '0';i++)
			{
				System.out.print((str.Substring(i)));
			}
			System.out.print("\n");
			number(i);
		}
		else if (*(str.Substring(position)) <= '9' && *(str.Substring(position)) >= '0' && *(str.Substring(position) - 1) == '-')
		{
			for (i = position; * (str.Substring(i)) <= '9' && *(str.Substring(i)) >= '0';i++)
			{
				;
			}
			number(i);
		}
		else
		{
			number(position + 1);
		}
	}
	public static int Main()
	{
		int i;
		str = new Scanner(System.in).nextLine();
		number(0);
	}

}
