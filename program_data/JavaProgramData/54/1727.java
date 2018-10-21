package <missing>;

public class GlobalMembers
{
	public static int p = 1;
	public static int count1 = 1;
	public static int sum = 0;
	public static int Main()
	{
		int n;
		int k;
		int ans;
		int min = new int(int n, int k);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			ans = min(n, k);
		} while (ans < 0);
	   System.out.print(ans);
	   System.out.print("\n");
	   ans = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

	public static int min(int n, int k)
	{
		 if (count1 == 1)
		 {
				   sum = n * p + k;
				   count1++;
				   return min(n, k);
		 }
		 else
		 {
			 if (count1 == n + 1)
			 {
				 // cout << sum << endl;
				  return sum;
			 }
			 else
			 {
				 if (sum % (n - 1) == 0)
				 {
						count1++;
						sum = (sum * n) / (n - 1) + k;
					   return min(n, k);
				 }
				 else
				 {
					 count1 = 1;
					 p++;
					 return -1;
					// min(n, k);
				 }
			 }
		 }
	}
}

