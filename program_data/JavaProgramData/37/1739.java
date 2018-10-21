package <missing>;

public class GlobalMembers
{
	//************************************
	//*??  ????????????*****
	//*????? 1300012753         ***** 
	//*???2013.11.05          ********* 
	//************************************
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100000]);
		char ch;
		ch = System.in.read();
		for (int i = 1; i <= t; i++)
		{
			int k = 1;
			int j;
			int m;
			int num = 0;
			a = tangible.StringFunctions.changeCharacter(a, k, System.in.read());
			while (a.charAt(k) != '\n')
			{
				k++;
				a = tangible.StringFunctions.changeCharacter(a, k, System.in.read());
			}
			k--;
			for (j = 1; j <= k; j++)
			{
				for (m = 1; m <= k; m++)
				{
					if (j == m)
					{
					continue;
					}
					if (a.charAt(j) == a.charAt(m))
					{
					break;
					}
				}
				if (m == k + 1)
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					num++;
				}
				if (num == 1)
				{
				break;
				}
			}
			if (num == 0)
			{
			System.out.print("no");
			System.out.print("\n");
			}
		}
		return 0;
	}
}

