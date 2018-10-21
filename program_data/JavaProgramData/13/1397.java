package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag;
		int[] a = new int[MAX];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 1;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			flag = 1;
			for (j = i - 1;j >= 0;j--)
			{
				if (a[i] == a[j])
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				if (i > 1)
				{
				   System.out.printf(" %d",a[i]);
				}
				else
				{
					System.out.printf("%d",a[i]);
				}
			}
		}
		return 0;
	}




}

