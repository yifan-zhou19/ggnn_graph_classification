public class student
{
	public String name = new String(new char[20]);
	public int exam;
	public int chara;
	public char ganbu;
	public char west;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static int scholarship(student stu)
	{
		int s = 0;
		if (stu.exam > 80 && stu.paper > 0)
		{
			s = s + 8000;
		}
		if (stu.exam > 85 && stu.chara > 80)
		{
			s = s + 4000;
		}
		if (stu.exam > 90)
		{
			s = s + 2000;
		}
		if (stu.exam > 85 && (stu.west == 'Y'))
		{
			s = s + 1000;
		}
		if ((stu.ganbu == 'Y') && stu.chara > 80)
		{
			s = s + 850;
		}
		return (s);

	}

	public static void Main()
	{
		int n;
		int[] c = new int[100];
		int i;
		int sum = 0;
		int max;
		int k;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

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
			stu[i].exam = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			stu[i].chara = Integer.parseInt(tempVar4);
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

		for (i = 0;i < n;i++)
		{
			c[i] = scholarship(stu[i]);
			sum = sum + c[i];
		}

		max = c[0];
		k = 0;
		for (i = 1;i < n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
				k = i;
			}
		}

		System.out.printf("%s\n",stu[k].name);
		System.out.printf("%d\n",c[k]);
		System.out.printf("%d\n",sum);

	}
}

