package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[100][110];
		int i;
		int j;
		int k;
		int n;
		void pipei(char c[110]);
		int print = char c[110];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						c[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
						System.out.printf("%s\n",c[i]);
						pipei(c[i]);
		}
		return 0;
	}

	public static void pipei(String c)
	{
		 int p1 = 0;
		 int p2 = 0;
		 int tihuan = 0;
		 int i;
		 int j;
		 int k;
		 for (i = 0;i < c.length();i++)
		 {
								 if (!c[i].equals('('))
								 {
											  p1 += 1;
											  p2 += 1;
								 }
								 else
								 {
									 break;
								 }
		 }
		 if (p1 == c.length())
		 {
						   print(c);
		 }
		 else
		 {
			 while (p1 < c.length())
			 {
								if (c[p1].equals('('))
								{
											  p2 = p1;
											  p1 += 1;
								}
								else if (c[p1].equals(')'))
								{
									 c[p1] = 'A';
									 c[p2] = 'A';
									 tihuan += 1;
									 break;
								}
								else
								{
									p1 += 1;
								}
			 }
			 if (tihuan == 0)
			 {
						   print(c);
			 }
			 else
			 {
				 pipei(c);
			 }
		 }
	}

	public static int print(String c)
	{
		 int i;
		 for (i = 0;i < c.length();i++)
		 {
								 if (c[i].equals('('))
								 {
									 System.out.print("$");
								 }
								 else if (c[i].equals(')'))
								 {
									 System.out.print("?");
								 }
								 else
								 {
									 System.out.print(" ");
								 }
		 }
		 System.out.print("\n");
		 return 0;
	}
}

