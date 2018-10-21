package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String b = new String(new char[50]);
		String r = new String(new char[50]);
		String a = new String(new char[50]);
		int i;
		int k;
		int n1;
		int n2;
		int n3;
		int n;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = tempVar3.charAt(0);
		}
		n1 = s.length();
		n2 = b.length();
		n3 = r.length();
		for (i = 0;i < n1 - n2 + 1;i++)
		{
			for (k = 0;k < n2;k++)
			{
			   a = tangible.StringFunctions.changeCharacter(a, k, s.charAt(i + k));
			}
			a = tangible.StringFunctions.changeCharacter(a, n2, '\0');
			result = strcmp(a,b);
			if (result == 0)
			{
			   n = i;
			   break;
			}
			else
			{
				continue;
			}
		}
		 for (i = 0;i < n1;i++)
		 {
			 if (i == n)
			 {
			   System.out.printf("%s",r);
			   i = i + n2 - 1;
			 }
			 else
			 {
			   System.out.printf("%c",s.charAt(i));
			 }
		 }
		  return 0;
	}

}

