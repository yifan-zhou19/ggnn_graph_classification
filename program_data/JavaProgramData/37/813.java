package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[100000]);
		char[][] b = new char[100][100];
		String l = new String(new char[1]);

		int n = 0;
		int q;
		int i = 0;
		int j = 0;
		int k = 0;
		int fei = 0;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   // cin.getline(l,1);
	for (q = 0;q < n;q++)
	{
			  word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  // cin.getline(word,100000);
			   x = word.length();
			 for (j = 0;j < x;j++)
			 {
				 fei = 0;
				for (k = 0;k < x;k++)
				{
				   if (word.charAt(j) == word.charAt(k))
				   {
					  fei++;
				   }


				}
				 if (fei == 1)
				 {
					System.out.print(word.charAt(j));
					System.out.print("\n");
					break;
				 }
				//else cout<<"no"<<endl;
			 }
			 if (fei != 1)
			 {
				 System.out.print("no");
				 System.out.print("\n");
			 }
	}
	   return 0;
	}

}

