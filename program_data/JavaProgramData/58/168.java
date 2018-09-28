package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int sum;
		String c = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		char[][] a = new char[n][81];
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			sum = 0;
			for (int j = 0;j < String.valueOf(a[i]).length();j++)
			{
			  if (!(a[i][j] >= '0' && a[i][j] <= '9' || a[i][j] >= 'a' && a[i][j] <= 'z' || a[i][j] >= 'A' && a[i][j] <= 'Z' || a[i][j] == '_'))
			  {
				  sum = sum;
				  sum = 0;
				  break;
			  }
			  else if (a[i][0] >= '0' && a[i][0] <= '9')
			  {
				sum = sum;
				sum = 0;
				break;
			  }
			  else
			  {
				  sum = sum + 1;
			  }
			}
			  if (sum != 0)
			  {
			  System.out.print("1\n");
			  }
			  else
			  {
			  System.out.print("0\n");
			  }
		}

	}


}

