package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[30]);
		  String num = new String(new char[30]);
		  s = new Scanner(System.in).nextLine();
		  int l;
		  l = s.length();
		  int k = 0;
		  for (int i = 0;i < l;i++)
		  {
			  if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			  {
				  num = tangible.StringFunctions.changeCharacter(num, k, s.charAt(i));
				  k++;
			  }
			  else
			  {
				  if (k != 0)
				  {
						   for (int j = 0;j < k;j++)
						   {
							  System.out.printf("%c",num.charAt(j));
						   }
						   System.out.print("\n");
						   k = 0;
				  }
				  else
				  {
					  k = 0;
				  }
			  }
		  }
		  if (k != 0)
		  {
			 for (int j = 0;j < k;j++)
			 {
				System.out.printf("%c",num.charAt(j));
			 }
			 System.out.print("\n");
		  }
		  System.in.read();
		  System.in.read();
	}

}

