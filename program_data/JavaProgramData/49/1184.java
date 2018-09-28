package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int i;
		int m;
		int n;
		int x;
		int y = 0;
		String a = new String(new char[500]);
		for (i = 0;i < 500;i++)
		{
		  String tempVar = ConsoleInput.scanfRead(null, 1);
		  if (tempVar != null)
		  {
			  a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
		  }
	  if (a.charAt(i) == '\n')
	  {
	  break;
	  }
		}
						for (n = 2;n <= i;n++)
						{
										 for (m = 0;m <= i - n;m++)
										 {
		  b = m;
										for (x = 0;x < n / 2;x++)
										{
										  if (a.charAt(m + x) == a.charAt(m + n - 1 - x))
										  {
											y = 0;
										  }
										else
										{
											y = 1;
										break;
										}
										}
										if (y == 0)
										{
											for (b = m;b < m + n;b++)
											{
										System.out.printf("%c",a.charAt(b));
											}
										}
	System.out.print("\n");
										x = 0;
										 }
	  m = 0;
						}
										return 0;
	}
}

