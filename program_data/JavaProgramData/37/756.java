package <missing>;

public class GlobalMembers
{
	//******************************************
	//*???????????????.cpp     **
	//*??: ??     1100012808              **
	//*???2011.11.08                       **
	//******************************************
	public static int Main() //???
	{ //?????
		String str = new String(new char[100000]);
		int t;
		int[] flag = new int[26];
		int i = 0;
		int j = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++) //?????????
		{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag, 0, (Integer.SIZE / Byte.SIZE)); //???flag????
		for (j = 0; j < str.length(); j++)
		{
				flag[str.charAt(j) - 'a']++; //????????????
		}
		for (j = 0; j < str.length(); j++)
		{
				if (flag[str.charAt(j) - 'a'] == 1) //???????1
				{
			System.out.print(str.charAt(j));
			System.out.print("\n");
			break; //?????????
				}
			 if (j == (str.length() - 1)) //?????????????
			 {
			System.out.print("no");
			System.out.print("\n");
			 }
		}
		}
		return 0;
	} //?????


}

