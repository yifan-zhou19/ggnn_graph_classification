package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int max = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long sum=0;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[21]; //??
	//		int mark; //??????
	//		int evaluation; //??????
	//		char cadre; //????
	//		char west; //??????
	//		int thesis; //???
	//		int scholarship; //???
	//	};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		student * p = (student)malloc(n * sizeof(student));
		for (i = 0; i < n; i++)
		{
			student q;
			q = p + i;
			q.scholarship = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(q.name) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(q.mark) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(q.evaluation) = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				(q.cadre) = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				(q.west) = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				(q.thesis) = tempVar7;
			}
			if (q.mark > 80 && q.thesis > 0)
			{
				q.scholarship += 8000; //?????
			}
			if (q.mark > 85 && q.evaluation > 80)
			{
				q.scholarship += 4000; //?????
			}
			if (q.mark > 90)
			{
				q.scholarship += 2000; //?????
			}
			if (q.mark > 85 && q.west == 'Y')
			{
				q.scholarship += 1000; //?????
			}
			if (q.evaluation > 80 && q.cadre == 'Y')
			{
				q.scholarship += 850; //?????
			}
			sum += q.scholarship;
		}
		for (i = 1; i < n; i++)
		{
			if ((p + i).scholarship > (p + max).scholarship)
			{
				max = i;
			}
		}
		System.out.printf("%s\n%d\n%d",(p + max).name,(p + max).scholarship,sum);
	}
}

