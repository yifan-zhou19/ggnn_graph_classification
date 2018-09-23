package <missing>;

public class GlobalMembers
{
	public static void output(int[] a, int n)
	{
	  int i;
	  for (i = 0;i < n;i++)
	  {
		switch (a[i])
		{
			case 1:
				System.out.print("$");
				break;
			case 0:
				System.out.print(" ");
				break;
			case -1:
				System.out.print("?");
				break;
		}
	  }
	  System.out.print("\n");
	}
	public static void trans(String s, int[] a, int n)
	{
	  int i;
	  int[] p = new int[200];
	  int k = -1;
	  n = s.length();
	  for (i = 0;i < n;i++)
	  {
		   if ((!s[i].equals('(')) && (!s[i].equals(')')))
		   {
			   a[i] = 0;
		   }
		   else if (s[i].equals('('))
		   {
					   k++;
					   p[k] = i;
					   a[i] = 1;
		   }
				else
				{
					   if (k > -1)
					   {
							 a[p[k]] = 0;
							 k--;
							 a[i] = 0;
					   }
					   else
					   {
						   a[i] = -1;
					   }
				}
	  }
	}
	public static void input()
	{
	  String s = new String(new char[200]);
	  int[] a = new int[200];
	  int n;
	  while (scanf("%s",s) != EOF)
	  {
		 n = s.length();
		 System.out.println(s);
		 trans(s, a, n);
		 output(a, n);
	  }
	}
	public static int Main()
	{
	  input();
	}
}
