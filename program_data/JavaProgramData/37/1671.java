package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n???????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0 ; k < n ; k++)
		{
			String str = new String(new char[100000]);
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int i;
			int j;
			for (i = 0 ; i < str.length(); i++)
			{
				for (j = 0 ; j < str.length() ; j++)
				{
					if (j == i)
					{
						continue;
					}
					else
					{
						if (str.charAt(j) == str.charAt(i))
						{
							 break;
						}
					}
				}
				if (j == str.length()) //????????
				{
					System.out.print(str.charAt(i));
					System.out.print("\n");
					break;
				}
			}
			if (i == str.length())
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

