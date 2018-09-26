package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int b = 0;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 1000;i++)
		{

			if (a.charAt(i) == '\0')
			{
				System.out.print("\n");
				break;
			}

			if (a.charAt(i) != ' ')
			{
				b = 0;
				System.out.printf("%c",a.charAt(i));
			}
			else
			{
				b = b + 1;
			}

			if (b == 1)
			{
				System.out.print(" ");
			}
			else
			{
				continue;
			}
		}
		return 0;
	}


}
