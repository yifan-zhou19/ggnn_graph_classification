package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String danchi = new String(new char[1000]);
		char[][] e = new char[50][1000];
		int[] k = new int[50];
		int i;
		int j;
		int g = 0;
		int l = 0;
		int a;
		int v = 0;
		int m = 0;
		int max = 0;
		int min = 100;
		int max1;
		int min1;
		danchi = new Scanner(System.in).nextLine();
			 int c = danchi.length();
		for (j = 0;j < 50;j++)
		{
					  l = 0;
			for (i = g;i < 100;i++)
			{
					 if (danchi.charAt(i) == ' ')
					 {
						 m++;
						 break;
					 }
					e[j][l] = danchi.charAt(i);
					g++;
					l++;
					v++;

			}
				g++;
				l++;
				v++;
			k[j] = String.valueOf(e[j]).length();
					if (v > c)
					{
						break;
					}

		}
		for (a = 0;a < j + 1;a++)
		{
			if (k[a] == 0)
			{
				break;
			}
			if (max < k[a])
			{
					max = k[a];
					max1 = a;
			}
			if (min > k[a])
			{
					min = k[a];
					min1 = a;
			}
			 if (a > m)
			 {
				 break;
			 }
		}
		System.out.printf("%s\n",e[max1]);
		System.out.printf("%s\n",e[min1]);
		return 0;
	}

}
