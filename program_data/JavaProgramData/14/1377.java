public class Student
{
	public int number;
	public int a;
	public int b;
	public int c;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int z;

		Student stu = new Student();
		Student maxStu = new Student();
		Student smaxStu = new Student();
		Student tmaxStu = new Student();

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			z = Integer.parseInt(tempVar4);
		}
		stu.number = x;
		stu.a = y;
		stu.b = z;
		stu.c = stu.a + stu.b;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: maxStu = stu;
		maxStu.copyFrom(stu);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: smaxStu = stu;
		smaxStu.copyFrom(stu);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmaxStu = stu;
		tmaxStu.copyFrom(stu);

		for (i = 0; i < n - 1; i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				x = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				y = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				z = Integer.parseInt(tempVar7);
			}
			stu.number = x;
			stu.a = y;
			stu.b = z;
			stu.c = stu.a + stu.b;
			if (stu.c > maxStu.c)
			{
				if (maxStu.c > smaxStu.c)
				{
					if (smaxStu.c > tmaxStu.c)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmaxStu = smaxStu;
						tmaxStu.copyFrom(smaxStu);
					}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: smaxStu = maxStu;
					smaxStu.copyFrom(maxStu);
				}
				else if (maxStu.c > tmaxStu.c)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmaxStu = maxStu;
						tmaxStu.copyFrom(maxStu);
				}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: maxStu = stu;
				maxStu.copyFrom(stu);
			}
			else if (stu.c > smaxStu.c)
			{
				if (smaxStu.c > tmaxStu.c)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmaxStu = smaxStu;
					tmaxStu.copyFrom(smaxStu);
				}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: smaxStu = stu;
				smaxStu.copyFrom(stu);
			}
			else if (stu.c > tmaxStu.c)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmaxStu = stu;
				tmaxStu.copyFrom(stu);
			}
		}

		System.out.printf("%d %d\n%d %d\n%d %d",maxStu.number,maxStu.c,smaxStu.number,smaxStu.c,tmaxStu.number,tmaxStu.c);
		return 0;
	}
}

