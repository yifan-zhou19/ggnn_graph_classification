package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int num = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] max = new int[1000];
		for (i = 0;i < 1000;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num++; //??
			if (System.in.read() == '\n') //????????????Xi??????
			{
				break;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n') //????
			{
				break;
			}
		}
		for (i = 0;i < num;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				max[j]++; //max[j]??j????????
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (max[0] < max[i])
			{
				max[0] = max[i]; //???????????
			}
		}
			System.out.print(num);
			System.out.print(' ');
			System.out.print(max[0]);
			return 0;
	}
}

