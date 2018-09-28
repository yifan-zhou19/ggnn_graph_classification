package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int p;
		int i;
		int b;
		int c;
		char[][] a = new char[100][10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (p = 0;p < t;p++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[p] = tempVar2.charAt(0);
						}
		}
			for (p = 0;p < t;p++)
			{
								 c = 0;
								 int d = String.valueOf(a[p]).length();
								 for (i = 0;i < d;i++)
								 {
								 b = 0;
								 for (int q = 0;q < d;q++)
								 {
										 if (a[p][q] == a[p][i])
										 {
										 b++;
										 }
										 else
										 {
											 ;
										 }
								 }
								  if (b == 1)
								  {
								  System.out.printf("%c\n",a[p][i]);
								  c++;
								  break;
								  }
								  else
								  {
									  ;
								  }
								 }
			if (c == 0)
			{
			System.out.print("no\n");
			}
			}
	}
}

