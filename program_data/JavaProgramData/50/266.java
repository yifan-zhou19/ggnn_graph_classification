package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int date;
		int l = 0;
		int[] a = new int[12];
		int[] mouth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		int k;
		int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			date = Integer.parseInt(tempVar);
		}
		p = a;
		if (6 - date > 0)
		{
			b[0] = 6 - date;
		}
		else
		{
			b[0] = 13 - date;
		}
		i = 0;
		k = 0;
		while (b[i] <= 365)
		{
			b[i + 1] = b[i] + 7;
			i++;
			k++;
		}
		for (i = 0;i <= k;i++)
		{
			for (j = 0;j < 13;j++)
			{
				if (b[i] - mouth[j] == 13)
				{
					b[i] = b[i] - mouth[j];
					p++=j + 1;
					 l++;
				}
				else
				{
					b[i] = b[i] - mouth[j];
				}
			}
		}
		for (i = 0;i < l - 1;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		System.out.printf("%d\n",a[l - 1]);
	}
}

