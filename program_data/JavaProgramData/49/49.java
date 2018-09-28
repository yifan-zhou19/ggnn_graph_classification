package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ? ?                           *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 11 ? 24 ?                   * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static String a = new String(new char[501]); //??a??????
	public static int Judge(int b, int e) //????Judge??a????b???e???????
	{
		int k = (b + e - 1) / 2;
		int i;
		for (i = b; i <= k; i++)
		{
			if (a.charAt(i) != a.charAt(b + e - i))
			{
				break;
			}
		}
		if (i == k + 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int l;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		for (int i = 2; i <= l; i++) //?????2?l??
		{
			for (int j = 0; j <= l - i; j++) //?????????????
			{
				if (Judge(j, j + i - 1) != 0)
				{
					for (int k = j; k < i + j; k++)
					{
						System.out.print(a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

