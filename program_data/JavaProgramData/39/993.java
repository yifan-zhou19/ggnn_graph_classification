public class stus
{
	public String name = new String(new char[25]);
	public int qimo;
	public int banji;
	public char ganbu;
	public char xibu;
	public int lunwen;
	public int p;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int s = 0;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		stus[] stu = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
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
				stu[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].banji = Integer.parseInt(tempVar4);
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
				stu[i].lunwen = Integer.parseInt(tempVar7);
			}
			if (stu[i].qimo > 80 && stu[i].lunwen >= 1)
			{
				stu[i].p += 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banji > 80)
			{
				stu[i].p += 4000;
			}
			if (stu[i].qimo > 90)
			{
				stu[i].p += 2000;
			}
			if (stu[i].xibu == 'Y' && stu[i].qimo > 85)
			{
				stu[i].p += 1000;
			}
			if (stu[i].banji > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].p += 850;
			}
			s += stu[i].p;
		}
		m = stu[0].p;
		c = stu[0].name;
		for (i = 1;i < n;i++)
		{
			if (stu[i].p > m)
			{
				c = stu[i].name;
				m = stu[i].p;
			}
		}
		System.out.printf("%s\n",c);
		System.out.printf("%d\n%d",m,s);
	}
}

