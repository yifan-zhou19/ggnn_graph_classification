package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int t = 1;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1;t <= n;t++)
		{
			String a = new String(new char[100001]);
			char p;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (i = 0;i < a.length();i++)
			{
				p = a.charAt(i);
				for (j = 0;j < a.length();j++)
				{
					if (p == a.charAt(j))
					{
						k++;
					}
				}
				if (k == 1)
				{
					System.out.print(p);
					System.out.print("\n");
					num++;
					break;
				}
				k = 0;
			}
			if (num == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			k = 0;
			num = 0;
		}
		return 0;
	}
}

