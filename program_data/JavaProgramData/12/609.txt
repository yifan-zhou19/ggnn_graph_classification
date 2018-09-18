package <missing>;

public class GlobalMembers
{
	//?? 
	public static int Main()
	{
		int[] num = new int[16]; //????????????
		int i; //i,k????  n?????
		int k;
		int n;
		while (true) //?while?????break???-1
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num, 0, (Integer.SIZE / Byte.SIZE));
			i = 0;
			k = 0;
			n = 0; //?????
			for (i = 1; ; i++)
			{
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (num[i] == 0)
				{
					break;
				}
				for (k = 1; k <= i; k++)
				{
					if ((num[k] / num[i] == 2 && num[k] % num[i] == 0) || (num[i] / num[k] == 2 && num[i] % num[k] == 0))
					{
						n++; //????
					}
				}
			}
			if (num[1] == -1)
			{
				break;
			}
			System.out.print(n);
			System.out.print("\n");
		}
		return 0;
	}

}

