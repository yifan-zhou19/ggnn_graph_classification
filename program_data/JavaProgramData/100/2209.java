package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char x;
		char i;
		int flag = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				x = tempVar.charAt(0);
			}
			if (x >= 'A' && x <= 'Z')
			{
				a[(int)(x - 'A')]++;
			}
			if (x >= 'a' && x <= 'z')
			{
				b[(int)(x - 'a')]++;
			}
		}while (x != '\n');
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",'A' + i,a[i]);
				flag = 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",'a' + i,b[i]);
				flag = 1;
			}
		}
		if (flag != 1)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

