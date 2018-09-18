package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  int num;
	  int[] a = new int[17];
	  do
	  {
		   i = 0;
		 do
		 {
			  i++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		 }while (a[i] > 0);
		 n = i - 1;
		 if (a[n + 1] != -1)
		 {
			  num = 0;
			for (i = 1;i <= n - 1;i++)
			{
			for (j = i + 1;j <= n;j++)
			{
			  if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
			  {
				num++;
			  }
			}
			}
			System.out.printf("%d\n",num);
		 }
	  }while (a[n + 1] == 0);
	  return 0;
	}
}

