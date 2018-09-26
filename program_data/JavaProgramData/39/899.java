public class student
{
	public String name = new String(new char[25]);
	public int qimo;
	public int banji;
	public char ganbu;
	public char xibu;
	public int lunwen;
	public int jiangjin;

}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int q = 0;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		int i;
		int j;
		int k;
		int r;
		int m = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
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
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].lunwen = Integer.parseInt(tempVar7);
			}
	//		scanf("%d",&stu[i].qimo);
	//		scanf("%d",&stu[i].banji);
	//		scanf("&c",&stu[i].ganbu);
	//		scanf("%c",&stu[i].xibu);
	//		scanf("%d",&stu[i].lunwen);
			stu[i].jiangjin = 0;
		}

		for (i = 0;i < n;i++)
		{
			if (stu[i].qimo > 80 && stu[i].lunwen >= 1)
			{
				stu[i].jiangjin = stu[i].jiangjin + 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banji > 80)
			{
				stu[i].jiangjin = stu[i].jiangjin + 4000;
			}
			if (stu[i].qimo > 90)
			{
				stu[i].jiangjin = stu[i].jiangjin + 2000;
			}
			if (stu[i].qimo > 85 && stu[i].xibu == 'Y')
			{
				stu[i].jiangjin = stu[i].jiangjin + 1000;
			}
			if (stu[i].banji > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].jiangjin = stu[i].jiangjin + 850;
			}
			q = q + stu[i].jiangjin;
		}
		for (i = 0,q = 0;i < n;i++)
		{
			if (stu[i].jiangjin > m)
			{
				m = stu[i].jiangjin;
			}
			q = q + stu[i].jiangjin;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].jiangjin == m)
			{
				System.out.printf("%s\n",stu[i].name);
				System.out.printf("%d\n",m);
				System.out.printf("%d",q);
				break;

			}

		}

	}
}

