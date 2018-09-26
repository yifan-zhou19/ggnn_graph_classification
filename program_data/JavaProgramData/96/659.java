package <missing>;

public class GlobalMembers
{
	//********************************
	//*???3.cpp   **
	//*?????? 1200012768 **
	//*???2012.11.  **
	//*?????13  **
	//********************************
	public static int Main()
	{
		String ch = new String(new char[101]);
		int[] res = new int[100];
		int rem = 0;
		int i = 0;
		int j;
		int flag = 0;
		for (i = 0; i < 101; i++)
		{
			cin.get(ch.charAt(i));
			if (ch.charAt(i) == '\n')
			{
				break;
			}
			res[i] = (int)(ch.charAt(i) - '0' + 10 * rem) / 13;
			rem = (int)((ch.charAt(i) - '0' + 10 * rem) % 13);
		}
		for (j = 0; j < i; j++)
		{
			if (flag == 0 && res[j] != 0)
			{
				System.out.print(res[j]);
				flag = 1;
			}
			else if (flag != 0)
			{
				System.out.print(res[j]);
			}
		}
		if (flag == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		System.out.print(rem);
		System.out.print("\n");
		return 0;
	}

}
