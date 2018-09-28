package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int[] stre = new int[1000];
		int y;
		int max = 1;
		char[][] str = new char[1000][1000];
		String stra = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			stra = tempVar2.charAt(0);
		}
		len = stra.length();
		for (int i = 0;i <= len - n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				str[i][j] = stra.charAt(i + j);
			}
		}
		//?????~
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(stre, 0, (Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < len - n;i++)
		{
			for (int j = i;j <= len - n;j++)
			{
				y = strcmp(str[i],str[j]);
				if (y == 0)
				{
					stre[i]++;
				}
			}
		}
		for (int i = 0;i < len - n;i++)
		{
			if (stre[i] > max)
			{
				max = stre[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (int i = 0;i < len - n;i++)
			{
				if (stre[i] == max)
				{
					for (int j = 0;j < n;j++)
					{
						System.out.printf("%c",str[i][j]);
					}
					System.out.print("\n");

				}


			}
		}
	}
}

