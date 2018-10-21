package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] a = new int[300];
		int i;
		int j;
		int max = 0;
		int min = 100;
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
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i] = String.valueOf(c[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
			if (min > a[i])
			{
				min = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == max)
			{
				System.out.printf("%s\n",c[i]);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == min)
			{
				System.out.printf("%s\n",c[i]);
				break;
			}
		}
		return 0;
	}

}

