package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] sum = new int[123];
		int m = 0;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char[] c = (String)malloc((Character.SIZE / Byte.SIZE) * 301);
		for (i = 0;i <= 301;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c[i] = tempVar.charAt(0);
			}
			if (c[i] == '\n')
			{
				q = i;
				break;
			}
		}
		for (j = 65;j <= 90;j++)
		{
			for (i = 0;i < q;i++)
			{
				if ((int)c[i] == j)
				{
					sum[j]++;
				}
			}
			if (sum[j] != 0)
			{
				System.out.printf("%c=%d\n",j,sum[j]);
				m++;
			}
			else
			{
				continue;
			}
		}
		for (j = 97;j <= 122;j++)
		{
			for (i = 0;i < q;i++)
			{
				if ((int)c[i] == j)
				{
					sum[j]++;
				}
			}
			if (sum[j] != 0)
			{
				System.out.printf("%c=%d\n",j,sum[j]);
				m++;
			}
			else
			{
				continue;
			}
		}
		if (m == 0)
		{
			System.out.print("No");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(c);
	}
}

