package <missing>;

public class GlobalMembers
{
	public static int[] monkey = new int[300];

	public static int Main()
	{
		void getking(int n, int m);
		int n = -1;
		int m;

		while (n != 0)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					n = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}

				if (n != 0)
				{
					 getking(n, m);
				}
		}

		return 0;
	}

	public static void getking(int n, int m)
	{

		 int i;
		 int left;
		 int delete_n;
		 int count = 0;


		 for (i = 0; i <= n - 1; i++)
		 {
			   monkey[i] = 1;
		 }

		 left = n;
		 i = n - 1;
		 while (left > 1)
		 {
					while (count < m)
					{

								if (i + 1 >= n)
								{
									 i = 0;
								}
								else
								{
									 i = i + 1;
								}
								count = count + (monkey[i] == 1);
					}

					monkey[i] = 0;
					left = left - 1;
					count = 0;
		 }

		 for (i = 0; i <= n - 1; i++)
		 {
			   if (monkey[i] == 1)
			   {
							System.out.printf("%d\n", i + 1);
			   }
		 }
	}




}

