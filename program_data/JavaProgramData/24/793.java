package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char c;
		int[] b = new int[50];
		int i;
		int j;
		int m;
		int max;
		int min;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			if (c = System.in.read() == '\n')
			{
				break;
			}
			m = i;
		}
		for (i = 0;i <= m + 1;i++)
		{
			for (j = 0;j < 50;j++)
			{
				if (a[i][j] != 0)
				{
					b[i]++;
				}
			}
		}
		for (i = 1,max = 0,min = 0;i <= m + 1;i++)
		{
			if (b[i] > b[max])
			{
				max = i;
			}
			if (b[i] < b[min])
			{
				min = i;
			}
		}
		System.out.printf("%s\n%s\n",a[max],a[min]);
	}

}

