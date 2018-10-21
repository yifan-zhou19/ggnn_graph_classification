package <missing>;

public class GlobalMembers
{
	public static String num = new String(new char[15]);
	public static int reverse(String num)
	{
		int i;
		int count = 0;
		if (num[0].equals('-'))
		{
			System.out.printf("%c",'-');
		}
		for (i = 14;i >= 0;i--)
		{
			if ((num[i].compareTo('0') >= 0) && (num[i].compareTo('9') <= 0))
			{
				if (count > 0)
				{
					System.out.printf("%c",num[i]);
				}
				else if (!num[i].equals('0'))
				{
					 count++;
					 System.out.printf("%c",num[i]);
				}
			}
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		  int j;
		  int k;
		  for (k = 1;k < 7;k++)
		  {
		  for (j = 0;j <= 14;j++)
		  {
			  num = tangible.StringFunctions.changeCharacter(num, j, '\0');
		  }
		  num = new Scanner(System.in).nextLine();
		  reverse(num);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

