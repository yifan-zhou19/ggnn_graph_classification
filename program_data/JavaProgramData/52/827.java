package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *ptr1,*ptr2,i,n,number,a[1000];
		int ptr1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *ptr2;
		int ptr2;
		int i;
		int n;
		int number;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < number; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		ptr1 = a;
		ptr2 = ptr1 + number - n;
		for (i = 1; i <= n; i++)
		{
			System.out.printf("%d ", ptr2);
			ptr2++;
		}
		for (i = 1; i < (number - n); i++)
		{
			System.out.printf("%d ", ptr1);
			ptr1++;
		}
		System.out.printf("%d", (ptr1));
	}

}

