package <missing>;

public class GlobalMembers
{
	///#define B '('
	///#define G ')'
	public static void Main(String[] args)
	{
		String s = new String(new char[N]);
		String e = new String(new char[N]);
		char B;
		char G;
	 int i;
	 int k;
	 s = new Scanner(System.in).nextLine();
	B = s.charAt(0);
	 for (i = 0;s.charAt(i);i++)
	 {
		 e = tangible.StringFunctions.changeCharacter(e, i, 'a');
	 }

	i = 0;
	while (s.charAt(i) != null)
	{
		if (s.charAt(i) == B)
		{
			i++;
		}
	 else
	 {
	   for (k = i - 1;k >= 0;k--)
	   {
		if (s.charAt(k) == B && e.charAt(k))
		{
			e = tangible.StringFunctions.changeCharacter(e, k, '\0');
		 System.out.printf("%d %d\n",k,i);
		 break;
		}
	   }
	   i++;
	 }
	}
	System.out.println("\n");
	}
}

