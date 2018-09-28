package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int i;
		int k;
		int num = 0;
		int[] p = a;
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
				p + i = tempVar2;
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n - num;i++)
		{
			if (p[i] == k)
			{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
				int * j = p + i;
				for (;j < a + n - num;j++)
				{
					*j = (j + 1);
				}
				i--;
				num++;
			}
		}
		for (i = 0;i < n - num - 1;i++)
		{
			System.out.printf("%d ",p[i]);
		}
	System.out.printf("%d",p[n - num - 1]);
		return 0;
	}
}

