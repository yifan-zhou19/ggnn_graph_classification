package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int s = 0;
		int k = 0;
		int n;
		int b;
		int c;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			k++;
		 a = k % 7;
		 if (a != 0)
		 {
			  b = k / 10;
		   c = k - 10 * b;
		   if (b != 7 && c != 7)
		   {
		   s += i * i;
		   }
		 }
		}
		System.out.printf("%d",s);
		return 0;
	}
}

