package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10000];
		int i;
		int j;
		int[] b = new int[10000];
		int s;
		int t;
		int[] n = new int[10000];
		int max = 0;
		String c = new String(new char[10000]);
		String d = new String(new char[10000]);
		for (i = 0; ;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
			}
			s = i + 1;
			if (c.charAt(i) != ',')
			{
				break;
			}
		}
		for (i = 0; ;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, tempVar4);
			}
			t = i + 1;
			if (d.charAt(i) != ',')
			{
				break;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			n[i] = 0;
			for (j = 0;j < s;j++)
			{
				if (a[j] <= i != 0 && b[j] >= i + 1)
				{
					n[i] = n[i] + 1;
				}
			}
		}
		for (i = 0;i < 1000;i++)
		{
		   if (max < n[i])
		   {
			 max = n[i];
		   }
		}
		System.out.printf("%d %d",s,max);
	}


}

