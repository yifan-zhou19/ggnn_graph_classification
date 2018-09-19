package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[3];
		int leap = 1;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a[1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[2] = Integer.parseInt(tempVar3);
		}
		if ((((a[0] % 4) && !(a[0] % 100))) || (a[0] % 400))
		{
			 leap = 0;
		}
		if (a[1] == 1)
		{
			day = a[2];
		}
		if (a[1] == 2)
		{
			day = a[2] + 31;
		}
		if (a[1] == 3)
		{
			day = a[2] + 59 + leap;
		}
		if (a[1] == 4)
		{
			day = a[2] + 90 + leap;
		}
		if (a[1] == 5)
		{
			day = a[2] + 120 + leap;
		}
		if (a[1] == 6)
		{
			day = a[2] + 151 + leap;
		}
		if (a[1] == 7)
		{
			day = a[2] + 181 + leap;
		}
		if (a[1] == 8)
		{
			day = a[2] + 212 + leap;
		}
		if (a[1] == 9)
		{
			day = a[2] + 243 + leap;
		}
		if (a[1] == 10)
		{
			day = a[2] + 273 + leap;
		}
		if (a[1] == 11)
		{
			day = a[2] + 304 + leap;
		}
		if (a[1] == 12)
		{
			day = a[2] + 334 + leap;
		}
		System.out.printf("%d",day);
	}
}

