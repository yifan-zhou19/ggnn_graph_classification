package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[301];
		int i;
		int j;
		int[] b = new int[301];
		int g = 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1 = (a + 1);
		int[] p2 = b;
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
		b[0] = a[0];
		for (i = 1;i < n;i++,p1++)
		{
			for (j = 0;j < i;j++)
			{
				if (*p1 == a[j])
				{
				break;
				}
			}
			if (j >= i)
			{
				b[g] = a[i];
				g++;
			}
		}
		for (i = 0;i < g - 1;i++,p2++)
		{
		System.out.printf("%d,",p2[0]);
		}
		System.out.printf("%d",p2[0]);
	}
}

