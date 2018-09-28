package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int i;
		int temp1;
		int temp2;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				temp2 = Integer.parseInt(tempVar3);
			}
			if (temp1 == 0 && temp2 == 0)
			{
				break;
			}
			else
			{
				a[temp1] = 0;
				a[temp2]++;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] == n - 1)
			{
				p++;
				System.out.printf("%d\n",i);
			}
		}
		if (p == 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}
}

