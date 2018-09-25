package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int sum;
		int m;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			f = 1;
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 m = Integer.parseInt(tempVar2);
						 }
						 for (j = 0;j < m;j++)
						 {
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 sum = Integer.parseInt(tempVar3);
						 }
		if (((sum + 3 * j) >= 60) && (f) != 0)
		{
			 f = 0;
			 sum = 60 - 3 * j;
			 System.out.printf("%d\n",sum);
		}
		else if (((sum + 3 * j + 3) >= 60) && (f) != 0)
		{
			 f = 0;
			 System.out.printf("%d\n",sum);
		}
						 }
		 if (f != 0)
		 {
			  sum = 60 - 3 * m;
			 System.out.printf("%d\n",sum);
		 }
		}
		return 0;
	}
}

