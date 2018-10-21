package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[300];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] b = new int[300];
		int j;
		int p = 0;
		for (i = 0;i < n;)
		{
			if (i == 0)
			{
				b[p] = a[i];
				p++;
				i++;
			}
			else
			{
				for (j = 0;j < i;j++)
				{

				   if (a[i] == a[j])
				   {
					   if (i < n - 1)
					   {
						   i++;
						   j = 0;
					   }
					   else
					   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						   goto stop;
					   }
				   }
				}
			b[p] = a[i];
			p++;
			i++;
			}

		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	stop:
	p = p - 1;
		for (i = 0;i < p;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[i]);


	}
}

