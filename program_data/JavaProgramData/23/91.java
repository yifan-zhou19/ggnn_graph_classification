package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String s = new String(new char[100]);
	  char[][] rs = new char[100][100];
	  String is = new String(new char[100]);
	  char[] sp = {' ', '\0'};
	  int i;
	  int j = 0;
	  int k = 0;
	  s = new Scanner(System.in).nextLine();
	  is = s;
	  for (i = 0;s.charAt(i) != '\0';i++)
	  {
		  if (s.charAt(i) != ' ')
		  {
			  rs[j][k] = s.charAt(i);
			  k++;
		  }
		  else if (s.charAt(i))
		  {
			  j++;
			  k = 0;
		  }
	  }
	  is = rs[j];
	  if (j > 1)
	  {
	  is += sp;
	  for (i = j - 1;i >= 1;i--)
	  {
		  is = strcat(is,rs[i]);
		  is = strcat(is,sp);
	  }
	  is += rs[0];
	  }
	  System.out.println(is);
	}
}
