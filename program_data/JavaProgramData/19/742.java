package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x;
		  int y;
		  int z;
		  int i;
		  int j;
		  int k = 0;
		  int c;
		  int flag = 0;
		  String s = new String(new char[200]);
		  String a = new String(new char[100]);
		  String b = new String(new char[100]);
		  String temp = new String(new char[300]);
		  s = new Scanner(System.in).nextLine();
		  a = new Scanner(System.in).nextLine();
		  b = new Scanner(System.in).nextLine();
		  x = s.length();
		  y = a.length();
		  z = b.length();

		  for (i = 0;i < x + y;)
		  {
			  if (flag == 0)
			  {
				 c = 1;
				 if (s.charAt(i) == ' ')
				 {
					 flag = 0;
				 }
				 else
				 {
					 flag = 1;
				 }

				 for (j = 0;j < y;j++)
				 {
					 if (a.charAt(j) != s.charAt(i + j))
					 {
						 c *= 0;
					 }
				 }

				 if (c != 1)
				 {
					 temp = tangible.StringFunctions.changeCharacter(temp, k, s.charAt(i));
					 i++;
					 k++;
				 }
				 else
				 {
					 for (j = 0;j < z;j++,k++)
					 {
						 temp = tangible.StringFunctions.changeCharacter(temp, k, b.charAt(j));
					 }
					 i += y;
				 }

			  }
			  else
			  {

				  if (s.charAt(i) == ' ')
				  {
					  flag = 0;
				  }
				  else
				  {
					  flag = 1;
				  }
				  temp = tangible.StringFunctions.changeCharacter(temp, k, s.charAt(i));
				  k++;
				  i++;
			  }
		  }
		  for (i = 0;i < k - y;i++)
		  {
			  System.out.printf("%c",temp.charAt(i));
		  }
	}

}

