package <missing>;

public class GlobalMembers
{
	/*???:???1????
	**?  ?:??
	**?  ?:2010?11?19?
	*/
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int l;
		int flag;
		String str = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= t; i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			flag = 0;
			l = str.length();
			//??????????????????????????
			for (j = 0; j < l; j++)
			{
				for (k = 0; k < l; k++)
				{
					if ((str.charAt(j) == str.charAt(k)) && (j != k))
					{
						break; //??????????
					}
				}
				if (k == l)
				{
					System.out.print(str.charAt(j));
					System.out.print("\n");
					flag = 1;
					break; //k = l?????,??,???????
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

