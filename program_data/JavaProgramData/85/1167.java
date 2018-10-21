package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k;
		char[][] suoyou = new char[1000][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		int[] jieguo = new int[1000];
		for (i = 0;i < n;i++)
		{
			suoyou[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			jieguo[i] = 0;
		}


		for (i = 0;i < n;i++)
		{
			if ((suoyou[i][0] < 65) || ((suoyou[i][0]>90) && (suoyou[i][0] < 97) && (suoyou[i][0] != 95)) || (suoyou[i][0]>122))
			{
				jieguo[i] = 1;
			}
			else
			{
				for (k = 0;k < String.valueOf(suoyou[i]).length();k++)
				{
					if ((suoyou[i][k] < 48) || ((suoyou[i][k]>57) && (suoyou[i][k] < 65)) || ((suoyou[i][k]>90) && (suoyou[i][k] < 95)) || ((suoyou[i][k]>95) && (suoyou[i][k] < 97)) || (suoyou[i][k]>122))
					{
						jieguo[i] = 1;
					}
				}
			}
		}
			for (i = 0;i < n;i++)
			{
				if (jieguo[i] != 0)
				{
					System.out.print("no\n");
				}
				else
				{
					System.out.print("yes\n");
				}
			}
			return 0;
	}

}

