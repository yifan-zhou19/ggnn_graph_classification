package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c = 0;
		int j;
		int[] B = new int[300];
		B[1] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		   for (j = 1;j < 300;j++)
		   {
				  B[j] = B[j] * 2 + c;
				  c = 0;
			   if (B[j] >= 10)
			   {
					B[j] -= 10;
					c = 1;
			   }
		   }
		}
		for (i = 288;i > 0;i--)
		{
			if (B[i] != 0)
			{
			  break;
			}
		}
		for (j = i;j > 0;j--)
		{
			System.out.printf("%d",B[j]);
		}
		return 0;
	}
}

