package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int[] d = new int[1000];
		int total;
		int temp;
		String c = new String(new char[1000]);
		while ((c[i] = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		{
			i++;
			d[i] = 0;
		}
		total = i;
		for (i = 0;i < (total / 2);i++)
		{
			for (j = 0;j < total;j++)
			{
				if (d[j] == 0)
				{
					if (c.charAt(j) == c.charAt(total - 1))
					{
						temp = j;
						d[j] = 1;
						do
						{
							j--;
						} while (d[j] == 1);
						System.out.print(j);
						System.out.print(" ");
						System.out.print(temp);
						System.out.print("\n");
						d[j] = 1;
						break;
					}
				}
			}
		}
		return 0;
	}

	//??????????????????
	//???????????????
	//????????????????????????
	//????????????????? 
}

