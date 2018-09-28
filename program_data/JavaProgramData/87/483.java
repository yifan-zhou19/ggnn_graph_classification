package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int i;
		int k;
		int[] s = new int[1000];
		k = 0;

		for (i = 0; i < 1000; i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		if (a == 0)
		{
		break;
		}
		s[i] = 3600 - b * 60 - c + (d + 11 - a) * 3600 + e * 60 + f;
		k++;
		}

	   for (i = 0; i < k; i++)
	   {
		   System.out.printf("%d\n",s[i]);
	   }
			return 0;
	}


}

