package <missing>;

public class GlobalMembers
{
	/*
	 * ????huiwenzichuan.cpp
	 * ?????
	 * ????: 2011-12-28
	 * ???????
	 */
	public static int Main()
	{
		String a = new String(new char[500]); //????
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,j,k,l;
		int i; //????
		int j;
		int k;
		int l;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (k = 2;k < a.length() + 1;k++) //????
		{
			for (i = 0;i < a.length() - k + 1;i++) //??
			{
				for (j = i;j < i + k;j++) //???????
				{
					if (a.charAt(j) != a.charAt(2 * i + k - 1 - j))
					{
						break; //?????????????
					}
					else if (j >= 2 * i + k - 1 - j)
					{
						for (l = i;l < i + k;l++)
						{
							System.out.print(a.charAt(l));
						}
						System.out.print("\n");
						break;
					} //?????????
				}
			}
		}
		return 0; //????
	}


}

