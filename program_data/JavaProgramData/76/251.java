package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int q;
	int l;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct qujian
	//{
	//int x,y;
	//}
	//asd[50001];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(asd[i].x) = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(asd[i].y) = tempVar3;
		}
	}
	for (i = 0;i < n;i++)
	{
		for (l = 0;l < n - 1;l++)
		{
		if (asd[l].x > asd[l + 1].x)
		{
		k = asd[l].x;
	asd[l].x = asd[l + 1].x;
	asd[l + 1].x = k;
		}
	if (asd[l].y > asd[l + 1].y)
	{
		k = asd[l].y;
	asd[l].y = asd[l + 1].y;
	asd[l + 1].y = k;
	}
		}
	}
	q = 1;

	for (i = asd[0].x;i <= asd[n - 1].y;i++)
	{
		for (l = 0;l < n;l++)
		{
		if (asd[l + 1].x > asd[l].y)
		{
	if ((i <= asd[l + 1].x) && (i >= asd[l].y))
	{
		q = 0;
	}
		}
		}
	}
	if (q == 1)
	{
		System.out.printf("%d %d",asd[0].x,asd[n - 1].y);
	}

	else if (q == 0)
	{
		System.out.print("no");
	}

	return 0;
	}

}

