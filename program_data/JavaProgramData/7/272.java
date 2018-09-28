package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int m;
		int p;
		int e;
		String sz = new String(new char[1000]);
		String sf = new String(new char[1000]);
		String sc = new String(new char[1000]);
		sz = new Scanner(System.in).nextLine();
		sf = new Scanner(System.in).nextLine();
		sc = new Scanner(System.in).nextLine();
		int len = sz.length();
		int len1 = sf.length();
		for (i = 0;i < len;i++)
		{
			e = 0;
			if (sz.charAt(i) == sf.charAt(0))
			{
		for (k = 0;k < len1;k++)
		{
			if (sz.charAt(i + k) == sf.charAt(k))
			{
				e++;
			}
		}

		if (e == len1)
		{
	for (m = 0;m < i;m++)
	{
		System.out.printf("%c",sz.charAt(m));
	}
	System.out.printf("%s",sc);
	for (p = i + len1;p < len;p++)
	{
		System.out.printf("%c",sz.charAt(p));
	}

	break;
		}
			}
		}
		if (e != len1)
		{
			System.out.printf("%s",sz);
		}
			return 0;
	}




}
