public class scholarship
{
	public String name = new String(new char[21]);
	public short mark;
	public short judge;
	public char cadre;
	public char west;
	public short paper;
	public int ss;
}

package <missing>;

public class GlobalMembers
{
	public static scholarship[] stu = tangible.Arrays.initializeWithDefaultscholarshipInstances(100);
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
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
				stu[i].mark = Short.parseShort(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].judge = Short.parseShort(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].cadre = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Short.parseShort(tempVar7);
			}
			stu[i].ss = 0;
			if (stu[i].mark > 80 && stu[i].paper >= 1)
			{
				stu[i].ss = stu[i].ss + 8000;
			}
			if (stu[i].mark > 85 && stu[i].judge > 80)
			{
				stu[i].ss = stu[i].ss + 4000;
			}
			if (stu[i].mark > 90)
			{
				stu[i].ss = stu[i].ss + 2000;
			}
			if (stu[i].mark > 85 && stu[i].west == 'Y')
			{
				stu[i].ss = stu[i].ss + 1000;
			}
			if (stu[i].judge > 80 && stu[i].cadre == 'Y')
			{
				stu[i].ss = stu[i].ss + 850;
			}
		}
		int max = stu[0].ss;
		int a = 0;
		int total = 0;
		for (i = 0;i < n;i++)
		{
			if (stu[i].ss > max)
			{
				max = stu[i].ss;
				a = i;
			}
			total = total + stu[i].ss;
		}
		System.out.printf("%s\n%d\n%d\n",stu[a].name,stu[a].ss,total);
	}
}

