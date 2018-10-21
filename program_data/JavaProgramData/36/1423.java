package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		int[] flag = new int[100];
		int i = 0;
		int j = 0;
		int flag1 = 0;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.in.read();
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n = s.length();
		int m = a.length();
		if (n != m)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				int flag2 = 0;
				for (j = 0;j < n;j++)
				{
					if (flag[j] != 0)
					{
						continue;
					}
					else if (s.charAt(i) == a.charAt(j))
					{
						flag[j] = 1,flag2 = 1;
						break;
					}
				}
				if (flag2 == 0)
				{
					flag1 = 1;
				}
			}
			if (flag1 == 1)
			{
				System.out.print("NO");
				System.out.print("\n");
				return 0;
			}
			else
			{
				System.out.print("YES");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

