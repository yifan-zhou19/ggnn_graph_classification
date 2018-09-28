package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int a = (-1);
		int x;
		int s;
		int t;
		int e;
		int w;
		int[] y = new int[100];
		char[][] v = new char[100][20];
		String A = new String(new char[20]);
		String z = new String(new char[2000]);
		z = new Scanner(System.in).nextLine();
		x = z.length();
		for (i = 0;i < x;i++)
		{
					  if ((z.charAt(i) == ' ' && z.charAt(i + 1) != ' ') || (i == 0 && z.charAt(i) != ' '))
					  {
								 a++;

					  }
					 if (z.charAt(i) == ' ')
					 {
								j = 0;
					 }
					 else
					 {
						 j++;
						 v[a][j - 1] = z.charAt(i);
						 v[a][j] = '\0';
					 }
					 if ((z.charAt(i) != ' ' && z.charAt(i + 1) == ' ') || z.charAt(i + 1) == '\0')
					 {
								  y[a] = j;
					 }
		}

		 w = a + 1;
		 for (s = 1;s <= w;s++)
		 {
		for (t = 0;t < w - s;t++)
		{
				if (y[t] < y[t + 1])
				{
						e = y[t + 1];
						y[t + 1] = y[t];
						y[t] = e;
						A = v[t + 1];
						v[t + 1] = v[t];
						v[t] = A;
				}
		}
		 }
		System.out.printf("%s\n",v[0]);
	   for (s = 1;s <= w;s++)
	   {
		for (t = 0;t < w - s;t++)
		{
				if (y[t] > y[t + 1])
				{
						e = y[t + 1];
						y[t + 1] = y[t];
						y[t] = e;
						A = v[t + 1];
						v[t + 1] = v[t];
						v[t] = A;
				}
		}
	   }

		System.out.printf("%s",v[0]);
			return 0;
	}

}
