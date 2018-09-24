package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String s = new String(new char[40]);
		String[] local = {"er", "ly", "ing"};
		String res = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		while (n-- != 0)
		{

			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s = tempVar2.charAt(0);
			 }
			 int len = s.length();
			 if (len > 2 && strcmp(s.Substring(len) - 2, local[0]) == 0)
			 {
					for (int i = 0; i < len - 2; ++i)
					{
							System.out.printf("%c", s.charAt(i));
					}
					System.out.print("\n");
			 }
			 else if (len > 2 && strcmp(s.Substring(len) - 2, local[1]) == 0)
			 {
				  for (int i = 0; i < len - 2; ++i)
				  {
							System.out.printf("%c", s.charAt(i));
				  }
					System.out.print("\n");
			 }
			 else if (len > 3 && strcmp(s.Substring(len) - 3, local[2]) == 0)
			 {
				  for (int i = 0; i < len - 3; ++i)
				  {
							System.out.printf("%c", s.charAt(i));
				  }
					System.out.print("\n");
			 }
			 else
			 {
				  System.out.printf("%s\n", s);
			 }
		}

	}

}

