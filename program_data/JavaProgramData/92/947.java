package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tian;
		int tian;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *lord;
		int lord;
		int i;
		int j;
		int[] x = new int[500];
		int t;
		int sumnum = 0;
		int sum;
		int ta;
		int tb;
		int la;
		int lb;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		tian = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		lord = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tian + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				lord + i = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (*(tian + i) < *(tian + i + 1))
				{
					t = (tian + i);
					*(tian + i) = *(tian + i + 1);
					*(tian + i + 1) = t;
				}
			}
		}

		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (*(lord + i) < *(lord + i + 1))
				{
					t = (lord + i);
					*(lord + i) = *(lord + i + 1);
					*(lord + i + 1) = t;
				}
			}
		}
				ta = 0,la = 0,tb = n - 1,lb = n - 1;
				sum = 0;
				while (ta != tb)
				{
					if (*(tian + tb) < *(lord + lb))
					{
						tb--;
						la++;
						sum--;
					}
					else if (*(tian + tb) > *(lord + lb))
					{
						tb--;
						lb--;
						sum++;
					}
					else if (*(tian + ta) < *(lord + la))
					{
						tb--;
						la++;
						sum--;
					}
					else if (*(tian + ta) > *(lord + la))
					{
						ta++;
						la++;
						sum++;
					}
					else if (*(tian + tb) < *(lord + la))
					{
						tb--;
						la++;
						sum--;
					}
					else if (*(tian + tb) > *(lord + la))
					{
						tb--;
						la++;
						sum++;
					}
					else
					{
						tb--;
						la++;
					}
				}
				if (*(tian + ta) > *(lord + la))
				{
					sum++;
				}
				else if (*(tian + ta) < *(lord + la))
				{
					sum--;
				}

		x[sumnum] = sum;
		sumnum++;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		}

		for (i = 0;i < sumnum;i++)
		{
		System.out.printf("%d\n",x[i] * 200);
		}
	}
}

