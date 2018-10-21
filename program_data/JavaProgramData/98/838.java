package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		int flag = 0;
		int sum = 0;
		String sen = new String(new char[59]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while ((sen = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			if (flag == 0 && sum < 80)
			{
				System.out.print(sen);
				sum = sum + sen.length();
				//cout<<sum<<endl;
				flag = 1;
			}
			else if (flag == 1)
			{
				sum = sum + sen.length() + 1;
				if (sum <= 80)
				{
				System.out.print(" ");
				System.out.print(sen);
				}
				else
				{
					System.out.print("\n");
					System.out.print(sen);
					sum = sen.length();
				}
			}
		}


		return 0;
	}

}

