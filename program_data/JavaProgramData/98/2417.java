package <missing>;

public class GlobalMembers
{
	public static char[][] dat = new char[1000][41];
	public static int Main()
	{
		int l1;
		int cou;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l1 = 1;l1 <= n;l1++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dat[l1] = tempVar2.charAt(0);
			}
		}

		System.out.printf("%s",dat[1]);
		cou = String.valueOf(dat[1]).length();
		for (l1 = 2;l1 <= n;l1++)
		{
			if (cou + String.valueOf(dat[l1]).length() + 1 > 80)
			{
					System.out.printf("\n%s",dat[l1]);
					cou = String.valueOf(dat[l1]).length();
			}
			else
			{
					System.out.printf(" %s",dat[l1]);
					cou += String.valueOf(dat[l1]).length() + 1;
			}
		}

		return 0;
	}

}

