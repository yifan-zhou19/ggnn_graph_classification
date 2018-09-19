package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[100]);
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  s = new Scanner(System.in).nextLine();
	  a = new Scanner(System.in).nextLine();
	  b = new Scanner(System.in).nextLine();
	  char[][] x = new char[100][100];
	  int i;
	  int t = 1;
	  int j = 1;
	  int y;
	  int z;
	  int q;
	  int p;
	  int m;
	  for (q = 0;q <= 99;q++)
	  {
		for (p = 0;p <= 99;p++)
		{
			  x[q][p] = '\0';
		}
	  }
	  for (i = 0;i <= 99;i++)
	  {
		 if (s.charAt(i) == ' ')
		 {
			 break;
		 }
		 else
		 {
		 x[0][i] = s.charAt(i);
		 }
	  }
	   do
	   {
		   if (s.charAt(t) == ' ')
		   {
			   z = t;
			  for (y = 0;y <= 99;y++)
			  {
				   z++;
					if (s.charAt(z) != ' ' && s.charAt(z) != '\0')
					{
					x[j][y] = s.charAt(z);
					}
				   else
				   {
					break;
				   }
			  }
				 j++;
		   }
			t++;
	   } while (t <= 99);
	   for (i = 0;i <= 99;i++)
	   {
		  if (strcmp(x[i],a) == 0)
		  {
		  x[i] = b;
		  }
	   }
		 for (m = 0;m <= 99;m++)
		 {
			  if (x[m][0] == '\0')
			  {
				  break;
			  }
		 }
	  for (i = 0;i <= m - 1;i++)
	  {
		   if (i == 0)
		   {
		   System.out.printf("%s",x[i]);
		   }
		   else
		   {
		   System.out.printf(" %s",x[i]);
		   }
	  }
	return 0;
	}


}
