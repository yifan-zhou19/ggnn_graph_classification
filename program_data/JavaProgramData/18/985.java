package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] array = new int[101][101];
	public static int search_x(int k)
	{
		int i;
		int j;
		int t = 1000;
		for (j = 0;j < n;j++)
		{
				if (*(*(array + 0) + j) < t)
				{
					t = (*(array + 0) + j);
				}
		}
			for (j = 0;j < n;j++)
			{
				*(*(array + 0) + j) = *(*(array + 0) + j) - t;
			}

		for (i = k;i < n;i++)
		{
			t = 1000;
			for (j = 0;j < n;j++)
			{
				if (*(*(array + i) + j) < t)
				{
					t = (*(array + i) + j);
				}
			}
			for (j = 0;j < n;j++)
			{
				*(*(array + i) + j) = *(*(array + i) + j) - t;
			}
		}
		return 0;
	}
	public static int search_y(int k)
	{
		int i;
		int j;
		int t = 1000;
		for (i = 0;i < n;i++)
		{
				if (*(*(array + i) + 0) < t)
				{
					t = (*(array + i) + 0);
				}
		}
			for (i = 0;i < n;i++)
			{
				*(*(array + i) + 0) = *(*(array + i) + 0) - t;
			}
		for (j = k;j < n;j++)
		{
			t = 1000;
			for (i = 0;i < n;i++)
			{
				if (*(*(array + i) + j) < t)
				{
					t = (*(array + i) + j);
				}
			}
			for (i = 0;i < n;i++)
			{
				*(*(array + i) + j) = *(*(array + i) + j) - t;
			}
		}
		return 0;
	}
	public static int change(int k)
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			*(*(array + i) + k) = 1000;
		}
		for (j = 0;j < n;j++)
		{
			*(*(array + k) + j) = 1000;
		}
		return 0;
	}
	public static int Main()
	{


		int i;
		int j;
		int k;
		int w;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (w = 0;w < n;w++)
		{
			num = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
				*(*(array + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}

		for (k = 0;k < n;k++)
		{
			search_x(k + 1);
			search_y(k + 1);
			num = num + *(*(array + k + 1) + k + 1);
			change(k + 1);

		}

		System.out.print(num);
		System.out.print("\n");
		}
		return 0;

	}
}

