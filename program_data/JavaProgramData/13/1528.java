package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int n;
		int i;
		int num;
		int j;
		int flag;
		int k;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num = Integer.parseInt(tempVar3);
			}
			for (j = 0;j <= i - 1;j++)
			{
				if (num != a[j])
				{
				flag = 1;
				}
			 else
			 {
				 flag = 0;
				 break;
			 }
			}
		 if (flag == 1)
		 {
			 h++;
			 a[h] = num;
		 }
		}
		for (k = 0;k <= h - 1;k++)
		{
			System.out.printf("%d ",a[k]);
		}
		System.out.printf("%d",a[h]);
		return 0;
	}
}

