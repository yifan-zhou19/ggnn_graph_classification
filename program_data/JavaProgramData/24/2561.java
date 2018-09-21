package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[200][20];
		int i;
		int n;
		int max = 0;
		int min = 20;
		int[] b = new int[200];
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
			b[i] = String.valueOf(a[i]).length();

		}
		for (i = 0;i < n;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
			if (min > b[i])
			{
				min = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				System.out.printf("%s\n",a[i]);
				break;
			}
		}
			for (i = 0;i < n;i++)
			{
			if (b[i] == min)
			{
				System.out.printf("%s\n",a[i]);
				break;
			}
			}
		return 0;
	}

}

