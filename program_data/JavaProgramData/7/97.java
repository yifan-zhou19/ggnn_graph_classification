package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);

		int wz = -1;
		int len1;
		int len2;
		int i;
		int j;
		int x;

		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		len1 = str.length();
		len2 = sub.length();
		for (i = 0;i < len1;i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				x = 1;
				wz = i;
				for (j = 0;j < len2;i++,j++)
				{
					if (sub.charAt(j) != str.charAt(i))
					{
						x = 0;
						i = wz;

						break;
					}
				}
				if (x != 0)
				{
					break;
				}
			}
		}
		if (wz == -1)
		{
			System.out.printf("%s",str);
		}
		else
		{
			for (i = 0;i < wz;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",rep);
			for (i += len2;i < len1;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}

}
