package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int numnew;
		if (num == 0)
		{
			return 0;
		}
		else
		{
			if (num > 0)
			{
				numnew = 0;
				while (num > 0)
				{
					numnew = numnew * 10 + num % 10;
					num = num / 10;
				}
				return numnew;
			}
			else if (num < 0)
			{
				num = -num;
				numnew = 0;
				while (num > 0)
				{
					numnew = numnew * 10 + num % 10;
					num = num / 10;
				}
				return -numnew;
			}
		}
	}
	public static int Main()
	{
		int i;
		int[] a = new int[6];
		int[] answer = new int[6];
		for (i = 0;i < 6;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			answer[i] = reverse(a[i]);
			System.out.print(answer[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

