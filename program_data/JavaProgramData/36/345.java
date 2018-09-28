package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[1000]);
		String d = new String(new char[1000]);
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		char e;
		int i;
		int n;
		int m;
		int p = 0;
		int[] c1 = new int[26];
		int[] c2 = new int[26];
		int[] d1 = new int[26];
		int[] d2 = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
		 m = d.length();
		 n = c.length();
		 for (i = 0;i < n;i++)
		 {
			a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(i));
		 }
		 for (i = 0;i < m;i++)
		 {
			b = tangible.StringFunctions.changeCharacter(b, i, d.charAt(i));
		 }
		 for (i = 0;i < 26;i++)
		 {
			 c1[i] = 0;
			 c2[i] = 0;
			 d1[i] = 0;
			 d2[i] = 0;
		 }
		for (i = 0;i < n;i++)
		{
		  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		  {
			c1[a.charAt(i) - 'a']++;
		  }
		  else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
		  {
			c2[a.charAt(i) - 'A']++;
		  }
		}
		for (i = 0;i < m;i++)
		{
		  if (d.charAt(i) >= 'a' && d.charAt(i) <= 'z')
		  {
			d1[d.charAt(i) - 'a']++;
		  }
		  else if (d.charAt(i) >= 'A' && d.charAt(i) <= 'Z')
		  {
			 d2[d.charAt(i) - 'A']++;
		  }
		}
		for (i = 0;i < 26;i++)
		{
			if (c1[i] == d1[i] && c2[i] == d2[i])
			{
				p++;
			}
			else
			{
				p--;
			}
		}
			if (p == 26)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
	}

}

