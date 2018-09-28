package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000010424_4.cpp
	* @author ???
	* @date 2010?11?20
	* @description
	* ??????: ?????C????????
	*/



	public static int Main()
	{
		int n; //?????????????
		int i;
		int j;
		String input = new String(new char[90]); //????????
		int sum; //??????????????
		int len;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();

		for (i = 1; i <= n; i++)
		{
			cin.get(input, 90); //??90??????????~?
			System.in.read();
			len = input.length(); //?????
			sum = 0;

			if (input.charAt(0) == '_' || (input.charAt(0) <= 'z' && input.charAt(0) >= 'a') || (input.charAt(0) <= 'Z' && input.charAt(0) >= 'A'))
			{
				sum++;

				for (j = 1; j < len; j++)
				{
					if (input.charAt(j) == '_' || (input.charAt(j) <= 'z' && input.charAt(j) >= 'a') || (input.charAt(j) <= 'Z' && input.charAt(j) >= 'A') || (input.charAt(j) >= '0' && input.charAt(j) <= '9'))
					{
						 sum++;
					}
					else
					{
						break;
					}
				}
			}

			if (sum == len)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}

		return 0;
	}
}

