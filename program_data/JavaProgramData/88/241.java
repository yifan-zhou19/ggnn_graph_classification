package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[31]);
		  int i;
		  int n;
		  s = new Scanner(System.in).nextLine();
		  n = s.length();
		  for (i = 0;i < n;i++)
		  {

			  if (s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0') //???i????????
			  {
				  if (s.charAt(i + 1) == '1' || s.charAt(i + 1) == '2' || s.charAt(i + 1) == '3' || s.charAt(i + 1) == '4' || s.charAt(i + 1) == '5' || s.charAt(i + 1) == '6' || s.charAt(i + 1) == '7' || s.charAt(i + 1) == '8' || s.charAt(i + 1) == '9' || s.charAt(i + 1) == '0') //????????????????
				  {
			  System.out.printf("%c",s.charAt(i));
				  }
			  else
			  {
			  System.out.printf("%c\n",s.charAt(i));
			  }
			  }

		  }
		  System.in.read();
		  System.in.read();
	}

}
