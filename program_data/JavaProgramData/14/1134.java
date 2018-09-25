public class stu
{
	public int id;
	public int chn;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu[] indi = tangible.Arrays.initializeWithDefaultstuInstances(100000);
		int n;
		int i;
		int j;
		int[] rank = new int[3];
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
				indi[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				indi[i].chn = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				indi[i].math = Integer.parseInt(tempVar4);
			}
			indi[i].sum = indi[i].chn + indi[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			rank[i] = 0;
			for (j = 0;j < n;j++)
			{
				if (indi[j].sum > indi[rank[i]].sum)
				{
					rank[i] = j;
				}
			}
			indi[rank[i]].sum = -indi[rank[i]].sum;
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",indi[rank[i]].id,-indi[rank[i]].sum);
		}


		return 0;
	}

}

