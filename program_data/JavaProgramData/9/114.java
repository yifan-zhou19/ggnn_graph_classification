public class pa
{
	public String str = new String(new char[10]);
	public int y;
}

package <missing>;

public class GlobalMembers
{
	public static pa[] pa = tangible.Arrays.initializeWithDefaultpaInstances(101);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int t = 0;
		int[] a = new int[100];
		int[] b = new int[100];
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
				pa[i].str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pa[i].y = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (pa[i].y >= 60)
			{
				a[k] = i;
				k++;
			}
			else
			{
				b[t] = i;
				t++;
			}
		}

		 for (i = 1;i < k;i++)
		 {
			 for (j = 0;j < k - i;j++)
			 {
				 if (pa[a[j]].y < pa[a[j + 1]].y)
				 {
					 pa[100] = pa[a[j]];
					 pa[a[j]] = pa[a[j + 1]];
					 pa[a[j + 1]] = pa[100];
				 }
			 }
		 }

		 for (i = 0;i < k;i++)
		 {
			 System.out.printf("%s\n",pa[a[i]].str);
		 }
		 for (i = 0;i < t;i++)
		 {
			 System.out.printf("%s\n",pa[b[i]].str);
		 }
	}

}

