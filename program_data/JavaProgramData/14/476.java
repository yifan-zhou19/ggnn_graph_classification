public class student
{
	public String xuehao = new String(new char[100]);
	public int yuwen;
	public int shuxue;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int m;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student temp = new student();



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
				stu[i].xuehao = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].shuxue = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].yuwen + stu[i].shuxue;
		}

		for (j = 1;j < 4;j++)
		{
			for (m = 0;m < n - j;m++)
			{
				if (stu[m].sum >= stu[m + 1].sum)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[m];
					temp.copyFrom(stu[m]);
					stu[m] = stu[m + 1];
					stu[m + 1] = temp;
				}
			}
		}




		for (l = n - 1;l > n - 4;l--)
		{
			System.out.printf("%s %d\n",stu[l].xuehao,stu[l].sum);
		}

		return 0;
	}

}

