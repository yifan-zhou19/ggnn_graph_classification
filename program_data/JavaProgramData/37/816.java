package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (q = 0;q < n;q++)
	{
		   String word = new String(new char[100000]);
		   int i = 0;
		   int j = 0;
		   int k = 0;
		   int fei = 0;
		   int ya = 0;
		   word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			 for (j = 0;j < word.length();j++)
			 {
				 fei = 0;
				 for (k = 0;k < word.length();k++)
				 {
				   if (word.charAt(j) == word.charAt(k))
				   {
					  fei++;
					  continue;
				   }
				 }
				if (fei == 1)
				{
					ya = 1;
					System.out.print(word.charAt(j));
					System.out.print("\n");
					break;
				}

			 }
			 if (ya == 0)
			 {
			 System.out.print("no");
			 System.out.print("\n");
			 }

	}

	   return 0;
	}


}

