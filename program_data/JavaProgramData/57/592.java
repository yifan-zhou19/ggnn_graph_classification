package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String former = new String(new char[50]);
		int n;
		int j;
		int i;
		int[] q = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			former = new Scanner(System.in).nextLine();
			q[i] = former.length();
			if (former.charAt(q[i] - 1) == 'y' || former.charAt(q[i] - 1) == 'r')
			{
				for (j = 0;j < q[i] - 2;j++)
				{
					System.out.printf("%c",former.charAt(j));
				}
			}
			if (former.charAt(q[i] - 1) == 'g')
			{
				for (j = 0;j < q[i] - 3;j++)
				{
					System.out.printf("%c",former.charAt(j));
				}
			}
			if (i != 0 && i != n)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

