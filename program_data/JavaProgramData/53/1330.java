package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		int[] a = new int[301];
		int n;
		int t;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			flag = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < k;j++)
			{
				if (t == a[j])
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				a[k++] = t;
			}
		}
		if (k > 1)
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
		}
		System.out.printf("%d\n",a[k - 1]);
	}
}

