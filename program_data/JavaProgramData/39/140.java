public class Student
	{
		public String name = new String(new char[21]);
		public int avg;
		public int cls;
		public char off;
		public char west;
		public int paper;
	}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int N;
		int high;
		int[] sch = new int[100];
		int schtot = 0;
		char c;
		Student[] ptcpt = tangible.Arrays.initializeWithDefaultStudentInstances(100);
		Student tmp = new Student();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				N = Integer.parseInt(tempVar);
			}
		for (i = 0;i < N - 1;i++)
		{
			j = 0;
			while (j < 22 && (c = System.in.read()) != ' ')
			{
				ptcpt[i].name = tangible.StringFunctions.changeCharacter(ptcpt[i].name, j, c);
				j++;
			}
				ptcpt[i].name = tangible.StringFunctions.changeCharacter(ptcpt[i].name, j, '\0');
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				ptcpt[i].avg = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				ptcpt[i].cls = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar4 != null)
			{
				ptcpt[i].off = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				ptcpt[i].west = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				ptcpt[i].paper = Integer.parseInt(tempVar6);
			}
			if (ptcpt[i].avg > 80 && ptcpt[i].paper >= 1)
			{
			sch[i] = sch[i] + 8000;
			}
			if (ptcpt[i].avg > 85 && ptcpt[i].cls > 80)
			{
			sch[i] = sch[i] + 4000;
			}
			if (ptcpt[i].avg > 90)
			{
			sch[i] = sch[i] + 2000;
			}
			if (ptcpt[i].avg > 85 && ptcpt[i].west == 'Y')
			{
			sch[i] = sch[i] + 1000;
			}
			if (ptcpt[i].cls > 80 && ptcpt[i].off == 'Y')
			{
			sch[i] = sch[i] + 850;
			}

			schtot = schtot + sch[i];
		}

			j = 0;
			while (j < 22 && (c = System.in.read()) != ' ')
			{
				ptcpt[N - 1].name = tangible.StringFunctions.changeCharacter(ptcpt[N - 1].name, j, c);
				j++;
			}
				ptcpt[N - 1].name = tangible.StringFunctions.changeCharacter(ptcpt[N - 1].name, j, '\0');
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				ptcpt[N - 1].avg = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				ptcpt[N - 1].cls = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				ptcpt[N - 1].off = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				ptcpt[N - 1].west = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				ptcpt[N - 1].paper = Integer.parseInt(tempVar11);
			}
			if (ptcpt[N - 1].avg > 80 && ptcpt[N - 1].paper >= 1)
			{
				sch[N - 1] = sch[N - 1] + 8000;
			}
			if (ptcpt[N - 1].avg > 85 && ptcpt[N - 1].cls > 80)
			{
			sch[N - 1] = sch[N - 1] + 4000;
			}
			if (ptcpt[N - 1].avg > 90)
			{
			sch[N - 1] = sch[N - 1] + 2000;
			}
			if (ptcpt[N - 1].avg > 85 && ptcpt[N - 1].west == 'Y')
			{
			sch[N - 1] = sch[N - 1] + 1000;
			}
			if (ptcpt[N - 1].cls > 80 && ptcpt[N - 1].off == 'Y')
			{
			sch[N - 1] = sch[N - 1] + 850;
			}

			schtot = schtot + sch[N - 1];
			tmp.name = ptcpt[N - 1].name;
					high = sch[N - 1];

			for (i = N - 1;i > -1;i--)
			{
				if (high <= sch[i])
				{
					tmp.name = ptcpt[i].name;
					high = sch[i];
				}
					else
					{
						continue;
					}
			}
			System.out.printf("%s\n%d\n%ld",tmp.name,high,schtot);
		return 0;
	}
}

