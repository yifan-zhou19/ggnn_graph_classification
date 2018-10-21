package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[41]);
		int num;
		int count = 0;
		int sum = 0;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (count < num)
		{
			count++;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int l = a.length();
			if (sum == 0)
			{
				System.out.print(a);
				sum += l;
			}
			else if (sum + l + 1 > 80)
			{
				System.out.print("\n");
				System.out.print(a);
				sum = l;
			}
			else if (sum > 0 && sum + l < 80)
			{
				System.out.print(" ");
				System.out.print(a);
				sum += (l + 1);
			}
		}
		return 0;
	}
}

