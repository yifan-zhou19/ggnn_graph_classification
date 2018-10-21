package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int s;
		int b = 0;
		int z;
		int o;
		int v = 0;
		int[] a = new int[100];
		int[] p = new int[100];
		int[] l = new int[100];
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
		for (i = m;i <= n;i++)
		{
			z = 0;
			k = 0;
			s = i;
			t = 0;
			v = 0;
			for (j = 1;j <= i;j++)
			{

				if (i % j == 0)
				{
					t++;
				}
			}
			while (s != 0)
			{

				a[k] = s % 10;
				p[z] = s % 10;
				s = s / 10;
				k++;
				z++;
			}

			for (k = 0,o = z - 1;k<z,o >= 0;k++,o--)
			{
				if (a[k] == p[o])
				{
					v++;
				}
			}
			if (t == 2 && v == z)
			{
				l[b] = i;
				b++;
			}
		}
		if (b == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",l[0]);
		}
			 for (i = 1;i < b;i++)
			 {
			 System.out.printf(",%d",l[i]);
			 }
		return 0;
	}




}

