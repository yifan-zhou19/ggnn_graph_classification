package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		for (int i = 3; i <= 7; i = i + 2)
		{
				if ((n % i) == 0)
				{
				sum = sum + 1;
				}
		}
		int t = 0;
		for (int i = 3; i <= 7; i = i + 2)
		{
				if ((n % i) == 0)
				{
				 t = t + 1;
				   if (t < sum)
				   {
					   System.out.print(i);
					   System.out.print(" ");
				   }
				   else
				   {
					   System.out.print(i);
				   }
				}
		}
		if (sum == 0)
		{
			System.out.print('n');
		}
		//while(1);
		return 0;
	}

}

