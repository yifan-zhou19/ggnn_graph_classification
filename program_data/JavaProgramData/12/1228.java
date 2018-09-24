package <missing>;

public class GlobalMembers
{
	/*
	 * file : 1.cpp
	 * author : ??? 1200012911
	 * time ?2012.10.29
	 * function : ????
	 */



	public static int Main()
	{
		int[] a = new int[17]; //????????
		int count;
		int i;
		int j;
		int k;
		int two;
		int num;
		for (k = 1; ; k++)
		{
			count = 0; //?????
			for (i = 1; i <= 16; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[1] == -1 || a[i] == 0)
				{
					num = i; //????????
					break;
				}
			}
			if (a[1] == -1)
			{
				break; //?????-1????
			}
			for (i = 1; i < num; i++)
			{
				two = 2 * a[i]; //????????
				for (j = 1; j < num; j++)
				{
					if (two == a[j]) //?????
					{
						count++;
						break;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}
}

