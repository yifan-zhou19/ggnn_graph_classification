package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String b = new String(new char[300]);
		int i;
		int j;
		int n = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		final String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		for (i = 0;i < 52;i++)
		{
			for (j = 0;b.charAt(j) != '\0';j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					n = n + 1;
				}
			}
			if (n != 0)
			{
				m = m + 1;
				System.out.printf("%c=",a.charAt(i));
				System.out.printf("%d",n);
				System.out.print("\n");

			}
			n = 0;
		}
		if (m == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

