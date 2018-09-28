public class data
{
	public int[] a = new int[100];
	public char[][] num = new char[100][15];
}

package <missing>;

public class GlobalMembers
{
	public static data data = new data();

	public static void Main()
	{
		int i;
		int b;
		int k = 0;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data.num[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				data.a[i] = Integer.parseInt(tempVar3);
			}
			if (data.a[i] >= 60)
			{
				k++;
			}
		}
		for (j = 0;j < k;j++)
		{
			b = 0;
			for (i = 0;i < n;i++)
			{
				if (data.a[i] > data.a[b])
				{
				b = i;
				}
			}
			System.out.printf("%s\n",data.num[b]);
			data.a[b] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (data.a[i] != 0)
			{
				System.out.printf("%s\n",data.num[i]);
			}
		}
	}
}

