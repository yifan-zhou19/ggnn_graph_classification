package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  char c;
		  char d;
		  String b = new String(new char[1000]);
		  b = new Scanner(System.in).nextLine();
		  k = b.length();
		  c = b.charAt(0);
		  j = 0;
		  for (i = 0;i < k + 1;i++)
		  {

					 if (b.charAt(i) == c || b.charAt(i) == c + 'a'-'A' || b.charAt(i) == c + 'A'-'a')
					 {
																  j++;
					 }
					 else
					 {
						  if (c >= 'a' && c <= 'z')
						  {
						  System.out.printf("(%c,%d)",c + 'A'-'a',j);
						  }
						  else
						  {
						  System.out.printf("(%c,%d)",c,j);
						  }
						  j = 1;
						  c = b.charAt(i);
					 }

		  }
		  System.in.read();
		  System.in.read();
	}
}
