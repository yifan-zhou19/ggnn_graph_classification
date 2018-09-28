package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int y;
		int z;
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int[] p = new int[45];
		int[] q = new int[45];
		float[] m = new float[45];
		float x;
		float t;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		k = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				x = (a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]);
				p[k] = i;
				q[k] = j;
				m[k] = Math.sqrt(x);
				k++;
			}
		}
		for (i = k - 1;i >= 0;i--)
		{
			for (j = k - 1;j >= k - i - 1;j--)
			{
				if (m[j + 1] > m[j])
				{
					t = m[j];
					m[j] = m[j + 1];
					m[j + 1] = t;
					y = p[j];
					p[j] = p[j + 1];
					p[j + 1] = y;
					z = q[j];
					q[j] = q[j + 1];
					q[j + 1] = z;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			y = p[i];
			z = q[i];
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[y],b[y],c[y],a[z],b[z],c[z],m[i]);
		}
	}

}

