package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String fib = new String(new char[SIZE]);
		int i = 1;
		int t = 1;
		int[] loser = new int[SIZE];
		String ptr;
		loser[0] = -1;

		fib = new Scanner(System.in).nextLine();

		for (i = 0;i < fib.length();)
		{
							 if ((fib.charAt(i) >= '0') && (fib.charAt(i) <= '9'))
							 {
							 i++;
							 }

							 else
							 {
							  loser[t++] = i++;
							 }
		}
		loser[t] = fib.length();
		ptr = fib.charAt(0);
		for (i = 0;i < t;i++)
		{
							 for (;loser[i] < loser[i + 1] - 1;loser[i]++)
							 {
							 System.out.printf("%c",*(ptr + loser[i] + 1));
							 }
		  if ((*(ptr + loser[i]) >= '0') && (*(ptr + loser[i]) <= '9'))
		  {
		  System.out.print("\n");
		  }


		}


		return 0;
	}

}
