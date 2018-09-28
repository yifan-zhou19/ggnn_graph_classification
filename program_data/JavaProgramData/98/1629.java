package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????  **
	//*????? 1300012845 **
	//*???2013.12.11  **
	//********************************
	public static char[][] str =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};


	public static int Main()
	{
		int[] label = new int[1000];
		int i;
		int j;
		int n;
		int l = -1;
		int k = 0;
		char[][] str =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String p = str; //p???????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		p = p.Substring(1);
		while (k <= n) //??????????
		{
			while (l <= 80) //?????80???????
			{
				k++;
				l += 1 + String.valueOf(str[k]).length(); //????
			}
		k = k - 1, l = -1; //k?????
		label[k] = 1; //???????????
		}
		for (i = 1; i <= n - 1; i++) //??
		{
			if (label[i] != 1)
			{
				System.out.print((p++));
				System.out.print(" ");
			}
			else
			{
				System.out.print((p++));
				System.out.print("\n");
			}
		}
		System.out.print(str[i]);
		System.out.print("\n");
		return 0;
	}

}

