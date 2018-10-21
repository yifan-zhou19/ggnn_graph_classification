package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		int[] month = new int[12];
		int n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		w = w + 12;
		if ((w) % 7 == 5)
		{
			month[i] = 1;
		i++;
		}
		w = w + 3;
		if (w % 7 == 5)
		{
			month[i] = 2;
		i++;
		month[i] = 3;
		i++;
		}
		w = w + 3;
		if (w % 7 == 5)
		{
			month[i] = 4;
		i++;
		}
		w = w + 2;
		if (w % 7 == 5)
		{
			month[i] = 5;
		i++;
		}
		w = w + 3;
		if (w % 7 == 5)
		{
			month[i] = 6;
		i++;
		}
		w = w + 2;
		if (w % 7 == 5)
		{
			month[i] = 7;
		i++;
		}
		w = w + 3;
		if (w % 7 == 5)
		{
			month[i] = 8;
		i++;
		}
		w = w + 3;
		if (w % 7 == 5)
		{
			month[i] = 9;
		i++;
		}
		w = w + 2;
		if (w % 7 == 5)
		{
			month[i] = 10;
		i++;
		}
		w = w + 3;
		if (w % 7 == 5)
		{
			month[i] = 11;
		i++;
		}
		w = w + 2;
		if (w % 7 == 5)
		{
			month[i] = 12;
		i++;
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",month[i]);
		}
	}


}

