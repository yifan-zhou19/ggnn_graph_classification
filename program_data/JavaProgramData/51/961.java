package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		String s = new String(new char[MAX]); //temp?????????zichuan???????????
		char[][] zichuan = new char[MAX][MAX];
		String temp = new String(new char[MAX]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		int k = 0; //k+1?????????
		int[] count = new int[500]; //?zichuan??????????????
		for (j = 0;j < n;j++)
		{
			zichuan[0][j] = s.charAt(j);
		}
		zichuan[0][n] = 0;
		int flag;
		for (i = 1;i <= len - n;i++)
		{
			flag = 0;
			for (j = 0;j < n;j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, s.charAt(j + i));
			}
			temp = temp.substring(0, n);
			for (l = 0;l <= k;l++)
			{
				if (strcmp(zichuan[l],temp) == 0)
				{
					count[l]++; //?????\0???
					flag = 1; //???????????????
					break;
				}
			}
			if (flag != 1) //flag?????????????
			{
				k++;
				zichuan[k] = temp;
			}
		}
		int maxcount = 0;
		for (i = 0;i <= k;i++)
		{
			if (count[i] > maxcount)
			{
				maxcount = count[i];
			}
		}
		maxcount++;
		if (maxcount == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",maxcount);
			for (i = 0;i <= k;i++)
			{
				if (count[i] == maxcount - 1)
				{
					System.out.printf("%s\n",zichuan[i]);
				}
			}
		}
		return 0;
	}
}

