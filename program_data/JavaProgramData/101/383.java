package <missing>;

public class GlobalMembers
{
	/*A??B??????C??????? 
	  B??A??????A??C??? 
	  C????B????B?A????*/
	public static void Main()
	{
		int[] a = new int[3];
		int[] b = new int[3];
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		int t;
		char[] c = {'A', 'B', 'C'};
		char d;
		for (a[0] = 0;a[0] < 3;a[0]++)
		{
		  for (a[1] = 0;a[1] < 3;a[1]++)
		  {
			for (a[2] = 0;a[2] < 3;a[2]++)
			{
				for (i = 0;i < 3;i++)
				{
					b[i] = 0;
				}
				if (a[1] > a[0])
				{
					b[0]++;
				}
				if (a[2] == a[0])
				{
					b[0]++;
				}
				if (a[0] > a[1])
				{
					b[1]++;
				}
				if (a[0] > a[2])
				{
					b[1]++;
				}
				if (a[2] > a[1])
				{
					b[2]++;
				}
				if (a[1] > a[0])
				{
					b[2]++;
				}
				if (a[0] + b[0] == 2 && a[1] + b[1] == 2 && a[2] + b[2] == 2)
				{
					for (i = 0;i < 3;i++)
					{
					for (j = 0;j < 2 - i;j++)
					{
						if (a[j] > a[j + 1])
						{
							t = a[j];
							a[j] = a[j + 1];
							a[j + 1] = t;
							d = c[j];
							c[j] = c[j + 1];
							c[j + 1] = d;
						}
					}
					}
					for (i = 0;i < 3;i++)
					{
						System.out.printf("%c",c[i]);
					}
					System.exit(1);
				}
			}
		  }
		}
	}
}
