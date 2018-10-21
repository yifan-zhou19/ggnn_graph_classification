package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int j;
		int k = 0;
		int[] d = new int[100];
		int p;
		char[][] b = new char[100][10];
		String c = new String(new char[10]);
		char[][] str = new char[100][10];
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
				str[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 60)
			{
				d[k] = a[i];
				b[k] = str[i];
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (d[j] < d[j + 1])
				{
					p = d[j + 1];
					d[j + 1] = d[j];
					d[j] = p;

					c = b[j + 1];
					b[j + 1] = b[j];
					b[j] = c;

				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",b[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < 60)
			{
				System.out.printf("%s\n",str[i]);
			}
		}
	}
}

