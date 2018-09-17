package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		int i;
		int j;
		int num0 = 0;
		int num;
		for (i = 65;i <= 90;i++)
		{
			num = 0;
			for (j = 0;j < len;j++)
			{
				if (a.charAt(j) == i)
				{
					num++;
				}
			}
			if (num != 0)
			{
				num0 = 1;
				System.out.printf("%c=%d\n",i,num);
			}
		}
		for (i = 97;i <= 122;i++)
		{
			num = 0;
			for (j = 0;j < len;j++)
			{
				if (a.charAt(j) == i)
				{
					num++;
				}
			}
			if (num != 0)
			{
				num0 = 1;
				System.out.printf("%c=%d\n",i,num);
			}
		}
		if (num0 == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}

}
