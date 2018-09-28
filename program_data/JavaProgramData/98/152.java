package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[400][50];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int counter = 0;
		for (i = 0 ; i <= n - 1 ; i++)
		{
			words[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		String p = new String(new char[50]);
		for (p = words ; p <= words + n - 2 ; p++)
		{
			counter = counter + String.valueOf p.length();
			if (counter < 80)
			{
				if (counter + 1 + String.valueOf(* (p.Substring(1))).length() <= 80)
				{
					System.out.print(p);
					System.out.print(" ");
					counter++;
				}
				else
				{
					System.out.print(p);
					System.out.print("\n");
					counter = 0;
				}
			}
			else if (counter == 80)
			{
				System.out.print(p);
				System.out.print("\n");
				counter = 0;
			}
			else
			{
				System.out.print("\n");
				System.out.print(p);
				counter = String.valueOfp.length();

			}
		}
		counter = counter + String.valueOf p.length();
		if (counter <= 80)
		{
			System.out.print(p);
		}
		else
		{
			System.out.print("\n");
			System.out.print(p);
		}



		return 0;
	}

}

