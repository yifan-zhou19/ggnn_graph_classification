package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = a;
		for (i = 3;i <= n;i = i + 2)
		{
			for (j = 3;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				*p = i;
				p++;
			}
		}
		k = p - a;
		for (i = 1;i < k;i++)
		{
			if (a[i] == a[i - 1] + 2)
			{
				System.out.printf("%d %d\n",a[i - 1],a[i]);
			}
		}
		if (a[1] == 0)
		{
			System.out.print("empty");
		}
	}

}

