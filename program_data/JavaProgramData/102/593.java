package <missing>;

public class GlobalMembers
{
	public static double[] h = new double[100];

	/*void swap(int x, int y) {
	        double t;
	        t = h[x];
	        h[x] = h[y];
	        h[y] = t;
	    }
	
	int partition(int l, int r) {
	        int mark = l;
	        for(int i = l; i < r; i++)
	            if(h[l] <= h[r]) {
	                swap(mark, i);
	                mark++;
	            }
	        swap(mark, r);
	        return mark;
	    }
	
	void sort(int l, int r) {
	        if(l < r) {
	            int q;
	            q = partition(l, r);
	            sort(l, q - 1);
	            sort(q + 1, r);
	        }
	    }*/

	public static void sort(int n)
	{
		int i;
		int j;
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - i - 1; j++)
			{
				if (h[j] > h[j + 1])
				{
					double t = h[j];
					h[j] = h[j + 1];
					h[j + 1] = t;
				}
			}
		}
	}

	public static int Main()
	{
		int n;
		String in = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				in = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(in,"male") != 0)
			{
				h[i] = 1000000.0 - h[i];
			}
		}
		sort(n);
		for (int i = 0; i < n; i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			if (h[i] > 500000.0)
			{
				System.out.printf("%.2lf", 1000000.0 - h[i]);
			}
			else
			{
				System.out.printf("%.2lf", h[i]);
			}

		}
		return 0;
	}

}

