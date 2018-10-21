public class person
{
	public String name = new String(new char[30]);
	public int qimo;
	public int banji;
	public String ganbu = new String(new char[5]);
	public String xibu = new String(new char[5]);
	public int lunwen;
	public int yuanshijiangxue;
	public int wusijiangxue;
	public int chengjiyouxiu;
	public int xibujiangxue;
	public int banjigongxian;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static person[] student = tangible.Arrays.initializeWithDefaultpersonInstances(110);

	public static int Main()
	{
		int n;
		int i;
		int all = 0;
		int max = 0;
		int whom = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[i].banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				student[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				student[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				student[i].lunwen = Integer.parseInt(tempVar7);
			}
		}

		for (i = 0; i < n; i++)
		{
			if (student[i].lunwen > 0 && student[i].qimo > 80)
			{
				student[i].yuanshijiangxue = 8000;
			}
			else
			{
				student[i].yuanshijiangxue = 0;
			}
		}

		for (i = 0; i < n; i++)
		{
			if (student[i].qimo > 85 && student[i].banji > 80)
			{
				student[i].wusijiangxue = 4000;
			}
			else
			{
				student[i].wusijiangxue = 0;
			}
		}

		for (i = 0; i < n; i++)
		{
			if (student[i].qimo > 90)
			{
				student[i].chengjiyouxiu = 2000;
			}
			else
			{
				student[i].chengjiyouxiu = 0;
			}
		}

		for (i = 0; i < n; i++)
		{
			if (student[i].xibu.charAt(0) == 'Y' && student[i].qimo > 85)
			{
				student[i].xibujiangxue = 1000;
			}
			else
			{
				student[i].xibujiangxue = 0;
			}
		}

		for (i = 0; i < n; i++)
		{
			if (student[i].banji > 80 && student[i].ganbu.charAt(0) == 'Y')
			{
				student[i].banjigongxian = 850;
			}
			else
			{
				student[i].banjigongxian = 0;
			}
		}

		for (i = 0; i < n; i++)
		{
			student[i].total = student[i].yuanshijiangxue + student[i].wusijiangxue + student[i].chengjiyouxiu + student[i].xibujiangxue + student[i].banjigongxian;
		}

		for (i = 0; i < n; i++)
		{
			all = all + student[i].total;
		}

		for (i = n - 1; i >= 0; i--)
		{
			if (student[i].total >= max)
			{
				max = student[i].total;
				whom = i;
			}
		}

		System.out.printf("%s\n", student[whom].name);
		System.out.printf("%d\n", student[whom].total);
		System.out.printf("%d", all);


		return 0;
	}
}

