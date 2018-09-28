package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] m = new int[1000];
		int i;
		int j;
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
			m[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (m[i] + m[j] == k)
				{
					break;
				}
			}
				if (j != n)
				{
					break;
				}
		}
		if (i == n)
		{
			System.out.print("no");
		}
			else
			{
			System.out.print("yes");
			}
			return 0;
	}











}

