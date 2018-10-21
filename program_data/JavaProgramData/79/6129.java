package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int m;
		while (true)
		{
			int count = 0;
			int number = 0;
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (N == 0 && m == 0)
			{
				break;
			}
			final int n = N;
			int[] a = new int[n + 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			for (int i = 1;;++i)
			{
				if (i > n)
				{
					i = i - n;
				}
				if (a[i] == 1)
				{
					continue;
				}
				else
				{
					++count;
					//cout<<"i="<<i<<" count="<<count<<" a["<<i<<"]="<<a[i]endl;

				}
				if (number == n - 1)
				{
					break;
				}
				if (count == m)
				{
					number++;
					count = 0;
					a[i] = 1;
					//cout<<"number="<<number<<"a["<<i<<"]="<<a[i]<<endl

				}
			}
		for (int i = 1;i <= n;++i)
		{
		if (a[i] == 0)
		{
			System.out.print(i);
			System.out.print("\n");
		}
		}
		}
		return 0;
	}

}

