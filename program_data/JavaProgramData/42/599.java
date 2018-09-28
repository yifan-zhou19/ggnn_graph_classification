package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int n;
		int m;
		int k;
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
		p = a;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if ((*p) == k)
			{
				for (j = 0;j < n - i - 1;j++)
				{
					*(p + j) = *(p + j + 1);
				}
				n = n - 1;
				p--;
				i--;
			}
			p++;
		}
		p = a;
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",*p);
			p = p + 1;
		}
		System.out.printf("%d",*p);
	}
}

