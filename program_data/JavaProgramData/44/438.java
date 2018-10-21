package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (int j = 0;j < 6;j++)
		{
				String a = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		if (a.charAt(0) == '-')
		{
		  int k = a.length();
		  int p = 0;
		  System.out.print("-");
		  for (int i = k - 1;i >= 1;i--)
		  {
			  if (a.charAt(i) != '0')
			  {
				 p++;
			  }
			  if (p != 0)
			  {
				  System.out.printf("%c",a.charAt(i));
			  }
		  }
		}
		else
		{
		  int k = a.length();
		  int p = 0;
		  for (int i = k - 1;i >= 0;i--)
		  {
			  if (a.charAt(i) != '0')
			  {
				 p++;
			  }
			  if (p != 0)
			  {
				  System.out.printf("%c",a.charAt(i));
			  }
		  }
		}
		System.out.print("\n");
		}
	}

}

