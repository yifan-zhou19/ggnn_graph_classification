public class student
{
	public int number;
	public int math;
	public int chin;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] st = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static student t = new student();
	public static void Main()
	{
		int i;
		int j;
		int n;
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
				st[i].number = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				st[i].math = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				st[i].chin = Integer.parseInt(tempVar4);
			}
			st[i].sum = st[i].math + st[i].chin;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = n;j >= 1;j--)
			{
				if (st[j].sum > st[j - 1].sum)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=st[j-1];
					t.copyFrom(st[j - 1]);
					st[j - 1] = st[j];
					st[j] = t;
				}
			}
		}
				for (i = 0;i < 3;i++)
				{
				System.out.printf("%d %d\n",st[i].number,st[i].sum);
				}
	}



}

