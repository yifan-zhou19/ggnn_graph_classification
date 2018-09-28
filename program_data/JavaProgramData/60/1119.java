package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int i;
		int j;
		int[] s = new int[10000];
		int t = 0;
		int k = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (j = n;j >= 3;j--)
		{
			t = 0;
			for (i = 2;i <= n / 2;i++)
			{
			   if (j % i == 0 && i != j)
			   {
				   t = 1;
			   }
			}
			if (t == 0)
			{
				s[k] = j;

				k++;
			}
		}


		  t = 0;

		 for (i = k - 1;i > 0;i--)
		 {
			if (s[i] + 2 == s[i - 1])
			{
			System.out.printf("%d %d\n",s[i],s[i - 1]);

			t = 1;
			}
		 }
		 if (t == 0)
		 {
			 System.out.print("empty");
		 }
		return 0;
	}
}

