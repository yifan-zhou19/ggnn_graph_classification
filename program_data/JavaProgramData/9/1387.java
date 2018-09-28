public class student
{
	public String num = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

	public static int Main()
	{
		char c;
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: struct student *pstu=stu,e;
		student[] pstu = new student(stu);
		student e = new student();
		pstu = stu[0];

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
			stu[i].num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			stu[i].age = Integer.parseInt(tempVar3);
		}

		}
		for (j = 0;j < n;j++)
		{
			if (stu[j].age >= 60)
			{
						 for (i = j;i > 0;i--)
						 {
											if (stu[i].age > stu[i - 1].age)
											{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=*(pstu+i);
																	  e.copyFrom(pstu[i]);
																	  pstu[i] = (pstu + i - 1);
																	  *(pstu - 1 + i) = e;
											}
						 }
			}
		}
		for (i = 0;i < n;i++)
		{
						 System.out.printf("%s\n",(pstu + i).num);
		}
	return 0;


	}



}

