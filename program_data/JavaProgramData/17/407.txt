package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String chn = new String(new char[120]);
		int i;
		int l;
		int z;
		int t;
		char a;
		char b;
		while (scanf("%s",chn) != -1)
		{
		l = chn.length();
		System.out.printf("%s\n",chn);
		while (true)
		{
		  z = -1;
		  t = 0;
		  for (i = 0;i < l; i++)
		  {
			if (z == -1 && chn.charAt(i) == '(')
			{
			   z = i;
			}
			else if (z >= 0 && chn.charAt(i) == ')')
			{
				 chn = tangible.StringFunctions.changeCharacter(chn, z, ' ');
				 chn = tangible.StringFunctions.changeCharacter(chn, i, ' ');
				 t++;
				 break;
			}
			else if (z >= 0 && chn.charAt(i) == '(')
			{
			  z = i;
			}
		  }
		  if (t == 0)
		  {
			  break;
		  }
		}
		for (i = 0;i < l;i++)
		{
		   if (chn.charAt(i) == '(')
		   {
			 chn = tangible.StringFunctions.changeCharacter(chn, i, '$');
		   }
		   else if (chn.charAt(i) == ')')
		   {
			 chn = tangible.StringFunctions.changeCharacter(chn, i, '?');
		   }
		   else
		   {
			   chn = tangible.StringFunctions.changeCharacter(chn, i, ' ');
		   }
		 System.out.printf("%c",chn.charAt(i));
		}
		System.out.print("\n");
		}

	 return 0;
	}


}

