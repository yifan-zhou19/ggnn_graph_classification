package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] b = new int[52];
		int j;
		int k = 0;
		int t = 0;
		final String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		char temp;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				temp = tempVar.charAt(0);
			}
			if (temp == '\n')
			{
				break;
			}
			for (j = 0;j < 52;j++)
			{
				if (a.charAt(j) == temp)
				{
					b[j]++;
					t = 1;
				}
			}
		}
		if (t == 0)
		{
			System.out.print("No\n");
		}
		else
		{
		for (i = 0;i < 52;i++)
		{
			if (b[i] != 0)
			{
			System.out.printf("%c=%d\n",a.charAt(i),b[i]);
			}
		}
		}
		return 0;
	}

}

