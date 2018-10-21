package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[256]);
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	 for (j = 0;j < n;j++)
	 {
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			 if (s.charAt(i) == 'T')
			 {
				 System.out.print("A");
			 }
			 if (s.charAt(i) == 'A')
			 {
				 System.out.print("T");
			 }
			 if (s.charAt(i) == 'G')
			 {
				 System.out.print("C");
			 }
			 if (s.charAt(i) == 'C')
			 {
				 System.out.print("G");
			 }
		}
	 System.out.print("\n");
	 }
	return 0;
	}
}

