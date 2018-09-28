package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int[] a = new int[105];
	  int[] b = new int[105];
	  int[] d = new int[105];
	  int i;
	  int j;
	  int k;
	  int n;
	  final String c = "";
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		c = new Scanner(System.in).nextLine();
		k = c.length();
		for (j = 0;j < k;j++)
		{
		  a[j] = c.charAt(k - j - 1) - '0';
		}
		for (j = k;j < 105;j++)
		{
			a[j] = 0;
		}
		c = new Scanner(System.in).nextLine();
		k = c.length();
		for (j = 0;j < k;j++)
		{
		  b[j] = c.charAt(k - j - 1) - '0';
		}
		for (j = k;j < 105;j++)
		{
			b[j] = 0;
		}
		//printf("%d %d%d%d%d%s ",k,b[1],b[2],b[3],b[4],c);
		c = new Scanner(System.in).nextLine();
		for (j = 0;j <= 102;j++)
		{
			d[j] = 0;
		}
		for (j = 0;j <= 102;j++)
		{
			d[j] = d[j] + a[j] - b[j];
			if (d[j] < 0)
			{
				d[j] = d[j] + 10;
				d[j + 1] = d[j + 1] - 1;
			}
			//k=j,k=d[j];
		}
		j = 101;
		while (d[j] == 0)
		{
			j--;
		}
		while (j >= 0)
		{
			System.out.printf("%d",d[j]);
			j--;
		}
		System.out.print("\n");
	  }
	}

}

