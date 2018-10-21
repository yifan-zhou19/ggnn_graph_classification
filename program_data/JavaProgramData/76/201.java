package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n; //have_a_gap?1?,?????.
	int i;
	int j;
	int min;
	int max;
	int have_a_gap = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct Space
	//{
	//int left,right;
	//}
	spaces[n],temp; //????,???????????

	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			spaces[i].left = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			spaces[i].right = tempVar3;
		}
	}

	for (i = 0;i < n - 1;i++) //??n-1?,??
	{
		for (j = 0;j < n - 1 - i;j++)
		{
			if (spaces[j].left > spaces[j + 1].left)
			{
				temp = spaces[j];
				spaces[j] = spaces[j + 1];
				spaces[j + 1] = temp;
			}
		}
	}

	min = spaces[0].left;
	max = spaces[0].right;


	for (i = 0;i < n - 1;i++)
	{
		if (max < (spaces[i + 1].left)) //????
		{
			have_a_gap = 1;
			System.out.print("no");
			break;
		}
		else //??????
		{
			if (spaces[i + 1].right > max)
			{
				max = spaces[i + 1].right;
			}
		}
	}

	if (have_a_gap == 0)
	{
		System.out.printf("%d %d",min,max);
	}

	return 0;
	}
}

