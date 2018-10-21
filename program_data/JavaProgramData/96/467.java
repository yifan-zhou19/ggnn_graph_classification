package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String c = new String(new char[100]);
		  String v = new String(new char[100]);
		  int a;
		  int b;
		  int d;
		  int e;
		  int i;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }
		  if (c.charAt(1) == '\0')
		  {
		  System.out.print("0\n");
		  System.out.printf("%c\n",c.charAt(0));
		  }
		  else
		  {
		  if ((c.charAt(2) == '\0') && (((c.charAt(0) - '0') * 10 + c.charAt(1) - '0') <= 13))
		  {
					  System.out.print("0\n");
					  m = (c.charAt(0) - '0') * 10 + c.charAt(1) - '0';
					  System.out.printf("%d\n",m);
		  }
		  else
		  {
		  if (((c.charAt(0) - '0') * 10 + c.charAt(1) - '0') >= 13)
		  {
		  a = ((c.charAt(0) - '0') * 10 + c.charAt(1) - '0') % 13;
		  b = ((c.charAt(0) - '0') * 10 + c.charAt(1) - '0') / 13;
		  v = tangible.StringFunctions.changeCharacter(v, 0, b + '0');
		  for (i = 2;c.charAt(i) != '\0';i++)
		  {
					  d = (a * 10 + c.charAt(i) - '0') % 13;
					  b = (a * 10 + c.charAt(i) - '0') / 13;
					  a = d;
					  v = tangible.StringFunctions.changeCharacter(v, i - 1, b + '0');
		  }
		  v = tangible.StringFunctions.changeCharacter(v, i - 1, '\0');
		  System.out.printf("%s\n",v);
		  System.out.printf("%d\n",a);
		  }
		  else
		  {
		  if (c.charAt(3) == '\0')
		  {
		  d = ((c.charAt(0) - '0') * 100 + (c.charAt(1) - '0') * 10 + c.charAt(2) - '0') / 13;
		  e = ((c.charAt(0) - '0') * 100 + (c.charAt(1) - '0') * 10 + c.charAt(2) - '0') % 13;
		  System.out.printf("%d\n",d);
		  System.out.printf("%d\n",e);
		  }
		  else
		  {
			  d = ((c.charAt(0) - '0') * 100 + (c.charAt(1) - '0') * 10 + c.charAt(2) - '0') / 13;
			  e = ((c.charAt(0) - '0') * 100 + (c.charAt(1) - '0') * 10 + c.charAt(2) - '0') % 13;
			  for (i = 3;c.charAt(i) != '\0';i++)
			  {
								v = tangible.StringFunctions.changeCharacter(v, i - 3, d + '0');
								c = tangible.StringFunctions.changeCharacter(c, i - 2, e + '0');
								e = ((c.charAt(i - 2) - '0') * 10 + c.charAt(i) - '0') % 13;
								d = ((c.charAt(i - 2) - '0') * 10 + c.charAt(i) - '0') / 13;
								c = tangible.StringFunctions.changeCharacter(c, i - 1, e + '0');
								v = tangible.StringFunctions.changeCharacter(v, i - 2, d + '0');
			  }
			  v = tangible.StringFunctions.changeCharacter(v, i - 2, '\0');
			  System.out.printf("%s\n",v);
			  System.out.printf("%d\n",e);
		  }
		  }
		  }
		  }
		  System.in.read();
		  System.in.read();
	}
}

