package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String arrey = new String(new char[300]);
		int k = 0;
		int i = 0;
		int num = 0;
		int j = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			arrey = tempVar.charAt(0);
		}
		n = arrey.length();
		for (i = 0;i < n;i++)
		{
			if (arrey.charAt(i) < 'A' || (arrey.charAt(i)>'Z' && arrey.charAt(i) < 'a') || arrey.charAt(i)>'z')
			{
				num++;
			}
			if (num == n)
			{
				System.out.print("No\n");
			}
		}
		num = 0;
		for (j = 65;j < 91;j++)
		{
			for (k = 0;k < n;k++)
			{
				if (arrey.charAt(k) == j)
				{
				num++;
				}
			}
			if (num != 0)
			{
			System.out.printf("%c=%d\n",j,num);
			}
			num = 0;
		}
		for (j = 97;j < 123;j++)
		{
			for (k = 0;k < n;k++)
			{
				if (arrey.charAt(k) == j)
				{
				num++;
				}
			}
			if (num != 0)
			{
			System.out.printf("%c=%d\n",j,num);
			}
			num = 0;
		}
		return 0;
	}
}

