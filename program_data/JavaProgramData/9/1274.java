package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int n;
		int j = 0;
		int i;
		int num = 0;
		int t;
		char[][] a = new char[100][10]; //a???????d?a???
		char[][] d = new char[100][10];
		String temp = new String(new char[10]);
		int[] b = new int[100]; //b???????c?b???
		int[] c = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 60)
			{
				c[j] = b[i];
				d[j] = a[i];
				j++;
				num = j; //???????65????????c?????????
			}
		}
		for (i = 1;i < num;i++)
		{
		for (j = 0;j < num - i;j++)
		{
			if (c[j] < c[j + 1])
			{
				t = c[j + 1];
				c[j + 1] = c[j];
				c[j] = t;
				temp = d[j + 1];
				d[j + 1] = d[j];
				d[j] = temp; //?????65???????????????
			}
		}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] < 60)
			{
				c[num] = b[i];
				d[num] = a[i];
				num++; //???65????c?????????
			}
		}
		for (j = 0;j < n;j++)
		{
			System.out.printf("%s\n",d[j]); //???????
		}

	}


}

