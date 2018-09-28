package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String ch = new String(new char[1000]);
		//scanf("%s", ch);
		ch = new Scanner(System.in).nextLine();
		int len = ch.length();

		int i;
		for (i = 0; i < len; i++)
		{
			if (ch.charAt(i) != ' ')
			{
				System.out.printf("%c", ch.charAt(i));
			}
			else
			{
				if (ch.charAt(i - 1) == ' ')
				{

				}
				else
				{
					System.out.print(" ");
				}
			}
		}

		System.out.print("\n");


		return 0;
	}
}
