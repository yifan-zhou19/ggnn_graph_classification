package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[1000];
		char[][] a = new char[1000][256];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			b[i] = String.valueOf(a[i]).length();
		}
		 for (i = 0;i < n;i++)
		 {
			for (j = 0;j < b[i];j++)
			{
				if (a[i][j] == 'A')
				{
					System.out.print("T");
				}
				if (a[i][j] == 'T')
				{
					System.out.print("A");
				}
				if (a[i][j] == 'G')
				{
					System.out.print("C");
				}
				if (a[i][j] == 'C')
				{
					System.out.print("G");
				}
			}
			  System.out.print("\n");
		 }
		return 0;
	}
}

