package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int i;
			int t;
			int[] a = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			int[] b = new int[100];
			int[] c = new int[100];
			for (i = 0;i < 48;i++)
			{
				a[i + 2] = a[i] + a[i + 1];
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
					b[i] = Integer.parseInt(tempVar2);
				}
				t = b[i];
				c[i] = a[t - 1];
			}
			   for (i = 0;i < n;i++)
			   {
				   System.out.printf("%d\n",c[i]);
			   }
	}

}

