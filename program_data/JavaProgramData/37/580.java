package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		  a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  int[] num = new int[27];
		  int len = 0;
		  int temp = 0;
		  len = String.valueOf(a[i]).length();
		  for (j = 0;j < len;j++)
		  {
		  num[a[i][j] - 'a' + 1]++;
		  }
		  for (j = 1;j <= 26;j++)
		  {
			if (num[j] != 1)
			{
			  temp++;
			}
		  }
		  if (temp == 26)
		  {
			System.out.print("no");
			System.out.print("\n");
		  }
		  else
		  {
			   for (j = 0;j < len;j++)
			   {
				  if (num[a[i][j] - 'a' + 1] == 1)
				  {
										   System.out.print(a[i][j]);
										   System.out.print("\n");
										   break;
				  }
			   }
		  }


		}

	}
}

