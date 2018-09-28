package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int m;
		int n;
		int i;
		int j;
		int s;
		int k;
		String string = new String(new char[256]);
		String substring = new String(new char[256]);
		String replacement = new String(new char[256]);
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substring = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replacement = tempVar3.charAt(0);
		}
		l = String.length();
		m = substring.length();
		t = substring.charAt(0);
		for (i = 0;i <= l - m;i++)
		{
		   s = 0;
		   if (String[i] == t)
		   {
			  for (j = i;j <= i + m - 1;j++)
			  {
			  if (String[j] == substring.charAt(j - i))
			  {
				  s++;
			  }
			  }
		   if (s == m)
		   {
			   for (k = 0;k <= m - 1;k++)
			   {
				   String[i + k] = replacement.charAt(k);
			   }
			   i = l - m;
		   }
		   else
		   {
				   i++;
		   }
		   }
		}
		System.out.printf("%s\n",String);
	return 0;
	}
}

