package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int o = 0;
		  int[] a = new int[1000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (i = m;i <= n;i++)
		  {
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
					break;
					}
				}
				if (j != i)
				{
				continue;
				}
				if (j == i)
				{
					int k = 0;
					int d = i;
					int c = 0;
					int s;
					int l;
					while (d != 0)
					{
						 a[k] = d % 10;
						 d = d / 10;
						 k++;
					}
					for (l = k - 1;l >= c;l--)
					{
						if (a[l] == a[c])
						{
						s = 1;
						}
						else
						{
						s = 0;
						break;
						}
						c++;
					}
					if (s == 1)
					{
							o++;
							if (o == 1)
							{
							System.out.printf("%d",i);
							}
							else
							{
							System.out.printf(",%d",i);
							}
					}
				}

		  }
		   if (o == 0)
		   {
				System.out.print("no");
		   }
		  System.in.read();
		  System.in.read();
	}

}

