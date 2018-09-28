package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int m;
		int t;
		int[] cf = new int[100];
		int jinwei = 0;
		cf[0] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = 0;
		for (i = 0;i < n;i++)
		{
						 for (k = 0;k <= t;k++)
						 {
										   cf[k] = cf[k] * 2 + jinwei;
										   if (cf[k] >= 10)
										   {
													   cf[k] = cf[k] % 10;
													   jinwei = 1;
										   }
													   else
													   {
															jinwei = 0;
													   }
						 }
						 for (m = 99;cf[m] == 0;m--)
						 {
							 ;
						 }
						 t = m + 1;
		}
		for (i = 99;cf[i] == 0;i--)
		{
			;
		}
		for (;i >= 0;i--)
		{
					   System.out.printf("%d",cf[i]);
		}

		return 0;
	}
}

