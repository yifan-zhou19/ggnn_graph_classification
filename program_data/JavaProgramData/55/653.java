package <missing>;

public class GlobalMembers
{
	//????????
	public static int Main()
	{
		int i; //????
		int m;
		int len;
		int num;
		int sum = 0;
		int n;
		int j = 0;
		String zi = new String(new char[1000]);
		int[] goal = new int[1000];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		zi = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len = zi.length();
		for (i = 0;i < len;i++)
		{
			if (zi.charAt(i) > 64 && zi.charAt(i) < 91)
			{
				num = (int)zi.charAt(i) - 55;
			}
			else if (zi.charAt(i) > 96 && zi.charAt(i) < 123)
			{
				num = (int)zi.charAt(i) - 87;
			}
			else
			{
				num = (int)zi.charAt(i) - 48;
			}
			sum = sum + num * Math.pow(m * 1.0,len - i - 1); //??????
		}
		while (sum >= n)
		{
			goal[j] = sum % n;
			sum = sum / n;
			j++; //???n??
		}
		goal[j] = sum;
		for (i = j;i >= 0;i--)
		{
			if (goal[i] >= 10)
			{
				System.out.print((char)(goal[i] + 55));
			}
			else
			{
				System.out.print(goal[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

