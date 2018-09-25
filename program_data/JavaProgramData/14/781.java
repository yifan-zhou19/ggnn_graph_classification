package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int chi;
	//		int math;
	//		int sum;
	//	};
		student fig;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		fig = (student)malloc(sizeof(student) * n);
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int numa = 0;
		int numb = 0;
		int numc = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(fig + i).num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(fig + i).chi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(fig + i).math = tempVar4;
			}
			(fig + i).sum = (fig + i).chi + (fig + i).math;
			if ((fig + i).sum > a)
			{
				c = b;
				numc = numb;
				b = a;
				numb = numa;
				a = (fig + i).sum;
				numa = (fig + i).num;
			}
			else if ((fig + i).sum > b)
			{
				c = b;
				numc = numb;
				b = (fig + i).sum;
				numb = (fig + i).num;
			}
			else if ((fig + i).sum > c)
			{
				c = (fig + i).sum;
				numc = (fig + i).num;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",numa,a,numb,b,numc,c);
		return 0;

	}

}

