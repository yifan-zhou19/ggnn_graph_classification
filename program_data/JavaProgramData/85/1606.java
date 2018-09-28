package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] z = new char[500][500];
		int[] a = new int[500];
		int[] d = new int[500];
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
				z[i] = tempVar2.charAt(0);
			}
			a[i] = String.valueOf(z[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < a[i];j++)
			{
				if ((z[i][0] >= 'A' && z[i][0] <= 'Z') || (z[i][0] == '_') || (z[i][0] >= 'a' && z[i][0] <= 'z'))
				{
					if ((z[i][j] >= 'A' && z[i][j] <= 'Z') || (z[i][j] == '_') || (z[i][j] >= 'a' && z[i][j] <= 'z') || (z[i][j] >= '0' && z[i][j] <= '9'))
					{
				d[i] = 1;
					}
			else
			{
				d[i] = 0;
				break;
			}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (d[i] == 1)
			{
				 System.out.print("yes\n");
			}
			else
			{
				 System.out.print("no\n");
			}
		}
		return 0;

	}

}

