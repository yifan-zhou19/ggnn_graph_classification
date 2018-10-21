package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //num????,i????
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num != 1) //??num????1,???????
		{
			for (i = 0;num != 1;i++)
			{
				if (num % 2 == 0)
				{
					System.out.print(num);
					System.out.print("/2=");
					System.out.print(num / 2);
					System.out.print("\n");
					num = num / 2;
				} //??????
				else
				{
					System.out.print(num);
					System.out.print("*3+1=");
					System.out.print(num * 3 + 1);
					System.out.print("\n");
					num = num * 3 + 1;
				}
			}
			System.out.print("End");
		}
		else
		{
			System.out.print("End");
			System.out.print("\n");
		}

		return 0;

	}

}

