package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 String str = new String(new char[80]);
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int ln = 0;
	 while (n-- != 0)
	 {
	  str = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  if (ln == 0)
	  {
	   System.out.print(str);
	   ln = str.length() + 1;
	  }
	  else if (ln + str.length() > 80)
	  {
	   System.out.print("\n");
	   System.out.print(str);
	   ln = str.length() + 1;
	  }
	  else
	  {
	   System.out.print(' ');
	   System.out.print(str);
	   ln += str.length() + 1;
	  }

	 }
	 return 0;
	}

}

