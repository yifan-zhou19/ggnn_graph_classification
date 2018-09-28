package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);

		int i;
		int n;
		int k;
		int j;
		int flag;
		int nf = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 2;i <= n;i++)
		{
			for (j = 0;j < n - i + 1;j++)
			{
				flag = 1;
				for (k = 0;k < i / 2;k++)
				{
					if (a.charAt(j + k) != a.charAt(j + i - 1 - k))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
						if (nf != 0)
						{
							System.out.print("\n");
						}
						for (k = 0;k < i;k++)
						{
							System.out.printf("%c",a.charAt(j + k));
						}

						nf = 1;
				}
			}
		}
		return 0;
	}
}
