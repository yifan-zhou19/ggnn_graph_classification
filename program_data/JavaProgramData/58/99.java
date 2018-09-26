package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int flag;
		char[][] a = new char[100][100];
		String[] p = new String[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			p[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			flag = 1;
			if ((p[i] < 'a' || p[i]>'z') && (p[i] < 'A' || p[i]>'Z') && (p[i] != '_'))
			{
				flag = 0;
			}
			for (; p[i] != '\0';p[i]++)
			{
				if ((p[i] < '0' || p[i]>'9') && (p[i] < 'a' || p[i]>'z') && (p[i] < 'A' || p[i]>'Z') && p[i] != '_')
				{
					flag = 0;
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
	}





}

