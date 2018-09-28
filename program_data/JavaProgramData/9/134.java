package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] age = new int[N];
		int n;
		int i;
		int k;
		char[][] id = new char[N][LEN];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(age[i]) = Integer.parseInt(tempVar3);
			}
		}
			 int e;
			 String e_id = new String(new char[LEN]);
			 for (k = 1 ; k <= n; k++)
			 {
		for (i = 0; i < n - k; i++)
		{
			if ((age[i] < age[i + 1] && age[i] >= 60) || (age[i] < 60 && age[i + 1] >= 60))
			{
				e = age[i + 1];
				e_id = id[i + 1];
				age[i + 1] = age[i];
				id[i + 1] = id[i];
				age[i] = e;
				id[i] = e_id;
			}
		}
			 }



		for (i = 0; i < n; i++)
		{
			System.out.printf("%s\n", id[i]);
		}
		return 0;
	}
}

