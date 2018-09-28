package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int j;
		int k;
		int q;
		int flag = 0;
		String a = new String(new char[500]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 2; i <= len; i++)
		{
			for (j = 0; j <= len - i; j++)
			{
				k = 0;
				while (a.charAt(j + k) == a.charAt(j + i - 1 - k) && k < i)
				{
					k++;
				}
				if (k == i)
				{
					if (flag == 0)
					{
						flag = 1;
					}
					else
					{
						System.out.print('\n');
					}
					for (q = 0; q < i; q++)
					{
						System.out.print(a.charAt(j + q));
					}
				}
			}
		}
		return 0;
	}
}

