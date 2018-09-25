package <missing>;

public class GlobalMembers
{
	  public static void hehe(int n,int m)
	  {
	  int[] a = new int[300];
	  int[] b = new int[300];
	  int c;
	  int i;
	  int j;
	  for (i = 1;i <= n;i++)
	  {
	  a[i] = i;
	  }
	  for (i = n;i > 1;i--)
	  {
		  c = (m % i);
		  for (j = c + 1;j <= i;j++)
		  {
		  b[j - c] = a[j];
		  }
		  for (j = 1;j < c;j++)
		  {
		  b[i - c + j] = a[j];
		  }
		  for (j = 1;j < i;j++)
		  {
		  a[j] = b[j];
		  }
	  }
		System.out.printf("%d\n",a[1]);
	  }
	  public static void Main()
	  {
		  int[] n = new int[15];
		  int[] m = new int[15];
		  int i;
		  int j;
	for (i = 0;i < 15;i++)
	{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] == 0 && n[i] == 0)
			{
			break;
			}
			else
			{
			scanf("\n");
			}
	}
		for (j = 0;j < i;j++)
		{
			hehe(n[j], m[j]);
		}
	  }

}

