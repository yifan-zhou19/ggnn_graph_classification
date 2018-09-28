package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int i;
		int n;
		int b;
		int j;
		int k;
		int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	n = s.length();

	for (i = 2;i <= n;i++)
	{

		for (k = 0;k <= n - i;k++)
		{
			b = 0;
			for (j = 0;j < i;j++)
			{
				if (s.charAt(k + j) == s.charAt(k + i - j - 1))
				{
					b++;
				}
			}
				if (b == i)
				{
					for (x = k;x < k + j;x++)
					{
	System.out.printf("%c",s.charAt(x));
					}
	System.out.print("\n");
				}
		}
	}




				return 0;
	}

}

