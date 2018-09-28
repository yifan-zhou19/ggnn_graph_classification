public class student
{
public String name = new String(new char[21]);
public int pingjun;
public int banyi;
public char ganbu;
public char west;
public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(120);
	public static void scholar(student p, int a)
	{
		int sums;
		int sum = 0;
		int max = 0;
		int j;
		int jishu = 0;
		for (j = 0;j < a;j++)
		{
			sums = 0;
			if (((p + j).pingjun > 80) && ((p + j).paper > 0))
			{
				sums += 8000;
			}
			if (((p + j).pingjun > 85) && ((p + j).banyi > 80))
			{
				sums += 4000;
			}
			if ((p + j).pingjun > 90)
			{
				sums += 2000;
			}
			if (((p + j).pingjun > 85) && ((p + j).west == 'Y'))
			{
				sums += 1000;
			}
			if (((p + j).banyi > 80) && ((p + j).ganbu == 'Y'))
			{
				sums += 850;
			}
			sum += sums;
			if (sums > max)
			{
				max = sums;
				jishu = j;
			}
		}
		System.out.printf("%s\n%d\n%d",(p + jishu).name,max,sum);

	}

	public static int Main()
	{
		int n;
		int i;
		student pointer1;
		pointer1 = stu;
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
				stu[i].pingjun = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].banyi = Integer.parseInt(tempVar4);
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
				stu[i].paper = Integer.parseInt(tempVar7);
			}
		}
		scholar(pointer1, n);
		return 0;
	}
}

