package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int k;
		int tot;
		int s;
		a = 0;
		int[] num = new int[20];
		while (a != -1)
		{
		j = 1;
		tot = 1;
		s = 0;
		for (i = 1;i <= 20;i++)
		{
			num[i] = 0;
		}
		i = 1;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != -1)
		{
			if (a != 0)
			{
				num[i++] = a;
				tot++;
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			else
			{
				break;
			}
		}
	   if (a != -1)
	   {
		   for (j = 1;j <= tot;j++)
		   {
			 for (k = j + 1;k <= tot;k++)
			 {
			   if ((num[k] == 2 * num[j]) || (2 * num[k] == num[j]))
			   {
				s++;
			   }
			 }
		   }
			   System.out.print(s);
			   System.out.print("\n");
	   }
		}
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  return 0;

	}

}

