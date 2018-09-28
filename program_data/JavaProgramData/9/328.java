package <missing>;

public class GlobalMembers
{
	public static char[][] id = new char[NUM][LEN];
	public static char[][] oldid = new char[NUM][LEN];
	public static char[][] newid = new char[NUM][LEN];
	public static int[] age = new int[NUM];
	public static int[] oldage = new int[NUM];
	public static int[] newage = new int[NUM];
		public static int Main()
		{
		int num;
		int i = 0;
		int j = 0;
		int k = 0;
		int n = 0;
		int e_oldage;
		String e_oldid = new String(new char[LEN]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0; i < num; i++)
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
		for (i = 0;i < num;i++)
		{
			if (age[i] >= 60)
			{
					oldage[j] = age[i];
					oldid[j] = id[i];
					j++;
			}
			else
			{
				newage[n] = age[i];
				newid[n] = id[i];
				n++;
			}
		}
		for (k = 1 ; k <= j; k++)
		{
			for (i = 0; i < j - k; i++)
			{
				   if (oldage[i] < oldage[i + 1])
				   {
					e_oldage = oldage[i + 1];
					e_oldid = oldid[i + 1];

					oldage[i + 1] = oldage[i];
					oldid[i + 1] = oldid[i];

					oldage[i] = e_oldage;
					oldid[i] = e_oldid;
				   }
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",oldid[i]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",newid[i]);
		}
		return 0;
		}
}

