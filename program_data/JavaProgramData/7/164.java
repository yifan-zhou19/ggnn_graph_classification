package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[256]);
		String sub = new String(new char[256]);
		String replace = new String(new char[256]);
		String s = new String(new char[256]);
		String p = new String(new char[256]);
		int i;
		int j;
		int k;
		int a;
		int k0;
		int k1;
		int k2;
		int flag = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replace = tempVar3.charAt(0);
		}
		k0 = String.length();
		k1 = sub.length();
		k2 = replace.length();
		for (i = 0;i < k0;i++)
		{
		   for (j = i,k = 0;j < i + k1;j++,k++)
		   {
			   p = tangible.StringFunctions.changeCharacter(p, k, string.charAt(j));
		   }
		   p = p.substring(0, k);

		   if (strcmp(sub,p) == 0)
		   {
			   a = i;
			   for (i = 0;i < a;i++)
			   {
				s = tangible.StringFunctions.changeCharacter(s, i, string.charAt(i));
			   }
			   for (i = k0 + k2 - k1,j = k0;i >= a + k2,j >= a + k1;i--,j--)
			   {
				s = tangible.StringFunctions.changeCharacter(s, i, string.charAt(j));
			   }
			   for (i = a,j = 0;i < a + k2,j < k2;i++,j++)
			   {
				s = tangible.StringFunctions.changeCharacter(s, i, replace.charAt(j));
			   }
			   flag = 1;
			   break;
		   }
		}
		  if (flag == 1)
		  {
			  for (i = 0;i < k0 + k2 - k1;i++)
			  {
			  System.out.printf("%c",s.charAt(i));
			  }
			  System.out.print("\n");
		  }
		  if (flag == 0)
		  {
			  System.out.println(String);
		  }

	}
}

