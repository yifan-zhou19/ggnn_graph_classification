package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[100];
		int[] n = new int[100];
		int s = 0;
		int index = 0; //????
		int loc; //????
		int t = 0;
		int p; //?????
		for (s = 0;s <= 1000;s++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m[s] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[s] = Integer.parseInt(tempVar2);
			}
			if ((m[s] == 0) && (n[s] == 0))
			{
				break;
			}
			int[][] a = new int[100][1000];
			for (int i = 0;i < m[s];i++)
			{
				a[s][i] = 1;
			}
			t = 0;
			index = 0;
			p = m[s];
			while (p > 0)
			{
				if (a[s][index] == 1)
				{
					 ++t;
					 if (t % n[s] == 0)
					 {
						   a[s][index] = 0;
						   loc = index;
						   p--;
					 }
				}
				if (index < m[s] - 1)
				{
				   index++;
				}
				else
				{
				   index = 0;
				}
			}
			System.out.printf("%d\n",loc + 1);
		}
		return 0;
	}


}

