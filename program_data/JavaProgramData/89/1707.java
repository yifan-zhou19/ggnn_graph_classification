package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] p = new int[10000];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
			else
			{
				p[i] = -n;
				p[j] += 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] == n - 1)
			{
				System.out.printf("%d\n",i);
				sum = sum + 1;
			}
		}
		if (sum == 0)
		{
			System.out.print("NOT FOUND\n");
		}
	}
}

