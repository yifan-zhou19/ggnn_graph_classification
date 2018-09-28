package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int k;
		int s;
		int l;
		int flag;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		for (i = 2; i <= l; i++)
		{
			for (j = 0; j <= l - i; j++)
			{
				flag = 1;
				for (k = 0; k < i / 2; k++)
				{
					if (a.charAt(j + k) != a.charAt(j + i - k - 1))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					for (s = 0; s < i; s++)
					{
						System.out.print(a.charAt(j + s));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

