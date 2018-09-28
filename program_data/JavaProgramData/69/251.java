int MAX = new int(int,int);
int main()
{
	  String a = new String(new char[251]);
	  String b = new String(new char[251]);
	  String c = new String(new char[251]);
	  int t = 0;
	  int len1;
	  int len2;
	  int i;
	  int j;
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  len1 = a.length();
	  len2 = b.length();
	  if (len1 < len2)
	  {
		  for (i = len1 - 1;i >= 0;i--)
		  {
			 a = tangible.StringFunctions.changeCharacter(a, i + len2 - len1, a.charAt(i));
		  }
for (i = 0;i <= len2 - len1 - 1;i++)
{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
}
	  }
	  else if (len1 > len2)
	  {
			   for (i = len2 - 1;i >= 0;i--)
			   {
				  b = tangible.StringFunctions.changeCharacter(b, i + len1 - len2, b.charAt(i));
			   }
			for (i = 0;i <= len1 - len2 - 1;i++)
			{
				  b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
	  }
	  m = MAX(len1,len2);
	  for (i = 0;i <= 250;i++)
	  {
		  c = tangible.StringFunctions.changeCharacter(c, i, '\0');
	  }
	  for (i = m - 1;i >= 0;i--)
	  {
		  c = tangible.StringFunctions.changeCharacter(c, i, (a.charAt(i) - '0' + b.charAt(i) - '0' + t) % 10 + '0');
	 /* printf("%c",a[i]);*/
	   t = (a.charAt(i) - '0' + b.charAt(i) - '0' + t) / 10;
	  }
	  if (t == 1)
	  {
	for (i = m - 1;i >= 0;i--)
	{
		   c = tangible.StringFunctions.changeCharacter(c, i + 1, c.charAt(i));
	}
		 c = tangible.StringFunctions.changeCharacter(c, 0, '1');
	  }
	   len2 = c.length();
	   for (i = 0;i <= len2 - 1;i++)
	   {
		   if (c.charAt(i) != '0')
		   {
		  break;
		   }
	   }

	   if (i == len2)
	   {
		  System.out.print("0");
	   }
	   else
	   {
			 for (j = i;j <= len2 - 1;j++)
			 {
			   System.out.printf("%c",c.charAt(j));
			 }
	   }
}
int MAX(int a,int b)
{
	if (a >= b)
	{
	  return a;
	}
	else
	{
	  return b;
	}
}


