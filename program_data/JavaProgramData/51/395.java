package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String input = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		input = new Scanner(System.in).nextLine();
		input = new Scanner(System.in).nextLine();
		int len = input.length();

		int[] count = new int[501]; //????i???i?????n???????????????count[i]=-1??????????????
		int i;
		int j;
		int k;
		for (i = 0; i < len; i++)
		{
			if (i + n > len)
			{
				break; //???????????n??????
			}
			if (count[i] == -1)
			{
				continue; //count[i]==-1????????????
			}
			for (j = i + 1; j < len; j++)
			{
				if (j + n > len)
				{
					break; //????????????????n??????????
				}
				int equal = 1; //equal==1?????????equal=0??????
				for (k = 0; k < n; k++)
				{
					if (input.charAt(i + k) != input.charAt(j + k))
					{
						equal = 0;
						break;
					}
				}

				if (equal == 1)
				{
					count[i]++; //??count??
					count[j] = -1; //??????
				}
			}
		}

		//???????
		int max = -1;
		int max_pos = 0;
		for (i = 0; i < len; i++)
		{
			if (count[i] > max)
			{
				max = count[i];
				max_pos = i;
			}
		}
		//?????????????????
		if (max + 1 <= 1)
		{
			System.out.print("NO\n");
			return 0;
		}
		System.out.printf("%d\n", max + 1);
		for (i = 0; i < len; i++)
		{
			if (count[i] == max)
			{
				for (j = i; j < i + n; j++)
				{
					System.out.printf("%c", input.charAt(j));
				}
				System.out.print("\n");
			}
		}


	}
}

