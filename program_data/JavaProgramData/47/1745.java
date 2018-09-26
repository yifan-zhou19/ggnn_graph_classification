package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int temp;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int n;
		int[] a = new int[102];
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
		p--;
		for (q = a;q - p <= 0;q++,p--)
		{
			temp = q;
			*q = p;
			*p = temp;
		}
		for (p = a;p < a + n;p++)
		{
			System.out.printf("%d%c",*p,(p < a + n - 1)? ' ':'\n');
		}
	}
}

