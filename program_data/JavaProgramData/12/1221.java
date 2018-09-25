package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16]; //???0????????????
		int num = 0;
		int s; //??2??????
		int i; //?????
		int j;
		a[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a[num] != -1)
		{
			while (a[num] != 0)
			{
				num++;
				a[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			num--; //?????0????
			s = 0;
			for (i = 0; i <= num; i++)
			{
				for (j = 0; j <= num; j++)
				{
					if (a[i] == a[j] * 2)
					{
						s++;
					}
				}
			}
			System.out.print(s);
			System.out.print("\n");
			num = 0;
			a[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

	}

}

