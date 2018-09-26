package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int len;
		int temp;
		int i;
		int j;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			temp = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();

			for (j = 0;j <= len - 1;j++)
			{
				if ((a[0] < 'a' || a[0]>'z') && (a[0] < 'A' || a[0]>'Z') && (a[0] != '_'))
				{
				System.out.print("no\n");
				temp = 0;
				break;
				}
				if ((a[j] < 'a' || a[j]>'z') && (a[j] < 'A' || a[j]>'Z') && (a[j] != '_') && (a[j] < '0' || a[j]>'9'))
				{
				System.out.print("no\n");
				temp = 0;
				break;
				}

			}
			if (temp == 1)
			{
				System.out.print("yes\n");
			}
		}
	}

}

