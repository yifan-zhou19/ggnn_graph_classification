package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[300]);
		  String b = new String(new char[100]);
		  String c = new String(new char[100]);
		  a = new Scanner(System.in).nextLine();
		  b = new Scanner(System.in).nextLine();
		  c = new Scanner(System.in).nextLine();
		  int x1;
		  int x2;
		  int x3;
		  int i;
		  int j;
		  int k;
		  x1 = a.length();
		  x2 = b.length();
		  x3 = c.length();
		  /*puts(a);
		  puts(b);
		  puts(c);*/
		  for (i = 0;i <= x1 - x2;i++)
		  {
			  for (j = 0;j <= x2 - 1;j++)
			  {
				  if (b.charAt(j) != a.charAt(i + j))
				  {
					  break;
				  }
			  }
			  //printf("%d\n",j);
			  if (j == x2)
			  {
				  for (k = 0;k <= x2 - 1;k++)
				  {
					  a = tangible.StringFunctions.changeCharacter(a, i + k, c.charAt(k));
				  }
				  break;
			  }
		  }
		  System.out.println(a);
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

