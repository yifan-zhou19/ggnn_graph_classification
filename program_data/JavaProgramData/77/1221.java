package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char w;
	  String a = new String(new char[105]);
	  int i;
	  int j = 1;
	  int k;
	  int m = 0;
	  int t;
	  int[] b = new int[100];
	  int[] c = new int[100];
	 for (k = 0;k < 105;k++)
	 {
		 w = System.in.read();
		  if (w != '\n')
		  {
				a = tangible.StringFunctions.changeCharacter(a, k, w);
		  }
		  if (w == '\n')
		  {
			   break;
		  }
	 }
	  while (j <= k)
	  {
	   for (i = 0;i < k;i++)
	   {
			if ((a.charAt(i) == '{' || a.charAt(i) == '(' || a.charAt(i) == '[' || a.charAt(i) == '<') && (a.charAt(i + j) == '}' || a.charAt(i + j) == ')' || a.charAt(i + j) == ']' || a.charAt(i + j) == '>'))
			{
			  b[m] = i;
			  c[m] = i + j;
			  m++;
			   a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			   a = tangible.StringFunctions.changeCharacter(a, i + j, '\0');
			}
	   }
		j = j + 2;
	  }
	  for (i = 0;i < m - 2;i++)
	  {
		 for (j = 0;j < m - 2 - i;j++)
		 {
		   if (c[j] > c[j + 1])
		   {
		   t = c[j];
		   c[j] = c[j + 1];
		   c[j + 1] = t;
		   t = b[j];
		   b[j] = b[j + 1];
		   b[j + 1] = t;
		   }
		 }
	  }
	   for (i = 0;i < k / 2;i++)
	   {
		System.out.print(b[i]);
		System.out.print(' ');
		System.out.print(c[i]);
		System.out.print("\n");
	   }

	 return 0;
	}
}

