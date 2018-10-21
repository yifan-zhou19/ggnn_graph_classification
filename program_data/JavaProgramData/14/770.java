package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ss
	//	{
	//		int num,yu,sh;
	//		int sum;
	//	};
		int n;
		int i;
		ss stu;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		stu = (ss)malloc(sizeof(ss) * n);
		for (i = 0;i < n;i++)
		{
			int num1;
			int yu1;
			int sh1;
		(stu + i).num = 0;
		(stu + i).yu = 0;
		(stu + i).sh = 0;
		(stu + i).sum = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			yu1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			sh1 = Integer.parseInt(tempVar4);
		}
		(stu + i).num = num1;
		(stu + i).yu = yu1;
		(stu + i).sh = sh1;
		(stu + i).sum = yu1 + sh1;
		}
		for (i = 1;i < n;i++)
		{
			int t;
		if ((stu + 0).sum < (stu + i).sum)
		{
			t = (stu + 0).sum;
		 (stu + 0).sum = (stu + i).sum;
		 (stu + i).sum = t;
		 t = (stu + 0).num;
		 (stu + 0).num = (stu + i).num;
		 (stu + i).num = t;
		}
		}
		for (i = 2;i < n;i++)
		{
			int t;
		if ((stu + 1).sum < (stu + i).sum)
		{
			t = (stu + 1).sum;
		 (stu + 1).sum = (stu + i).sum;
		 (stu + i).sum = t;
		 t = (stu + 1).num;
		 (stu + 1).num = (stu + i).num;
		 (stu + i).num = t;
		}
		}
		for (i = 3;i < n;i++)
		{
			int t;
		if ((stu + 2).sum < (stu + i).sum)
		{
			t = (stu + 2).sum;
		 (stu + 2).sum = (stu + i).sum;
		 (stu + i).sum = t;
		 t = (stu + 2).num;
		 (stu + 2).num = (stu + i).num;
		 (stu + i).num = t;
		}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",(stu + i).num,(stu + i).sum);
		}
		stu = null;
		return 0;
	}



}

