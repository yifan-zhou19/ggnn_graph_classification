package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int j;
		int t;
		int num;
		char y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (x = 0;x <= t;x++)
		{
			int d;
			String a = new String(new char[100001]);
			int[] b = new int[100001];
			a = new Scanner(System.in).nextLine();
			num = a.length();
			for (i = 0;i < num;i++)
			{
			for (j = 0;j < num;j++)
			{
				if (a.charAt(i) == a.charAt(j))
				{
				b[i] = b[i] + 1;
				}
			}
			}
			for (i = 0;i < num;i++)
			{
				if (b[i] == 1)
				{
				System.out.printf("%c\n",a.charAt(i));
				break;
				}
			}
			for (i = 0;i < num;i++)
			{
			if (b[i] <= b[i + 1])
			{
				d = b[i];
				b[i] = b[i + 1];
				b[i + 1] = d;
			}
			}
			if (b[num - 1] > 1)
			{
				System.out.print("no\n");
			}

		}

	}

}

