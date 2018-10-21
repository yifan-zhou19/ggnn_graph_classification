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
	int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int i;
	int j;
	int k;
	for (i = 1;i <= 12;i++)
	{
		int days = 0;
		for (j = i - 1;j >= 0;j--)
		{
		days = days + month[j];
		}
		days += 13;
	   k = n - 1 + days % 7;
	   if (k == 0)
	   {
			 k = 7;
	   }
		else if (k > 7)
		{
			k = k - 7;
		}
		 if (k == 5)
		 {
		   System.out.printf("%d\n",i);
		 }
	}
	return 0;
	}


}

