package <missing>;

public class GlobalMembers
{
	public static int sushu(int t)
	{
		int r;
		int i;
		for (i = 2;i < t;i++)
		{
			r = t % i;
			if (r == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int huiwen(int t)
	{
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int k;
		for (i = 1;;i++)
		{
			j = t / (Math.pow(10,i));
			if (j == 0)
			{
				break;
			}
		}
		k = i;
		for (i = 0;i < k;i++)
		{
			s[i] = t % 10;
			t = t / 10;
		}
		j = k - 1;
		for (i = 0;;)
		{
			if (i > j)
			{
				return 1;
			}
			if (s[i++] != s[j--])
			{
				return 0;
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{

			if (huiwen(i) != 0 && sushu(i) != 0 && j == 0)
			{
				System.out.printf("%d",i);
				j++;
			}
			else if (huiwen(i) != 0 && sushu(i) != 0)
			{
				System.out.printf(",%d",i);
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

