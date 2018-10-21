package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		char len;
		char i;
		String p1;
		String p2;
		p1 = a;
		p2 = b;
		for (i = 0;i < 101;i++)
		{
			*(p1 + i) = '\0';
			*(p2 + i) = '\0';
		}

		p1 = new Scanner(System.in).nextLine();
		len = a.length();

		for (i = 0;i < len;i++)
		{
			if (i != len - 1)
			{
				*(p2 + i) = *(p1 + i) + *(p1 + i + 1);
			}
			else
			{
				*(p2 + i) = *(p1 + i) + (p1);
			}
		}

		System.out.println(p2);
		return 0;
	}

}
