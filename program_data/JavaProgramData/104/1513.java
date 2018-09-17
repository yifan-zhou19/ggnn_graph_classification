package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int[] a = new int[13];
	  int[] b = new int[13];
	  int i1;
	  int i2;
	  int e;
	  int f;
	  int i3;
	  int[] c = new int[13];
	  int[] d = new int[13];
	  int i4 = 0;
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
	  a[0] = m;
	  b[0] = n;
	  for (i1 = 1;m > 0;i1++)
	  {
	   a[i1] = m / 2;
	   m = m / 2;
	  }
	  for (i2 = 1;n > 0;i2++)
	  {
	   b[i2] = n / 2;
	   n = n / 2;
	  }
	  for (i3 = 12;i3 >= 0;i3--)
	  {
	   if (a[i3] != 0)
	   {
		   c[i4] = a[i3];
		   i4++;
	   }
	  }
	  i4 = 0;
	  for (i3 = 12;i3 >= 0;i3--)
	  {
	   if (b[i3] != 0)
	   {
		   d[i4] = b[i3];
		   i4++;
	   }
	  }
	  for (i3 = 0;i3 < 13;i3++)
	  {
		if (c[i3] != d[i3] || (c[i3] == 0 && d[i3] == 0))
		{
		System.out.printf("%d",c[i3 - 1]);
		break;
		}
	  }
	 return 0;
	}
}

