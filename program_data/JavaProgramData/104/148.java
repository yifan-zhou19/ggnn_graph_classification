package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int j;
		int[] a = new int[10];
		int[] b = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x,b[0] = y;
		if (x == 1 || y == 1)
		{
			System.out.print("1");
		}
		else
		{
		  for (i = 1;x != 1;i++)
		  {
			  a[i] = x / 2;
			   x = x / 2;
		  }
		  for (j = 1;y != 1;j++)
		  {
			  b[j] = y / 2;
			   y = y / 2;
		  }
		  for (;i >= 1,j >= 1;i--,j--)
		  {
			  if (a[i - 1] != b[j - 1])
			  {
			  System.out.printf("%d",a[i]);
								  break;
			  }
		  }
		  if (i == 0 && j >= 0)
		  {
			  System.out.printf("%d",a[0]);
		  }
		  if (j == 0 && i > 0)
		  {
			  System.out.printf("%d",b[0]);
		  }
		}
	}
}

