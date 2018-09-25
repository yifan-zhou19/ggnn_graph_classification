package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int h;
		int n;
		for (h = 0;;h++)
		{
			n = 0;

				for (i = 0;i < 16;i++)
				{
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 a[i] = Integer.parseInt(tempVar);
				 }
				 if (a[i] == 0)
				 {
				  break;
				 }
				}
				if (a[0] == -1)
				{
					break;
				}
			for (j = 0;j < i;j++)
			{
				for (k = 0;k < i;k++)
				{
					if ((a[k] / a[j]) == 2 && (a[k] % a[j]) == 0)
					{
					n = n + 1;
					}
				 else
				 {
					 n = n;
				 }
				}
			}
		   System.out.printf("%d\n",n);
		   if (a[0] == -1)
		   {
				break;
		   }

		}
		return 0;
	}
}

