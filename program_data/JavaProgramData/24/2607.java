package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] num = new int[1000];
		char[][] a = new char[1000][100];
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
			num[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (num[j] > num[j - 1])
				{
					k = num[j];
					num[j] = num[j - 1];
					num[j - 1] = k;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (String.valueOf(a[i]).length() == num[0])
			{
				System.out.printf("%s\n",a[i]);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (String.valueOf(a[i]).length() == num[n - 1])
			{
				System.out.printf("%s\n",a[i]);
				break;
			}
		}
		return 0;
	}
}

