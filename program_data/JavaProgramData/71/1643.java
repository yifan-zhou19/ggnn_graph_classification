package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int t;
		int N = 0;
		int a;
		int b;
		int c;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}

			 if ((a % 100) == 0)
			 {
				if ((a % 400) == 0)
				{
				month[2] = 29;
				}
			 }
			 else
			 {
				 if ((a) % 4 == 0)
				 {
				 month[2] = 29;
				 }
			 }
			 if (b > c)
			 {
				 t = c;
			 c = b;
			 b = t;
			 }
			 for (j = b;j < c;j++)
			 {
				 N = N + month[j];
			 }
				 month[2] = 28;
				 if ((N % 7) == 0)
				 {
				 System.out.print("YES\n");
				 }
				 else
				 {
				 System.out.print("NO\n");
				 }
				 N = 0;
		}
		 return 0;
	}

}

