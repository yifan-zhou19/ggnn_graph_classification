package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		int j = 1;
		int l;
		String a = new String(new char[41]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = a.length();
			count = count + l;
			if (count < 80 && count != l)
			{
				System.out.print(" ");
				System.out.print(a);
				count++;
			}
			else if (count < 80 && count == l)
			{
				System.out.print("\n");
				System.out.print(a);
			}

			else
			{
				System.out.print("\n");
				System.out.print(a);
				count = l;
			}
		}
		return 0;
	}

}

