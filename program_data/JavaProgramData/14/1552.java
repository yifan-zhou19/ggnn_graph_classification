package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int a,b,c;
	//	};
		int i;
		int n;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		stu hd;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		stu * p = new stu();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		hd = p = (stu)malloc(100000 * sizeof(stu));
		for (i = 0;i < n;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.b = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.c = tempVar4;
			}
		}
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	nxt:
	for (p = hd,i = 0;i < n;i++,p++)
	{
			if (p.b + p.c > max)
			{
				max = p.b + p.c;
			}
	}
		for (p = hd,i = 0;i < n;i++,p++)
		{
			if (p.b + p.c == max)
			{
				System.out.printf("%d %d\n",p.a,p.b + p.c);
				p.b = 0;
				p.c = 0;
				max = 0;
				j++;
				break;
			}
		}
		if (j <= 2)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto nxt;
		}

	}
}

