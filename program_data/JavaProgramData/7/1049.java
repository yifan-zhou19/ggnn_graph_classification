package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j = 0;
	  int t;
	  int s;
	  int n = 0;
	  int k;
	  int l;
	  String c1 = new String(new char[256]);
	  String c2 = new String(new char[256]);
	  String c3 = new String(new char[256]);
	  c1 = new Scanner(System.in).nextLine();
	  c2 = new Scanner(System.in).nextLine();
	  c3 = new Scanner(System.in).nextLine();
	  s = c2.length();
	  for (i = 0;c1.charAt(i) != '\0';i++)
	  {
		if (c1.charAt(i) == c2.charAt(j))
		{
		 n++;
		 j++;
		}
		else
		{
			j = 0;
			n = 0;
		}
		if (n == s)
		{
			t = i;
			break;
		}
		//printf("%d",i);                        
	  }
	  //printf("%d",n);
	  if (n == s)
	  {
		 for (l = 0,k = t - s + 1;k <= t,l < s;l++,k++)
		 {
		c1 = tangible.StringFunctions.changeCharacter(c1, k, c3.charAt(l));
		 }
	  }

	 System.out.printf("%s",c1);
	System.in.read();
	System.in.read();
	 System.in.read();
	}

}

