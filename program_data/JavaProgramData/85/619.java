package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int len;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] a = new char[100][20];
	String b = new String(new char[20]);
	int i;
	int k;
	int flag;
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
		b = a[i];
		flag = 1;

		len = b.length();
		if ((b.charAt(0) >= 'A' && b.charAt(0) <= 'Z') || (b.charAt(0) >= 'a' && b.charAt(0) <= 'z') || (b.charAt(0) == '_'))
		{
			for (k = 1;k < len;k++)
			{
				if ((b.charAt(k) >= 'A' && b.charAt(k) <= 'Z') || (b.charAt(k) >= 'a' && b.charAt(k) <= 'z') || (b.charAt(k) == '_') || (b.charAt(k) >= '0' && b.charAt(k) <= '9'))
				{
				  flag = 1;
				}
				else
				{
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		else
		{
			System.out.print("no\n");
		}
	}
		return 0;
	}
}

