package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a = 0;
		  int b = 0;
		  int m = 0;
		  int j = 0;
		  int i = 0;
		  int k = 0;
		  int l = 0;
		  int y = 0;
		  String n = new String(new char[1000]);
		  String o = new String(new char[1000]);
		  for (j = 0;j <= 1000;j++)
		  {
			  o = tangible.StringFunctions.changeCharacter(o, j, '\0');
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  //strlwr(n);
		  for (j = 0;n.charAt(j) != '\0';j++)
		  {
		  if (n.charAt(j) >= 'A' && n.charAt(j) <= 'Z')
		  {
		  n = tangible.StringFunctions.changeCharacter(n, j, n.charAt(j) - 'A'+'a');
		  }
		  }
		  //j=strlen(n);
		  for (i = 0;i < j;i++)
		  {
			  if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			  {
			  n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 10);
			  }
			  else if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			  {
			  n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - '1' + 1);
			  }
		  }
		  for (i = 0;i < j;i++)
		  {
			  k = n.charAt(i);
			  for (l = 0;l < (j - i - 1);l++)
			  {
				  k = k * a;
			  }
			  m = m + k;
		  }
		  //printf("%d",m);
		  do
		  {
			  for (y = 1;o.charAt(y) != '\0';y++)
			  {
				  ;
			  }
			  //y=strlen(o);
			  for (i = y;i != 0;i--)
			  {
				  o = tangible.StringFunctions.changeCharacter(o, i, o.charAt(i - 1));
			  }
			  o = tangible.StringFunctions.changeCharacter(o, 0, m % b);
			  if (o.charAt(0) == '\0')
			  {
			  o = tangible.StringFunctions.changeCharacter(o, 0, 46);
			  }
			  m = (int)m / b;
		  } while (m != 0);
		  y = o.length();
		  for (i = 0;i < y;i++)
		  {
			  if (o.charAt(i) >= 10 && o.charAt(i) <= 36)
			  {
			  o = tangible.StringFunctions.changeCharacter(o, i, o.charAt(i) - 10 + 'A');
			  }
			  else if (o.charAt(i) >= 0 && o.charAt(i) <= 9)
			  {
			  o = tangible.StringFunctions.changeCharacter(o, i, o.charAt(i) - 1 + '1');
			  }
			  else if (o.charAt(i) == 46)
			  {
			  o = tangible.StringFunctions.changeCharacter(o, i, '0');
			  }
		  }
		  System.out.printf("%s",o);
		  return 0;
	}

}

