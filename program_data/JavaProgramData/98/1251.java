package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //???
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[50]); //??
		int sum = 0; //?????
		int num = 0; //????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(a);
		num = a.length();
		sum = num;
		for (i = 0;i < n - 1;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			num = a.length();
			sum = num + sum + 1;
			if (sum == num + 1)
			{
				for (p = a;p < num + a;p++) //??????
				{
				 System.out.print(p);
				}
				sum--;
			}
			else
			{
				if (sum < 80 && sum != num + 1)
				{
				System.out.print(' ');
				for (p = a;p < num + a;p++) //??????
				{
				 System.out.print(p);
				}

				}

			if (sum == 80)
			{
				System.out.print(' ');
				for (p = a;p < num + a;p++) //??????
				{
				 System.out.print(p);
				}
				System.out.print("\n");
				sum = 0;
			}
			if (sum > 80) //??
			{
				sum = num;

				System.out.print("\n");
				for (p = a;p < num + a;p++)
				{
				 System.out.print(p);
				}
			}
			}
		}


		return 0;
	}
}

