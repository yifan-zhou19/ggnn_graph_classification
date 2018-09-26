package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] array = new int[5][5];
		int n;
		int m;
		int i;
		int z;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int panduan = new int(int,int);
		void zhuanhuan(int *,int*);
		for (i = 0;i < 5;i++)
		{
			p = array[i];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p + 1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p + 2 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p + 3 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p + 4 = Integer.parseInt(tempVar5);
			}
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			n = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			m = Integer.parseInt(tempVar7);
		}
		z = panduan(n, m);
		if (z == 1)
		{
			zhuanhuan(array[n], array[m]);
			for (i = 0;i < 5;i++)
			{
			p = array[i];
			System.out.printf("%d %d %d %d %d\n", p,*(p + 1),*(p + 2),*(p + 3),*(p + 4));
			}
		}
		if (z == 0)
		{
			System.out.print("error\n");
		}
	}

	public static int panduan(int n,int m)
	{
		int z = 1;
		if (n < 0 || n>4)
		{
			z = 0;
		}
		if (m < 0 || m>4)
		{
			z = 0;
		}
		return (z);
	}

	public static void zhuanhuan(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		int temp;
		int i;
		for (i = 0;i < 5;i++)
		{
			temp = (a.argValue + i);
			*(a.argValue + i) = *(b.argValue + i);
			*(b.argValue + i) = temp;
		}
	}
}

