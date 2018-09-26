package <missing>;

public class GlobalMembers
{
	public static int huiwen(int num)
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *shuwei;
		int shuwei;
		int number;
		int gao = 0;
		int t = 1;
		int a;
		int z;
		number = num;
		for (;;)
		{
			if (num / 10 != 0)
			{
				gao++;
				num = num / 10;
			}
			else
			{
				break;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		shuwei = (int)calloc(gao + 1,4);
			for (i = gao + 1;i >= 1;i--)
			{
				shuwei[i - 1] = number / Math.pow(10,i - 1);
				a = number / Math.pow(10,i - 1);
				number = number - a * Math.pow(10,i - 1);
			}
			for (i = 1;i <= gao + 1;i++)
			{
				if (shuwei[i - 1] != shuwei[gao + 1 - i])
				{
					t = 0;
					break;
				}
			}
			if (t == 1)
			{
				z = 1;
			}
			else
			{
				z = 0;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(shuwei);
			return z;
	}

	public static int Main()
	{
		int num;
		int i = 1;
		int j;
		int m;
		int n;
		int[] a = new int[1000];
		int[] t = new int[1000];
		int w = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (num = m;num <= n;num++)
		{
			if (huiwen(num) == 1)
			{
				a[i - 1] = num;
				i++;
			}
		}
		for (i = 1;i <= 1000;i++)
		{
			if (a[i - 1] != 0)
			{
				for (j = 2;j < a[i - 1];j++)
				{
					if (a[i - 1] % j == 0)
					{
						t[i - 1] = 1;
						break;
					}
				}
			}
		}
		for (i = 1;i <= 1000;i++)
		{
			if (a[i - 1] != 0 && t[i - 1] == 0)
			{
				System.out.printf("%d",a[i - 1]);
				w = 1;
				break;
			}
		}
		for (j = i + 1;j <= 1000;j++)
		{
			if (a[j - 1] != 0 && t[j - 1] == 0)
			{
				System.out.printf(",%d",a[j - 1]);
			}
		}
		if (w == 0)
		{
			System.out.print("no");
		}
	}



}

