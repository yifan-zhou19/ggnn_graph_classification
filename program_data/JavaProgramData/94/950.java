package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N = 0; //N?????N  k????? i j???????
		int i = 0;
		int k = 0;
		int j = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] s = new int[N];
		 for (i = 0;i <= N - 1;i++)
		 {
		 s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (i = 0;i <= N - 1;i++)
		 {
		   if (s[i] % 2 != 0)
		   {
			   s[k] = s[i];
			   k++;
		   }

		 }
			for (i = 0;i <= k;i++)
			{
				 for (j = i;j <= k - i - 1;j++)
				 {
					 if (s[j - 1] > s[j])
					 {
					 s[j - 1] = s[j - 1] ^ s[j];
					 s[j] = s[j] ^ s[j - 1];
					 s[j - 1] = s[j - 1] ^ s[j];
					 }
				 }
			}
	for (i = 0;i <= k - 1;i++)
	{
	if (i == 0)
	{
	System.out.print(s[i]);
	}
	if (i != 0)
	{
	System.out.print(",");
	System.out.print(s[i]);
	}
	}

	return 0;
	}
}

