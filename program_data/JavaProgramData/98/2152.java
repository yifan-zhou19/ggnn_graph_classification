package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int length;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String str = new String(new char[41]);
		System.in.read();
		cin.getline(str,41,' ');
		sum = str.length() + 1;
		System.out.print(str);
		for (i = 1;i < n;i++)
		{
			cin.getline(str,41,' ');
			length = str.length();
			sum = sum + length + 1;
			if (sum <= 81)
			{
				System.out.print(' ');
				System.out.print(str);
			continue;
			}
			else
			{
				System.out.print("\n");
				System.out.print(str);
				sum = str.length() + 1;
			}
		}
		return 0;
	}
}

