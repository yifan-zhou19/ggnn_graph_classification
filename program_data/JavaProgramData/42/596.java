package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[n - 1] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			k = Integer.parseInt(tempVar4);
		}
		p = a;
		for (i = 0;i < n;i++,p++)
		{
			if (*p == k)
			{
				for (q = p;q < a + n;q++)
				{
					*(q) = (q + 1);
				}
				i--;
				n--;
				p--;
			}
		}
		p = a;
		System.out.printf("%d",*p);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",*(p + i));
		}

	}
}

