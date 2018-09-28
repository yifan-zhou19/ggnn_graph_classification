package <missing>;

public class GlobalMembers
{
	public static int asdf(int n,int m)
	{
			int[] a = new int[n];
			int ret = 0;
			int i = 0;
			int left = n;
			int temp = 0;
			int inc = 0;

			for (i = 0;i < n;i++)
			{
					a[i] = i + 1;
			}

			i = 0;

			while (a[1] != 0)
			{
					temp = (i + m) % left;
					if (0 == temp)
					{
							temp = left;
					}
					else
					{
							for (inc = temp;inc < left;inc++)
							{
									a[inc - 1] = a[inc];

							}
					}
					i = temp - 1;
					a[left - 1] = 0;
					left--;
			}
			ret = a[0];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(a);
			return ret;
	}

	public static int Main()
	{
			int n;
			int m;
			int[] res = new int[MAX_SIZE];
			int counter = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(res,0,(Integer.SIZE / Byte.SIZE));

			for (;counter < MAX_SIZE;counter++)
			{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						n = Integer.parseInt(tempVar);
					}
					String tempVar2 = ConsoleInput.scanfRead(" ");
					if (tempVar2 != null)
					{
						m = Integer.parseInt(tempVar2);
					}
					if (n == 0)
					{
							break;
					}
					res[counter] = asdf(n, m);
			}
			for (counter = 0;(counter < MAX_SIZE) && (res[counter] != 0);counter++)
			{
					System.out.printf("%d\n",res[counter]);
			}
			return 0;
	}

}

