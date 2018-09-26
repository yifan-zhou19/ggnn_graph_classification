package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String c = new String(new char[50]);
		int n;
		int m;
		int i;
		int j;
		int k = 0;
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  a = tempVar.charAt(0);
			  }
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  b = tempVar2.charAt(0);
			  }
		n = a.length();
		m = b.length();
		for (i = 0;i < m;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = i;j < i + n;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, k, b.charAt(j));
					k++;
				}
				c = tangible.StringFunctions.changeCharacter(c, k, '\0');
				if (strcmp(c,a) == 0)
				{
					System.out.printf("%d",i);
				}
			}
		}
		return 0;
	}
}

