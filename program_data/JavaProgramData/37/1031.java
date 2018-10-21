package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[100000]);
		int total;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			total = Integer.parseInt(tempVar);
		}

		int i;
		int j;
		int k;
		int[] alphabet = new int[26];
		for (i = 1;i <= total;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			for (j = 0;j < 26;j++)
			{
				alphabet[j] = 0;
			}
			for (j = 0; * (zfc.Substring(j)) != '\0';j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (*(zfc.Substring(j)) == 97 + k)
					{
						alphabet[k] = 1 + alphabet[k];
						break;
					}
				}
			}
			int time = 0;
			for (j = 0; * (zfc.Substring(j)) != '\0';j++)
			{
				if (alphabet[(*(zfc.Substring(j)) - 97)] == 1)
				{
					System.out.printf("%c\n",*(zfc.Substring(j)));
					time++;
					break;
				}
			}
			if (time == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

