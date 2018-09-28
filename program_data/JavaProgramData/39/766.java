public class student
{
	public String name = new String(new char[30]);
	public int mark1;
	public int mark2;
	public char worker;
	public char west;
	public int paper;
	public int RMB;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(Max);
	public static int Main()
	{
		int n;
		int i = 0;
		int j;
		int S = 0;
		int[] b = new int[Max];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			stu[i].RMB = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].mark1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].mark2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].worker = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
			if (stu[i].mark1 > 80 && stu[i].paper != 0)
			{
				stu[i].RMB = stu[i].RMB + 8000;
			}
			if (stu[i].mark1 > 85 && stu[i].mark2 > 80)
			{
				stu[i].RMB = stu[i].RMB + 4000;
			}
			if (stu[i].mark1 > 90)
			{
				stu[i].RMB = stu[i].RMB + 2000;
			}
			if (stu[i].mark2 > 80 && stu[i].worker == 'Y')
			{
				stu[i].RMB = stu[i].RMB + 850;
			}
			if (stu[i].mark1 > 85 && stu[i].west == 'Y')
			{
				stu[i].RMB = stu[i].RMB + 1000;
			}

			b[i] = stu[i].RMB;
		}
		for (i = 0;i < n;i++)
		{
			S = S + stu[i].RMB;
		}

		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (b[j + 1] < b[j])
				{
					t = b[j + 1];
				b[j + 1] = b[j];
				b[j] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].RMB == b[n - 1])
			{

				System.out.printf("%s\n%d\n%d\n",stu[i].name,stu[i].RMB,S);
	break;
			}
		}
				return 0;
	}

}

