package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char a;
		int[] length = new int[500];
		int i;
		int j = 0;
		int sign = 0;
		 for (i = 0;;i++)
		 {
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}
			if (a != ' ' && a != '\n')
			{
				length[j]++;
			}
			else if (a == ' ')
			{
				j++;
			}
			else
			{
				break;
			}
		 }
		for (i = 0;i <= 499;i++)
		{
			if (length[i] != 0)
			{
				if (sign == 0)
				{
					System.out.printf("%d",length[i]);
					sign = 1;
				}
				else
				{
					System.out.printf(",%d",length[i]);
				}
			}
		}
	}
}

