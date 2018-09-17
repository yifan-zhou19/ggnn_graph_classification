package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[1001]);
		int count = 1;
		int i;
		int j;
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0;ch.charAt(i) != '\0';i++)
		{
			if (ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z')
			{
				ch.charAt(i) -= 32;
			}
		}
		for (j = 0,i = 0;;)
		{
			if (ch.charAt(j) == '\0')
			{
				System.out.print("(");
				System.out.print(ch.charAt(i));
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				break;
			}
			else
			{
				for (j = i + 1;ch.charAt(j) != '\0';j++)
				{
					if (ch.charAt(j) == ch.charAt(i))
					{
						count++;
					}
					else
					{
						System.out.print("(");
						System.out.print(ch.charAt(i));
						System.out.print(",");
						System.out.print(count);
						System.out.print(")");
						count = 1;
						i = j;
						break;
					}
				}
			}
		}
		return 0;
	}
}

