public class tushu
{
public int bianhao;
public String writer = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static tushu[] book = tangible.Arrays.initializeWithDefaulttushuInstances(1000);
	public static void jishu(tushu p1, int[] a, int b)
	{
		int j;
		int k;
		int diji;
		for (j = 0;j < 26;j++)
		{
			a[j] = 0;
		}
		for (j = 0;j < b;j++)
		{
			k = 0;
			do
			{
				diji = (*(p1 + j)).writer[k] - 'A';
				a[diji]++;
				k++;
			}while ((*(p1 + j)).writer[k] != '\0');
		}
	}
	public static int max(int[] c)
	{
		int k;
		int da;
		int jieguo = 0;
		da = c[0];
		for (k = 1;k < 26;k++)
		{
			if (c[k] > da)
			{
				da = c[k];
				jieguo = k;
			}
		}
		System.out.printf("%c\n%d\n",65 + jieguo,da);
		return (jieguo);
	}
	public static void shu(tushu p2, int d, int e)
	{
		char ai = 65 + d;
		int x;
		int y;
		for (x = 0;x < e;x++)
		{
			y = 0;
			do
			{
				if ((*(p2 + x)).writer[y] == ai)
				{
					System.out.printf("%d\n",(p2 + x).bianhao);
				}
				y++;
			}while ((*(p2 + x)).writer[y] != '\0');
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int m;
		int[] zimu = new int[26];
		tushu pointer;
		pointer = book[0];
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
				book[i].bianhao = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].writer = tempVar3.charAt(0);
			}
		}
		jishu(pointer, zimu, n);
		m = max(zimu);
		shu(pointer, m, n);
		return 0;
	}



}

