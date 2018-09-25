package <missing>;

public class GlobalMembers
{
	public static char[][] sex = new char[50][7];
	public static float[] tall = new float[50];
	public static float[] sort1 = new float[50];
	public static float[] sort2 = new float[50];
	public static final String m = "male";
	public static final String f = "female";

	public static void x(float[] s, int n)
	{
		int i;
		int j;
		float tmp;
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (s[j] > s[j + 1])
				{
					tmp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = tmp;
				}
			}
		}
	}

	public static void x1(float[] s, int n)
	{
		int i;
		int j;
		float tmp;
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (s[j] < s[j + 1])
				{
					tmp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = tmp;
				}
			}
		}
	}

	public static int Main()
	{
		int N;
		int count;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		count = N;
		while (N-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				tall[i] = Float.parseFloat(tempVar3);
			}
			i++;
		}

		for (i = 0,j = 0;i < count;i++)
		{
			if (!strcmp(sex[i],"male"))
			{
				sort1[j] = tall[i];
				j++;
			}
		}

		x(sort1, j);

		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2f ",sort1[i]);
		}

		for (i = 0,j = 0;i < count;i++)
		{
			if (!strcmp(sex[i],"female"))
			{
				sort2[j] = tall[i];
				j++;
			}
		}

		x1(sort2, j);

		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%.2f ",sort2[i]);
		}
		System.out.printf("%.2f",sort2[j - 1]);
		System.out.print("\n");
		return 0;
	}
}

