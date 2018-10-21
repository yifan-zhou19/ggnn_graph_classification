package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (int i = 1;i <= n;i++)
		 {
			  String word = new String(new char[33]);
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  word = tempVar2.charAt(0);
			  }
			  int len;
			  len = word.length();
			  if (word.charAt(len - 2) == 'e' && word.charAt(len - 1) == 'r')
			  {
					for (int j = 0;j < len - 2;j++)
					{
						System.out.printf("%c",word.charAt(j));
					}
					System.out.print("\n");
			  }
	if (word.charAt(len - 2) == 'l' && word.charAt(len - 1) == 'y')
	{
					for (int j = 0;j < len - 2;j++)
					{
						System.out.printf("%c",word.charAt(j));
					}
	 System.out.print("\n");

	}
	if (word.charAt(len - 3) == 'i' && word.charAt(len - 2) == 'n' && word.charAt(len - 1) == 'g')
	{
					for (int j = 0;j < len - 3;j++)
					{
						System.out.printf("%c",word.charAt(j));
					}
	 System.out.print("\n");

	}
		 }
	}
}

