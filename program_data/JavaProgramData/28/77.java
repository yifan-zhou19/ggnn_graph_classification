package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		int count = 0;
		int i = 0;
		int[] a = new int[301];
		int j;
		for (j = 0;j < 301;j++)
		{
			a[j] = 0;
		}
		do
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tempVar.charAt(0);
			}
		if (c != ' ')
		{
			if (count == 0)

			{
				count = 1;
				a[i]++;
			}
					   if (count == 1)
					   {
						  a[i]++;
					   }
		}
			else if (c == ' ')
			{
				if (count == 1)
				{
					count = 0;
					i++;
				}
			}
		}while (c != '\n');
				for (j = 0;j < i;j++)
				{
				 System.out.printf("%d,",a[j] - 1);
				}
				System.out.printf("%d",a[i] - 2);
	}



}

