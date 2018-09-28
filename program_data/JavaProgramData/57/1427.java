package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int g;
	String m = new String(new char[50]);
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
					 m = ConsoleInput.readToWhiteSpace(true).charAt(0);
					 g = m.length();
					 if (m.charAt(g - 1) == 'r' || m.charAt(g - 1) == 'y')
					 {
					 for (j = 0;j < g - 2;j++)
					 {
					 System.out.print(m.charAt(j));
					 }
					 System.out.print("\n");
					 }
					 else if (m.charAt(g - 1) == 'g')
					 {
						  for (j = 0;j < g - 3;j++)
						  {
						  System.out.print(m.charAt(j));
						  }
						  System.out.print("\n");
					 }
	}

	return 0;
	}

}

