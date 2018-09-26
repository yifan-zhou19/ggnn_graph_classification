package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int m;
		int n;
		int i;
		int j;
		int account;
		m = a.length();
		n = b.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(0) == b.charAt(i))

			{
				account = i;
				for (j = 1,i;j < m,i < n;j++,i++)
				{
					if (a.charAt(j) != b.charAt(i + 1))
					{
						break;
					}

				}
	if (j = (m - 1))
	{

		 System.out.printf("%d\n",account);
	}

			}
		}


		return 0;
	}

}

