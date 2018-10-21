package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k = 0;
		int[] b = new int[100];
		int c = 0;
		int eb;
		char[][] a = new char[100][10];
		String ea = new String(new char[10]);
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
		for (i = n - 1;i > j;i--)
		{
			if (b[i] > b[i - 1] && b[i] >= 60)
			{
				eb = b[i];
				b[i] = b[i - 1];
				b[i - 1] = eb;
				ea = a[i];
				a[i] = a[i - 1];
				a[i - 1] = ea;
			}
		}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
		return 0;
	}
}

