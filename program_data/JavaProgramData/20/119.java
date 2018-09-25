package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String s = "";
	 int i;
	 int n;
	 int l;
	 int a;
	 int k;
	 int t;
	 i = 0;
	 do
	 {
		 s = tangible.StringFunctions.changeCharacter(s, i, new Scanner(System.in).nextLine());
	  i++;
	 }while (s.charAt(i - 1)[0] != '\0');
	 n = i - 2;
	 for (i = 0;i <= n;i++)
	 {
		 l = String.valueOf(s.charAt(i)).length();
	  a = s.charAt(i)[0];
	  for (k = 1;k < l - 4;k++)
	  {
		  if (s.charAt(i)[k] > a)
		  {
			 a = s.charAt(i)[k];
		  t = k;
		  }
	  }
	  for (k = 0;k <= t;k++)
	  {
	  System.out.printf("%c",s.charAt(i)[k]);
	  }
	  for (k = l - 3;k <= l - 1;k++)
	  {
	  System.out.printf("%c",s.charAt(i)[k]);
	  }
	  for (k = t + 1;k < l - 4;k++)
	  {
	  System.out.printf("%c",s.charAt(i)[k]);
	  }
	  System.out.print("\n");
	 }
	}
}

