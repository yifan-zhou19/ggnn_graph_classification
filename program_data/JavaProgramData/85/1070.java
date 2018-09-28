package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int i;
		int b;
		int j;
		String a = new String(new char[21]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n + 1; i++)
		{
			a = new Scanner(System.in).nextLine();
			x = 0;
			if (a.charAt(0) == 95 || (a.charAt(0) >= 65 && a.charAt(0) <= 90) || (a.charAt(0) >= 97 && a.charAt(0) <= 122))
			{
			}
			else
			{
				x = 1;
			}
			b = a.length();
			for (j = 1; j < b; j++)
			{
				if ((a.charAt(j) >= '0' && a.charAt(j) <= '9') || a.charAt(j) == 95 || (a.charAt(j) >= 65 && a.charAt(j) <= 90) || (a.charAt(j) >= 97 && a.charAt(j) <= 122))
				{
				}
				else
				{
					x = 1;
				}

			}
			if (i > 0)
			{
			if (x == 1)
			{
				System.out.print("no\n");
			}
			if (x == 0)
			{
				System.out.print("yes\n");
			}
			}
		}


		return 0;
	}
}

