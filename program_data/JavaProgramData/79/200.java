package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void search(int m,int n);
		int m;
		int n;
		int k = 1;
		int i;
		int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[] a = new int[300];
		int[][] b = new int[10][2];
		for (i = 0;;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b[i][1] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[i][2] = Integer.parseInt(tempVar2);
		}
		if (b[i][1] == 0)
		{
			break;
		}
		}
	for (j = 0;j < i;j++)
	{
		search(b[j][1], b[j][2]);
	}
	}


	public static void search(int m,int n)
	{
		int k = 0;
		int i;
		int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[] a = new int[300];
		p = a;
		for (i = 0;i < m;i++)
		{
			*(p + i) = i + 1;
		}
		i = 0;

		while (j < m - 1)
		{
			if (*(p + i) != 0)
			{
				k++;
			}
		if (k == n)
		{
			*(p + i) = 0;
			k = 0;
			j++;
		}
		i++;
		if (i == m)
		{
			i = 0;
		}
		}
		while (p == 0)
		{
			p++;
		}
		 System.out.printf("%d\n", p);
	}



}

