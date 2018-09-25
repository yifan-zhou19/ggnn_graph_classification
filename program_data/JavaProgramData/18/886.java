package <missing>;

public class GlobalMembers
{
	//1????'\0'
	//2???????
	//3??????
	//4?cin.get();
	//5?double??
	//6?
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int q = 0;
		while (q < n)
		{
			int[][] a = new int[110][110];
			(int)(*p)[110] = a;
			int o = n;
			int sum = 0;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					*(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			while (o > 0)
			{
				int[][] min = new int[110][2];
				(int)(*q)[2] = min;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(min,10000,(Integer.SIZE / Byte.SIZE));
				for (int i = 0;i < o;i++)
				{
					for (int j = 0;j < o;j++)
					{
						if (*(*(p + i) + j) < *(*(q + i)))
						{
							*(*(q + i)) = *(*(p + i) + j);
						}
					}
				}
				for (int i = 0;i < o;i++)
				{
					for (int j = 0;j < o;j++)
					{
						*(*(p + i) + j) -= *(*(q + i));
					}
				}
				for (int j = 0;j < o;j++)
				{
					for (int i = 0;i < o;i++)
					{
						if (*(*(p + i) + j) < *(*(q + j) + 1))
						{
							*(*(q + j) + 1) = *(*(p + i) + j);
						}
					}
				}
				for (int j = 0;j < o;j++)
				{
					for (int i = 0;i < o;i++)
					{
						*(*(p + i) + j) -= *(*(q + j) + 1);
					}
				}
				sum += *(*(p + 1) + 1);
				for (int i = 0;i < o;i++)
				{
					for (int j = 1;j < o;j++)
					{
						*(*(p + i) + j) = *(*(p + i) + j + 1);
					}
				}
				for (int i = 1;i < o;i++)
				{
					for (int j = 0;j < o;j++)
					{
						*(*(p + i) + j) = *(*(p + i + 1) + j);
					}
				}
				o--;
			}
			System.out.print(sum);
			System.out.print("\n");
			q++;
		}
		return 0;
	}
}

