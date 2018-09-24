package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String str = new String(new char[510]);
		 int len = 0;
		 int x;
		 int y;

		 str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 len = str.length();
		 for (int i = 1; i < len; i++)
		 {
			  for (int j = 0; j < len - i; j++)
			  {
				   for (x = j, y = j + i; x < y; x++, y--)
				   {
						 if (str.charAt(x) != str.charAt(y))
						 {
							break;
						 }
				   }

				if (x >= y)
				{
						 for (int m = j; m <= j + i; m++)
						 {
							 System.out.print(str.charAt(m));
						 }
						 System.out.print("\n");
				}
			  }
		 }
		  return 0;
	}
}

