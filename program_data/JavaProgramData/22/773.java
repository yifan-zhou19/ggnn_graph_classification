package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int n;
		int k = 1;
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c != ',')
			{
				break;
			}
		}
		n = i + 1;
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == b[j])
				{
					break;
				}
				if (j == i - 1)
				{
					b[k] = a[i];
					k++;
				}
			}
		}
		if (k == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				for (j = 0;j < k - i - 1;j++)
				{
					if (b[j] < b[j + 1])
					{
						b[j] = b[j] + b[j + 1];
						b[j + 1] = b[j] - b[j + 1];
						b[j] = b[j] - b[j + 1];
					}
				}
			}
		System.out.printf("%d",b[1]);
		}
		return 0;
	}
}

