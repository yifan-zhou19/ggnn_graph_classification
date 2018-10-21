package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[40]);
		int n;
		int sum = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a != null && n > 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			i++;
			int len = a.length();
			if (i == 1)
			{
				sum = sum + len;
			}
			else
			{
				sum = sum + len + 1;
			}
			if (sum <= 80)
			{
				if (i == 1)
				{
					System.out.print(a);
				}
				else
				{
					System.out.print(" ");
					System.out.print(a);
				}
			}
			if (sum == 80)
			{
				System.out.print("\n");
				sum = 0;
				i = 0;
			}
			if (sum > 80)
			{
				System.out.print("\n");
				System.out.print(a);
				sum = len;
				i = 1;
			}
			n--;
		}
		return 0;
	}
}

