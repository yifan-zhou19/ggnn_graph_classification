public class student
{
	public String name = new String(new char[21]);
	public int qimo;
	public int banji;
	public char ganbu;
	public char west;
	public int article;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int sum;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(4 * n + (Character.SIZE / Byte.SIZE) * 23 * n);

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
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].article = Integer.parseInt(tempVar7);
			}
			stu[i].total = 0;
		}


		for (i = 0;i < n;i++)
		{
			if (stu[i].qimo > 80 && stu[i].article > 0)
			{
				stu[i].total += 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banji > 80)
			{
				stu[i].total += 4000;
			}
			if (stu[i].qimo > 90)
			{
				stu[i].total += 2000;
			}
			if (stu[i].qimo > 85 && stu[i].west == 'Y')
			{
				stu[i].total += 1000;
			}
			if (stu[i].banji > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].total += 850;
			}
		}
		max = stu[0].total;
		sum = 0;
		for (i = 0;i < n;i++)
		{
			if (stu[i].total > max)
			{
				max = stu[i].total;
			}
			sum += stu[i].total;
		}
		for (i = 0;i < n;i++)
		{
			if (max == stu[i].total)
			{
				System.out.printf("%s\n%d\n%d\n",stu[i].name,max,sum);
				break;
			}
		}

		return 0;

	}
}

