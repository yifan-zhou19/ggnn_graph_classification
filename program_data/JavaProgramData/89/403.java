package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] people = new int[100000];
		int n;
		int num1;
		int num2;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;;)
		{
			num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num1 == 0 && num2 == 0)
			{
				for (int i = 0 ; i < n ; i++)
				{
				   if (people[i] == n - 1)
				   {
					   flag = 1;
					   System.out.print(i);
					   System.out.print("\n");
				   }
				}
				if (flag == 0)
				{
					 System.out.print("NOT FOUND");
					 System.out.print("\n");
				}
				return 0;
			}
			else
			{
				people[num2]++;
			}
		}


	}


}

