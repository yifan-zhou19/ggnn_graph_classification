package <missing>;

public class GlobalMembers
{
	//??????????
	//?????????????????????????????

	//????????????????????????????

	//?????????????????????????????????



	public static int mycompare(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int t;
		int m;
		int k;
		int[] tian = new int[1001];
		int[] qi = new int[1001];
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				qi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tian,n,(Integer.SIZE / Byte.SIZE),mycompare);
			qsort(qi,n,(Integer.SIZE / Byte.SIZE),mycompare);
			s = 0;
			for (i = 0,m = 0,j = n - 1,k = n - 1;i <= k;)
			{
				if (tian[m] > qi[i])
				{
					s++;
					m++;
					i++;
				}
				else if (tian[j] > qi[k])
				{
					s++;
					j--;
					k--;
				}
				else
				{
					if (tian[j] < qi[i])
					{
						s--;
					}
					j--;
					i++;

				}
			}
			System.out.print(s * 200);
			System.out.print("\n");
		}
		return 0;

	}
}

