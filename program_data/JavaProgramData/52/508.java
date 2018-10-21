package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'point', so pointers on this parameter are left unchanged:
	public static void last_to_first(int * point, int lenth_of_n)
	{
		int last;
		int i;
		point = (point + lenth_of_n - 1);
		last = point;

		for (i = 1;i < lenth_of_n;i++)
		{
			*(point) = (point - 1);
			point = point - 1;
		}

		*point = last;
	}

	public static void Main()
	{
		int[] num = new int[100];
		int n;
		int m;
		int i;
		int[] point = num;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point = Integer.parseInt(tempVar3);
			}
			point++;
		}

		for (i = 0;i < m;i++)
		{
			last_to_first(num, n);
		}

		point = num;
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",point[0]);
			point++;

		}

	}

}

