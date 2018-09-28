package <missing>;

public class GlobalMembers
{
	//*******************************************//
	//*???????                           *//
	//*?????                               *//
	//*???2010.12.21                         *//
	//*******************************************//
	public static void search()
	{
	  int i;
	  int j;
	  int len;
	  int t;
	  for (len = 2;len <= lenstr;len = len + 2) //???????
	  {
		for (i = 0;i <= lenstr - len;i++) //??????
		{
		  String spr = new String(new char[500]);
		  for (j = i,t = 0;j <= i + len - 1;j++,t++) //???????????????????????????????????????????
		  {
			 spr = tangible.StringFunctions.changeCharacter(spr, t, str.charAt(j));
		  }
		  spr = tangible.StringFunctions.changeCharacter(spr, j, '\0');
		  check(spr);
		}
	  }
	}
	public static void check(String same)
	{
		int lensame;
		lensame = same.length();
		int i;
		int flag = 1;
		for (i = 0;i <= lensame / 2 - 1;i++) //??????????????
		{
		  if (!same[lensame-1 - i].equals(same[i])) //??????????
		  {
			flag = 0;
			break;
		  }
		}
		if (flag == 1)
		{
		  for (i = 0; !same[i].equals('\0');i++)
		  {
			  System.out.print(same[i]);
		  }
		  System.out.print("\n");
		}
	}
	public static String str = new String(new char[500]);
	public static int lenstr;
	public static int Main()
	{
	   str = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   lenstr = str.length();
	   search();
	}
}

