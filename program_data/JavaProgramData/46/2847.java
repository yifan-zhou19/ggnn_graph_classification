package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[100][100]; //h�&#199;DD�y l�&#199;�D�y ij&#182;&#188;�&#199;&#209;-&#187;�&#191;&#216;&#214;&#198;�&#228;�&#191;   s�&#199;?&#230;�&#197;&#213;aD&#169;�y�&#214;?&#196;�y��  re�&#199;&#188;&#199;&#194;&#188;&#213;aD&#169;�y�&#214;�D&#195;&#187;�D�&#187;�&#223;?&#189;?&#196;�y�� x[4]�&#199;?&#227;�&#198;&#182;??&#196;�o�DD�y?&#196;�&#228;&#187;??&#196;&#207;��&#191;y[4]�&#199;?&#227;�&#198;&#182;??&#196;�o��D�y�&#228;&#187;??&#196;&#207;��&#191;
		int[][] re = new int[100][100];
		int h = 0;
		int l = 0;
		int dh = 0;
		int dl = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] x = {0, 1, 0, -1};
		int[] y = {1, 0, -1, 0};
		  h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (i = 1;i <= h;i++)
		  {
			 for (j = 1;j <= l;j++)
			 {
					 s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					 re[i][j] = 1;
			 }
		  }
		  dh = 1;
		  dl = 1;
		  k = 0;
		  System.out.print(s[1][1]);
		  System.out.print("\n");
		  re[1][1] = 0;
		  for (i = 1;i <= h * l - 1;i++) //&#191;a�&#188;����
		  {
				if (re[dh + x[k]][dl + y[k]] == 1)
				{
					re[dh + x[k]][dl + y[k]] = 0;
					dh += x[k];
					dl += y[k];
					System.out.print(s[dh][dl]);
					System.out.print("\n");
					continue;
				}
				if (re[dh + x[k]][dl + y[k]] == 0)
				{
				   k = (k + 1) % 4; //&#187;&#187;�&#189;&#207;�
					re[dh + x[k]][dl + y[k]] = 0;
					dh += x[k];
					dl += y[k];
					System.out.print(s[dh][dl]);
					System.out.print("\n");
					continue;
				}
		  }
		  return 0;
	}
}

