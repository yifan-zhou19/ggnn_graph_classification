package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ship
	//{
	//char name[20],o,w;
	//int score,cla,paper,totle;
	//struct ship *next;
	//}
	//n[100];
	int T = 0;
	int N;
	int i;
	int m = 0;
	String temp = new String(new char[20]);
	ship head = n[0];
	ship p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (i = 0;i < N;i++) //????//
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n[i].name = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		n[i].score = tempVar3;
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		n[i].cla = tempVar4;
	}
	String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar5 != null)
	{
		n[i].o = tempVar5;
	}
	String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar6 != null)
	{
		n[i].w = tempVar6;
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		n[i].paper = tempVar7;
	}
	}
	for (i = 0;i < N - 1;i++)
	{
	n[i].next = &n[i + 1];
	}
	n[N - 1].next = null;



	for (i = 0;i < N;i++) //scholarship for everyone//
	{
		n[i].totle = 0;
	if (n[i].cla > 80 && n[i].o == 'Y')
	{
		n[i].totle += 850;
	}
	if (n[i].score > 85 && n[i].w == 'Y')
	{
		n[i].totle += 1000;
	}
	if (n[i].score > 90)
	{
		n[i].totle += 2000;
	}
	if (n[i].score > 85 && n[i].cla > 80)
	{
		n[i].totle += 4000;
	}
	if (n[i].score > 80 && n[i].paper)
	{
		n[i].totle += 8000;
	}
	}

	for (i = 0;i < N;i++) //sort the scholarships ; incresing//
	{
	if (n[m].totle < n[i].totle)
	{
		m = i;
	}
	}

	p = head;
	do
	{
	 T += p.totle;
	 p = p.next;
	} while (p != null); //T is the entire scholarship//
	System.out.printf("%s\n%d\n%d",n[m].name,n[m].totle,T);
	return 0;
	}
}

