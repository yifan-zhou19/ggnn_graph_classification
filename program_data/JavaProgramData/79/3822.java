package <missing>;

public class GlobalMembers
{
	public static void king(int n,int m)
	{
		int i;
		int j = 1;
		int[] a = new int[300];
		int k = 1;
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		while (n > 1)
		{
			j = (j - 1 + m) % n;
			if (j != 0)
			{
				for (i = j;i < n;i++)
				{
					a[i] = a[i + 1];
				}
			}
				else
				{
					j = 1;
				}
				n = n - 1;
		}
		System.out.printf("%d\n",a[1]);
	}
	public static void Main()
	{
		int[] n = new int[30];
		int[] m = new int[30];
		int i;
		int j = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[j] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[j] = Integer.parseInt(tempVar2);
			}
			j++;
		}while (n[j - 1] != 0 && m[j - 1] != 0);
		for (i = 0;i < j - 1;i++)
		{
			king(n[i], m[i]);
		}
	}

}

