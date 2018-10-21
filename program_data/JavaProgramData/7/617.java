package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String an = new String(new char[256]);
		String be = new String(new char[256]);
		String ce = new String(new char[256]);
		int i;
		int j;
		int m;
		int n;
		int k = 0;
		int h;
		an = new Scanner(System.in).nextLine();
		be = new Scanner(System.in).nextLine();
		ce = new Scanner(System.in).nextLine();
		m = an.length();
		n = be.length();
		h = ce.length();
	  for (i = 0;i < m;i++)
	  {

			if (an.charAt(i) == be.charAt(0))
			{
				for (j = 1;j < n;j++)
				{
					if (be.charAt(j) != an.charAt(i + j))
					{
						break;
					}
				}
				if (j == n)
				{
					for (k = 0;k < i;k++)
					{
					 System.out.printf("%c",an.charAt(k));
					}
					for (k = 0;k < h;k++)
					{
						System.out.printf("%c",ce.charAt(k));
					}
					for (k = i + n;k < m;k++)
					{
						System.out.printf("%c",an.charAt(k));
					}
					break;
				}

			}
	  }
	  if (k != m)
	  {
		  System.out.printf("%s",an);
	  }
	  return 0;
	}




}
