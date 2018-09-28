package <missing>;

public class GlobalMembers
{
	//********************************
	//*????7???????   **
	//*?????? 1300012934 **
	//*???2013.10.14  **
	//********************************


	public static int Main()
	{
		int n; //??n????
		int sum;
		sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1 ; i <= n ; i++)
		{
			if (i % 7 != 0) //????7
			{
				if (i % 10 != 7) //?????7
				{
					int x = i / 10; //?????
					if (x != 7) //?????7
					{
						sum = sum + i * i; //i???????i???
					}
				}
			}
		}

		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}


}

