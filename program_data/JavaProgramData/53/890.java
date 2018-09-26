package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[300];
		int i;
		int j;
		int num;
		int k = 1;
		int[] a = new int[300];
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  n[i] = Integer.parseInt(tempVar2);
			  }
		}
		for (i = 1;i < num;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (n[i] == n[j])
				{
					n[i] = -1;
				}
			}
		}
		for (i = 0;i <= num - 1;i++)
		{
			if (n[i] >= 0)
			{
				a[k] = n[i];
				k++;
				p++;
			}
		}
		for (k = 1;k < p;k++)
		{
			System.out.printf("%d,",a[k]);
		}
		System.out.printf("%d",a[p]);

		return 0;
	}


}

