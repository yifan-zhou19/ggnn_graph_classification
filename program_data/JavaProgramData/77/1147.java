package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] d = new int[1000];
		int count = 0;
		int i;
		int j;
		int zongshu;
		char c;
		char nanhai;
		c = System.in.read();
		nanhai = c;
		while (c != '\n')
		{
			  if (c == nanhai)
			  {
				  a[n] = 1; //???
			  }
			  else
			  {
				  a[n] = 2; //???
				  d[count] = n; //???????
				  count++; //?????
			  }
			  n++;
			  c = System.in.read();
		}
		zongshu = n; //???
		while (n != 0)
		{
			  for (i = 0;i < zongshu - 1;i++)
			  {
				  if (a[i] == 1) //??
				  {
							  j = i + 1;
							  while (a[j] == 0)
							  {
								  j++; //????????????
							  }
							  if (a[j] == 2) //??????
							  {
										  a[i] = 0;
										  a[j] = 0; //????
										  b[j] = i; //???????????
										  n = n - 2; //?????2
							  }
				  }
			  }
		}
		for (i = 0;i < count;i++)
		{
			System.out.print(b[d[i]]);
			System.out.print(' ');
			System.out.print(d[i]);
			if (i != count - 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}



}
