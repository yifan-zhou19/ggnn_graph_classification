package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] an1 = new int[MAX_LEN];
		int[] an2 = new int[MAX_LEN];
		int[] sum = new int[MAX_LEN];
		String seLine1 = new String(new char[MAX_LEN]);
		String seLine2 = new String(new char[MAX_LEN]);


		seLine1 = new Scanner(System.in).nextLine();
		seLine2 = new Scanner(System.in).nextLine();

		int nLen1 = seLine1.length();
		int nLen2 = seLine2.length();

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum, 0, (Integer.SIZE / Byte.SIZE));

		int i;
		int j;
		int c;
		for (i = nLen1 - 1,j = 0; i >= 0; i--, j++)
		{
			an1[j] = seLine1.charAt(i) - '0';
		}
		for (i = nLen2 - 1,j = 0; i >= 0; i--, j++)
		{
			an2[j] = seLine2.charAt(i) - '0';
		}


		c = 0;
		for (i = 0; i < MAX_LEN ; i++)
		{
			sum[i] = an1[i] + an2[i] + c;
			c = 0;
			while (sum[i] >= 10)
			{
				sum[i] -= 10;
				c++;
			}

		}
		i = MAX_LEN - 1;
		while (sum[i] == 0)
		{
			i--;
		}
		if (i == -1)
		{
			System.out.print("0");
		}
		for (;i >= 0; i--)
		{
			System.out.printf("%d", sum[i]);
		}
		System.out.print("\n");

		return 0;
	}

}
