package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] b = new int[200];
		int c;
		int e;
		int k;
		int[] a = new int[13];
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = a[1] = 0;
		a[5] = a[7] = a[10] = a[12] = 30;
		a[2] = a[4] = a[6] = a[8] = a[9] = a[11] = 31;
		a[3] = 28;
		for (k = 3;k <= 12;k++)
		{
					 a[k] += a[k - 1];
		}

		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 y = Integer.parseInt(tempVar2);
			 }
			 if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			 {
				 for (k = 3;k < 13;k++)
				 {
					 a[k] += 1;
				 }
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 c = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 e = Integer.parseInt(tempVar4);
			 }
			 if (c < e)
			 {
				 int t;
				 t = c;
				 c = e;
				 e = t;
			 }
			 if ((a[c] - a[e]) % 7 == 0)
			 {
				b[i] = 0;
			 }
			 else
			 {
				 b[i] = 1;
			 }
			 if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			 {
				 for (k = 3;k < 13;k++)
				 {
					 a[k] -= 1;
				 }
			 }
		}

		 for (i = 0;i < n;i++)
		 {
			 if (b[i] == 0)
			 {
			System.out.print("YES\n");
			 }
			 else
			 {
				 System.out.print("NO\n");
			 }
		 }
		return 0;
	}

}

