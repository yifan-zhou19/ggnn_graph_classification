package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] x =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
		int i;
		int j;
		int m;
		int k;
		int total;
		int temp;
		int[] y = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		temp = k;
		for (i = 0;i <= k - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = tempVar2.charAt(0);
		}
		}
		for (i = 0;i <= k - 1;i++)
		{
		y[i] = String.valueOf(x[i]).length();
		}
		for (i = 0;;)
		{
					 System.out.printf("%s",x[i]);
					 total = y[i];
					 temp--;
					 for (j = i + 1;;j++)
					 {
									total = total + y[j] + 1;
									if (total > 80)
									{
										break;
									}
									temp--;
									if (temp == 0)
									{
										break;
									}
					 }
					 if (temp != 0)
					 {
					 for (m = i + 1;m <= j - 1;m++)
					 {
					 System.out.printf(" %s",x[m]);
					 }
					 System.out.print("\n");
					 i = j;
					 }
					 else
					 {
						  for (m = i + 1;m <= k - 1;m++)
						  {
						  System.out.printf(" %s",x[m]);
						  }
						  System.out.print("\n");
						  break;
					 }
		}
	return 0;
	}
}

