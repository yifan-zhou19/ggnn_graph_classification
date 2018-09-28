package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String c = new String(new char[300]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (int j = 0;j < n;j++)
	{
	   c = new Scanner(System.in).nextLine();
	   for (int i = 0;i < c.length();i++)
	   {
		 if (c.charAt(i) == 'A')
		 {
		  System.out.print("T");
		 }
		 if (c.charAt(i) == 'T')
		 {
		  System.out.print("A");
		 }
		 if (c.charAt(i) == 'G')
		 {
		  System.out.print("C");
		 }
		 if (c.charAt(i) == 'C')
		 {
		  System.out.print("G");
		 }
		if (i == (c.length() - 1))
		{
		  System.out.print("\n");
		}
	   }
	}
	return 0;
	}
}

