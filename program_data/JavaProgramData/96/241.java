package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  String b = new String(new char[1000]);
		  int i;
		  int j;
		  int k;
		  int l;
		  a = new Scanner(System.in).nextLine();
		  i = 0;
		  j = 0;
		  k = 0;
		  l = 0;
		  while (a.charAt(i + 1) != '\0')
		  {
			  i++;
		  }
		  while (j <= i)
		  {
			  b = tangible.StringFunctions.changeCharacter(b, j, '0');
			  j++;
		  }
		  k = i;
		  if (k == 0 || (k == 1 && a.charAt(0) == '1' && a.charAt(1) <= '2'))
		  {
			  System.out.print("0\n");
			  System.out.println(a);
		  }
		  else
		  {
			  i = 0;
			  while (i < k)
			  {
			  b = tangible.StringFunctions.changeCharacter(b, i, (10 * (a.charAt(i) - '0') + a.charAt(i + 1) - '0') / 13 + '0');
			  a = tangible.StringFunctions.changeCharacter(a, i + 1, (10 * (a.charAt(i) - '0') + a.charAt(i + 1) - '0') - 13 * (b.charAt(i) - '0') + '0');
			  i = i + 1;
			  }
			  i = 1;
			  if (b.charAt(0) != '0')
			  {
			  System.out.printf("%c",b.charAt(0));
			  }
			  while (i < k)
			  {
			  System.out.printf("%c",b.charAt(i));
			  i++;
			  }
			  if (b.charAt(k) != '0')
			  {
			  System.out.printf("%c",b.charAt(k));
			  }
			  System.out.printf("\n%c",a.charAt(k));
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

