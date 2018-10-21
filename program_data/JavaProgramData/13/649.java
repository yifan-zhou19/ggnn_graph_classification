package <missing>;

public class GlobalMembers
{
	public static int BT(int x, int[] a)
	{
		int b = 0;
		int c = 0;
		while (b < 40000)
		{
					 if (a[b] == x)
					 {
								c = 1;
								break;
					 }
					 else
					 {
					 b++;
					 }
		}
		return c;
	}
	public static int Main()
	{
		  int n;
		  int[] a = new int[40000];
		  int i;
		  int[] b = new int[40000];
		  int c;
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
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (i = 0;i < 10001;i++)
		  {
		  b[i] = -1;
		  }
		  for (i = 0,c = 0;i < n;i++)
		  {
		  if (BT(a[i], b) == 0)
		  {
						   if (c == 0)
						   {
						   System.out.printf("%d",a[i]);
						   }
						   else
						   {
						   System.out.printf(" %d",a[i]);
						   }
						   b[c] = a[i];
						   c++;
		  }
		  }
		  System.in.read();
		  System.in.read();
	}
}

