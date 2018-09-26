package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int m;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num != 1)
		{
			m = num;
			if (num % 2 == 0)
			{
				num = num / 2,cout << m << "/" << "2=" << num << "\n";
			}
			else
			{
				num = num * 3 + 1,cout << m << "*3+1=" << num << "\n";
			}
		}
		System.out.print("End");
		return 0;
	}
}

