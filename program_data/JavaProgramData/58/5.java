package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int len;
	int flag = 0;
	char[][] a = new char[50000][82];
	String str = new String(new char[100]);
	//scanf("%d",&n);
	str = new Scanner(System.in).nextLine();
	n = Integer.parseInt(str);
	for (i = 0;i < n;i++)
	{
	a[i] = new Scanner(System.in).nextLine();
	}
	for (i = 0;i < n;i++)
	{
		flag = 0;
	if (a[i][0] == '_' || (a[i][0] >= 65 && a[i][0] <= 90) || (a[i][0] >= 97 && a[i][0] <= 122))
	{
	   len = String.valueOf(a[i]).length();
		for (j = 0;j < len;j++)
		{
			if (a[i][j] == '_' || (a[i][j] >= 65 && a[i][j] <= 90) || (a[i][j] >= 97 && a[i][j] <= 122) || (a[i][j] >= 48 && a[i][j] <= 57))
			{
			flag = 1;
			}
	else
	{
	flag = 0;
	}
			if (flag == 0)
			{
				break;
			}
		}

	}
	if (flag == 1)
	{
		System.out.print("1\n");
	}
	else
	{
		System.out.print("0\n");
	}
	}
	return 0;
	}

}
