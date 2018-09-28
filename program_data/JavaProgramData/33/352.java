package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a;
	String s = new String(new char[500]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	   for (i = 0;i < n;i++)
	   {
		   s = new Scanner(System.in).nextLine();
		a = s.length();
		for (j = 0;j < a;j++)
		{
			if (s.charAt(j) == 'A')
			{
		System.out.print("T");
			}
	if (s.charAt(j) == 'T')
	{
		System.out.print("A");
	}
	if (s.charAt(j) == 'C')
	{
		System.out.print("G");
	}
	if (s.charAt(j) == 'G')
	{
		System.out.print("C");
	}
		}
	System.out.print("\n");
	   }

	}
}

