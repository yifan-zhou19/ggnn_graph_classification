public class stu
{
	public String name = new String(new char[21]);
	public int avs;
	public int pys;
	public char gb;
	public char xb;
	public int lw;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100);

	public static int Main()
	{
		int n;
		int i;
		int max;
		int maxstu;
		int sum;
		int[] jj = new int[100];

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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].avs = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].pys = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lw = Integer.parseInt(tempVar7);
			}
			jj[i] = 0;
			if (stu[i].avs > 80 && stu[i].lw > 0)
			{
				jj[i] += 8000;
			}
			if (stu[i].avs > 85 && stu[i].pys > 80)
			{
				jj[i] += 4000;
			}
			if (stu[i].avs > 90)
			{
				jj[i] += 2000;
			}
			if (stu[i].avs > 85 && stu[i].xb == 'Y')
			{
				jj[i] += 1000;
			}
			if (stu[i].pys > 80 && stu[i].gb == 'Y')
			{
				jj[i] += 850;
			}
		}

		max = jj[0];
		maxstu = 0;
		sum = jj[0];
		for (i = 1;i < n;i++)
		{
			if (jj[i] > max)
			{
				max = jj[i];
				maxstu = i;
			}
			sum += jj[i];
		}

		System.out.printf("%s\n%d\n%d\n",stu[maxstu].name,max,sum);
	}
}

