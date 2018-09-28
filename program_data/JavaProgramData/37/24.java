package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?????????????              *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 11 ? 17 ?                   * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{
		int n;
		int l;
		String a = new String(new char[100001]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			int[] flag = new int[26]; //??????????
			int[] count = new int[26];
			int min = 100001;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = a.length();
			for (int j = 0; j < l; j++)
			{
				count[a.charAt(j) - 'a']++; //??????????
				if (flag[a.charAt(j) - 'a'] == 0) //??????????????
				{
					flag[a.charAt(j) - 'a'] = j;
				}
			}
			for (int j = 0; j < 26; j++)
			{
				if (count[j] == 1 && flag[j] < min) //??????????????????????
				{
					min = flag[j];
				}
			}
			if (min == 100001) //??min??????count[j]????1
			{
				System.out.print("no");
			}
			else
			{
				System.out.print(a.charAt(min));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

