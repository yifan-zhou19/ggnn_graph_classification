package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] l = new int[50];
		char[][] a = new char[50][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			l[i] = String.valueOf(a[i]).length();
		}
		for (i = 0; i < n; i++)
		{
			if (a[i][l[i] - 2] == 'e' && a[i][l[i] - 1] == 'r')
			{
				a[i][l[i] - 2] = '\0';
				System.out.println(a[i]);
			}
			else if (a[i][l[i] - 2] == 'l' && a[i][l[i] - 1] == 'y')
			{
				a[i][l[i] - 2] = '\0';
				System.out.println(a[i]);
			}
			else if (a[i][l[i] - 3] == 'i' && a[i][l[i] - 2] == 'n' && a[i][l[i] - 1] == 'g')
			{
				a[i][l[i] - 3] = '\0';
				System.out.println(a[i]);
			}
		}
	}
}

