package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		int i;
		int k;
		int len;
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (len = 2;len <= l;len++)
		{
			for (i = 0;i <= l - len;i++)
			{
				if (a.charAt(i) == a.charAt(i + len - 1))
				{
					for (k = 1;k <= len / 2;k++)
					{
						if (a.charAt(k + i) != a.charAt(i + len - 1 - k))
						{
							break;
						}
					}
					if (k > len / 2)
					{
						for (k = i;k < i + len;k++)
						{
							System.out.printf("%c",a.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}
