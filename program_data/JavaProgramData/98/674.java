package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[1000][50];
		int sum = 0;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
		cin.getline(word[i],50,' ');
		}

		for (i = 0;i < n - 1;i++)
		{
			   sum += String.valueOf(word[i]).length() + 1;
			   if (sum + String.valueOf(word[i + 1]).length() <= 80)
			   {
					  System.out.print(word[i]);
					  System.out.print(" ");
			   }
			   else if (sum + String.valueOf(word[i + 1]).length() > 80)
			   {
					 System.out.print(word[i]);
					 System.out.print("\n");
					 sum = 0;
			   }
		}
		System.out.print(word[n - 1]);
		System.out.print("\n");

		return 0;
	}

}

