package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[301]);
		String ds = new String(new char[301]);
		int i;
		int j;
		int k;
		int l;
		int max;
		while (scanf("%s", s) != EOF)
		{

		  l = s.length();
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  ds = tempVar.charAt(0);
		  }
		  max = l - 1;
		  for (j = l - 1;j > 0;j = j - 1)
		  {
			  if (s.charAt(j) >= s.charAt(max))
			  {
				  max = j;
			  }
		  }
		  for (i = 0;i <= max;i++)
		  {
			  System.out.printf("%c",s.charAt(i));
		  }
		  System.out.printf("%s",ds);
		  for (i = max + 1;i < l;i++)
		  {
			  System.out.printf("%c",s.charAt(i));
		  }
		  System.out.print("\n");
		}
		return 0;
	}
}

