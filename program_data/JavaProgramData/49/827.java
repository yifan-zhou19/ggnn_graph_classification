package <missing>;

public class GlobalMembers
{
	//***********************
	//??????**
	//???4.cpp**
	//???2012.11.16**
	//***********************

	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		String a = new String(new char[500]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = a.length();
		for (i = 2; i <= n; i++)
		{
			for (j = 0; j <= n - i; j++)
			{
				for (k = j; k <= j + i / 2; k++)
				{
					if (a.charAt(k) == a.charAt(i + 2 * j - 1 - k))
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if (k > j + i / 2)
				{
					for (k = j; k < j + i; k++)
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

