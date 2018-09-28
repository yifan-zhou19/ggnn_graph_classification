package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] a = new char[1000][50];
		int[] b = new int[1000];
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
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					k = b[j];
					b[j] = b[j + 1];
					b[j + 1] = k;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			k = String.valueOf(a[i]).length();
			if (k == b[n - 1])
			{
				System.out.printf("%s\n",a[i]);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			k = String.valueOf(a[i]).length();
			if (k == b[0])
			{
				System.out.printf("%s",a[i]);
				break;
			}
		}
	}

}

