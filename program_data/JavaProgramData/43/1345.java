package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int j;
	 int i;
	 char[] isprime = {0, 0};
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 2;i <= n;i++)
	 {
		 isprime[i] = 1;
	 }
	 for (i = 2;i <= n / 2;i++)
	 {
		 if (isprime[i] != null)
		 {
			 for (j = i + i;j <= n;j += i)
			 {
				 isprime[j] = 0;
			 }
		 }
	 }

		for (j = 2;j <= n / 2;j++)
		{
			if (isprime[j] && isprime[n - j])
			{
				System.out.printf("%d %d\n",j,n - j);
			}
		}


	return 0;
	}

}

