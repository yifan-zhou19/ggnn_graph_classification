package <missing>;

public class GlobalMembers
{
	public static int check(String p, String q, int a, int b)
	{
	  int m;
	  int x;
	  for (m = 0;m <= a;m++)
	  {
		if (p[b + m].equals(q[m]))
		{
			x = 1;
		}
		else
		{
		  x = 0;
		  break;
		}
	  }
	  return (x);
	}
	public static void Main()
	{
	  String s = new String(new char[100]);
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  int i;
	  int l;
	  int j;
	   for (i = 0;i < 100;i++)
	   {
		s = tangible.StringFunctions.changeCharacter(s, i, '\0');
		a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');
	   }
	  s = new Scanner(System.in).nextLine();
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
	  l = s.length();
	  s = tangible.StringFunctions.changeCharacter(s, l, ' ');
	  l = a.length();
	  a = tangible.StringFunctions.changeCharacter(a, l, ' ');
	  if (check(s, a, l, 0) != 0)
	  {
		  System.out.printf("%s",b);
	  }
	  else
	  {
		 i = 0;
		 do
		 {
		  System.out.printf("%c",s.charAt(i));
		  i++;
		 } while (s.charAt(i) != ' ');
	  }
	  i = 0;
	  while (s.charAt(i) != ' ')
	  {
		  i++;
	  }
	  for (i = i + 1;i < 100;)
	  {
		j = i;
		if (s.charAt(i) == '\0')
		{
			break;
		}
		else if (check(s, a, l, i))
		{
			System.out.printf(" %s",b);
		}
		else
		{
		  System.out.print(" ");
		  do
		  {
		  System.out.printf("%c",s.charAt(i));
		  i++;
		  } while (s.charAt(i) != ' ');
		}
		i = j;
		while (s.charAt(i) != ' ')
		{
			i++;
		}
		i = i + 1;
	  }
	}

}

