package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		char[][] w = new char[100][10];
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
				w[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i] = String.valueOf(w[i]).length();
				if (w[i][a[i] - 1] == 'r')
				{
				b[i] = a[i] - 2;
				}
				if (w[i][a[i] - 1] == 'y')
				{
					b[i] = a[i] - 2;
				}
				if (w[i][a[i] - 1] == 'g')
				{
					b[i] = a[i] - 3;
				}
				for (j = 0;j < b[i];j++)
				{
					System.out.printf("%c",w[i][j]);
				}
			System.out.print("\n");
		}
		return 0;
	}

}

