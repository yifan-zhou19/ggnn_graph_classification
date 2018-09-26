package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String s = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p = s;
	  s = new Scanner(System.in).nextLine();
	  int j = 0;
	  int k;
	  int i = 0;
	  int l;
	  for (; * p != ' ';p++)
	  {
		  j++;
	  }
	  k = j + 1;
	  for (;s.charAt(i) != s.charAt(k);k++)
	  {
		  ;
	  }
	  for (;;k++)
	  {
		  for (;s.charAt(i) == s.charAt(k);i++,k++)
		  {
			  ;
		  }
		  if (i == j)
		  {
			  l = k - 2 * j - 1;
			  break;
		  }
		  else
		  {
			  continue;
		  }
	  }
	  System.out.printf("%d",l);

	}






}
