package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;

		int[] sz = new int[10];
		int[] a = new int[10];
		float x = 0F;
		float y = 0F;
		float GPA;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (int i = 0;i <= n - 1;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}

			y += a[i];
		}
		for (int p = 0;p <= n - 1;p++)
		{

			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[p]) = Integer.parseInt(tempVar3);
			}
		}
		for (int j = 0;j <= n - 1;j++)
		{


			if ((sz[j]) >= 90)
			{

				x += 4.0 * a[j];

			}
			else if ((sz[j]) >= 85 && (sz[j]) < 90)
			{

				x += 3.7 * a[j];

			}
			else if ((sz[j]) >= 82 && (sz[j]) < 85)
			{

				x += 3.3 * a[j];

			}
			else if ((sz[j]) >= 78 && (sz[j]) < 82)
			{

				x += 3.0 * a[j];

			}
			else if ((sz[j]) >= 75 && (sz[j]) < 78)
			{

				x += 2.7 * a[j];

			}
			else if ((sz[j]) >= 72 && (sz[j]) < 75)
			{

				x += 2.3 * a[j];

			}
			else if ((sz[j]) >= 68 && (sz[j]) < 72)
			{

				x += 2.0 * a[j];

			}
			   else if ((sz[j]) >= 64 && (sz[j]) < 68)
			   {

				x += 1.5 * a[j];

			   }
			else if ((sz[j]) >= 60 && (sz[j]) < 64)
			{

				x += 1.0 * a[j];

			}
			else if ((sz[j]) < 60)
			{

				x += 0;

			}

		}
		GPA = x / y;

		System.out.printf("%.2f",GPA);

















		return 0;

	}
}

