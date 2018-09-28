package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		String a = new String(new char[50]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int s = a.length();
			sum += s + 1;
			if (sum == s + 1)
			{
				System.out.print(a);
				sum--;
			}
			else if (sum > 80)
			{
				System.out.print("\n");
				System.out.print(a);
				sum = s;
			}
			else if (sum < 80)
			{
				System.out.print(' ');
				System.out.print(a);
			}
			else if (sum == 80)
			{
				System.out.print(' ');
				System.out.print(a);
				System.out.print("\n");
				sum = 0;
			}
		}

		return 0;
	}
}

