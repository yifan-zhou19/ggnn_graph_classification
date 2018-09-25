package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[1001];
		int[] y = new int[1001];
		int i;
		int j;
		int min = 2000;
		int max = 0;
		int m = 0;
		String s = new String(new char[1100]);
		int[] t = new int[1100];

		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, tempVar2);
			}
			if (s.charAt(i) == '\n')
			{
				n = i + 1;
				break;
			}
		}
		for (i = 0;;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, tempVar4);
			}
			if (s.charAt(i) == '\n')
			{
				//n=i+1;
				break;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (x[i] < min)
			{
				min = x[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (y[i] > max)
			{
				max = y[i];
			}
		}

		for (i = min;i < max;i++)
		{
			  for (j = 0;j < n;j++)
			  {
				  if (x[j] <= i != 0 && y[j]> i)
				  {
					  t[i]++;
				  }
			  }
		}

		for (i = min;i < max;i++)
		{
			if (t[i] > m)
			{
				m = t[i];
			}
		}

		System.out.printf("%d %d",n,m);



		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			n = Integer.parseInt(tempVar5);
		}
		return 0;
	}

}

