package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[101]);
	   String b = new String(new char[101]);
	   int[] st = new int[100];
	   int sp;
	   int i;
	   int l;
	   int m;
	   int n;
	   int t;
	   while (true)
	   {
		  for (i = 0;i <= 99;i++)
		  {
		  st[i] = 0;
		  }
		  sp = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  if (a.charAt(0) == '\0')
		  {
		  break;
		  }
		  b = a;
		  l = a.length();
		  for (i = 0;i <= l - 1;i++)
		  {
			 if (a.charAt(i) == '(')
			 {
			 st[sp] = i;
			 break;
			 }
		  }
		  if (i == l)
		  {
			  ;
		  }
		  else
		  {
			 for (sp = 1,i = st[0] + 1;i <= l - 1;i++)
			 {
				if (a.charAt(i) == '(')
				{
				st[sp++] = i;
				}
				else if (a.charAt(i) == ')')
				{
				   if (sp > 0)
				   {
					  b = tangible.StringFunctions.changeCharacter(b, st[--sp], ' ');
					  b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				   }
				}
			 }
		  }
		  for (i = 0;i <= l - 1;i++)
		  {
			 if (b.charAt(i) == '(')
			 {
			 b = tangible.StringFunctions.changeCharacter(b, i, '$');
			 }
			 else if (b.charAt(i) == ')')
			 {
			 b = tangible.StringFunctions.changeCharacter(b, i, '?');
			 }
			 else if (b.charAt(i) == ' ')
			 {
				 ;
			 }
			 else
			 {
			 b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			 }
		  }
		  System.out.printf("%s\n",a);
		  n = l - 1;
		  for (i = l - 1;i >= 0;i--)
		  {
				if (b.charAt(i) == ' ')
				{
				n = i - 1;
				}
				else
				{
				break;
				}
		  }
		  m = 0;
		  for (i = 0;i <= l - 1;i++)
		  {
			 if (b.charAt(i) == ' ')
			 {
			 m = i + 1;
			 }
			 else
			 {
			 break;
			 }
		  }
		  t = 0;
		  for (i = m;i <= n;i++)
		  {
			 System.out.printf("%c",b.charAt(i));
			 t++;
		  }
		  System.out.print("\n");
		  a = tangible.StringFunctions.changeCharacter(a, 0, '\0');
	   }
	}
}

