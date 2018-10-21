package <missing>;

public class GlobalMembers
{
	public static int[] n = new int[2];
	public static void input(int[] a, int[] b, int[] n)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n[1] = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n[0];i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n[1];i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
		}
	}
	public static void sort(tangible.RefObject<Integer> p, tangible.RefObject<Integer> q, tangible.RefObject<Integer> x)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < (x.argValue-1);i++)
		{
			k = i;
			for (j = i + 1;j < x.argValue;j++)
			{
			  if (*(p.argValue + j) < *(p.argValue + k))
			  {
				  k = j;
			  }
			}
			if (k != i)
			{
				t = (p.argValue + i);
				*(p.argValue + i) = *(p.argValue + k);
				*(p.argValue + k) = t;
			}
		}
		for (i = 0;i < *(x.argValue+1) - 1;i++)
		{
			k = i;
			for (j = i + 1;j < *(x.argValue+1);j++)
			{
			  if (*(q.argValue + j) < *(q.argValue + k))
			  {
				  k = j;
			  }
			}
			if (k != i)
			{
				t = (q.argValue + i);
				*(q.argValue + i) = *(q.argValue + k);
				*(q.argValue + k) = t;
			}
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'q', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'w', so pointers on this parameter are left unchanged:
	public static void fold(int * p, tangible.RefObject<Integer> x, int * q, int * w)
	{
		int i;
		for (i = 0;i < x.argValue;i++,w++,p++)
		{
			*w = p;
		}
		for (;i < x.argValue + (*(x.argValue+1));i++,w++,q++)
		{
			*w = q;
		}
	}
	public static void putout(tangible.RefObject<Integer> w, tangible.RefObject<Integer> x)
	{
		int i;
		for (i = 0;i < x.argValue + (*(x.argValue+1)) - 1;i++)
		{
			System.out.printf("%d ",*(w.argValue + i));
		}
		System.out.printf("%d\n",*(w.argValue + i));
	}
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
		input(a, b, n);
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
	tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
	tangible.RefObject<Integer> tempRef_n = new tangible.RefObject<Integer>(n);
		sort(tempRef_a, tempRef_b, tempRef_n);
		n = tempRef_n.argValue;
		b = tempRef_b.argValue;
		a = tempRef_a.argValue;
	tangible.RefObject<Integer> tempRef_n2 = new tangible.RefObject<Integer>(n);
		fold(a, tempRef_n2, b, c);
		n = tempRef_n2.argValue;
	tangible.RefObject<Integer> tempRef_c = new tangible.RefObject<Integer>(c);
	tangible.RefObject<Integer> tempRef_n3 = new tangible.RefObject<Integer>(n);
		putout(tempRef_c, tempRef_n3);
		n = tempRef_n3.argValue;
		c = tempRef_c.argValue;
	}

}

