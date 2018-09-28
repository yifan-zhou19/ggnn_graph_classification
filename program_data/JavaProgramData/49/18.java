package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a;
		int b;
		int q;
		int w = 0;
		String s = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = s.length();
		a = n / 2;
		for (j = 1;j < a + 1;j++)
		{
			k = j;
			for (i = 0;i < n - 1;i++)
			{
				for (b = 0;b < k;b++)
				{
					w = 0;
					if (s.charAt(i + b) == s.charAt(i + 2 * k - b - 1))
					{
						;
					}
					else
					{
						w = 1;
						break;
					}
				}
				if (b == k)
				{
					for (q = 0;q < j * 2;q++)
					{
						System.out.printf("%c",s.charAt(i + q));
					}
					System.out.print("\n");
				}
			}

		}
		return 0;
	}
}

