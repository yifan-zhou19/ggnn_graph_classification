package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int flag;
		int i;
		int j;
		String c = new String(new char[100]);
		String b = new String(new char[2]);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = c.length();
		b = tangible.StringFunctions.changeCharacter(b, 0, c.charAt(0));
		b = tangible.StringFunctions.changeCharacter(b, 1, c.charAt(n - 1));
		for (int k = 1;k <= n / 2;k++)
		{
			flag = 0;
			for (i = 0;i < n;i++)
			{
				if (a[i] == 0 && c.charAt(i) == b.charAt(0))
				{
					for (j = i + 1;;j++)
					{
						if (c.charAt(j) == b.charAt(0) && a[j] == 0)
						{
							break;
						}
						if (a[j] == 0 && c.charAt(j) == b.charAt(1))
						{
							a[j] = 1;
							a[i] = 1;
							flag = 1;
							System.out.print("\n");
							System.out.print(i);
							System.out.print(" ");
							System.out.print(j);
							break;
						}
					}
					if (flag != 0)
					{
						break;
					}
				}
			}
		}
		return 0;
	}
}

