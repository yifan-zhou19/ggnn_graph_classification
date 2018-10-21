/*
 * ct.c
 *
 *  Created on: 2011-11-24
 *      Author: lin
 */

public class block
{
	public int l;
	public int r;
}

package <missing>;

public class GlobalMembers
{
	public static int mysort(Object a, Object b)
	{
		block aa = (block)a;
		block bb = (block)b;
		if (aa.l == bb.l)
		{
			return bb.r - aa.r;
		}
		else
		{
			return aa.l - bb.l;
		}
	}

	public static int Main()
	{
		block[] in = tangible.Arrays.initializeWithDefaultblockInstances(50000);
		int n;
		int i;
		int left;
		int right;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; ++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				in[i].l = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				in[i].r = Integer.parseInt(tempVar3);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(in,n,sizeof(in[0]),mysort);

		left = in[0].l;
		right = in[0].r;
		for (i = 1; i < n; ++i)
		{
			if (in[i].r > right)
			{
				if (in[i].l <= right)
				{
					right = in[i].r;
				}
				else
				{
					break;
				}
			}
		}
		if (i == n)
		{
			System.out.printf("%d %d", left, right);
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;

	}



}

