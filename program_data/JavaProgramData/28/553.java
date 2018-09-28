package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[NUM * LEN]);
		String z1 = new String(new char[100]);
		String z2 = new String(new char[100]);
		char[][] c = new char[NUM][LEN];
		int i;
		int j;
		int k;
		int n;
		int p;
		int count;
		int count1;
		int count2;
		int count4;
		int[] count3 = new int[50];
		int num1;
		int num2;
		int d = 0;
		zfc = new Scanner(System.in).nextLine();
		count = 0;
		for (k = 0;;)
		{
				if (zfc.charAt(count) != ' ' && zfc.charAt(count) != 0)
				{
					c[0][k] = zfc.charAt(count);
					count++;
					k++;
				}
				else
				{
					c[0][k] = 0;
					count++;
					k++;
					break;
				}
		}
			if (k - 1 != 0)
			{
				System.out.printf("%d",k - 1);
			}
		for (i = 1;;i++)
		{
			for (k = 0;;)
			{
				if (zfc.charAt(count) != ' ' && zfc.charAt(count) != 0)
				{
					c[i][k] = zfc.charAt(count);
					count++;
					k++;
				}
				else
				{
					c[i][k] = 0;
					count++;
					k++;
					break;
				}
			}
			if (k - 1 != 0)
			{
				System.out.printf(",%d",k - 1);
			}
			if (zfc.charAt(count - 1) == 0)
			{
				break;
			}
		}
	   return 0;
	}


}
