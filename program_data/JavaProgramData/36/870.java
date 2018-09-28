package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int l1;
		int l2;
		int flag = 0;
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			flag = 1;
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				int k = 0;
				for (j = 0;j < l2;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						a = a.substring(0, i);
						b = b.substring(0, j);
						k = 1;
					}
				}
					if (k == 0)
					{
						flag = 1;
						break;
					}
			}
		}
			if (flag == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			return 0;
	}
}

