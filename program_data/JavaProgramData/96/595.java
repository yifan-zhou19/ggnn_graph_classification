package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m = 0;
		  int i;
		  int j;
		  String a = new String(new char[101]);
		  String b = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  n = a.length();
		  if (n == 1 || (n == 2 && a.charAt(0) - '0' == 1 && a.charAt(1) - '0' < 3))
		  {
		   System.out.printf("0\n%s",a);
		  }
		  else
		  {
		  for (i = 0;i <= n - 1;i++)
		  {
						  b = tangible.StringFunctions.changeCharacter(b, i, (m * 10 + a.charAt(i) - '0') / 13 + '0');
						  m = (m * 10 + a.charAt(i) - '0') % 13;
		  }
		  if (b.charAt(1) == '0')
		  {
		  for (i = 2;i <= n - 1;i++)
		  {
		  System.out.printf("%c",b.charAt(i));
		  }
		  }
		  else
		  {
		  for (i = 1;i <= n - 1;i++)
		  {
		  System.out.printf("%c",b.charAt(i));
		  }
		  }
		  System.out.printf("\n%d",m);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

