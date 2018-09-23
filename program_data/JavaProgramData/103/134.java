package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String str = new String(new char[101]);
		  str = new Scanner(System.in).nextLine();
		  int i = 0;
		  int n = 1;
		  for (i;str.charAt(i) != '\0';i++)
		  {
				 if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				 {
					 str.charAt(i) += 'A'-'a';
				 }
		  }
		  for (i = 0;str.charAt(i) != '\0';i++)
		  {
				 if (str.charAt(i) == str.charAt(i + 1))
				 {
					 n++;
				 }
				 else
				 {
					  System.out.printf("(%c,%d)",str.charAt(i),n);
					  n = 1;
				 }
		  }
		  System.in.read();
	}
}
