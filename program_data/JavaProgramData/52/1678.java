package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int n;
		int m;

		p = a[0];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}

		for (p = a[0];p <= a + n - 1;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}

		p = a + n - m;
		while (true)
		{

			System.out.printf("%d", *p);
			p++;
			//printf("[%g]", p);
			if (p != a + n - m)
			{
				System.out.print(" ");
			}
			if (p > a + n - 1)
			{
				p -= n;
			}
			if (p == a + n - m)
			{
				break;
			}
		}
	}

}

