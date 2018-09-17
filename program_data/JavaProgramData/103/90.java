package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int l;
	int k = 0;
	String s = new String(new char[1000]);
	String a = new String(new char[1000]);
	int[] b = new int[1000];
	s = new Scanner(System.in).nextLine();
	l = s.length();
	a = tangible.StringFunctions.changeCharacter(a, 0, s.charAt(0));
	b[0] = 1;
	for (i = 1;i < l;i++)
	{
	 if (s.charAt(i) == s.charAt(i - 1) || (s.charAt(i) - s.charAt(i - 1)) == 32 || (s.charAt(i - 1) - s.charAt(i)) == 32)
	 {
	  if (s.charAt(i) < 91)
	  {
		  a = tangible.StringFunctions.changeCharacter(a, k, s.charAt(i));
	  }
	  else
	  {
		  a = tangible.StringFunctions.changeCharacter(a, k, s.charAt(i) - 32);
	  }
	  b[k]++;
	 }
	 else
	 {
	 k++;
	 b[k] = 0;
	 a = tangible.StringFunctions.changeCharacter(a, k, s.charAt(i));
	 b[k]++;
	 }
	}
	for (j = 0;j <= k;j++)
	{
	if (a.charAt(j) < 91)
	{
		System.out.printf("(%c,%d)",a.charAt(j),b[j]);
	}
	else
	{
		System.out.printf("(%c,%d)",a.charAt(j) - 32,b[j]);
	}
	}
	System.in.read();
	System.in.read();
	}

}

