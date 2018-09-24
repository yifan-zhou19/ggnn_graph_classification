public class student
{
	public String name = new String(new char[20]);
	public int ave;
	public int cla;
	public char leader;
	public char west;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(200);
		int n;
		int i;
		int[] count = new int[200];
		int[] count2 = new int[200];
		int k;
		int j;
		int temp;
		int l;
		int all;
		int max;
		all = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			count[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].ave = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].cla = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
			if (stu[i].ave > 80 && stu[i].paper >= 1)
			{
				count[i] = count[i] + 8000;
			}
			if (stu[i].ave > 85 && stu[i].cla > 80)
			{
				count[i] = count[i] + 4000;
			}
			if (stu[i].ave > 90)
			{
				count[i] = count[i] + 2000;
			}
			if (stu[i].ave > 85 && stu[i].west == 'Y')
			{
				count[i] = count[i] + 1000;
			}
			if (stu[i].cla > 80 && stu[i].leader == 'Y')
			{
				count[i] = count[i] + 850;
			}
			all = all + count[i];

		}
		for (k = 0;k < n;k++)
		{
			count2[k] = count[k];
		}
		max = count[0];
		for (j = 0;j < n;j++)
		{
			if (count[j] > max)
			{
				max = count[j];
			}
		}
			for (l = 0;l < n;l++)
			{
				if (count2[l] == max)
				{
					break;
				}
			}
			System.out.printf("%s\n%d\n%d\n",stu[l].name,max,all);
	}

}

