package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int m;
		int i;
		int n;
		int p;
		p = 0;
	char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	char[] d = {'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	char[] e = {'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};

		  String c = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }

		  for (n = 0;n < 100;n++)
		  {
			   if (c.charAt(n) == '\0')
			   {
				   break;
			   }
		  }
		   for (m = 0;m < 26;m++)
		   {
			 for (i = 0;i < n;i++)
			 {
					if (a[m] == c.charAt(i))
					{
				 c = tangible.StringFunctions.changeCharacter(c, i, b[m]);
					}
				 if (d[m] == c.charAt(i))
				 {
				 c = tangible.StringFunctions.changeCharacter(c, i, e[m]);
				 }
			 }
		   }

		  do
		  {
			  for (i = p;i < n;i++)
			  {
					if (c.charAt(i) != c.charAt(p))
					{
						break;
					}
			  }

				System.out.printf("(%c,%d)",c.charAt(p),i - p);
				p = i;
		  }while (p != n);
	 }




}

