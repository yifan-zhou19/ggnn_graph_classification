package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String substr = new String(new char[50]);
		String r = new String(new char[50]);
		str = new Scanner(System.in).nextLine();
		substr = new Scanner(System.in).nextLine();
		r = new Scanner(System.in).nextLine();
		int i;
		int j;
		int n;
		int same = 0;
		int l = substr.length();
		for (i = 0;str.charAt(i) != 0;i++)
		{
			if (substr.charAt(0) == str.charAt(i))
			{
				same = 1;
				for (j = 1;substr.charAt(j) != 0;j++)
				{
					if (substr.charAt(j) != str.charAt(i + j))
					{
						same = 0;
						break;
					}
				}
				if (same == 1)
				{
					n = i;
					break;
				}
			}
		}
		if (same == 1)
		{
			for (j = 0;j < n;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.printf("%s",r);
			for (j = n + l;str.charAt(j) != 0;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
		}
		if (same == 0)
		{
			System.out.printf("%s",str);
		}
		return 0;
	}

}
