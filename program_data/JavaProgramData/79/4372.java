package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[301];
		int[] b = new int[50];
		int i;
		int j;
		int k;
		int x;
		int[] n = new int[50];
		int[] m = new int[50];
		int c;
		int d;
		for (k = 1;k <= 50;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[k] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[k] = Integer.parseInt(tempVar2);
			}
			if (n[k] == 0)
			{
				break;
			}
		}
		for (k = 1;;k++)
		{
			if (n[k] == 0)
			{
				break;
			}
			for (i = 1;i <= n[k];i++)
			{
				a[i] = i;
			}
			i = 1;
			for (j = n[k];j >= 2;j--)
			{
				i = (i + m[k] - 2) % j + 1;
				for (x = i;x <= j - 1;x++)
				{
					a[x] = a[x + 1];
				}
			}
			b[k] = a[1];
		}
		for (i = 1;i <= k - 1;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
	}

}

