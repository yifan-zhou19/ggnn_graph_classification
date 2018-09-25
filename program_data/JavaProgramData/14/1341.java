public class person
{
	public int num;
	public int chinese;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static person[] student = tangible.Arrays.initializeWithDefaultpersonInstances(110000);

	public static int Main()
	{
		int n;
		int i;
		int max1 = 0;
		int count1 = 0;
		int max2 = 0;
		int count2 = 0;
		int max3 = 0;
		int count3 = 0;
		int number = 0;
		int sum = 0;
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
				student[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[i].math = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0; i < n; i++)
		{
			student[i].total = student[i].chinese + student[i].math;
		}
		for (i = n - 1; i >= 0; i--)
		{
			if (student[i].total >= max1)
			{
				max1 = student[i].total;
				count1 = i;
			}
		}
		number = student[0].num;
		sum = student[0].total;
		student[0].num = student[count1].num;
		student[0].total = student[count1].total;
		student[count1].num = number;
		student[count1].total = sum;
		number = 0;
		sum = 0;
		for (i = n - 1; i >= 1; i--)
		{
			if (student[i].total >= max2)
			{
				max2 = student[i].total;
				count2 = i;
			}
		}
		number = student[1].num;
		sum = student[1].total;
		student[1].num = student[count2].num;
		student[1].total = student[count2].total;
		student[count2].num = number;
		student[count2].total = sum;
		number = 0;
		sum = 0;
		for (i = n - 1; i >= 2; i--)
		{
			if (student[i].total >= max3)
			{
				max3 = student[i].total;
				count3 = i;
			}
		}
		number = student[2].num;
		sum = student[2].total;
		student[2].num = student[count3].num;
		student[2].total = student[count3].total;
		student[count3].num = number;
		student[count3].total = sum;
		for (i = 0; i < 3; i++)
		{
			System.out.printf("%d %d\n", student[i].num, student[i].total);
		}
		return 0;
	}
}

