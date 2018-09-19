package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16]; //len???????count??????
		int len;
		int count;
		while (true)
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1) //??????
			{
				break;
			}
			count = 0;
			len = 0;
			do
			{
				len++;
				a[len] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}while (a[len] != 0);
			for (int i = 0; i < len; i++) //a[len]=0???"<"
			{
				for (int j = 0; j < len; j++)
				{
					if (j == i)
					{
						continue; //???????
					}
					else
					{
						if (a[j] == (2 * a[i]))
						{
							count++; //????????????????
							break; //????????
						}
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}
}

