package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int len;
		int L = 0;
		char[][] ori = new char[300][42];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ori[i] = tempVar2.charAt(0);
			}
		}
		System.out.printf("%s",ori[0]);
		L += String.valueOf(ori[0]).length();
		for (i = 1;i < n;i++)
		{
			L += String.valueOf(ori[i]).length() + 1;
			if (L > 80)
			{
				L = 0;
				System.out.printf("\n%s",ori[i]);
				L += String.valueOf(ori[i]).length();
			}
			else
			{
				System.out.printf(" %s",ori[i]);
			}
		}


		return 0;
	}
}

