package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 1;
		int a;
		int b;
		int c;
		int i;
		int n;
		int j;
		float x;
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 n = Integer.parseInt(tempVar2);
						 }
						 a = 1;
						 b = 1;
						 sum = 0F;
						 j = 1;
						 while (j <= n)
						 {
									c = a + b;
									a = b;
									b = c;
									x = (float)b / a;
									sum = sum + x;
									j = j + 1;
						 }
									System.out.printf("%.3f\n",sum);
		}
															  return 0;
	}

}

