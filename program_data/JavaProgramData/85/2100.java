package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int counter;
		int i;
		int j;
		int n;
		String a = new String(new char[20]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		for (j = 0;j < n;j++)
		{
			String a = new String(new char[20]);
			counter = 0;
			a = new Scanner(System.in).nextLine();
			if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || a.charAt(0) >= 'A' && a.charAt(0) <= 'Z' || a.charAt(0) == '_')
			{
				for (i = 1;a.charAt(i) != '\0';i++)
				{
					if (!((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' || a.charAt(i) == '_' || (a.charAt(i) >= '0' && a.charAt(i) <= '9')))
					{
						counter++;
						System.out.print("no");
						System.out.print("\n");
						break;
					}
				}
				if (counter == 0)
				{
					System.out.print("yes");
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

