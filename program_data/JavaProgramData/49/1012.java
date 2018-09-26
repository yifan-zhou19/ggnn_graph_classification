package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		String a = new String(new char[500]);
		int i = 0;
		int j = 0;
		int k = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = a.length();
		for (i = 2; i <= l; i++)
		{
			for (j = 0; j <= l - i; j++)
			{
				int flag = 1;
				for (k = j; k < j + i; k++)
				{
					if (a.charAt(k) != a.charAt(j + i + j - k - 1))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
				for (k = j; k < i + j; k++)
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

