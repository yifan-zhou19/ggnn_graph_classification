package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***???????***
	//***??????***
	//***???2012.1.11***
	//*************************************************
	public static int Main()
	{
		int i;
		int j;
		int k;
		int flag;
		String a = new String(new char[501]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 1; a.charAt(i) != '\0'; i++)
		{
			for (j = 0; a.charAt(j) != '\0'; j++)
			{
				flag = 1;
				for (k = 0;j + i - k >= j + k; k++)
				{
					if (a.charAt(j + i - k) != a.charAt(j + k))
					{
						flag = 0;
					}
				}
				if (flag == 1)
				{
					for (k = 0; k <= i; k++)
					{
						System.out.print(a.charAt(j + k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

