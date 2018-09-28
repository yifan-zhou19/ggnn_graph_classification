package <missing>;

public class GlobalMembers
{
	//10.12 ????
	//???   1100012799
	//??????
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else if (num != 1) //????1 ??????
		{
			do
			{
				if (num % 2 == 0) //????
				{
					num = num / 2;
					System.out.print(num * 2);
					System.out.print("/2=");
					System.out.print(num);
					System.out.print("\n");
				}
				else if (num % 2 == 1) //????
				{
					num = num * 3 + 1;
					System.out.print((num - 1) / 3);
					System.out.print("*3+1=");
					System.out.print(num);
					System.out.print("\n");
				}
			} while (num != 1); //??????1?????
			System.out.print("End");
			System.out.print("\n");
		}
		return 0;
	}

}

