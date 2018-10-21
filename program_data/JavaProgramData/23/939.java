package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		int n;
		int i;
		int m;
		str1 = new Scanner(System.in).nextLine();
		n = str1.length();
		for (i = n - 1;i >= 0;i--)
		{
			if (str1.charAt(i) == ' ')
			{
				for (m = i + 1;m < n;m++)
				{
					System.out.printf("%c",str1.charAt(m));
				}
					n = i;
					System.out.print(" ");
			}
		}
		for (m = 0;m < n;m++)
		{
		System.out.printf("%c",str1.charAt(m));
		}

		return 0;
	}

}
