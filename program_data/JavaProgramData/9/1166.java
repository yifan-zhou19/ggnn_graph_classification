package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] id = new char[100][10];
		char[][] old = new char[100][10];
		char[][] yog = new char[100][10];
		int n;
		int i;
		int m = 0;
		int l = 0;
		int[] age = new int[100];
		int[] oag = new int[100];
		int[] yag = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(age[i]) = Integer.parseInt(tempVar3);
			}
			if (age[i] >= 60)
			{
				 oag[m] = age[i];
				 old[m] = id[i];
				 m++;
			}
			else
			{
				yag[l] = age[i];
				yog[l] = id[i];
				l++;
			}
		}
		char[][] e_id = new char[1][10];
		int e_age;
		int k;
		for (k = 1;k <= m;k++)
		{
			for (i = 0;i < m - k;i++)
			{
				if (oag[i] < oag[i + 1])
				{
					e_id[0] = old[i];
					old[i] = old[i + 1];
					old[i + 1] = e_id[0];
					e_age = oag[i];
					oag[i] = oag[i + 1];
					oag[i + 1] = e_age;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.println(old[i]);
		}
		for (i = 0;i < l;i++)
		{
			System.out.println(yog[i]);
		}
		return 0;
	}




}

