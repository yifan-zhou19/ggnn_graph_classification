package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{ // n:???  f: ????????
		int n; // NUM????? t????? num:??????????
		int i;
		int j;
		int f;
		int NUM;
		int t;
		int[] num = new int[10];
		int[] A = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			NUM = 60;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				f = Integer.parseInt(tempVar2);
			}
			for (j = 0; j < f; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0; j < f; j++)
			{
				t = 60 - num[j] - 3 * j;

				if (t <= 3 && t > 0)
				{
					 NUM = num[j];
					break;
				}
				else if (t <= 0)
				{
					break;
				}
				else if (t > 3)
				{
					NUM -= 3;
				}

			}
			A[i] = NUM;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",A[i]);
		}
	}



}

