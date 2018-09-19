package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//stu create();
	public static int compare(Object a, Object b)
	{
	  return ((int)b - (int)a);
	}
	public static int Main()
	{
		int i;
		int j = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//			int num;
	//			int chi;
	//			int math;
	//			int total;
	//	};
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		stu * p = (stu)calloc(n,sizeof(stu));
		stu a = p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tot=(int *)calloc(n, sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		int tot = (int)calloc(n, (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.chi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.math = tempVar4;
			}
			*(tot + i) = p.total = p.chi + p.math;
			p++;
		}
		qsort(tot, n, (Integer.SIZE / Byte.SIZE), compare);
		for (i = 0;i < 3;i++,j = 0)
		{
			while ((a + (j++)).total != *(tot + i))
			{
				;
			}
			System.out.printf("%d %d\n", (a + j - 1).num, (a + j - 1).total);
			(a + j - 1).total = -1;
		}

		return 0;

	}
}

