package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		char[][] a = new char[100][100];
		String p = new String(new char[100]);
		String q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < a + n;p++)
		{
			*p = new Scanner(System.in).nextLine();
		}
		for (p = a;p < a + n;p++)
		{
			if (**p == '_' || ((**p >= 'a') && (**p <= 'z')) || ((**p >= 'A') && (**p <= 'Z')))
			{
				for (q = *p; q != 0;q++)
				{
					if (q == '_' || ((q >= 'a') && (q <= 'z')) || ((q >= 'A') && (q <= 'Z')) || ((q >= '0') && (q <= '9')))
					{
					k = 1;
					}
					else
					{
						k = 0;
						break;
					}
				}
			}
			else
			{
			k = 0;
			}
			System.out.printf("%d\n",k);
		}
	}
}

