package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] a = new char[1500][20];
		int[] b = new int[1500];
		int[] c = new int[1500]; //???????0 ????1
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
			b[i] = String.valueOf(a[i]).length();
		}
		for (j = 0;j < n;j++)
		{
			k = 0;
			for (i = 0;i < b[j];i++)
			{
				if ((a[j][i] >= 'a' && a[j][i] <= 'z') || (a[j][i] >= 'A' && a[j][i] <= 'Z') || (a[j][i] >= '0' && a[j][i] <= '9') || (a[j][i] == '_'))
				{
					k++;
				}
			}
			if (k == b[j])
			{
				c[j] = 1;
			}
			if ((a[j][0] >= '0') && (a[j][0] <= '9')) //??????~
			{
				c[j] = 0;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (c[j] == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
	}

}

