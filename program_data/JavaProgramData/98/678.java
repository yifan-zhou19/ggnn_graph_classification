package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int numofwords = 0; // num of char is used to count the num in the line
		int numofchar = 0;
		int[] lenofwords = new int[1000];
		int i = 0;
		int flag = 0;
		char[][] words = new char[1000][40];
		numofwords = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (numofwords > 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				words[i] = tempVar.charAt(0);
			}
			System.in.read();
			lenofwords[i] = String.valueOf(words[i]).length();
			numofwords--;
			if ((numofchar + lenofwords[i] + 1 <= 80) && (flag == 1))
			{
				System.out.print(" ");
				System.out.printf("%s",words[i]);
			 numofchar = numofchar + lenofwords[i] + 1;
			}
			 else if ((numofchar + lenofwords[i] <= 80) && (flag == 0))
			 {
				  System.out.printf("%s",words[i]);
				  flag = 1;
				  numofchar = numofchar + lenofwords[i];
			 }
			 else
			 {
				 System.out.print("\n");
				 System.out.print("\n");
				 System.out.print(words[i]);
				 flag = 1;
				 numofchar = lenofwords[i];
			 }
			i++;
		}
		return 0;
	}
}

