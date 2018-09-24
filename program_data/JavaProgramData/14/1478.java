package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int first;
		int second;
		int third;
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct mark
	//	{
	//		int ID,chinese,math,sum;
	//	}
	//	*num;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		num = (mark)malloc(sizeof(mark) * n);
		int n1;
		int c1;
		int m1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m1 = Integer.parseInt(tempVar4);
			}
			num[i].ID = n1;
			num[i].chinese = c1;
			num[i].math = m1;
			num[i].sum = c1 + m1;
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				first = num[i].sum;
				second = num[i].sum;
				third = num[i].sum;
				x = num[i].ID;
				y = num[i].ID;
				z = num[i].ID;
			}
			else if (i == 1)
			{
				if (num[i].sum > first)
				{
					first = num[i].sum;
					x = num[i].ID;
				}
				else
				{
					third = num[i].sum;
					z = num[i].ID;
				}

			}
			else
			{
				if (num[i].sum > first)
				{
					third = second;
					z = y;
					second = first;
					y = x;
					first = num[i].sum;
					x = num[i].ID;
				}
				else if (num[i].sum > second)
				{
					third = second;
					z = y;
					second = num[i].sum;
					y = num[i].ID;
				}
				else if (num[i].sum > third)
				{
					third = num[i].sum;
					z = num[i].ID;
				}
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",x,first,y,second,z,third);
		return 0;
	}
}

