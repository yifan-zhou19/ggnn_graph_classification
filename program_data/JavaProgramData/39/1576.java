public class scholarship
{
	public String name = new String(new char[20]);
	public int avscore;
	public int clscore;
	public char ganbu;
	public char xibu;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static scholarship[] stu = tangible.Arrays.initializeWithDefaultscholarshipInstances(100);
	public static void Main()
	{
	int n;
	int i;
	int[] b = new int[100];
	int c = 0;
	int d = 0;
	int all = 0;
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
			stu[i].avscore = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			stu[i].clscore = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			stu[i].ganbu = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			stu[i].xibu = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			stu[i].paper = Integer.parseInt(tempVar7);
		}
		if (stu[i].avscore > 80 && stu[i].paper > 0)
		{
			b[i] = b[i] + 8000;
		}
		if (stu[i].avscore > 85 && stu[i].clscore > 80)
		{
			b[i] = b[i] + 4000;
		}
		if (stu[i].avscore > 90)
		{
			b[i] = b[i] + 2000;
		}
		if (stu[i].avscore > 85 && stu[i].xibu == 'Y')
		{
			b[i] = b[i] + 1000;
		}
		if (stu[i].ganbu == 'Y' && stu[i].clscore > 80)
		{
			b[i] = b[i] + 850;
		}
		if (i > 0 && b[i] > c)
		{
			c = b[i];
			d = i;
		}
		else if (i == 0)
		{
			c = b[0];
		}
	}
	for (i = 0;i < n;i++)
	{
	all = all + b[i];
	}

	System.out.printf("%s\n%d\n%d\n",stu[d].name,c,all);


	}
}

