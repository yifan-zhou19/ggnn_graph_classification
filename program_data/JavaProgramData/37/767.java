package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[100100]);
	 int i = 0;
	 int j;
	 int k;
	 int t;
	 int same = 0;
	 int no = 0;
	 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < t;i++)
	 {
			 word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  no = 0;
		  for (j = 0;word.charAt(j) != '\0';j++)
		  {
				  same = 0;
			   for (k = 0;word.charAt(k) != '\0';k++)
			   {
				   if (word.charAt(j) == word.charAt(k) && j != k)
				   {
				   same = 1;
				   } //????????????????
			   }
			   if (same == 0)
			   {
				   no = 1;
				   System.out.print(word.charAt(j));
				   System.out.print("\n");
				   break;
			   }
		  }
		  if (no == 0)
		  {
			  System.out.print("no");
			  System.out.print("\n");
		  }

	 }

	 return 0;
	}

}

