package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[600]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int L;
		int t;
		L = a.length();
		int i;
		int j;
		int k;
		int p;
		for (i = 2;i <= L;i++)
		{
			if (i % 2 == 0)
			{
				for (j = i / 2 - 1;j <= L - i / 2;j++)
				{
					t = 0;
					for (k = 0;k < i / 2;k++)
					{
						if (a.charAt(j - k) != a.charAt(j + k + 1))
						{
							t = 1;
						break;
						}
					}
					if (t == 0)
					{
						for (p = j - i / 2 + 1;p <= j + i / 2;p++)
						{
							System.out.printf("%c",a.charAt(p));
						}

						System.out.print("\n");
					}
				}
			}
		}






		return 0;
	}




}

