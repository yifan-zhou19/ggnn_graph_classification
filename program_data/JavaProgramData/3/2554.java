package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] a = new int[1000];
		int i;
		int s = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					System.out.print("yes");
					s++;
					break;
				}
			}
			if (s != 0)
			{
				break;
			}
		}
		if (s == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

