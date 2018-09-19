package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int r;
		int s;
		final String a = "";
		final String b = "";
		final String c = "";
		char m;
	for (i = 0,n = 0;i < 100;i++,n++)
	{
	a = tangible.StringFunctions.changeCharacter(a, i, new Scanner(System.in).nextLine());
	}
	for (i = 0;i < n;i++)
	{
		l = String.valueOf(a.charAt(i)).length();
	 m = a.charAt(i)[0];
	 for (j = 0;j < l - 4;j++)
	 {
	  if (a.charAt(i)[j] > m)
	  {
		m = a.charAt(i)[j];
		k = j;
	  }
	 }
	 for (j = k + 1,r = 0;j < l - 4;j++,r++)
	 {
		  b.charAt(i)[r] = a.charAt(i)[j];
		  a.charAt(i)[j] = '\0';
	 }
	 a.charAt(i)[l - 4] = '\0';
	 for (j = l - 3,s = 0;j < l;j++,s++)
	 {
		  c.charAt(i)[s] = a.charAt(i)[j];
		  a.charAt(i)[j] = '\0';
	 }
	 System.out.printf("%s\n",strcat(strcat(a.charAt(i),c.charAt(i)),b.charAt(i)));
	}
	}
}

