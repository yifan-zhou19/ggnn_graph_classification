package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ? ? ?                        *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 11 ? 17 ?                   * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{
		String aa = new String(new char[101]); //?????????
		String bb = new String(new char[101]);
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		int n;
		int la;
		int lb;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			aa = ConsoleInput.readToWhiteSpace(true).charAt(0);
			bb = ConsoleInput.readToWhiteSpace(true).charAt(0);
			la = aa.length();
			lb = bb.length();
			for (int j = 0; j < la; j++) //???????????
			{
				a[j] = aa.charAt(j) - 48;
			}
			for (int j = 0; j < lb; j++)
			{
				b[j] = bb.charAt(j) - 48;
			}
			for (int j = 1; j <= lb; j++) //????????????
			{
				c[la - j] = a[la - j] - b[lb - j];
			}
			for (int j = 0; j < la - lb; j++) //b?????????0??????
			{
				c[j] = a[j];
			}
			for (int j = la - 1; j > 0; j--) //??????0??????10??????1(????
			{
				if (c[j] < 0)
				{
					c[j] += 10;
					c[j - 1] -= 1;
				}
			}
			int k;
			for (int j = 0; j < la; j++) //???????0??
			{
				if (c[j] != 0)
				{
					k = j;
					break;
				}
			}
			for (int j = k; j < la; j++) //????
			{
				System.out.print(c[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

