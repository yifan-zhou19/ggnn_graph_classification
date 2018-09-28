package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int flag = 0;
		int counter = 0;
		int[] a = new int[300];
		int i = 0;
		int j;
		int t;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		i++;
		counter++;
		while ((c = System.in.read()) == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		 if (a[i] != a[0])
		 {
			 flag = 1;
		 }
			i++;
			counter++;
		}
		if (counter == 1 || flag == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 0;j < counter - 1;j++)
			{
				for (i = 0;i < counter - 1 - j;i++)
				{
					if (a[i] > a[i + 1])
					{
						t = a[i];
						a[i] = a[i + 1];
						a[i + 1] = t;
					}
				}
			}
			for (j = counter - 2;j >= 0;j--)
			{
				if (a[j] < a[counter - 1])
				{
					System.out.printf("%d",a[j]);
					break;
				}
			}
		}
	}

}

