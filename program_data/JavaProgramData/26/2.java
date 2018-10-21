package <missing>;

public class GlobalMembers
{
	//***************
	//????2.cpp *
	//?  ?????*
	//***************
	public static int Main()
	{
		String str = new String(new char[101]); //?????
		int n = 0;
		int count = 0;
		int i;
		int j;
		int k;
		cin.get(str,101,'\n'); //?get????????
		n = str.length(); //?n????????
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) != ' ')
			{
				continue;
			}
			for (j = i + 1;j < n;j++)
			{
				if (str.charAt(j) == ' ')
				{
					count++;
				}
				else
				{
					break;
				}
			} //????????????
			if (count > 0)
			{
				for (k = i + 1;k < n;k++)
				{
					str = tangible.StringFunctions.changeCharacter(str, k, str.charAt(k + count));
				}
			} //?????????????????????
			count = 0;
		}
		System.out.print(str);
		return 0;
	}

}

