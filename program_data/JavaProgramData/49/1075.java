package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[600]);
		int len = 2;
		int j;
		int m;
		int i;
		int g = 0;
	   s = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   for (len = 2;len <= s.length();len++) //???????????
	   {
		   for (j = 0;j < s.length() - len + 1;j++)
		   {

			   g = 0; //??????????
			   for (m = 0;m <= len / 2 - 1;m++)
			   {
				 if (s.charAt(j + m) != s.charAt(j + len - 1 - m))
				 {
					 g = 1;
					 break;
				 } //??????????? ????g??????
			   }
			   if (g == 0)
			   {
				   for (i = j;i < j + len;i++)
				   {
					   System.out.print(s.charAt(i));
				   }
				   System.out.print("\n");
			   }
		   }
	   }
	   return 0;
	}

}

