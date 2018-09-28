package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int side_sum = int * p; //????
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p; //????*p???k??????
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = k;
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		side_sum(tempRef_p); //????
		p = tempRef_p.argValue;
		return 0;
	}
	public static int side_sum(tangible.RefObject<Integer> p) //??????????
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int l;
		int sum = 0;
		int[][] a = new int[100][100];
		k = p.argValue;
		for (i = 0; i < k; i++)
		{
			sum = 0; //?sum???0
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < m; j++)
			{
				for (l = 0; l < n; l++)
				{
					a[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (j == 0 || j == m - 1)
					{
						sum += a[j][l];
					}
					else
					{
						if (l == 0 || l == n - 1)
						{
							sum += a[j][l];
						}
					}
				}
			}
				System.out.print(sum);
				System.out.print("\n");
		}
		return 0;
	}






}

