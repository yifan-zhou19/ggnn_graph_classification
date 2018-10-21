package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String xulie = new String(new char[LEN]);
		String daxiezimu = new String(new char[LEN1]);
		String xiaoxiezimu = new String(new char[LEN1]);
		String ps;
		int[] daxiecishu = new int[LEN2];
		int[] xiaoxiecishu = new int[LEN2];
		int a = 0;
		int b;
		int c = 0;
		int d;
		int e;
		int f;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			xulie = tempVar.charAt(0);
		}
		for (b = 0;b < LEN2;b++)
		{
		  daxiecishu[b] = 0;
		  xiaoxiecishu[b] = 0;
		}
		for (i = 0;i < xulie.length();i++)
		{
		  if (xulie.charAt(i) >= 'A' && xulie.charAt(i) <= 'Z')
		  {
			daxiezimu = tangible.StringFunctions.changeCharacter(daxiezimu, xulie.charAt(i) - 'A', xulie.charAt(i));
			daxiecishu[xulie.charAt(i) - 'A']++;
			c++;
		  }
		  if (xulie.charAt(i) >= 'a' && xulie.charAt(i) <= 'z')
		  {
			xiaoxiezimu = tangible.StringFunctions.changeCharacter(xiaoxiezimu, xulie.charAt(i) - 'a', xulie.charAt(i));
			xiaoxiecishu[xulie.charAt(i) - 'a']++;
			a++;
		  }
		}
		if (a + c != 0)
		{
		for (e = 0;e < LEN1 - 1;e++)
		{
		  if (daxiecishu[e] != 0)
		  {
			System.out.printf("%c=%d\n",daxiezimu.charAt(e),daxiecishu[e]);
		  }
		}

		 for (f = 0;f < LEN1 - 1;f++)
		 {
		  if (xiaoxiecishu[f] != 0)
		  {
			System.out.printf("%c=%d\n",xiaoxiezimu.charAt(f),xiaoxiecishu[f]);
		  }
		 }
		}
		if (a + c == 0)
		{
		  System.out.print("No");
		}
		return 0;
	}
}

