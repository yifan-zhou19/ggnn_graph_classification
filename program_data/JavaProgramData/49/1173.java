package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int m;
	int x;
	int y;
	int z;
	String a = new String(new char[500]);
	a = new Scanner(System.in).nextLine();
	for (i = 0;a.charAt(i) != '\0';i++)
	{
		;
	}
	n = i;
	for (x = 2;x <= n;x++)
	{
	  for (i = 0;i < n - x + 1;i++)
	  {
			for (y = 0,m = 1;y < x;y++)
			{
			if (a.charAt(i + y) != a.charAt(i + x - y - 1))
			{
				m = 0;
				break;
			}
			}
		 if (m == 1)
		 {
				 for (z = i;z < i + x;z++)
				 {
				System.out.print(a.charAt(z));
				 }
			  System.out.print("\n");
		 }
	  }
	}
	return 0;
	}

}
