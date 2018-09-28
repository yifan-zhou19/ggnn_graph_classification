package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] as = new int[1000];
		int n;
		int k;
		int c;
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
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(as[i]) = Integer.parseInt(tempVar3);
			}
		}
		int d = 0;
		for (int j = 0;j < n;j++)
		{
			for (int l = 0;l < n;l++)
			{
				c = as[j] + as[l];
				if (c == k)
				{
					System.out.print("yes");
					d++;
					break;
				}
			}
			if (c == k)
			{
				break;
			}
		}
		if (d == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

