public class student
{
	public int num;
	public int all;
}

package <missing>;

public class GlobalMembers
{
	public static student[] person = tangible.Arrays.initializeWithDefaultstudentInstances(99999);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int x;
		int y;
		student temp1 = new student();
		student temp2 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i >= 0;i--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				person[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				y = Integer.parseInt(tempVar4);
			}
			person[i].all = x + y;
		}
		for (i = 3;i <= n - 1;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				person[i].num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				x = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				y = Integer.parseInt(tempVar7);
			}
			person[i].all = x + y;
			k = person[i].all;
			if (k > person[0].all)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp1=person[0];
				temp1.copyFrom(person[0]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp2=person[1];
				temp2.copyFrom(person[1]);
				person[0] = person[i];
				person[1] = temp1;
				person[2] = temp2;
				continue;
			}
			if (k <= person[0].all != 0 && k> person[1].all)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp1=person[1];
				temp1.copyFrom(person[1]);
				person[1] = person[i];
				person[2] = temp1;
				continue;
			}
			if (k <= person[1].all != 0 && k> person[2].all)
			{
				person[2] = person[i];
				continue;
			}
			if (k < person[2].all)
			{
				continue;
			}
		}
		System.out.printf("%d %d\n",person[0].num,person[0].all);
		System.out.printf("%d %d\n",person[1].num,person[1].all);
		System.out.printf("%d %d",person[2].num,person[2].all);
		return 0;
	}
}

