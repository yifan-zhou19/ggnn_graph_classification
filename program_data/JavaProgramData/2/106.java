package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] writer = new char[1000][30];
		char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int m;
		int n;
		int[] mark = new int[1000];
		int[] num = new int[26];
		int sum = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							mark[i] = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							writer[i] = tempVar3.charAt(0);
						}
		}
		for (i = 0;i < m;i++)
		{
						for (j = 0;j < String.valueOf(writer[i]).length();j++)
						{
										 if (writer[i][j] == 'A')
										 {
										 num[0]++;
										 }
										 else if (writer[i][j] == 'B')
										 {
										 num[1]++;
										 }
										 else if (writer[i][j] == 'C')
										 {
										 num[2]++;
										 }
										 else if (writer[i][j] == 'D')
										 {
										 num[3]++;
										 }
										 else if (writer[i][j] == 'E')
										 {
										 num[4]++;
										 }
										 else if (writer[i][j] == 'F')
										 {
										 num[5]++;
										 }
										 else if (writer[i][j] == 'G')
										 {
										 num[6]++;
										 }
										 else if (writer[i][j] == 'H')
										 {
										 num[7]++;
										 }
										 else if (writer[i][j] == 'I')
										 {
										 num[8]++;
										 }
										 else if (writer[i][j] == 'J')
										 {
										 num[9]++;
										 }
										 else if (writer[i][j] == 'K')
										 {
										 num[10]++;
										 }
										 else if (writer[i][j] == 'L')
										 {
										 num[11]++;
										 }
										 else if (writer[i][j] == 'M')
										 {
										 num[12]++;
										 }
										 else if (writer[i][j] == 'N')
										 {
										 num[13]++;
										 }
										 else if (writer[i][j] == 'O')
										 {
										 num[14]++;
										 }
										 else if (writer[i][j] == 'P')
										 {
										 num[15]++;
										 }
										 else if (writer[i][j] == 'Q')
										 {
										 num[16]++;
										 }
										 else if (writer[i][j] == 'R')
										 {
										 num[17]++;
										 }
										 else if (writer[i][j] == 'S')
										 {
										 num[18]++;
										 }
										 else if (writer[i][j] == 'T')
										 {
										 num[19]++;
										 }
										 else if (writer[i][j] == 'U')
										 {
										 num[20]++;
										 }
										 else if (writer[i][j] == 'V')
										 {
										 num[21]++;
										 }
										 else if (writer[i][j] == 'W')
										 {
										 num[22]++;
										 }
										 else if (writer[i][j] == 'X')
										 {
										 num[23]++;
										 }
										 else if (writer[i][j] == 'Y')
										 {
										 num[24]++;
										 }
										 else if (writer[i][j] == 'Z')
										 {
										 num[25]++;
										 }
						}
		}
		for (i = 0;i < 26;i++)
		{
						 if (num[i] >= sum)
						 {
										sum = num[i];
										n = i;
						 }

		}
		System.out.printf("%c\n",abc[n]);
		System.out.printf("%d\n", num[n]);
		for (i = 0;i < m;i++)
		{
						for (j = 0;j < String.valueOf(writer[i]).length();j++)
						{
														if (writer[i][j] == abc[n])
														{
																				System.out.printf("%d\n",mark[i]);
																				break;
														}
						}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

