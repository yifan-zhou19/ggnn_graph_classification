package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int l;
		  int n;
		  int m;
		  String a = new String(new char[1000]);
		  a = new Scanner(System.in).nextLine();
		  l = a.length();
		  for (i = 0;i < l;i++)
		  {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
		  }
		  k = 1;
		  for (i = 0;i < l;i++)
		  {
			 if (a.charAt(i) == a.charAt(i + 1))
			 {
			   k++;
			 }
			 else
			 {
				 System.out.printf("(%c,%d)",a.charAt(i),k);
				 k = 1;
			 }
		  }
	System.in.read();
	System.in.read();
	}



}

