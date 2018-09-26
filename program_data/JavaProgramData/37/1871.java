package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  String a = new String(new char[100001]);
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  int k;
		  int j;
		  int p;
		  int q = 0;
		  int count;
		  p = a.length();
		  for (k = 0;k < p - 1;k++)
		  {
			  count = 1;
			  if (a.charAt(k) == '@')
			  {
				  continue;
			  }
			  for (j = k + 1;j < p;j++)
			  {
				  if (a.charAt(k) == a.charAt(j))
				  {
					  a = tangible.StringFunctions.changeCharacter(a, j, '@');
					  count = 0;
				  }
			  }
			  if (count == 1)
			  {
				  System.out.printf("%c",a.charAt(k));
				  break;
			  }
		  }
		  if (k == p - 1)
		  {
			  System.out.print("no");
		  }
		  System.out.print("\n");
		}
	}
}

