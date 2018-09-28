package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[300]);
		  String b = new String(new char[300]);
		  String c = new String(new char[300]);
		  String d = new String(new char[300]);
		  String f = new String(new char[300]);
		  String h = new String(new char[300]);
		  int i;
		  int m;
		  int n = 0;
		  int t;
		  int g;
		  int[] e = new int[3];
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
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 c = tempVar3.charAt(0);
		 }
		  for (m = 0;m < 290;m++)
		  {
			  if (a.charAt(m) == '\0')
			  {
				  break;
			  }
			  e[0] = m + 1;
		  }
		  for (m = 0;m < 290;m++)
		  {
			  if (b.charAt(m) == '\0')
			  {
				  break;
			  }
			  e[1] = m + 1;
		  }
		  for (m = 0;m < 290;m++)
		  {
			  if (c.charAt(m) == '\0')
			  {
				  break;
			  }
			  e[2] = m + 1;
		  }
		  for (i = 0;i <= e[0] - e[1];i++)
		  {
			  for (t = 0;t < e[1];t++)
			  {
				 if (a.charAt(i + t) == b.charAt(t))
				 {
					 n++;
				 }
				 else
				 {
					 n = 0;
				 }
			  }
		  if (n == e[1])
		  {
			  g = i;
			  break;
		  }
		  }
		  if (n == 0)
		  {
			  System.out.printf("%s",a);
		  }
		  else
		  {
			  for (i = 0;i < g;i++)
			  {
			  d = tangible.StringFunctions.changeCharacter(d, i, a.charAt(i));
			  System.out.printf("%c",d.charAt(i));
			  }
		 for (i = 0;i < e[2];i++)
		 {
			  System.out.printf("%c",c.charAt(i));
		 }
		  for (i = 0;i < e[1];i++)
		  {
		  f = tangible.StringFunctions.changeCharacter(f, i, a.charAt(i + g));
		  }
		  for (i = 0;i < e[0] - e[1] - g;i++)
		  {
			  h = tangible.StringFunctions.changeCharacter(h, i, a.charAt(g + e[1] + i));
			  System.out.printf("%c",h.charAt(i));
		  }
		  }

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

