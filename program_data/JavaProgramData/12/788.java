package <missing>;

public class GlobalMembers
{
	public static int[] array = new int[16];
	public static int n = 0;
	public static int sum = 0;
	public static int Main()
	{
		int i;
		int j;
		while (true)
		{
				n = 0;
				sum = 0;
				while (true)
				{
						array[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						if (array[n] == 0 || array[n] == -1)
						{
						  n--;
						  break;
						}
						n++;
				}
				if (array[0] == -1)
				{
				 break;
				}
				for (i = 0;i <= n;++i)
				{
				 for (j = i;j <= n;++j)
				 {
						  if ((array[i] == array[j] * 2) || (array[j] == array[i] * 2))
						  {
								 sum++;
						  }
				 }
				}
				System.out.print(sum);
				System.out.print("\n");
		}

		return 0;
	}

}

