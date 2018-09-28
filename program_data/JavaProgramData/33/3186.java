package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int len;
		String a = new String(new char[260]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		  for (j = 0;j < n;j++)
		  {
			  len = 0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		   len = a.length();
		for (i = 0;i < len;i++)
		{

			if (i != len - 1)
			{
		  if (a.charAt(i) == 'A')
		  {
			System.out.print("T");
		  }
		  else if (a.charAt(i) == 'T')
		  {
			System.out.print("A");
		  }
		  else if (a.charAt(i) == 'G')
		  {
			System.out.print("C");

		  }
		  else if (a.charAt(i) == 'C')
		  {
			System.out.print("G");
		  }
			}
			else
			{
		  if (a.charAt(i) == 'A')
		  {
			System.out.print("T\n");
		  }
		  else if (a.charAt(i) == 'T')
		  {
			System.out.print("A\n");
		  }
		  else if (a.charAt(i) == 'G')
		  {
			System.out.print("C\n");

		  }
		  else if (a.charAt(i) == 'C')
		  {
			System.out.print("G\n");
		  }
			}
		}
		  }

		return 0;
	}
}

