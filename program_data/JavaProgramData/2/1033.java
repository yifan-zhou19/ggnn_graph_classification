package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int i;
		int j;
		int len;
		int max;
		int[] id = new int[1000];
		int[] b = new int[26];
		char[][] a = new char[100][27];
		char name;
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
				id[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = tempVar3.charAt(0);
			}
			len = String.valueOf(a[i]).length();
			for (j = 0;j < len;j++)
			{
				b[a[i][j] - 'A']++;
			}
		} //??????????????????????????
		max = b[0];
		name = 'A';
		for (j = 1;j < 26;j++)
		{
			if (b[j] > max)
			{
			max = b[j];
			name = j + 'A';
			}
		}
		System.out.printf("%c\n%d\n",name,max); //????????????????
		for (i = 0;i < m;i++)
		{
			len = String.valueOf(a[i]).length();
			for (j = 0;j < len;j++)
			{
			if (a[i][j] == name)
			{
				a[i] = "shuchu";
			break;
			} //????????????
			}
		}
		for (i = 0;i < m;i++)
		{
		if (strcmp(a[i],"shuchu") == 0)
		{
			System.out.printf("%d\n",id[i]); //???????????
		}
		}


	}


}

