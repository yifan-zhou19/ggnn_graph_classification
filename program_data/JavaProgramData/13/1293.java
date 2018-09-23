package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] number = new int[NUMBER];
		int i;
		i = 0;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		i = 1;
		int j = 0;
		System.out.printf("%d", number[0]);
		while (i < n)
		{
			while (j < i)
			{
			   if (number[i] == number[j])
			   {
					break;
			   }
			   else
			   {
				   j++;
			   }
			   if (j == i)
			   {
				   System.out.printf(" %d", number[i]);
			   }
			}
			j = 0;
			i++;
		}
		return 0;
	}
}

