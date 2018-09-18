package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		for (i = 0;i < 100;i++)
		{
		final String a = "";
		final String b = "";
		int[] c = new int[100];
		int[] d = new int[100];
		int k;
		int m;
		int t = 0;
		int c1 = 0;
		int c2 = 0;
		int j1 = 0;
		int j2 = 0;
		int z = 0;
		int y = 0;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int l = a.length();
		for (k = 0;k < l;k++)
		{
		  if (a.charAt(k) == '(')
		  {
			  c1 = k;
			  c[j1] = k;
			  j1++;
		  }
		  else if (a.charAt(k) == ')')
		  {
			  c2 = k;
			  d[j2] = k;
			  j2++;
		  }
			   else
			   {
				   b = tangible.StringFunctions.changeCharacter(b, k, ' ');
			   }
		}
		for (k = 0;k < j2;k++)
		{
		   for (m = 0;m < j1;m++)
		   {
			   if (d[k] > c[m])
			   {
			   y++;
			   if (c[m] != -1)
			   {
				   t++;
				   h = m;
			   }
			   else
			   {
				   z = m;
			   }
			   }
		   }
		   if (t == 0)
		   {
			   b = tangible.StringFunctions.changeCharacter(b, d[k], '?');
			   d[k] = -1;
		   }
		   else
		   {
			 if (z != y - 1)
			 {
				 b = tangible.StringFunctions.changeCharacter(b, c[y - 1], ' ');
				 c[y - 1] = -1;
				 b = tangible.StringFunctions.changeCharacter(b, d[k], ' ');
				 d[k] = -1;
			 }
			 else
			 {
				 b = tangible.StringFunctions.changeCharacter(b, c[h], ' ');
				 c[h] = -1;
				 b = tangible.StringFunctions.changeCharacter(b, d[k], ' ');
				 d[k] = -1;
			 }
		   }
		   t = 0;
		   y = 0;
		}
		for (k = 0;k < j1;k++)
		{
			if (c[k] != -1)
			{
				b = tangible.StringFunctions.changeCharacter(b, c[k], '$');
			}
		}
		for (k = 0;k < j2;k++)
		{
			if (d[k] != -1)
			{
				b = tangible.StringFunctions.changeCharacter(b, d[k], '?');
			}
		}
		System.out.printf("%s\n",a);
		for (k = 0;k < l;k++)
		{
			System.out.printf("%c",b.charAt(k));
		}
		System.out.print("\n");
		}
	  System.in.read();
	  System.in.read();
	}

}

