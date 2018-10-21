public class T
{
	   public String s = new String(new char[10]);
	   public char n;
}

package <missing>;

public class GlobalMembers
{
	public static T[] s = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	public static int m = 0;
	public static int max = 1;
	public static void search(String t)
	{
		 int i;
		 int b;
		 int j;
		 for (i = 0;i < m;i++)
		 {
			 b = strcmp(t,s[i].s);
			 if (b == 0)
			 {
				s[i].n++;
				if (s[i].n > max)
				{
				   max = s[i].n;
				}
				return;
			 }
		 }
		 m++;
		 s[i].s = t;
		 s[i].n = 1;
		 return;
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int l;
		String S = new String(new char[600]);
		String t = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			S = tempVar2.charAt(0);
		}
		l = S.length();
		for (i = 0;i < l - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				t = tangible.StringFunctions.changeCharacter(t, j, S.charAt(i + j));
			}
			t = tangible.StringFunctions.changeCharacter(t, n, '\0');
			search(t);
		}
		if (max == 1)
		{
		   System.out.print("NO\n");
		   return 0;
		}
		System.out.printf("%d\n",max);
		for (i = 0;i < m;i++)
		{
			if (s[i].n == max)
			{
			   System.out.printf("%s\n",s[i].s);
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

