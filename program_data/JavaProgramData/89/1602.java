package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[9999];
		int[] b = new int[9999];
		int flag;
		for (i = 0;i < 9999;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		j = 1;
		for (;;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			if (i == 0 && j == 0)
			{
				break;
			}
			a[j]++;
			b[i]++;
		}
		flag = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] == n - 1 && b[i] == 0)
			{
			 System.out.printf("%d\n",i);
			 flag = 1;
			}
		}
		if (flag = 0)
		{
			System.out.print("NOT FOUND");
		}
	}

}

