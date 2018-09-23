package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int d;
		int sum = 0;
		int[] a = new int[20];
		a[0] = 0;
		a[1] = 31;
		a[2] = 59;
		a[3] = 90;
		a[4] = 120;
		a[5] = 151;
		a[6] = 181;
		a[7] = 212;
		a[8] = 243;
		a[9] = 273;
		a[10] = 304;
		a[11] = 334;
		a[12] = 365;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if ((b % 4 != 0) || (b % 100 == 0 && b % 400 != 0))
		{
			sum = a[c - 1] + d;
		}
		else
		{
			 if (c < 3)
			 {
			 sum = a[c - 1] + d;
			 }
			 else
			 {
				 sum = a[c - 1] + d + 1;
			 }
		}
		System.out.printf("%d", sum);
		return 0;
	}
}

