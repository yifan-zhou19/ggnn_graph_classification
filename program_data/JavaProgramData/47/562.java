package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		for (int i = 0;i < n;i++)
		{
			int x;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			a[i] = x;
		}
		int[] pi = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pj = a + n;
		int t;
		for (;pi < pj;pi++,pj--)
		{
			t = pi[0];
			pi[0] = pj;
			*pj = t;
		}
		for (int k = 1;k < n;k++)
		{
			System.out.printf("%d ",a[k]);
		}
			 System.out.printf("%d",a[n]);
		return 0;
	}

}

