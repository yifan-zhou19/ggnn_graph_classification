package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void swap(int * pt1,int * pt2);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt1,*pt2;
		int pt1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt2;
		int pt2;
		int[] a = new int[100];
		int n;
		int i;

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
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		if (n % 2 == 0)
		{
			for (i = 0;i < n / 2;i++)
			{
				pt1 = a[i];
				pt2 = a[n - 1 - i];
			tangible.RefObject<Integer> tempRef_pt1 = new tangible.RefObject<Integer>(pt1);
			tangible.RefObject<Integer> tempRef_pt2 = new tangible.RefObject<Integer>(pt2);
				swap(tempRef_pt1, tempRef_pt2);
				pt2 = tempRef_pt2.argValue;
				pt1 = tempRef_pt1.argValue;
			}
		}
		else
		{
			for (i = 0;i < n / 2;i++)
			{
				pt1 = a[i];
				pt2 = a[n - 1 - i];
			tangible.RefObject<Integer> tempRef_pt12 = new tangible.RefObject<Integer>(pt1);
			tangible.RefObject<Integer> tempRef_pt22 = new tangible.RefObject<Integer>(pt2);
				swap(tempRef_pt12, tempRef_pt22);
				pt2 = tempRef_pt22.argValue;
				pt1 = tempRef_pt12.argValue;
			}
		}

		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}

	public static void swap(tangible.RefObject<Integer> pt1, tangible.RefObject<Integer> pt2)
	{
		int temp;
		temp = pt1.argValue;
		pt1.argValue = pt2.argValue;
		pt2.argValue = temp;
	}
}

