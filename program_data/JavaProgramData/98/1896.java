package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[1000][83];
		int n;
		int i;
		int counter = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			String temp;
		for (i = 0;i < n;i++)
		{
					temp = word[i];
			if (counter == 0)
			{
							for (p = temp;p < temp + String.valueOf(word[i]).length();p++)
							{
								 System.out.print(p);
							}
				counter = counter + String.valueOf(word[i]).length();
			}
			else
			{
				if (counter + String.valueOf(word[i]).length() + 1 <= 80)
				{
					System.out.print(" ");
									for (p = temp;p < temp + String.valueOf(word[i]).length();p++)
									{
										  System.out.print(p);
									}
					counter = counter + String.valueOf(word[i]).length() + 1;
				}
				else
				{
					System.out.print("\n");
					counter = 0;
					i--;
				}
			}
		}
		return 0;
	}
}

