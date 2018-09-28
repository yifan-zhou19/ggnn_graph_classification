package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void sort(int * p,int n);
		int n1;
		int n2;
		int[] a = new int[50];
		int[] b = new int[50];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pa,*pb;
		int pa;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pb;
		int pb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		pa = a[0];
		pb = b[0];
	tangible.RefObject<Integer> tempRef_pa = new tangible.RefObject<Integer>(pa);
		sort(tempRef_pa, n1); //????????????*
		pa = tempRef_pa.argValue;
	tangible.RefObject<Integer> tempRef_pb = new tangible.RefObject<Integer>(pb);
		sort(tempRef_pb, n2);
		pb = tempRef_pb.argValue;
		for (i = 0;i < n1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < n2 - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d\n",b[n2 - 1]);
	}

	public static void sort(tangible.RefObject<Integer> p, int n)
	{
		int i;
		int j;
		int temp;
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (*(p.argValue + j) > *(p.argValue + j + 1))
				{
					temp = (p.argValue + j);
					*(p.argValue + j) = *(p.argValue + j + 1);
					*(p.argValue + j + 1) = temp;
				}
			}
		}
	}
}

