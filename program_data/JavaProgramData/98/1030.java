package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.cpp   **
	//*?????? 1200012768 **
	//*???2013.1.3  **
	//*???????  **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count = 0;
		int len1;
		int len2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String w1 = new String(new char[41]);
		String w2 = new String(new char[41]);
		String w3 = new String(new char[41]);
		w1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = w1.length();
		if (n == 1)
		{
			System.out.print(w1);
		}
		else if (n == 2)
		{
			w2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.out.print(w1);
			System.out.print(" ");
			System.out.print(w2);
		}
	else
	{
		for (i = 2;i < n; i++)
		{
			w2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len2 = w2.length();
			count += len1 + 1 + len2;
			if (count <= 80)
			{
				System.out.print(w1);
				System.out.print(" ");
				count -= len2;
			}
			else
			{
				System.out.print(w1);
				System.out.print("\n");
				count = 0;
			}
			w1 = w2;
			len1 = w1.length();
		}
		w2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len2 = w2.length();
		count += len1 + 1 + len2;
		if (count <= 80)
		{
			System.out.print(w1);
			System.out.print(" ");
			System.out.print(w2);
		}
		else
		{
			System.out.print(w1);
			System.out.print("\n");
			System.out.print(w2);
		}
	}
		return 0;
	}

}

