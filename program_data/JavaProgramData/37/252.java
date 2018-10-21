package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int i;
		int j;
		int t = 0;
		int n;
		int la;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			t = 0;
			la = a.length();
			for (i = 0;i < la;i++)
			{
				t = 0;
				for (j = 0;j < la;j++)
				{
					if (i == j)
					{
						continue;
					}
					else
					{
						if (a.charAt(i) == a.charAt(j))
						{
							t = 1;
							break;
						}
					}
				}
				if (t == 0)
				{
					System.out.print(a.charAt(i));
					System.out.print("\n");
					break;
				}
			}
			if (t == 1)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

