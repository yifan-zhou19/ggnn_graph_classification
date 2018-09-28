package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] j = new int[6];
		int[] k = new int[6];
		int reverse = int n;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				j[i] = Integer.parseInt(tempVar);
			}
			k[i] = reverse(j[i]);
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",k[i]);
		}


	}

		 public static int reverse(int n)
		 {
			 int N;
			 int i;
			 int j = 0;
			 int revn = 0;
				N = n;
				if (n < 0)
				{
				n = -n;
				}
				for (;n != 0;)
				{
					j = n % 10;
					revn = revn * 10 + j;
					n = n / 10;
				}
				if (N < 0)
				{
				revn = -revn;
				}
				return (revn);






		 }

}

