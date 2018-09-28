package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] n = new int[1000][2];
		int i = 0;
		int j = 0;
		int count = 0;
		int[] m = new int[1000];
		int max = 0;
		int flag = 0;
		int t = 0;
		do
		{
			n[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m[n[i][0]]++;
			i++;
			count++;
		} while (System.in.read() == ',');
		i = 0;
		do
		{
			n[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m[n[i][1]] = m[n[i][1]] - 1;
			i++;
		} while (System.in.read() == ',');
		for (i = 0;i < 1000;i++)
		{
			if (m[i] != 0)
			{
				if (flag == 0)
				{
					t = m[i];
					flag = 1;
				}
				else
				{
					m[i] += t;
					t = m[i];
				}
			}
			else
			{
				continue;
			}
			if (max < m[i])
			{
				max = m[i];
			}
		}
		System.out.print(count);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}








}

