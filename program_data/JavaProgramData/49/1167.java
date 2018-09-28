package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int k;
		int x;
		a = new Scanner(System.in).nextLine();
		//i?????????
		for (i = 2;i <= a.length();i++)
		{
			//j?????????
			for (j = 0;j <= (a.length() - i);j++)
			{
				x = 0;
				for (k = 0;k < i;k++)
				{
					if (a.charAt(j + k) != a.charAt(j + i - 1 - k))
					{
						x = 1;
						break;
					}
				}
				if (x == 0)
				{
					for (k = j;k < j + i;k++)
					{
						System.out.printf("%c",a.charAt(k));
					}
				}
				System.out.print("\n");
			}
		}
		return 0;
	}

}
