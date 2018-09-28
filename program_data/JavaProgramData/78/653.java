package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void sort(int,int,int,int);
	  int a;
	  int b;
	  int c;
	  int d;
	  for (a = 10; a <= 50; a += 10)
	  {
		for (b = 10; b <= 50; b += 10)
		{
		  for (c = 10; c <= 50; c += 10)
		  {
			for (d = 10; d <= 50; d += 10)
			{
		if (a != b && a != c && a != d && b != c && b != d && c != d && (a + b == c + d) && (a + d > b + c) && (a + c < b))
		{
			sort(a, b, c, d);
		  break;
		}
			}
		  }
		}
	  }
	  return 0;
	}

	public static void sort(int a,int b,int c,int d)
	{
		int[] weight = {a, b, c, d};
	  char[] surname = {'z', 'q', 's', 'l'};
	  int i;
	  int j;
	  int k;
	  int temp;
	  char tempname;
	  for (i = 2;i >= 0;i--)
	  {
		for (j = 0;j <= i;j++)
		{
		   if (weight[j] < weight[j + 1]) //???????????????????
		   {
			   temp = weight[j]; //weight[j]?surname[j]????????????
			 weight[j] = weight[j + 1];
			 weight[j + 1] = temp;

			 tempname = surname[j];
			 surname[j] = surname[j + 1];
			 surname[j + 1] = tempname;
		   }
		}
	  }
	  for (k = 0;k <= 3;k++)
	  {
		System.out.print(surname[k]);
		System.out.print(' ');
		System.out.print(weight[k]);
		System.out.print("\n");
	  }
	}
}
