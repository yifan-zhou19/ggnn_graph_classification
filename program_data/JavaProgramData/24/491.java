package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ch = new String(new char[500]);
		String p1 = ch;
		String p2 = ch;
		int i;
		int length = 0;
		int flag = 1;
		int max = 0;
		int min = 500;
		ch = new Scanner(System.in).nextLine();
		for (i = 0;ch.charAt(i) != '\0';i++)
		{
			if (ch.charAt(i) == ' ')
			{
				if (flag == 1)
				{
					if (length > max)
					{
						max = length;
						p1 = ch.charAt(i) - length;
					}
					if (length < min)
					{
						min = length;
						p2 = ch.charAt(i) - length;
					}
					length = 0;
					flag = 0;
				}
			}
			else
			{
				if (flag == 0)
				{
					flag = 1;
				}
				length++;
			}
		}
		if (length > 0)
		{
			if (length > max)
			{
				p1 = ch.charAt(i) - length;
			}
			else if (length < min)
			{
				p2 = ch.charAt(i) - length;
			}
		}
		for (; p1 != ' ' && p1 != 0;p1++)
		{
		System.out.printf("%c", p1);
		}
		System.out.print("\n");
		for (; p2 != ' ' && p2 != 0;p2++)
		{
		System.out.printf("%c", p2);
		}
		System.out.print("\n");

	}
}
