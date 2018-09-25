package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int[] a = new int[13];
		int p;
		int q;
		int i;
		int b;
		int sum = 0;
		int c;
		int temp = 0;
		a[1] = 31;
		a[3] = 31;
		a[4] = 30;
		a[5] = 31;
		a[6] = 30;
		a[7] = 31;
		a[8] = 31;
		a[9] = 30;
		a[10] = 31;
		a[11] = 30;
		a[12] = 31;
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
				 y = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 p = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 q = Integer.parseInt(tempVar4);
			 }
			 if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			 {
				 a[2] = 29;
				 if (p > q)
				 {
					 for (b = q;b < p;b++)
					 {
						 sum += a[b];
					 };
				 }
				 else
				 {
					 for (b = p;b < q;b++)
					 {
						 sum += a[b];
					 };
				 }
				 if (sum % 7 == 0)
				 {
					 System.out.print("YES\n");
				 }
				 else
				 {
					 System.out.print("NO\n");
				 }
				 sum = 0;
			 }
			 else
			 {
				 a[2] = 28;
				 if (p > q)
				 {
					 for (c = q;c < p;c++)
					 {
						 temp += a[c];
					 };
				 }
				 else
				 {
					 for (c = p;c < q;c++)
					 {
						 temp += a[c];
					 };
				 }
				 if (temp % 7 == 0)
				 {
					 System.out.print("YES\n");
				 }
				 else
				 {
					 System.out.print("NO\n");
				 }
				 temp = 0;
			 }
		}
		return 0;
	}
}

