package <missing>;

public class GlobalMembers
{
	public static int MyCompare(Object a, Object b)
	{
		return ((int)b - (int)a);
	}
	public static int Main()
	{
		int i;
		int j;
		int p;
		int q;
		int n;
		int result;
		int[] speed1 = new int[1000];
		int[] speed2 = new int[1000];

		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			result = 0;
			for (i = 0;i < n;i++)
			{
				speed1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				speed2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(speed1,n,(Integer.SIZE / Byte.SIZE),MyCompare);
			qsort(speed2,n,(Integer.SIZE / Byte.SIZE),MyCompare);
			/*for(i=0;i<n;i++)
				cout<<speed1[i];
			for(i=0;i<n;i++)
				cout<<speed2[i];*/
			i = p = 0;
			j = q = n - 1;
			while (i <= j)
			{
				if (speed1[i] > speed2[p])
				{
					result += 200;
					i++;
					p++;
				}
				else if (speed1[j] > speed2[q])
				{
					result += 200;
					j--;
					q--;
				}
				else if (speed1[j] == speed2[p])
				{
					j--;
					p++;
				}
				else
				{
					result -= 200;
					j--;
					p++;
				}
			}
			System.out.print(result);
			System.out.print("\n");
		}
		return 0;
	}
}

