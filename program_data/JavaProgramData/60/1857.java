package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		 System.out.print("empty");
		}
		else
		{
			int i;
			int j;
			int k;
			for (i = 3;i <= n - 2;i++)
			{
				 for (j = 2;j <= Math.sqrt(i);j++)
				 {
					 if (i % j == 0)
					 {
					 break;
					 }
				 }
				 if (j > Math.sqrt(i))
				 {
					 for (k = 2;k <= Math.sqrt(i + 2);k++)
					 {
						if ((i + 2) % k == 0)
						{
						break;
						}
					 }
					 if (k > Math.sqrt(i + 2))
					 {
					   System.out.printf("%d %d\n",i,i + 2);
					 }
				 }
			}
		}
	}
}

