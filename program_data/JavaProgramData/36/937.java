package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l1;
		int l2;
		int[] c = new int[100];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l1 = a.length();
		l2 = b.length();
		if (l1 == l2)
		{
			for (i = 0;i <= l1 - 1;i++)
			{
				for (j = 0;j <= l2 - 1;j++)
				{
					if (a.charAt(i) == b.charAt(j) && c[j] == 0)
					{
						c[j] = 1;
						break;
					}
				}
			}
			for (i = 0;i <= l1 - 1;i++)
			{
				if (c[i] == 0)
				{
					break;
				}
			}
			if (i == l1)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}
}

