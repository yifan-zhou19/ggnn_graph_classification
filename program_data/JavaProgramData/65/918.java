package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz1 = new int[200];
		int[] sz2 = new int[200];
		int n;
		int i;
		int s1 = 0;
		int s2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz1[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(sz2[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((sz1[i] == 0 && sz2[i] == 1) || (sz1[i] == 1 && sz2[i] == 2) || (sz1[i] == 2 && sz2[i] == 0))
			{
				s1 += 1;
			}
			if ((sz1[i] == 1 && sz2[i] == 0) || (sz1[i] == 2 && sz2[i] == 1) || (sz1[i] == 0 && sz2[i] == 2))
			{
				s2 += 1;
			}
		}
		if (s1 > s2)
		{
			System.out.print("A");

		}
		if (s1 < s2)
		{
			System.out.print("B");
		}
		if (s1 == s2)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

