package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int[] zm = new int[100];
		int[] zmnum = new int[100];
		a = new Scanner(System.in).nextLine();
		int i;
		int k;
		int j;
		int t = 0;
		int ch;
		for (i = 0;(k = a.charAt(i)) != '\0';i++)
		{
			if (((int)a.charAt(i) >= 65 && (int)a.charAt(i) <= 90) || ((int)a.charAt(i) >= 97 && (int)a.charAt(i) <= 122))
			{
				zm[t] = (int)a.charAt(i);
				zmnum[t]++;
				for (j = 0;(k = a.charAt(j)) != '\0';j++)
				{
					if ((int)a.charAt(j) == (int)a.charAt(i) && j != i)
					{
						a = tangible.StringFunctions.changeCharacter(a, j, '0');
						zmnum[t]++;
					}
				}
				t++;
			}

		}

		for (i = 0;i < t - 1;i++)
		{
			for (j = 0;j < t - i - 1;j++)
			{
				if (zm[j] > zm[j + 1])
				{
					ch = zm[j];
					zm[j] = zm[j + 1];
					zm[j + 1] = ch;
					ch = zmnum[j];
					zmnum[j] = zmnum[j + 1];
					zmnum[j + 1] = ch;
				}
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		else
		{
			 for (i = 0;i < t;i++)
			 {

			System.out.printf("%c=%d\n",zm[i],zmnum[i]);
			 }
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		return 0;
	}
}

