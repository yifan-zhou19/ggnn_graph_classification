package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int hang;
		int lie;
		int h;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int j;
		int[] a = new int[10000];
		int place;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				hang = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				lie = Integer.parseInt(tempVar3);
			}
			p = a;
			for (j = 1;j <= hang;j++)
			{
				for (h = 1;h <= lie;h++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						*(p++) = tempVar4;
					}
				}

			}
			for (place = 0;place <= lie-1;place++)
			{
				p = a + place;
				sum += *p;
			}
			for (place = 2 * lie-1;place < hang * lie-1;place += lie)
			{
				p = a + place;
				sum += *p;
			}
			for (place = hang * lie-1;place > hang * lie - lie;place--)
			{
				p = a + place;
				sum += *p;
			}
			for (place = lie;place <= hang * lie - lie;place += lie)
			{
				p = a + place;
				sum += *p;
			}

			System.out.printf("%d\n",sum);
		}
	}
}

