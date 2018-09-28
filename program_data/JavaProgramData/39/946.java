public class student
{
	public String name = new String(new char[21]);
	public int chengji;
	public int pingyi;
	public char ganbu;
	public char xibu;
	public int lunwen;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		student temp = new student();
		int n;
		int i;
		int j;
		int r = 1;
		int final = 0;
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
				stu[i].chengji = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].pingyi = Integer.parseInt(tempVar4);
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
			stu[i].sum = 0;
			if (stu[i].chengji > 80 && stu[i].lunwen > 0)
			{
				stu[i].sum += 8000;
			}
			if (stu[i].chengji > 85 && stu[i].pingyi > 80)
			{
				stu[i].sum += 4000;
			}
			if (stu[i].chengji > 90)
			{
				stu[i].sum += 2000;
			}
			if (stu[i].chengji > 85 && stu[i].xibu == 'Y')
			{
				stu[i].sum += 1000;
			}
			if (stu[i].pingyi > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].sum += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			final = final + stu[i].sum;
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (stu[j].sum < stu[j + 1].sum)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[j];
					temp.copyFrom(stu[j]);
					stu[j] = stu[j + 1];
					stu[j + 1] = temp;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (stu[i].sum == stu[0].sum)
			{
				r++;
			}
			else
			{
				break;
			}
		}

		System.out.printf("%s\n%d\n%d\n",stu[0].name,stu[0].sum,final);
		return 0;
	}

}

