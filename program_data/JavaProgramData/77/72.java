public class OUT
{
	public int boy;
	public int girl;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		OUT[] out = tangible.Arrays.initializeWithDefaultOUTInstances(50);
		void sort(OUT out[0],int k);
		int i;
		int j;
		int k = 0;
		int len;
		String queue = new String(new char[101]);
		char boy;
		char girl;

		queue = new Scanner(System.in).nextLine();
		len = queue.length();
		boy = queue.charAt(0);
		girl = queue.charAt(len - 1);

		while (true)
		{
			for (i = 0;i < len - 1;i++)
			{
				if (queue.charAt(i) == boy)
				{
					for (j = i + 1;queue.charAt(j) == 0;j++)
					{
						;
					}
					//????????
					if (queue.charAt(j) == girl)
					{
						queue = queue.substring(0, i);
						queue = queue.substring(0, j);
						out[k].boy = i;
						out[k].girl = j;
						k++;
						i = j;
					}
					else
					{
						i = j - 1;
					}
				}
			}
			if (k == len / 2)
			{
				break;
			}
			//????len/2????????
		}

		sort(out, k);
		//???????
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d %d\n",out[i].boy,out[i].girl);
		}
	}

	public static void sort(OUT[] out, int k)
	{
		int i;
		int j;
		int min;
		int minum;
		OUT temp = new OUT();
		for (i = 0;i < k - 1;i++)
		{
			min = out[i].girl;
			minum = i;
			for (j = i + 1;j < k;j++)
			{
				if (min > out[j].girl)
				{
					min = out[j].girl;
					minum = j;
				}
			}
			if (minum - i != 0)
			{
				temp = out[i];
				out[i] = out[minum];
				out[minum] = temp;
			}
		}
	}
}

