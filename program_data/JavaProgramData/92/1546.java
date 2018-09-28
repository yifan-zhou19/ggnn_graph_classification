package <missing>;

public class GlobalMembers
{
	public static int[] tt = new int[2000];
	public static int[] qq = new int[2000];
	public static int n;
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int headt;
		int tailt;
		int headq;
		int tailq;
		int ans;
		while (scanf("%d",n) && n != 0)
		{
			ans = 0;
			headt = headq = 0;
			tailt = tailq = n;
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					tt[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qq[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(tt,tt + n);
			sort(qq,qq + n);
			while (headt != tailt)
			{
				if (tt[headt] < qq[headq])
				{
					ans--;
					headt++;
					tailq--;
					continue;
				}
				if (tt[headt] > qq[headq])
				{
					ans++;
					headt++;
					headq++;
					continue;
				}
				if (tt[tailt - 1] > qq[tailq - 1])
				{
					ans++;
					tailt--;
					tailq--;
					continue;
				}
				if (tt[tailt - 1] < qq[tailq - 1])
				{
					ans--;
					headt++;
					tailq--;
					continue;
				}
				if (tt[headt] < qq[tailq - 1])
				{
					ans--;
				}
				headt++;
				tailq--;
			}
			System.out.printf("%d\n",ans * 200);
		}
	}
}

