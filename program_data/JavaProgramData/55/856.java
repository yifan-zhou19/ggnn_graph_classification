package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int y,int r);
		int a;
		int b;
		int i;
		int j;
		int t = 0;
		int q = 0;
		int w = 0;
		int p = 0;
		String n = new String(new char[800]);
		int[] m = new int[1000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		 if (n.charAt(0) == '0')
		 {
		 System.out.printf("%c",'0');
		 }
		else
		{
				p = n.length();
			   for (i = 0;i < p;i++)
			   {
				   if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
				   {
					   n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'A' + 10);
				   }
				   else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
				   {
						n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 10);
				   }
						else if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
						{
						n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - '0');
						}
			   }
			   w = 0;
			   for (i = 0;i < p;i++)
			   {
			  w = w * a + n.charAt(i);
			   }
			   for (j = 0;;j++)
			   {
				m[j] = w % b;
				w = w / b;
				if (w < b)
				{
					m[j + 1] = w % b;
					t = j + 1;
				 break;
				}
			   }
				m[t + 1] = '\0';
			  for (i = t;i >= 0;i--)
			  {
				 if (m[i] > 9)
				 {
							  m[i] = m[i] + 'A' - 10;
							System.out.printf("%c",m[i]);
				 }
				   else
				   {
							 System.out.printf("%c",m[i] + '0');
				   }

			  }
		}

				  System.in.read();
				  System.in.read();


	}


}

