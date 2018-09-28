public class stu
{
	public String nam = new String(new char[40]);
	public int qi;
	public int pi;
	public char gan;
	public char xi;
	public int lun;
	public int ji;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(102);
	public static void Main()
	{
		int total = 0;
		int i;
		int n;
		int k = 0;
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
				stu[i].nam = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].qi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].pi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xi = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lun = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].ji = 0;
			if (stu[i].qi > 80 && stu[i].lun > 0)
			{
				stu[i].ji += 8000;
			}
			if (stu[i].qi > 85 && stu[i].pi > 80)
			{
				stu[i].ji += 4000;
			}
			if (stu[i].qi > 90)
			{
				stu[i].ji += 2000;
			}
			if (stu[i].qi > 85 && stu[i].xi == 'Y')
			{
				stu[i].ji += 1000;
			}
			if (stu[i].pi > 80 && stu[i].gan == 'Y')
			{
				stu[i].ji += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			total += stu[i].ji;
		}
		for (i = 1;i < n;i++)
		{
			if (stu[i].ji > stu[k].ji)
			{
				stu[k] = stu[i];
			}
		}
		System.out.printf("%s\n",stu[k].nam);
		System.out.printf("%d\n",stu[k].ji);
		System.out.printf("%d\n",total);
	}





}

