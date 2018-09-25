package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n; //????
		int[] a = new int[1000];
		int[] b = new int[1000];
		int s = 0;
		int d = 0;
		int f = 0;
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 == 1)
			{
				b[j] = a[i],j++,d++;
			} //???????
		}
		for (i = 0;i < d - 1;i++)
		{
			for (j = i + 1;j < d;j++)
			{
				if (b[i] > b[j])
				{
					f = b[i],b[i] = b[j],b[j] = f;
				} //?????
			}
		}
		for (j = 0;j < d - 1;j++)
		{
			System.out.print(b[j]);
			System.out.print(",");
		}
		System.out.print(b[d - 1]);
		return 0;
	}
}

