package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int t;
		int x;
		int i;
		int[] age = new int[100];
		String c = new String(new char[10]);
		char[][] num = new char[100][10];
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
				num[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (age[i] >= 60)
			{

				for (x = i;x > 0;x--)
				{
					   if (age[x] > age[x - 1])
					   {
						   t = age[x];
						   age[x] = age[x - 1];
						   age[x - 1] = t;
						  c = num[x];
						  num[x] = num[x - 1];
						  num[x - 1] = c;
					   }
				}
			}
		}





		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",num[i]);
		}
	}
}

