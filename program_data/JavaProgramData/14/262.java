public class stu
{
	public int num;
	public int ch;
	public int ma;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] score = new int[100000];
		int[] max = new int[2];
		stu[] STU = tangible.Arrays.initializeWithDefaultstuInstances(100000);
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
				STU[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				STU[i].ch = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				STU[i].ma = Integer.parseInt(tempVar4);
			}
			score[i] = STU[i].ch + STU[i].ma;
		}
		for (j = 0;j < 3;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (score[i] > max[1])
				{
					max[0] = STU[i].num;
					max[1] = score[i];
				}
			}
			System.out.printf("%d %d\n",max[0],max[1]);
			max[1] = 0;
			int temp = max[0];
			score[temp - 1] = 0;
		}
		return 0;
	}

}

