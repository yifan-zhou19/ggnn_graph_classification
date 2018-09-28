package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????               **
	//*??????                 **
	//*???2012.11.10             **
	//*******************************/


	public static int Main()
	{
		String str = new String(new char[500]);
		int i;
		int j;
		int k;
		int length;
		int flag = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = str.length();
		for (i = 1; i <= length - 1; i++)
		{
			for (j = 0; j < length - i; j++)
			{
				if (str.charAt(j) == str.charAt(j + i))
				{
					for (k = 0; k <= (i / 2); k++)
					{
						if (str.charAt(j + k) != str.charAt(i + j - k))
						{
							flag = 1;
							break;
						}
					}
					for (k = j; (k <= j + i) && (flag == 0); k++)
					{
						System.out.print(str.charAt(k));
					}
					if (flag == 1)
					{
						flag = 0;
					}
					else
					{
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}


}

