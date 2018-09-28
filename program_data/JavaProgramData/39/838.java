public class student
{
	public String name = new String(new char[20]);
	public int[] num = new int[6];
	public String xx = new String(new char[3]);
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
	public static String cc = new String(new char[10]);
	public static int Main()
	{
		int t;
		int k;
		int[] x = new int[10000];
		int n;
		int min = 10000;
		int max = 0;
		int min1 = 0;
		int max1 = 0;
		int a = 0;
		int b;
		int c;
		int d;
		int i;
		int j;
		int tp;
		int sum1 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			cc = tangible.StringFunctions.changeCharacter(cc, 1, tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].name = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				cc = tangible.StringFunctions.changeCharacter(cc, 1, tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu[i].num[1] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				cc = tangible.StringFunctions.changeCharacter(cc, 2, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].num[2] = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead(null, 1);
			if (tempVar8 != null)
			{
				cc = tangible.StringFunctions.changeCharacter(cc, 1, tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(null, 1);
			if (tempVar9 != null)
			{
				stu[i].xx = tangible.StringFunctions.changeCharacter(stu[i].xx, 1, tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(null, 1);
			if (tempVar10 != null)
			{
				cc = tangible.StringFunctions.changeCharacter(cc, 2, tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(null, 1);
			if (tempVar11 != null)
			{
				stu[i].xx = tangible.StringFunctions.changeCharacter(stu[i].xx, 2, tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead(null, 1);
			if (tempVar12 != null)
			{
				cc = tangible.StringFunctions.changeCharacter(cc, 3, tempVar12);
			}
			String tempVar13 = ConsoleInput.scanfRead();
			if (tempVar13 != null)
			{
				stu[i].num[3] = Integer.parseInt(tempVar13);
			}
			String tempVar14 = ConsoleInput.scanfRead(null, 1);
			if (tempVar14 != null)
			{
				cc = tangible.StringFunctions.changeCharacter(cc, 6, tempVar14);
			}
	stu[i].sum = 0;
	if (stu[i].num[1] > 80 && stu[i].num[3] >= 1)
	{
		stu[i].sum += 8000;
	}
	if (stu[i].num[1] > 85 && stu[i].num[2] > 80)
	{
		stu[i].sum += 4000;
	}
	if (stu[i].num[1] > 90)
	{
		stu[i].sum += 2000;
	}
	if (stu[i].num[1] > 85 && stu[i].xx.charAt(2) == 'Y')
	{
		stu[i].sum += 1000;
	}
	if (stu[i].num[2] > 80 && stu[i].xx.charAt(1) == 'Y')
	{
		stu[i].sum += 850;
	}
	sum1 += stu[i].sum;
	if (stu[i].sum > max)
	{
		max = stu[i].sum;
		max1 = i;
	}
		}
	System.out.printf("%s\n%d\n%d",stu[max1].name,stu[max1].sum,sum1);
	}




}

