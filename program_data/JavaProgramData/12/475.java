package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16]; //????a???????count????????????
		int i;
		int j;
		int k;
		int count;
		while (true)
		{
			for (i = 0; ; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0) //????0?????????
				{
					break;
				}
				if (a[0] == -1)
				{
					break;
				}
			}
			if (a[0] == -1) //????????-1???????
			{
				break;
			}
			count = 0; //?count??0
			for (k = 0; k < i; k++)
			{
				for (j = 0; j < i; j++)
				{
					if ((a[k] == 2 * a[j]) || (a[j] == a[k] * 2))
					{
						count++; //????????????
					}
				}
			}
					System.out.print(count / 2);
					System.out.print("\n");
		}
		return 0;
	}

}

