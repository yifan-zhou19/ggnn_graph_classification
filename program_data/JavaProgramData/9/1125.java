package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		char[][] id = new char[100][100];
		int[] age = new int[100];
		int n;
		int i;
		int k;
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
				age[i] = Integer.parseInt(tempVar3);
			}
		}


		int e;
		String t = new String(new char[13]);


		 char[][] id1 = new char[100][13];
		 int[] age1 = new int[100];
		 char[][] id2 = new char[100][13];
		 int[] age2 = new int[100];
		 int x = 0;
		 int y = 0;

			for (i = 0;i < n;i++)
			{
			if (age[i] >= 60)
			{
				age1[x] = age[i];
				id1[x] = id[i];
				x++;
			}

			if (age[i] < 60)
			{
				age2[y] = age[i];
				id2[y] = id[i];
				y++;
			}
			}

		 for (k = 1;k < x;k++)
		 {
		  for (i = 0;i < x - k;i++)
		  {
			if (age1[i] < age1[i + 1])
			{
				e = age1[i + 1];
				age1[i + 1] = age1[i];
				age1[i] = e;

				t = id1[i + 1];
				id1[i + 1] = id1[i];
				id1[i] = t;

			}
		  }
		 }

	   for (i = 0;i < x;i++)
	   {
			System.out.printf("%s\n",id1[i]);

	   }



	 for (i = 0;i < y;i++)
	 {
			System.out.printf("%s\n",id2[i]);

	 }


	}




}

