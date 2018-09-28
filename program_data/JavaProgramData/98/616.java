package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[100000][50];
	public static int Main()
	{
		int n = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1;i <= n;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = tempVar.charAt(0);
		}
	}
	int s = 0;

	for (int i = 1;i <= n;i++)
	{

		  if (s + String.valueOf(a[i]).length() <= 80)
		  {
			if (s + String.valueOf(a[i]).length() + String.valueOf(a[i + 1]).length() + 1 <= 80)
			{
				System.out.print(a[i]);
				if (i != n)
				{
					System.out.print(' ');
				}
				s += String.valueOf(a[i]).length();
				s++;
			}
			else if (s + String.valueOf(a[i]).length() + String.valueOf(a[i + 1]).length() + 1 > 80)
			{
				System.out.print(a[i]);
				System.out.print("\n");
				s = 0;
			}
		  }
		  else if (s + String.valueOf(a[i]).length() > 80)
		  {
			  System.out.print("\n");
			  System.out.print(a[i]);
			  System.out.print(' ');
			  s = String.valueOf(a[i]).length();
			  s++;
		  }


	}
	return 0;
	}

}

