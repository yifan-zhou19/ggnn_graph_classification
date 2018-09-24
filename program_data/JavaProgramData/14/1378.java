package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	   int id;
	//	   int chinese;
	//	   int math;
	//	   int total;
	//	   };

		int n;
		int temp;
		int max = 0;
		int max_1 = 0;
		int max_2 = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
		student p_ori;
		student p_end;
		student q;
		student p_max;
		student p_max_1;
		student p_max_2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p = (struct student *)malloc(n *sizeof(struct student));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p.copyFrom((student)malloc(n * sizeof(student)));
		p_ori = p;
		p_end = p + n;

		for (;p < p_end;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p.id) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p.chinese) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(p.math) = tempVar4;
			}
			p.total = p.chinese + p.math;
		}

//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p = p_ori;
		p.copyFrom(p_ori);
		for (;p < p_end;p++)
		{
			if (p.total > max)
			{
				max = p.total;
			  p_max = p;
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=p_ori;
		p.copyFrom(p_ori);
		for (;p < p_end;p++)
		{
			if (p.total > max_1 && p != p_max)
			{
				max_1 = p.total;
			  p_max_1 = p;
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=p_ori;
		p.copyFrom(p_ori);
		for (;p < p_end;p++)
		{
			if (p.total > max_2 && p != p_max && p != p_max_1)
			{
				max_2 = p.total;
			  p_max_2 = p;
			}
		}


		System.out.printf("%d %d\n",p_max.id,p_max.total);
		System.out.printf("%d %d\n",p_max_1.id,p_max_1.total);
		System.out.printf("%d %d\n",p_max_2.id,p_max_2.total);

	System.in.read();
	System.in.read();
	}

}

