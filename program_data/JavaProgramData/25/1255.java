package <missing>;

public class GlobalMembers
{
	//**************************
	//*?????2?N??  **
	//*?????? 1200012888 **
	//*???2013.11.15**
	//**************************
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] buf = {1};
		while (n != 0)
		{
			for (int i = 0;i < Max_Size ; i++)
			{
				buf[i] = 2 * buf[i];
			}
			for (int i = 0 ; i < Max_Size ; i++)
			{
				buf[i + 1] = buf[i] / 10 + buf[i + 1];
				buf[i] = buf[i] % 10;
			}
			n--;
		}
		int flag = 0;
		for (int i = Max_Size - 1 ; i >= 0 ; i--)
		{
			if (flag != 0)
			{
				System.out.print(buf[i]);
			}
			else if (buf[i] != 0)
			{
				System.out.print(buf[i]);
				flag = 1;
			}
		}
		return 0;
	}
}

