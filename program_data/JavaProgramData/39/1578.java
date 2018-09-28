package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//{
	//	char name[20],o,w;
	//int score,cla,paper;
	//}
	//n[100];
	int t = 0;
	int N;
	int i;
	int j;
	int[] m = new int[100];
	int[] e = new int[100];
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (i = 0;i < N;i++)
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
	for (i = 0;i < N;i++)
	{
		m[i] = 0;
	if (n[i].cla > 80 && n[i].o == 'Y')
	{
		m[i] += 850;
	}
	if (n[i].score > 85 && n[i].w == 'Y')
	{
		m[i] += 1000;
	}
	if (n[i].score > 90)
	{
		m[i] += 2000;
	}
	if (n[i].score > 85 && n[i].cla > 80)
	{
		m[i] += 4000;
	}
	if (n[i].score > 80 && n[i].paper)
	{
		m[i] += 8000;
	}
	}
	for (i = 0;i < N;i++)
	{
	e[i] = i;
	}
	for (i = 0;i < N;i++)
	{
	for (j = i;j < N;j++)
	{
		if (m[e[i]] < m[e[j]])
		{
			k = e[i];
			e[i] = e[j];
			e[j] = k;
		}
	}
	}
	System.out.printf("%s\n%d\n",n[e[0]].name,m[e[0]]);
	for (i = 0;i < N;i++)
	{
	 t += m[i];
	}
	System.out.printf("%d",t);
	return 0;
	}
}

