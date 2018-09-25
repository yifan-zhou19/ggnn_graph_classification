package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		String a = new String(new char[22]);
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < num; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			//cout << a << " ";
			int n;
			n = a.length();
			//cout << n << " ";
			int j;
			for (j = 0; j < n; j++)
			{
				if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
				{
					System.out.print("no");
					System.out.print("\n");
					break;
				}
				if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) >= '0' && a.charAt(j) <= '9' || a.charAt(j) == '_')
				{
					continue;
				}
				else
				{
					System.out.print("no");
					System.out.print("\n");
					break;
				}
			}
			//cout << "j =" <<j <<"";
			if (j == n)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
		}
		return 0;

	}
}

