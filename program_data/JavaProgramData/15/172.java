package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] num = new int[101][100];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = j = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[i][j] = Integer.parseInt(tempVar2);
		}
			}
		}
		int a;
		int b;
		int c;
		int d;
		a = b = c = d = 0;
		i = j = 0;
		do
		{
			do
			{
				if (num[i][j] == 0 && a == 0 && b == 0)
				{
					a = i,b = j + 1;
				}
				j++;
			}while (j < n);
			j = 0;
			i++;
		}while (i < n);
		i = j = 0;
	   do
	   {
			do
			{
				if (num[i][j] == 0 && c <= i != 0 && d <= j)
				{
					c = i,d = j;
				}
				j++;
			}while (j < n);
			j = 0;
			i++;
	   }while (i < n);
		int s;
		s = (c - a - 1) * (d - b);
		System.out.printf("%d\n",s);
	}


}

