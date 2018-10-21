package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int l1;
	  int l2;
	  int k;
	  int j;
	  int g = 0;
	  int c = 0;
	  int m = 0;
	  int t = 0;
	  final String s = "";
	  final String sub = "";
	  final String replacement = "";
	  final String w = "";
	  final String z = "";
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  sub = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  replacement = tempVar3.charAt(0);
	  }
	  l1 = s.length();
	  l2 = sub.length();
	  for (i = 0;t <= l1 - 1;i = t)
	  {
		if (m == 0)
		{
		if (s.charAt(i) == sub.charAt(0))
		{
		   for (k = 0,j = i;k <= l2 - 1;k++,j++)
		   {
			   if (sub.charAt(k) == s.charAt(j))
			   {
				   c++;
			   }
		   }
		   if (c >= l2)
		   {
		   w += replacement;
		   m++;
		   t = t + l2;
		   }
		   else
		   {
			   z = tangible.StringFunctions.changeCharacter(z, 0, s.charAt(i));
		   w += z;
		   t++;
		   }
		   c = 0;
		}
		else
		{
			 z = tangible.StringFunctions.changeCharacter(z, 0, s.charAt(i));
			 w += z;
			 t++;
		}
		}
		else
		{
		  z = tangible.StringFunctions.changeCharacter(z, 0, '\0');
		  for (k = i,j = 0;k <= l1 - 1;k++,j++)
		  {
			  z = tangible.StringFunctions.changeCharacter(z, j, s.charAt(k));
		  }
		  w += z;
		  break;
		}
	  }
	  if (m != 0)
	  {
		  System.out.printf("%s\n",w);
	  }
	  else
	  {
		  System.out.printf("%s\n",s);
	  }
	  System.in.read();
	  System.in.read();
	}
}

