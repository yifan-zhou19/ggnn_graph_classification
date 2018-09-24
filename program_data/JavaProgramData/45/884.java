package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String s = new String(new char[100]);
	  int length;
	  int i;
	  int x;
	  int y;
	  int j;
	  s = new Scanner(System.in).nextLine();
	  length = s.length();
	  for (i = 0;i < length;i++)
	  {
		if (s.charAt(i) == ' ')
		{
		  x = i;
		}
	  }
	  for (i = x + 1;i < length;i++)
	  {
		 if (s.charAt(0) == s.charAt(i))
		 {
			 y = i;
			 for (j = 0;j < x;j++)
			 {
			   if (s.charAt(j) != s.charAt(y + j))
			   {
			 break;
			   }
			 }
			 if (j == x)
			 {
				 System.out.printf("%d",y - x - 1);
				 break;
			 }
		 }
	  }
	}



}
