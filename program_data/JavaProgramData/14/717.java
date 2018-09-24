public class stu
{
	public int ID;
	public int c;
	public int m;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100000);


	public static void Main(String[] args)
	{
		int n;
		int i;
		int x;
		int y;
		int z;
		int t;
		int q;
		int w;
		int e;
		int[] b = new int[100000];
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
				a[i].ID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].m = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = a[i].c + a[i].m;
		}
		if (b[0] > b[1] && b[1] > b[2])
		{
			x = b[0];
			q = 1;
			y = b[1];
			w = 1 + 1;
			z = b[2];
			e = 2 + 1;
		}
		else if (b[1] > b[0] && b[0] > b[2])
		{
			x = b[1];
			y = b[0];
			z = b[2];
			q = 1 + 1;
			w = 0 + 1;
			e = 2 + 1;
		}
		else if (b[2] > b[1] && b[1] > b[0])
		{
			x = b[2];
			y = b[1];
			z = b[0];
			q = 2 + 1;
			w = 1 + 1;
			e = 0 + 1;
		}
		else if (b[2] > b[0] && b[0] > b[1])
		{
			x = b[2];
			y = b[0];
			z = b[1];
			q = 2 + 1;
			w = 0 + 1;
			e = 1 + 1;
		}
		else if (b[1] > b[2] && b[2] > b[0])
		{
			x = b[1];
			y = b[2];
			z = b[0];
			q = 1 + 1;
			w = 2 + 1;
			e = 0 + 1;
		}
		else if (b[0] > b[2] && b[2] > b[1])
		{
			x = b[0];
			y = b[2];
			z = b[1];
			q = 0 + 1;
			w = 2 + 1;
			e = 1 + 1;
		}
		for (i = 3;i < n;i++)
		{
			if (b[i] > x)
			{
				t = x;
				x = b[i];
				z = y;
				y = t;
				e = w;
				w = q;
				q = i + 1;
			}
			else if (b[i] > y)
			{
				z = y;
				y = b[i];
				e = w;
				w = i + 1;
			}
			else if (b[i] > z)
			{
				z = b[i];
				e = i + 1;
			}
		}
		System.out.printf("%d %d\n",q,x);
		System.out.printf("%d %d\n",w,y);
		System.out.printf("%d %d\n",e,z);

	}



}

