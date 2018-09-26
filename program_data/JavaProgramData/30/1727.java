package <missing>;

public class GlobalMembers
{
	//********************************
	//*????7???????   **
	//*?????? 1300062706 **
	//*???2013.10.10**
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int s;
		s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i != 7 && i != 17 && i != 27 && i != 37 && i != 47 && i != 57 && i != 67 && i != 87 && i != 97 && i != 71 && i != 72 && i != 73 && i != 74 && i != 75 && i != 76 && i != 78 && i != 79 && i % 7 != 0)
			{
				s = s + i * i;
			}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}
}

