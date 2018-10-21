package <missing>;

public class GlobalMembers
{
	//*********************
	//* ??? ??13     *
	//* ??? 1200012878 *
	//* 11?16?          *
	//*********************
	public static int Main()
	{
		String a = new String(new char[101]);
		int[] num = new int[101];
		int[] b = new int[101];
		int len;
		int flag = 0;
		int r;
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 0; i <= len - 1; i++)
		{
			num[i] = a.charAt(i) - '0';
		}
		r = 0;
		for (i = 0; i <= len - 1; i++)
		{
			b[i] = (r * 10 + num[i]) / 13;
			r = (r * 10 + num[i]) % 13;
		}
		for (i = 0; i <= len - 1; i++)
		{
			if (b[i] != 0 || flag == 1)
			{
				System.out.print(b[i]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		System.out.print(r);
		System.out.print("\n");
		return 0;
	}


}

