public class student
{
	public String name = new String(new char[21]);
	public char a;
	public char b;
	public int score;
	public int c;
	public int e;
	public int scholar;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static student temp = new student();
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
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
				stu[i].score = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].c = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].b = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].e = Integer.parseInt(tempVar7);
			}
		}
		/*for(i=0;i<n;i++)
		{
			printf("%s %d %d %c %c %d\n",stu[i].name,stu[i].score,stu[i].c,stu[i].a,stu[i].b,stu[i].e);
		}*/

		for (i = 0;i < n;i++)
		{
			stu[i].scholar = 0;
			if (stu[i].c > 80 && stu[i].a == 'Y')
			{
				stu[i].scholar += 850;
			}
			if (stu[i].score > 85 && stu[i].b == 'Y')
			{
				stu[i].scholar += 1000;
			}
			if (stu[i].score > 90)
			{
				stu[i].scholar += 2000;
			}
			if (stu[i].score > 85 && stu[i].c > 80)
			{
				stu[i].scholar += 4000;
			}
			if (stu[i].score > 80 && stu[i].e >= 1)
			{
				stu[i].scholar += 8000;
			}
		}
		for (j = 1;j < n;j++)
		{
			if (stu[0].scholar < stu[j].scholar)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[0];
				temp.copyFrom(stu[0]);
				stu[0] = stu[j];
				stu[j] = temp;
			}
		}
		for (j = 0;j < n;j++)
		{
			k += stu[j].scholar;
		}
		System.out.printf("\n%s\n%d\n%d",stu[0].name,stu[0].scholar,k);
	}

}

