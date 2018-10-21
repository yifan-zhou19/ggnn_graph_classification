package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int sr = 0;
		int jr = 0;
		int age;
		int[] srage = new int[100];
		int[] jrage = new int[100];
		String num = new String(new char[10]);
		char[][] srnum = new char[100][10];
		char[][] jrnum = new char[100][10];
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
				num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age = Integer.parseInt(tempVar3);
			}
			if (age < 60)
			{
				jrnum[jr] = num;
				jrage[jr] = age;
				jr++;
			}
			else
			{
				srnum[sr] = num;
				srage[sr] = age;
				sr++;
			}
		}
		for (i = sr - 1; i >= 0; i--)
		{
			for (j = 0; j < i; j++)
			{
				if (srage[j] < srage[j + 1])
				{
					age = srage[j];
					srage[j] = srage[j + 1];
					srage[j + 1] = age;
					num = srnum[j];
					srnum[j] = srnum[j + 1];
					srnum[j + 1] = num;
				}
			}
		}
		for (i = 0; i < sr; i++)
		{
			System.out.printf("%s\n", srnum[i]);
		}
		for (i = 0; i < jr; i++)
		{
			System.out.printf("%s\n", jrnum[i]);
		}
		return 0;
	}
}

