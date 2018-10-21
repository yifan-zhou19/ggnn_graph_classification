package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[27];
	public static int i;
	public static int j;
	public static int flag;
	public static char t;
	public static int Main()
	{
		for (i = 1;i <= 26;i++)
		{
			b[i] = 0;
		}
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				t = tempVar.charAt(0);
			}
			if (t == '\n')
			{
				break;
			}
			if ((t <= 'z') && (t >= 'a'))
			{
				b[t - 'a' + 1]++;
			}
		}
		flag = 0;
		for (i = 1;i <= 26;i++)
		{
			if (b[i] != 0)
			{
			System.out.printf("%c=%d\n",i + 'a' - 1,b[i]);
			flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
	}

}

