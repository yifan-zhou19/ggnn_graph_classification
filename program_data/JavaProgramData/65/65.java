package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int c = 0;
	int f = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct ppp
	//{
	//int a;
	//int b;
	//}
	//p[200];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p[i].a = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		p[i].b = tempVar3;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (((p[i].a == 2) && (p[i].b == 0)) || ((p[i].a == 0) && (p[i].b == 1)) || ((p[i].a == 1) && (p[i].b == 2)))
	{
	c++;
	}
	if (((p[i].a == 2) && (p[i].b == 2)) || ((p[i].a == 0) && (p[i].b == 0)) || ((p[i].a == 1) && (p[i].b == 1)))
	{
	f++;
	}
	}
	if (c > (n - f - c))
	{
		System.out.print("A");
	}
	else if (c < (n - f - c))
	{
		System.out.print("B");
	}

	else
	{
		System.out.print("Tie");
	}


	return 0;
	}

}

