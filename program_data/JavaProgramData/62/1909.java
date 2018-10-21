package <missing>;

public class GlobalMembers
{
	//********************************
	//*???1.cpp   **
	//*?????? 1200012768 **
	//*???2012.12.1  **
	//*??????????  **
	//********************************
	public static int Main()
	{
		char ch;
		int flag = 0;
		while ((ch = System.in.read()) != '\n')
		{
			if (ch != ' ')
			{
				System.out.print(ch);
				flag = 0;
			}
			else if (flag == 0)
			{
				System.out.print(' ');
				flag = 1;
			}
		}
		return 0;
	}
}
