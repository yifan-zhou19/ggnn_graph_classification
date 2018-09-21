package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String mystr = new String(new char[100]);
	  char c;
	  int[] a = new int[100];
	  int i;
	  int j;
	  int k;
	  mystr = new Scanner(System.in).nextLine();
	  for (i = 0,j = 1;i < mystr.length();i++)
	  {
		 if (mystr.charAt(i) == ' ')
		 {
			 a[j] = i;
			 j++;
		 }
	  }
	  a[0] = -1;
	  a[j] = mystr.length();
	  for (k = mystr.length() - 1;k >= 0;k--)
	  {

		  if (k == a[j - 1])
		  {
			   System.out.print(" ");
			   j = j - 1;
		  }
		  else

		  {
			  c = mystr.charAt(a[j] + a[j - 1] - k);
		  System.out.printf("%c",c);
		  }


	  }

	}


}
