package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int[] d = new int[1000];
		int n;
		char b = '(';
		char c = ')';
		int pp = 2;
		int ww = 0;
		for (int pa = 10;pa <= pp + 9;pa++)
		{
			  for (int i = 1;i <= 999;i++)
			  {
				  a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
				  if (a.charAt(i) == '\n')
				  {
					 n = i - 1;
					 break;
				  }
			  }
			  if (a.charAt(1) == '(' && a.charAt(2) == ')' && ww == 0)
			  {
				  pa = pa - 4;
				  ww = 1;
			  }
			  if (a.charAt(1) == '(' && a.charAt(3) == ')' && ww == 0)
			  {
				  pa = pa - 3;
				  ww = 1;
			  }
			  for (int i = 1;i <= n;i++)
			  {
			  d[i] = 0;
			  }
			  for (int i = 1;i <= n;i++)
			  {
				  if (a.charAt(i) != b && a.charAt(i) != c)
				  {
				  d[i] = 1;
				  }
			  }
			  for (int i = 1;i <= n / 2;i++)
			  {
				  for (int j = 1;j <= n;j++)
				  {
					  if (a.charAt(j) == b || d[j] == 1)
					  {
					  continue;
					  }
					  for (int k = j;k > 0;k--)
					  {
						  if (a.charAt(k) == c || d[k] == 1)
						  {
						  continue;
						  }
						  d[j] = 1;
						  d[k] = 1;
						  break;
					  }
				  }
			  }
			  for (int i = 1;i <= n;i++)
			  {
			  System.out.print(a.charAt(i));
			  }
			  System.out.print("\n");
			  for (int i = 1;i <= n;i++)
			  {
				  if (d[i] == 1)
				  {
				  System.out.print(" ");
				  }
				  else
				  {
					  if (a.charAt(i) == '(')
					  {
					  System.out.print("$");
					  }
					  else
					  {
					  System.out.print("?");
					  }
				  }
			  }
			  System.out.print("\n");
		}
		return 0;
	}


}

