package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String ch = new String(new char[100]);
		String ch1 = new String(new char[44]);
		ch1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(ch1);
		int sum = ch1.length() + 1;
		for (int i = 1;i < n;i++)
		{
			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
			sum = sum + ch.length() + 1;
			if (sum > 81)
			{
				System.out.print("\n");
				System.out.print(ch);
				sum = ch.length() + 1;
			}
			else
			{
				System.out.print(' ');
				System.out.print(ch);
			}
		}
		return 0;
	}


}

