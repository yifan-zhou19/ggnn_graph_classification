package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char p = 1;
		char i;
		cin.get(str,100);
			for (i = 0;str.charAt(i) != '\0';i++) //??????
			{
				if (str.charAt(i) != ' ')
				{
					if (p == 0) //?????????????
					{
						System.out.print(" ");
						System.out.print(str.charAt(i));
						p = 1;
					}
					else
					{
						System.out.print(str.charAt(i));
					}
				}
				else
				{
					p = 0;
				}
			}
			return 0;
	}
}
