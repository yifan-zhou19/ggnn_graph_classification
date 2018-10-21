package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int judgep = int i;
		int judgeh = int i;
		int m;
		int n;
		int i;
		int flag1;
		int flag2;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m,flag1 = 0,flag2 = 0,flag = 0;i < n + 1;i++)
		{
			flag1 = judgep(i);
			flag2 = judgeh(i);
			if (flag1 == 0)
			{
				continue;
			}
			else if (flag1 != 0 && flag2 != 0 && (flag == 0))
			{
				System.out.printf("%d",i);
				flag = 1;
			}
			else if (flag1 != 0 && flag2 != 0 && flag != 0)
			{
				System.out.printf(",%d",i);
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}

	public static int judgep(int i)
	{
		int j;
		int flag;
		int temp;
		for (j = 2,flag = 0;j < i;j++)
		{
			if (i % j == 0)
			{
				flag = 1;
				break;
			}
		}
		if (flag != 0)
		{
			temp = 0;
		}
		else
		{
			temp = 1;
		}
		return (temp);
	}

	public static int judgeh(int i)
	{
		int temp;
		int s;
		int t;
		t = i;
		s = 0;
		while (i / 10 != 0)
		{
			s = (s + i % 10) * 10;
			i = i / 10;
		}
		s = s + i;
		if (t == s)
		{
			temp = 1;
		}
		else
		{
			temp = 0;
		}
		return (temp);
	}
}

