package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int sum = 0;
		int a;
		int[][] num = new int[10006][2];
		char[][] room = new char[106][106];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(room,'\0',(Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (int i = 0;i < n;i++)
		{
			 for (int j = 0;j < n;j++)
			 {
			 String tempVar2 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar2 != null)
			 {
				 room[i][j] = tempVar2.charAt(0);
			 }
			 }
			 System.in.read();
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (int d = 2;d <= m;d++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			 memset(num,0, (Integer.SIZE / Byte.SIZE));
			 a = 0;
			 for (int x = 0;x < n;x++)
			 {
					  for (int y = 0;y < n;y++)
					  {
					  if (room[x][y] == '@')
					  {
								 if ((x - 1) >= 0)
								 {
								 if (room[x - 1][y] == '.')
								 {
								 num[a][0] = x - 1;
								 num[a][1] = y;
								 a++;
								 }
								 }
								 if ((x + 1) <= n - 1)
								 {
								 if (room[x + 1][y] == '.')
								 {
								 num[a][0] = x + 1;
								 num[a][1] = y;
								 a++;
								 }
								 }
								 if ((y - 1) >= 0)
								 {
								 if (room[x][y - 1] == '.')
								 {
								 num[a][0] = x;
								 num[a][1] = y - 1;
								 a++;
								 }
								 }
								 if ((y + 1) <= n - 1)
								 {
								 if (room[x][y + 1] == '.')
								 {
								 num[a][0] = x;
								 num[a][1] = y + 1;
								 a++;
								 }
								 }
					  }
					  }
			 }
			 for (int h = 0;h < a;h++)
			 {
			 room[num[h][0]][num[h][1]] = '@';
			 }
		}
		for (int k = 0;k < n;k++)
		{
			 for (int t = 0;t < n;t++)
			 {
			 if (room[k][t] == '@')
			 {
			 sum++;
			 }
			 }
		}
		System.out.printf("%d",sum);
	return 0;
	}
}

