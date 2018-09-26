package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int m;
		int n;
		int i;
		int t;
		int[] a = new int[13];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			year = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
		{
			 a[0] = 0;
			 a[1] = 0;
			 a[2] = 31;
			 a[3] = 60;
			 a[4] = 91;
			 a[5] = 121;
			 a[6] = 152;
			 a[7] = 182;
			 a[8] = 213;
			 a[9] = 244;
			 a[10] = 274;
			 a[11] = 305;
			 a[12] = 335;
			 if ((a[m] - a[n]) % 7 == 0)
			 {
			 System.out.print("YES\n");
			 }
			 else
			 {
			 System.out.print("NO\n");
			 }
		}
		else
		{
			a[0] = 0;
			 a[1] = 0;
			 a[2] = 31;
			 a[3] = 59;
			 a[4] = 90;
			 a[5] = 120;
			 a[6] = 151;
			 a[7] = 181;
			 a[8] = 212;
			 a[9] = 243;
			 a[10] = 273;
			 a[11] = 304;
			 a[12] = 334;
			 if ((a[m] - a[n]) % 7 == 0)
			 {
			 System.out.print("YES\n");
			 }
			 else
			 {
			 System.out.print("NO\n");
			 }
		}
		}
		return 0;
	}
}

