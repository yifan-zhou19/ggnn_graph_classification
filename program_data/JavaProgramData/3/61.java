package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int[] m = new int[1000];
		int s = 0;
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
			for (j = i - 1;j >= 0;j--)
			{
				if (m[i] + m[j] == k)
				{
					s++;
				}
			}
		}
		if (s > 0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}

}

