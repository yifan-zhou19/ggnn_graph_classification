package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String st = new String(new char[LEN]);
	   String su = new String(new char[LEN]);
	   String re = new String(new char[LEN]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   st = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead("\n");
	   if (tempVar2 != null)
	   {
		   su = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead("\n");
	   if (tempVar3 != null)
	   {
		   re = tempVar3.charAt(0);
	   }
	   int m;
	   int n;
	   int i;
	   int j;
	   int p = 0;
	   int q;
	   n = st.length();
	   m = su.length();
	   for (i = 0;i < n;i++)
	   {
		   if (su.charAt(0) == st.charAt(i))
		   {
			  for (j = 1;j < m;j++)
			  {
				  if (su.charAt(j) != st.charAt(i + j))
				  {
					 break;
				  }
				  else
				  {
					  p++;
				  }
			  }
		   }
		   if (p == (m - 1))
		   {
			   for (q = i;q < i + m;q++)
			   {
				   st = tangible.StringFunctions.changeCharacter(st, q, re.charAt(q - i));
			   }
			   break;
		   }
	   }
	   System.out.printf("%s",st);
	   return 0;
	}


}

