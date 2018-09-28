package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int len;
	   int i;
	   int j;
	   String str = new String(new char[256]);
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		  str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  len = str.length();
		  for (j = 0;j < len;j++)
		  {
			 switch (str.charAt(j))
			 {
				case 'A':
					System.out.print('T');
					break;
				case 'T':
					System.out.print('A');
					break;
				case 'C':
					System.out.print('G');
					break;
				case 'G':
					System.out.print('C');
					break;
			 }
		  }
		  System.out.print("\n");
	   }
	   return 0;
	}

}

