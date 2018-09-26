package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String N = new String(new char[100]);
		int[] n = new int[100];
		int[] a = new int[100];
		int[] b = new int[100];
		int k;
		int m;
		int e;
		char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = tempVar.charAt(0);
		}
		for (k = 0;k < 100;k++)
		{
			if (N.charAt(k) == '\0')
			{
		   break;
			}
		}
		for (m = 0;m <= 9;m++)
		{
			for (e = 0;e < k;e++)
			{
			if (N.charAt(e) == c[m])
			{
		 n[e] = m;
			}
			}
		}
		if (k == 1)
		{
			System.out.printf("%d\n%d",0,n[0]);
		}
		if (k == 2 && n[0] * 10 + n[1] < 13)
		{
		 System.out.printf("%d\n%d",0,n[0] * 10 + n[1]);
		}
		if (k == 2 && n[0] * 10 + n[1] >= 13)
		{
	System.out.printf("%d\n%d",(n[0] * 10 + n[1]) / 13,(n[0] * 10 + n[1]) % 13);
		}
		if (k > 2)
		{
			 b[0] = n[0];
		 a[0] = (b[0] * 10 + n[1]) / 13;
		 if (a[0] != 0)
		 {
			 System.out.printf("%d",a[0]);
		 }
		 for (e = 0;e < k - 1;e++)
		 {
			 b[e+1] = (10 * b[e] + n[e+1]) % 13;
		 }
		 for (e = 1;e < k - 1;e++)
		 {
			 a[e] = (b[e] * 10 + n[e+1]) / 13;
		 System.out.printf("%d",a[e]);
		 }
		 System.out.printf("\n%d",b[k - 1]);
		}
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}
}

