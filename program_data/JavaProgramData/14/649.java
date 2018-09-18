public class student
{
	public int num;
	public int liter;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student n1 = new student();
		student n2 = new student();
		student n3 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0].num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0].liter = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[0].math = Integer.parseInt(tempVar4);
		}
		a[0].total = a[0].liter + a[0].math;
		n1 = n2 = n3 = a[0];
		for (i = 1;i < n;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[i].num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				a[i].liter = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[i].math = Integer.parseInt(tempVar7);
			}
			a[i].total = a[i].liter + a[i].math;
			if (a[i].total > n1.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: n3=n2;
				n3.copyFrom(n2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: n2=n1;
				n2.copyFrom(n1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: n1=a[i];
				n1.copyFrom(a[i]);
			}
			else if (a[i].total > n2.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: n3=n2;
				n3.copyFrom(n2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: n2=a[i];
				n2.copyFrom(a[i]);
			}
			else if (a[i].total > n3.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: n3=a[i];
				n3.copyFrom(a[i]);
			}
		}
		System.out.printf("%d %d\n",n1.num,n1.total);
		System.out.printf("%d %d\n",n2.num,n2.total);
		System.out.printf("%d %d",n3.num,n3.total);
			return 0;
	}
}

