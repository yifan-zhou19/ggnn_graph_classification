package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz1 = new int[200];
		int[] sz2 = new int[200];
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz1[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz2[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (int k = 0;k < n;k++)
		{
		if (((sz1[k] - sz2[k]) == 1) || ((sz2[k] - sz1[k]) == 2))
		{
			b++;
		}
		else if (((sz2[k] - sz1[k]) == 1) || ((sz1[k] - sz2[k]) == 2))
		{
			a++;
		}
		else if (sz2[k] == sz1[k])
		{
			c++;
		}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (b > a)
		{
			System.out.print("B");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;
	}


}

