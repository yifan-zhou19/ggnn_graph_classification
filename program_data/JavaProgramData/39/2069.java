package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int total = 0;
		int max = 0;
		int maxi = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct list
	//	{
	//		char name[20];
	//		int score;
	//		int rate;
	//		char leader;
	//		char west;
	//		int pap;
	//		int schol;
	//	};
		list start;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		list * p1 = new list();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		start = (list)calloc(n,sizeof(list));
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p1=start;
		p1.copyFrom(start);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p1.name) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p1.score) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(p1.rate) = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				(p1.leader) = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				(p1.west) = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				(p1.pap) = tempVar7;
			}
			System.in.read();
			p1.schol = 0;
			if (p1.score > 80 && p1.pap > 0)
			{
				p1.schol += 8000;
			}
			if (p1.score > 85 && p1.rate > 80)
			{
				p1.schol += 4000;
			}
			if (p1.score > 90)
			{
				p1.schol += 2000;
			}
			if (p1.score > 85 && p1.west == 'Y')
			{
				p1.schol += 1000;
			}
			if (p1.rate > 80 && p1.leader == 'Y')
			{
				p1.schol += 850;
			}
			total += p1.schol;
			if (p1.schol > max)
			{
					max = p1.schol;
					maxi = i;
			}
			p1++;
		}
		System.out.printf("%s\n%d\n%d\n", (start + maxi).name, (start + maxi).schol, total);
		return 0;
	}
}

