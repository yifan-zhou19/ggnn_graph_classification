package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int n;
		int 1 = 1;
		int[] left = new int[10000];
		int[] right = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (1 != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			left[a]++;
			right[b]++;
			if (a == 0 && b == 0)
			{
				break;
			}
		}
		left[0] = left[0] - 1;
		right[0] = right[0] - 1;
		for (i = 0;i < n;i++)
		{
			if (right[i] == n - 1 && left[i] == 0)
			{
				System.out.printf("%d\n",i);
				1 = 0;
			}
		}
		if (1 != 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}
}

