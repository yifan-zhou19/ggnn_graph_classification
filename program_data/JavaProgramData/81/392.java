package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[5][100];
	public static int jiaohuan(int x,int y)
	{
		String b = new String(new char[100]);
		int i;
		int j;
		if (x < 0 || x>4 || y < 0 || y>4)
		{
			return (0);
		}
		else
		{
			for (i = 0; * (a[x] + i) != '\0';i++)
			{
				*(b.Substring(i)) = *(a[x] + i);
			}
				*(b.Substring(i)) = '\0';
			for (i = 0; * (a[y] + i) != '\0';i++)
			{
				*(a[x] + i) = *(a[y] + i);
			}
				*(a[x] + i) = '\0';
			for (i = 0; * (b.Substring(i)) != '\0';i++)
			{
				*(a[y] + i) = *(b.Substring(i));
			}
				*(a[y] + i) = '\0';

				return (1);
		}
	}
	public static int Main()
	{
		int j;
		int n;
		int m;
		for (j = 0;j < 5;j++)
		{
			a[j] = new Scanner(System.in).nextLine();
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (jiaohuan(n, m) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
			System.out.println(a[j]);
			}
		}
			return 0;
	}

}

