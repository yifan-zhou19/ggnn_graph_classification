package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int i;
		int j;
		int e;
		int[] a = new int[100];
		float s;
		float q;
		float w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			q = 2F,w = 1F,s = 0F;
			for (j = 1;j <= a[i];j++)
			{
			  s += q / w;
			  e = q;
				 q = q + w;
				 w = e;
			}
			System.out.printf("%.3f\n",s);
		}
	}

}

