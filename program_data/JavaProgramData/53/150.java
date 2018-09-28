package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 1;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2;
		p1 = a;
		p2 = b;
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
		*p2 = p1;
		for (i = 1,p1 = p1 + 1;i < n;i++,p1++)
		{
			p2 = b;
			for (j = 0;j < k;j++)
			{
				if (*p2 == *p1)
				{
					break;
				}
				p2++;
				if (j == k - 1)
				{
					*p2 = p1;
					k++;
				}
			}
		}
		p2 = b;
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",*(p2 + i));
		}
		System.out.printf("%d",*(p2 + k - 1));

	}
}

