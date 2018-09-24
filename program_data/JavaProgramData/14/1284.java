public class student
{
	public int num;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static student a = new student();
	public static student max1 = new student();
	public static student max2 = new student();
	public static student max3 = new student();

	public static void Main()
	{
		int i;
		int n;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max1.z = -1;
		max2.z = -1;
		max3.z = -1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a.num = Integer.parseInt(tempVar2);
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
			a.z = x + y;
			if (a.z > max1.z)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max3=max2;
				max3.copyFrom(max2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max2=max1;
				max2.copyFrom(max1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max1=a;
				max1.copyFrom(a);
			}
			else if (a.z > max2.z)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max3=max2;
				max3.copyFrom(max2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max2=a;
				max2.copyFrom(a);
			}
			else if (a.z > max3.z)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max3=a;
				max3.copyFrom(a);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max3=a;
				max3.copyFrom(a);
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",max1.num,max1.z,max2.num,max2.z,max3.num,max3.z);
	}

}

