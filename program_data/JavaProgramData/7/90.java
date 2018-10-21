package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int c;
		int m;
		int d;
		int k;
		int v = 0;
		String str = new String(new char[100]);
		String substr = new String(new char[100]);
		String rep = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			rep = tempVar3.charAt(0);
		}
		a = str.length();
		b = substr.length();
		for (i = 0;i < a;i++)
		{
			   k = i;
			   if (substr.charAt(0) == str.charAt(k))
			   {
				   d = 0;
				   for (j = i + 1,m = 1;j < i + b;j++,m++)
				   {
					   if (substr.charAt(m) == str.charAt(j))
					   {
						   d++;
					   }
				   }

					   if (d == b - 1)
					   {
						   for (j = i,c = 0;j < i + b;j++,c++)
						   {
							   str = tangible.StringFunctions.changeCharacter(str, j, rep.charAt(c));
							   v = 1;

						   }
					   }

			   }
			   if (v == 1)
			   {
				   break;
			   }
		}
		System.out.printf("%s",str);
		return 0;
	}
}

