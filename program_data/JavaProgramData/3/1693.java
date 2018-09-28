package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int a;
		int m = 0;
		int[] s1 = new int[1000];
		int[] s2 = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s1[i] = Integer.parseInt(tempVar3);
			}
			s2[i] = s1[i];
		}
		for (i = 0;i < (n - 1);i++)
		{
			for (a = (i + 1);a < n;a++)
			{
				if (s1[i] + s2[a] == k)
				{
					m++;
				}
			}
		}
		if (m > 0)
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

