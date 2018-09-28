package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i = 0;
		int j = 0;
		int g = 1;
		int l1;
		int l2;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i < l2;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = 1;j < l1;j++)
				{
					if (b.charAt(j + i) != a.charAt(j))
					{
						g = 0;
						break;
					}
				}
				if (g == 1)
				{
					System.out.print(i);
					break;
				}
			}
		}

		return 0;
	}
}

