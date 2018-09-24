package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.cpp   **
	//*?????? 1200012768 **
	//*???2012.12.18  **
	//*?????????  **
	//********************************
	public static int Main()
	{
		String ch = new String(new char[1001]);
		int c1 = 1;
		int c2 = 1;
		int i;
		int temp = -1;
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = ch.length();
		int[] num = new int[len];
		for (i = 0; i < len; i++)
		{
			if (ch.charAt(i) <= 'Z')
			{
				num[i] = ch.charAt(i) - 'A';
			}
			else
			{
				num[i] = ch.charAt(i) - 'a';
			}
		}
		for (i = 0; i < len; i++)
		{
			if (temp == -1)
			{
				temp = num[i];
				if (i == len - 1)
				{
					System.out.print("(");
					System.out.print((char)(temp + 65));
					System.out.print(",");
					System.out.print(c1);
					System.out.print(")");
				}
			}
			else if (num[i] == temp)
			{
				c1++;
				if (i == len - 1)
				{
					System.out.print("(");
					System.out.print((char)(temp + 65));
					System.out.print(",");
					System.out.print(c1);
					System.out.print(")");
				}
			}
			else
			{
				System.out.print("(");
				System.out.print((char)(temp + 65));
				System.out.print(",");
				System.out.print(c1);
				System.out.print(")");
				c1 = 1, temp = num[i];
				if (i == len - 1)
				{
					System.out.print("(");
					System.out.print((char)(temp + 65));
					System.out.print(",");
					System.out.print(c1);
					System.out.print(")");
				}
			}
		}
		return 0;
	}

}

