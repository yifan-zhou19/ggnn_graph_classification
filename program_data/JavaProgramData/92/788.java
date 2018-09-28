package <missing>;

public class GlobalMembers
{
	public static int[] tian = new int[1010];
	public static int[] qi = new int[1010];
	public static int n;
	public static int Main()
	{
	//	freopen("input.txt","r",stdin);
	//	freopen("output.txt","w",stdout);
		int i;
		int j;
		int k = 0;
		int headt;
		int tailt;
		int headq;
		int tailq;
		int ans;
		while (in(n) && n != 0)
		{
			ans = 0;
			headt = headq = 0;
			tailt = tailq = n;
			for (i = 0;i < n;i++)
			{
				in(tian[i]);
			}
			for (i = 0;i < n;i++)
			{
				in(qi[i]);
			}
			sort(tian,tian + n);
			sort(qi,qi + n);
			while (headt != tailt)
			{
				if (tian[headt] < qi[headq])
				{
					ans--;
					headt++;
					tailq--;
					continue;
				}
				if (tian[headt] > qi[headq])
				{
					ans++;
					headt++;
					headq++;
					continue;
				}
				if (tian[tailt - 1] > qi[tailq - 1])
				{
					ans++;
					tailt--;
					tailq--;
					continue;
				}
				if (tian[tailt - 1] < qi[tailq - 1])
				{
					ans--;
					headt++;
					tailq--;
					continue;
				}
				if (tian[headt] < qi[tailq - 1])
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
