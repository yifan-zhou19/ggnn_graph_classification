package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String str = new String(new char[10000]);
		  str = new Scanner(System.in).nextLine();
		  int lenth;
		  int count = 0;
		  lenth = str.length();
		  for (int i = 0;i < lenth;i++)
		  {
							  if (str.charAt(i) == ' ')
							  {
							  count++;
							  }
							  else
							  {
								  count = 0;
							  }
							  if (count < 2)
							  {
							  System.out.printf("%c",str.charAt(i));
							  }
		  }
		  System.in.read();
		  System.in.read();
		  return 0;
	}



}
