package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String mun = new String(new char[100]);
		int i;
		int len;
		int mod = 0;
		int flag = 0;
		mun = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = mun.length();
		for (i = 0; i < len; i++)
		{
			mod = mod * 10 + mun.charAt(i) - '0';
			if (flag == 0 && (mod / 13) == 0)
			{
				continue;
			}
			else
			{
				System.out.print(mod / 13);
				flag = 1;
			}
			mod = mod % 13;
		}
		if (flag == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		System.out.print(mod);
		System.out.print("\n");
		return 0;
	}


}

