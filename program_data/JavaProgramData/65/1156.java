package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct
	//{
	//int a,b;
	//}
	//sz[100];
	int n;
	int i;
	int x = 0;
	int y = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i].a = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		sz[i].b = tempVar3;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (sz[i].a - sz[i].b == -1 || sz[i].a - sz[i].b == 2)
	{
		x++;
	}
	else if (sz[i].a - sz[i].b == 1 || sz[i].a - sz[i].b == -2)
	{
		y++;
	}
	else
	{
		continue;
	}
	}
	if (x > y)
	{
		System.out.print("A");
	}
	else if (x == y)
	{
		System.out.print("Tie");
	}
	else
	{
		System.out.print("B");
	}
	return 0;
	}


}

