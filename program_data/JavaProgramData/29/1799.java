package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k = 1;
		float sum;
		float d;
		float a;
		float b;
		float c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = 1F,b = 2F,sum = 0F;
		for (i = 1;i <= m;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			 while (k <= n)
			 {
						d = b / a;
						sum = sum + d;
						c = b;
						b = b + a;
						a = c;
						k = k + 1;
			 }
			 System.out.printf("%.3f\n",sum);
			 sum = 0F;
			 k = 1;
			 a = 1F;
			 b = 2F;
			 c = 2F;


		}
			 return 0;
	}
}

