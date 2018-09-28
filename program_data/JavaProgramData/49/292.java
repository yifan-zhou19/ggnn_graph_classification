package <missing>;

public class GlobalMembers
{
	/*????????
	  ????00948344 ??
	  ?????2010//12/31
	*/


	public static int Main()
	{
		String str = new String(new char[500]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int k;
		int l;
		int len;
		len = str.length();
		for (i = 2;i < len;i++)
		{
			for (j = 0;j < len + 1 - i;j++)
			{
				for (k = j,l = j + i - 1;k < l;k++,l--)
				{
					if (str.charAt(k) != str.charAt(l))
					{
						break;
					}
				}
				if (k >= l)
				{
					for (k = j;k < j + i;k++)
					{
						System.out.print(str.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

