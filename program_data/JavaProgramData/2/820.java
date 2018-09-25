public class book
{
	public int num;
	public String writer = new String(new char[100]);

}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[26];
		int[] c = new int[100];
		int k;
		int t;
		int[] d = new int[100];
		int s;
		book[] bo = tangible.Arrays.initializeWithDefaultbookInstances(100);

		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
		}

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
				bo[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bo[i].writer = tempVar3.charAt(0);
			}

		}

		for (i = 0;i < n;i++)
		{
			c[i] = String.valueOf(bo[i].writer).length();
			for (j = 0;j < c[i];j++)
			{
				k = bo[i].writer.charAt(j) - 'A';
				a[k]++;

			}

		}

		t = a[0];
		j = 0;
		for (i = 1;i < 26;i++)
		{
			if (a[i] > t)
			{
				j = i;
				t = a[i];
			}

		}
		s = j;

		System.out.printf("%c\n",'A' + j);
		System.out.printf("%d\n",t);
		for (i = 0;i < n;i++)
		{
			d[i] = 0;
			for (j = 0;j < c[i];j++)
			{
				if (bo[i].writer.charAt(j) == ('A' + s))
				{
					d[i] = 1;
				}

			}
			if (d[i] == 1)
			{
				System.out.printf("%d\n",bo[i].num);
			}

		}


	}


}

