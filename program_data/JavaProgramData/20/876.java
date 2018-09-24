package <missing>;

public class GlobalMembers
{
	//??????
	//20101219 liuyi
	public static int Main()
	{

		 String str = new String(new char[11]);
		 String substr = new String(new char[4]);
		 while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		 {
			 substr = ConsoleInput.readToWhiteSpace(true).charAt(0);
			 String max = str;
			 char temp;
			 int i;
			 for (i = 0;i < str.length();i++)
			 {
			 if (str.charAt(i) > max) //?????????
			 {
				 max = str.charAt(i);
				 temp = max;
			 }
			 }
			 max = null; //?str??????????????????
			System.out.print(str);
			System.out.print(temp);
			System.out.print(substr);
			System.out.print(max.Substring(1));
			System.out.print("\n");
		 }
		return 0;

	}




}

