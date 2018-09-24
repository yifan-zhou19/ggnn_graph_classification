package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int j;
		int[] e = new int[50];
		char[][] a = new char[50][20];
		char[] b = {'e', 'r', '\0'};
		char[] c = {'l', 'y', '\0'};
		char[] d = {'i', 'n', 'g', '\0'};
		String p = new String(new char[3]);
		String q = new String(new char[4]);

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
			if ((int)a[i][String.valueOf(a[i]).length() - 1] - (int)b[1] == 0)
			{
			if ((int)a[i][String.valueOf(a[i]).length() - 2] - (int)b[0] == 0)
			{
			 e[i] = 1;
			}
			}
			if ((int)a[i][String.valueOf(a[i]).length() - 1] - (int)c[1] == 0)
			{
			if ((int)a[i][String.valueOf(a[i]).length() - 2] - (int)c[0] == 0)
			{
				e[i] = 1;
			}
			}
			if ((int)a[i][String.valueOf(a[i]).length() - 1] - (int)d[2] == 0)
			{
			if ((int)a[i][String.valueOf(a[i]).length() - 2] - (int)d[1] == 0)
			{
			if ((int)a[i][String.valueOf(a[i]).length() - 3] - (int)d[0] == 0)
			{
				e[i] = 2;
			}
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (e[i] == 0)
			{
				System.out.printf("%s",a[i]);
			}
			else if (e[i] == 1)
			{
				for (j = 0;j < String.valueOf(a[i]).length() - 2;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
			}
			else if (e[i] == 2)
			{
				for (j = 0;j < String.valueOf(a[i]).length() - 3;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
			}
				System.out.print("\n");
		}
	}
}

