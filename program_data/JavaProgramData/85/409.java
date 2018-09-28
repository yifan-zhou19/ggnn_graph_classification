package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count = 0;
		char[][] a = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i] = tempVar2.charAt(0);
						}
		}
		for (i = 0;i < n;i++)
		{
						int b = String.valueOf(a[i]).length();
						if ((a[i][0] >= '0') && (a[i][0] <= '9'))
						{
										System.out.print("no\n");
						}
						else
						{
							   for (j = 0;j < b;j++)
							   {
												 if (((a[i][j] > '9') && (a[i][j] < 'A')) || ((a[i][j]>'Z') && (a[i][j] < '_')) || ((a[i][j]>'_') && (a[i][j] < 'a')) || (a[i][j]>'z') || (a[i][j] < '0'))
												 {
												 count++;
												 }
							   }
							   if (count > 0)
							   {
							   System.out.print("no\n");
							   }
							   else
							   {
								   System.out.print("yes\n");
							   }
							   count = 0;
						}

		}
		System.in.read();
		System.in.read();
		return 0;
	}



}

