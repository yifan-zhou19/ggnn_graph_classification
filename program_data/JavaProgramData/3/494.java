package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[1000];
		int i;
		int j;
		int k;
		int jud = 0;
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
			for (j = i;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
				jud = 1;
				break;
				}
			}
			if (jud != 0)
			{
				break;
			}
		}
		if (jud != 0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}

