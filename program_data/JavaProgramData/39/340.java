public class p
{
	public String name = new String(new char[100]);
	public char leader;
	public char xibu;
	public int fen;
	public int ban;
	public int lun;
	public int scho;
}

package <missing>;

public class GlobalMembers
{
	public static p[] stu = tangible.Arrays.initializeWithDefaultpInstances(100);
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m = 0;
		int n;
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
				stu[i].fen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].ban = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lun = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].lun >= 1 && stu[i].fen > 80)
			{
				stu[i].scho = stu[i].scho + 8000;
			}
			if (stu[i].fen > 85 && stu[i].ban > 80)
			{
				stu[i].scho = stu[i].scho + 4000;
			}
			if (stu[i].fen > 90)
			{
				stu[i].scho = stu[i].scho + 2000;
			}
			if (stu[i].fen > 85 && stu[i].xibu == 'Y')
			{
				stu[i].scho = stu[i].scho + 1000;
			}
			if (stu[i].ban > 80 && stu[i].leader == 'Y')
			{
				stu[i].scho = stu[i].scho + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			m = m + stu[i].scho;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (stu[i].scho < stu[j].scho)
				{
					break;
				}
			}
			if (j == n)
			{
				System.out.printf("%s\n%d\n%d",stu[i].name,stu[i].scho,m);
				break;
			}
		}
	}

}

