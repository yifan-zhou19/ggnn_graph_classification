package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[100];
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int i;
		int temp;
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
				s + i = tempVar2;
			}
		}
		p = s;
		q = s + n - 1;
		while (p < q)
		{
			temp = p;
			*p = q;
			*q = temp;
			p++;
			q--;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",s[i]);
		}
		System.out.printf("%d",s[n - 1]);
		return 0;
	}
}

