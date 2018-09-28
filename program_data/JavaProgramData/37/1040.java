package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int j;
		int k;
		int judge;
		String zfc = new String(new char[100000]);
		String pzfc;
		int[] num = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pnum;
		int pnum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < 26;j++)
			{
				num[j] = 0;
			}
			j = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			while (*(zfc.Substring(j)) != '\0')
			{
				for (k = 0;k < 26;k++)
				{
					if (*(zfc.Substring(j)) == 'a' + k)
					{
						(num[k])++;
						break;
					}
				}
				j++;
			}
			judge = 0;
			for (j = 0; * (zfc.Substring(j)) != '\0';j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (*(zfc.Substring(j)) == 'a' + k)
					{
						if (num[k] == 1)
						{
							System.out.printf("%c\n",*(zfc.Substring(j)));
							judge = 1;
						}
						break;
					}
				}
				if (judge == 1)
				{
					break;
				}
			}
			if (judge == 0)
			{
				System.out.print("no\n");
			}
		}
	}
}

