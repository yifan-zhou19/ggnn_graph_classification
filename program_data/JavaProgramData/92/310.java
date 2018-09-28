package <missing>;

public class GlobalMembers
{
	public static int[] T = new int[1000];
	public static int[] Q = new int[1000];
	public static int[] TT = new int[1000];
	public static int Cmp(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p1 = (int *)e1, * p2 = (int *) e2;
		int p1 = (int)e1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p2 = (int *) e2;
		int p2 = (int) e2;
		return p1 - p2;
	}

	public static int Main()
	{
		int n;
		while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (int i = 0;i < n;i++)
			{
				T[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;i++)
			{
				Q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(T,n,(Integer.SIZE / Byte.SIZE),Cmp);
			qsort(Q,n,(Integer.SIZE / Byte.SIZE),Cmp);
		int pT;
		int qT;
		int pQ;
		int qQ;
		pT = 0,qT = n - 1,pQ = 0,qQ = n - 1;
		int ans = 0;
		for (int i = 0;i < n;i++)
		{
			if (T[pT] > Q[pQ])
			{
				ans += 200;
				pT++;
				pQ++;
				continue;
			}
			if (T[pT] < Q[pQ])
			{
				ans -= 200;
				pT++;
				qQ--;
				continue;
			}
			if (T[qT] > Q[qQ])
			{
				ans += 200;
				qT--;
				qQ--;
				continue;
			}
			if (T[qT] < Q[qQ])
			{
				ans -= 200;
				pT++;
				qQ--;
				continue;
			}
			if (T[pT] > Q[qQ])
			{
				ans += 200;
			}
			else if (T[pT] < Q[qQ])
			{
				ans -= 200;
			}
			pT++;
			qQ--;
		}



			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

