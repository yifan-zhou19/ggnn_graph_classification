package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[310];
		int i;
		int j;
		int k = 0;
		int t;
		int n;
		int num;
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
				num = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < i;j++)
			{
				t = 1;
				if (a[j] == num)
				{
					t = 0;
					break;
				}
			}
			if (i == 0)
			{
				a[k++] = num;
			}
			else
			{
				if (t == 1)
				{
					a[k++] = num;
				}
			}
		}
		if (k == 1)
		{
			System.out.printf("%d\n",a[0]);
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < k;i++)
			{
				System.out.printf(",%d",a[i]);
			}
			System.out.print('\n');
		}
		return 0;
	}



}

