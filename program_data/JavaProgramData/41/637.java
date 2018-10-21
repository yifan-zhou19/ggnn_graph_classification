package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int[] word = new int[6];
	int[] x = new int[6];
	int i;
	for (a = 1;a <= 5;a++)
	{
	  for (b = 1;b <= 5;b++)
	  {
		for (c = 1;c <= 5;c++)
		{
		  for (d = 1;d <= 5;d++)
		  {
			for (e = 1;e <= 5;e++)
			{
							 if (e == 3 || e == 2 || a == b || a == c || a == d || a == e || b == c || b == d || b == e || c == d || c == e || d == e)
							 {
								 continue;
							 }
							 word[1] = (e == 1);
							 word[2] = (b == 2);
							 word[3] = (a == 5);
							 word[4] = (c != 1);
							 word[5] = (d == 1);
							 x[1] = a;
							 x[2] = b;
							 x[3] = c;
							 x[4] = d;
							 x[5] = e;

							 for (i = 1;i <= 5;i++)
							 {
								if ((x[i] <= 2 && word[i] == 1) || (x[i]>2 && word[i] == 0))
								{
									;
								}
									else
									{
									break;
									}
							 }

							 if (i == 6)
							 {
								System.out.print(a);
								System.out.print(' ');
								System.out.print(b);
								System.out.print(' ');
								System.out.print(c);
								System.out.print(' ');
								System.out.print(d);
								System.out.print(' ');
								System.out.print(e);
								System.out.print("\n");
							 }
			}
		  }
		}
	  }
	}

	//ystem("pause");
	return 0;
	}

}
