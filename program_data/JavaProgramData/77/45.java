package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[N]);
		String e = new String(new char[N]);
		char b;
		char g;
	 int i;
	 int k;
	 s = new Scanner(System.in).nextLine();
	 b = s.charAt(0);
	 for (i = 1;s.charAt(i);i++)
	 {
		 if (s.charAt(i) != b)
		 {
			 g = s.charAt(i);
			 break;
		 }
	 }
	 for (i = 0;s.charAt(i);i++)
	 {
		 e = tangible.StringFunctions.changeCharacter(e, i, '\u0001');
	 }

	i = 0;
	while (s.charAt(i) != null)
	{
		if (s.charAt(i) == b)
		{
			i++;
		}
	 else
	 {
	   for (k = i - 1;k >= 0;k--)
	   {
		if (s.charAt(k) == b && e.charAt(k))
		{
			e = tangible.StringFunctions.changeCharacter(e, k, '\0');
		 System.out.printf("%d %d\n",k,i);
		 break;
		}
	   }
	   i++;
	 }
	}
	}

}

