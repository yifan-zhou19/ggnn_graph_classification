package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int counter = 0;
		int i = 0;
		int j;
		int t;
		int[] a = new int[300];
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			i++;
			counter++;
		}while (System.in.read() != '\n');
		if (counter == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < counter;i++)
			{
				 for (j = i + 1;j < counter;j++)
				 {
					 if (a[j] > a[i])
					 {
						t = a[i];
						a[i] = a[j];
						a[j] = t;
					 }
				 }
			}
			if (a[counter - 1] == a[0])
			{
				System.out.print("No\n");
			}
			else
			{
			for (i = 1;i < counter;i++)
			{
				if (a[i] != a[0])
				{
					 System.out.printf("%d\n",a[i]);
					break;
				}
			}
			}
		}
	}
}

