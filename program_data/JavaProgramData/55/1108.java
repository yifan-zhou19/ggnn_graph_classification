package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String c = new String(new char[100]);
	  String d = new String(new char[100]);
	  int a;
	  int n = 0;
	  int b;
	  int l;
	  int i;
	  int j;
	  int e;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  c = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	  l = c.length();
	  for (i = 0;i <= l - 1;i++)
	  {
		if (c.charAt(i) >= 'A' && c.charAt(i) < 'a')
		{
		e = c.charAt(i) - 'A' + 10;
		}
		else if (c.charAt(i) >= 'a')
		{
		e = c.charAt(i) - 'a' + 10;
		}
		else
		{
		e = c.charAt(i) - '0';
		}
		n = n * a + e;
	  }
	  for (i = 0;;i++)
	  {
		d = tangible.StringFunctions.changeCharacter(d, i, n % b);
		n = n / b;
		if (d.charAt(i) >= 10)
		{
		d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) - 10 + 'A');
		}
		else
		{
		d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + '0');
		}
		if (n == 0)
		{
		break;
		}
	  }
	  for (j = i;j >= 0;j--)
	  {
	  System.out.printf("%c",d.charAt(j));
	  }
	  System.out.print("\n");
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}

}

