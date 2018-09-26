package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int b;
		  int d;
		  int i;
		  int j;
		  int k;
		  int l;
		  String a = new String(new char[100]);
		  String c = new String(new char[100]);
		  String e = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  n = Integer.parseInt(tempVar3);
		  }
		  b = 0;
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
			  ;
		  }
		  {
		  for (j = 0;j < i;j++)
		  {
			   for (d = 1,k = 0;k < i - j - 1;k++)
			   {
					d *= m;
			   }
			   if (a.charAt(j) <= '9' && a.charAt(j) >= '0')
			   {
					   b += (d * (a.charAt(j) - '0'));
			   }
			   else if (a.charAt(j) <= 'z' && a.charAt(j) >= 'a')
			   {
					   b += (d * (a.charAt(j) - 'a' + 10));
			   }
			   else
			   {
					   b += (d * (a.charAt(j) - 'A' + 10));
			   }
		  }
	  }
		  if (b == 0)
		  {
		  System.out.print("0");
		  }
		  else
		  {
		  for (l = 0;b != 0;l++)
		  {
			   c = tangible.StringFunctions.changeCharacter(c, l, b % n);
			   if (c.charAt(l) > 9)
			   {
				  c = tangible.StringFunctions.changeCharacter(c, l, c.charAt(l) - 10 + 'A');
			   }
			   else
			   {
			   c = tangible.StringFunctions.changeCharacter(c, l, c.charAt(l) + '0');
			   }
			   b = (b / n);
		  }
		  c = tangible.StringFunctions.changeCharacter(c, l, '\0');
		  for (i = 0;i < l;i++)
		  {
		  e = tangible.StringFunctions.changeCharacter(e, i, c.charAt(l - 1 - i));
		  }
		  e = tangible.StringFunctions.changeCharacter(e, l, '\0');
		  System.out.printf("%s",e);
		  System.in.read();
		  System.in.read();
		  }
	}

}

