package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (Character.isDigit(a[0]))
			{
				System.out.print("no");
				System.out.print("\n");
				continue;
			}
			for (i = 0;a[i] != 0;++i)
			{
				if (a[i] == 95 || Character.isUpperCase(a[i]) || Character.isLowerCase(a[i]) || Character.isDigit(a[i]))
				{
					continue;
				}
				else
				{
					break;
				}
			}
			a[i] == 0?cout << "yes" << "\n":cout << "no" << "\n";
		}
	}
}

