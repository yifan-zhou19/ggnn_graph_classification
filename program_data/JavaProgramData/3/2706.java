package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] c = new int[1000];
		int i = 0;
		int j = 0;
		int A = 0;
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
		while (i < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			i++;
		}
		i = 0;
		while (i < n)
		{
			j = i + 1;
			while (j < n)
			{
				if (c[i] + c[j] == k)
				{
					A = 1;
				}
				j++;
			}
			i++;
		}
		if (A == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

