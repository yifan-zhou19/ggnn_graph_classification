package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[30]);
		  int c;
		  int i;
		  int j;
		  a = new Scanner(System.in).nextLine();
		  c = a.length();
		  for (i = 0;i < c;i++)
		  {
				if ((a.charAt(i) - '0' >= 0) && (a.charAt(i) - '9' <= 0))
				{
					System.out.printf("%c",a.charAt(i));
				}
				else
				{
					if (i >= 1)
					{
							if ((a.charAt(i - 1) - '0' >= 0) && (a.charAt(i - 1) - '9' <= 0))
							{
							System.out.print("\n");
							}
					}
				}
		  }
		  System.in.read();

	}

}
