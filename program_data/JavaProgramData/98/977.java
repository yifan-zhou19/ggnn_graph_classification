package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j;
		char b;
		cin.get(b);
		int[] num = new int[1000];
		for (i = 1;i < n;i++)
		{
			   j = 1;
				 while (true)
				 {
				 cin.get(b);
				 if (b == ' ')
				 {
						num[i] = j - 1;
						break;
				 }
				 else
				 {
					   *(*(a + i) + j) = b;
					   j = j + 1;
				 }
				 }
		}
		j = 1;
		 while (true)
		 {
				 cin.get(b);
				 if (b == '\n')
				 {
						num[i] = j - 1;
						break;
				 }
				 else
				 {
					   *(*(a + i) + j) = b;
					   j = j + 1;
				 }
		 }
		int sum = 0;

		for (i = 1;i <= n;i++)
		{
			  if (sum == 0)
			  {
					 for (j = 1;j <= num[i];j++)
					 {
						System.out.print((*(a + i) + j));

					 }
				  sum = sum + num[i];
			  }
			   else if (sum + num[i] + 1 <= 80)
			   {
					 System.out.print(' ');
				   for (j = 1;j <= num[i];j++)
				   {
						System.out.print((*(a + i) + j));

				   }
					sum = sum + num[i] + 1;
			   }
			   else if (sum + num[i] + 1 > 80)
			   {
					  System.out.print("\n");
					 i = i - 1;
					 sum = 0;
			   }
		}
		return 0;
	}
}

