package <missing>;

public class GlobalMembers
{
	public static void reverse()
	{
		  int i;
		  int len;
		  int aaa;
		  int bbb;
		  String num = new String(new char[100]);
		  String exnum = new String(new char[100]);
		  String p;
		  num = new Scanner(System.in).nextLine();
		  aaa = 0;
		  if (num.charAt(0) == '-')
		  {
				len = num.length() - 1;
				for (i = 0;i <= len - 1;i++)
				{
					  exnum = tangible.StringFunctions.changeCharacter(exnum, len - 1 - i, num.charAt(i + 1));
				}
				aaa = 1;
		  }
		  else
		  {
				len = num.length();
				for (i = 0;i <= len - 1;i++)
				{
					  exnum = tangible.StringFunctions.changeCharacter(exnum, len - 1 - i, num.charAt(i));
				}
		  }
		  if (aaa == 1)
		  {
				System.out.print("-");
		  }
		  bbb = 0;
		  for (i = 0;i <= len - 1;i++)
		  {
				if (exnum.charAt(i) == '0')
				{
				;
				}
				else
				{
					  bbb = 1;
					  break;
				}
		  }
		  for (;i <= len - 1;i++)
		  {
				System.out.printf("%c",exnum.charAt(i));
		  }
		  if (bbb == 0)
		  {
				System.out.print("0");
		  }
		  System.out.print("\n");
	}
	public static int Main()
	{
		  int i;
		  for (i = 1;i <= 6;i++)
		  {
				reverse();
		  }
		  return (0);
	}

}

