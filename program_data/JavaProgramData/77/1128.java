package <missing>;

public class GlobalMembers
{
	public static void f(String a, int n, char x, char y)
	{
		 int i;
		 int j;
		 int k = 1;
		 for (i = 0;i < n;i++)
		 {
			if (a[i].equals(y))
			{
				for (j = i;j >= 0;j--)
				{
					if (a[j].equals(x))
					{
						  System.out.printf("%d %d",j,i);
						  a[i] = null;
						  a[j] = null;
						  k += 2;
						  if (k < n)
						  {
							  System.out.print("\n\n");
						  }
						  break;
					}
				}
			}
		 }
	}


	public static int Main()
	{
		 String a = new String(new char[100]);
		 char x;
		 char y;
		 int i;
		 int n;
		 a = new Scanner(System.in).nextLine();
		 n = a.length();
		 x = a.charAt(0);
		 for (i = 0;i < n;i++)
		 {
			if (a.charAt(i) != x)
			{
				y = a.charAt(i);
			}
		 }
		 f(a, n, x, y);

	}

}
