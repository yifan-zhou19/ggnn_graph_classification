package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String test = new String(new char[100]);
		String tem = new String(new char[100]);
		int len;
		int i;
		int j;
		int flag = 0;
		int q;
		int r = 0;
		while ((test = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			len = test.length();
			for (i = 0 ; i <= len - 1 ; i++)
			{
			   r = 10 * r + test.charAt(i) - '0';
			   if (((r / 13) != 0) && (flag == 0))
			   {
				   q = i;
				   flag = 1;
			   }
			   if (flag != 0)
			   {
				   tem = tangible.StringFunctions.changeCharacter(tem, i - q, r / 13 + '0');
			   }
			   r = r % 13;
			}
			if (flag == 0)
			{
				System.out.print('0');
			}
			else
			{
				for (i = 0 ; i <= len - 1 - q ; i++)
				{
				 System.out.print(tem.charAt(i));
				}
			}
			System.out.print("\n");
			System.out.print(r);
			System.out.print("\n");
		}
		return 0;
	}


}

