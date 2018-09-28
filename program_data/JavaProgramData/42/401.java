package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		 int[] d = new int[100000]; //?????n?k?i?????count
		 int n;
		 int k;
		 int i;
		 int count = 0;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = 0;i < n;i++) //??????
		 {
			d[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = n - 1;i >= 0;i--) //?????????????????
		 {
			 if (d[i] == k)
			 {
				for (int j = i + 1;j < n;j++)
				{
					d[j - 1] = d[j];
				}
							count++;

			 }
		 }
		if (count == n)
		{
			System.out.print(" ");
			System.out.print("\n");
		}
		else
		{
			System.out.print(d[0]);
					for (int i = 1;i < n - count;i++) //?1?n-1??????????
					{
					System.out.print(" ");
					System.out.print(d[i]);
					}
					System.out.print("\n");

		}

		 return 0; //?????

	}











}

