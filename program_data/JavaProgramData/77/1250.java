package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int k = 1;
	   int[] a = new int[110];
	   int p = 1;
	   int x = 0;
	   char c;
	   char h;
	   h = System.in.read();
	   a[0] = a[0] + 2;
	   while (c = System.in.read())
	   {
		  if (c == h)
		  {
			a[p] = a[p] + 2;
			p = p + 1;
		  }
		  if (c != h && c != '\n')
		  {
			 a[p] = a[p] + 1;
			 p = p + 1;
		  }
		  if (c == '\n')
		  {
		  break;
		  }
	   }
	   for (j = 0;j < p;j++)
	   {
	   for (i = 0;i < p - 1;i++)
	   {
		  if (a[i] == 2)
		  {
		   for (k = 1;k < p - i;k++)
		   {
			  if (a[i + k] == 1)
			  {
				 System.out.print(i);
				 System.out.print(" ");
				 System.out.print(i + k);
				 System.out.print("\n");
				 a[i] = 0;
				 a[i + k] = 0;
				 i = 0;
				 break;
			  }
			  if (a[i + k] == 2)
			  {
			  break;
			  }
		   }
		  }
	   }
		   x = 0;
		  for (i = 0;i < p;i++)
		  {
			 if (a[i] == 0)
			 {
			 x = x + 1;
			 }
		  }
		  if (x == p)
		  {
		  break;
		  }
	   }
		  return 0;
	}
}
