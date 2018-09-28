package <missing>;

public class GlobalMembers
{
	//*************************
	//*??????  1200062705
	//*????4.????
	//*???2012-11-18
	//*************************
	public static int Main()
	{
		int i;
		int j;
		int p;
		int n;
		String string = new String(new char[501]); // ??????
		String = ConsoleInput.readToWhiteSpace(true);
		n = String.length(); // ?????
		for (i = 2; i <= n; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (p = 0; p < i / 2; p++)
				{
					if (String[j + p] != string.charAt(j + i - p - 1))
					{
						break;
					}
				}
					if (p == i / 2)
					{
						for (p = j; p < j + i; p++)
						{
							System.out.print(String[p]);
						}
						System.out.print("\n");
					}
			}
		}
	return 0;
	}


}

