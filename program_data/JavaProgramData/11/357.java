package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		{
			int[] a = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
			d = a[b - 1] + c;
			System.out.printf("%d\n", d);
		}
		else
		{
			int[] a = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
			d = a[b - 1] + c;
			System.out.printf("%d\n", d);
		}
		return 0;
	}
}

