package <missing>;

public class GlobalMembers
{
	/*??(5.9) ???? (1111)*/ 



	public static int Main()
	{
		int i;
		int j;
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a == 0)
				{
					break;
				}
			}
			if (a == 0)
			{
				break;
			}
		}
		int s = 0;
		while (++j <= n) //????????
		{
			if (a == 0)
			{
				s++;
			}
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int num = 0;
		for (i += 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a == 0)
				{
					num++;
				}
			}
		}
		int r;
		r = (num - s) / 2; //??????
		s -= 2; //??????????????-2
		System.out.print(r * s);
		System.out.print("\n");
		return 0;
	}
}

