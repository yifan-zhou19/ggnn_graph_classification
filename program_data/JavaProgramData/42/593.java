package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j;
		int k;
		int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p++ = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		p = a;
		for (i = 0;i < n;i++)
		{
				if (*(p + i) == k)
				{
					n--;
					for (j = i;j < n;j++)
					{
					 *(p + j) = *(p + j + 1);
					}
					i--;
				}
		}
		for (i = 0;i < n - 1;i++)
		{
				System.out.printf("%d ",*p++);
		}
		p = a;
		System.out.printf("%d",*(p + n - 1));
	}
}

