package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b = 0;
		int i;
		String c = new String(new char[100000]);

		while (true)
		{
			c = new Scanner(System.in).nextLine();
		for (i = 0;i < 100000;i++)
		{
			if (!c.charAt(i))
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
			if (c.charAt(i) != ' ' || b == 0)
			{
				System.out.print(c.charAt(i));
			}
			if (c.charAt(i) == ' ')
			{
				b = 1;
			}
			else
			{
				b = 0;
			}
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
		System.out.print("\n");
	}
}
