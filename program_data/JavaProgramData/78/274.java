public class ren
{
	   public char name;
	   public int w;
}

package <missing>;

public class GlobalMembers
{
	public static ren[] a = tangible.Arrays.initializeWithDefaultrenInstances(4);
	public static int Main()
	{
		  a[0].name = 'z';
		  a[1].name = 'q';
		  a[2].name = 's';
		  a[3].name = 'l';
		  int i;
		  int j;
		  int k;
		  int h;
		  int b = 0;
		  int t;
		  char T;
		  for (i = 5;i > 2;i--)
		  {
				for (j = 1;j < i;j++)
				{
					   for (k = 1;k < i - j;k++)
					   {
						   for (h = 1;h <= 5;h++)
						   {
								if ((i + j == k + h) && (j + h > i + k))
								{
									 b = 1;
									 break;
								}
						   }
						   if (b == 1)
						   {
							   break;
						   }
					   }
					   if (b == 1)
					   {
						   break;
					   }
				}
				if (b == 1)
				{
					break;
				}
		  }
		  a[1].w = i;
		  a[0].w = j;
		  a[2].w = k;
		  a[3].w = h;
		  for (int g = 0;g < 4;g++)
		  {
				for (int f = g + 1;f < 4;f++)
				{
						if (a[f].w > a[g].w)
						{
						   t = a[f].w;
						   a[f].w = a[g].w;
						   a[g].w = t;
						   T = a[f].name;
						   a[f].name = a[g].name;
						   a[g].name = T;
						}
				}
				System.out.printf("%c %d\n",a[g].name,a[g].w * 10);
		  }
		  System.in.read();
		  System.in.read();

	}

}

