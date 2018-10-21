package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static char[][] word = new char[1000][40];
	public static char[][] nstr = new char[100][100];
	public static String result = new String(new char[100]);
	public static int[] number = new int[300];
	public static int Main()
	{


			int i = 0;
			int j = 0;
			int k = 0;
			int flag = 0;
			int n = 0;
			int num = 0;
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
				word[i] = tempVar2.charAt(0);
			}
			//printf("%s\n",word[i]);
			number[i] = String.valueOf(word[i]).length();

			//printf("%d\n",number[i]);


		}
		i = 0;
		j = 0;

		while (i < n - 1)
		{
			while (((num + number[i] + j) <= 80) && (flag == 0))
			{

				if ((num + number[i] + number[i + 1] + j) >= 80)
				{
					System.out.printf("%s",word[i]);
				}
				else
				{
					System.out.printf("%s ",word[i]);
				}
				num += number[i];
				i++;
				j++;
				if (i == n - 1)
				{
					flag = 1;
				}
			}
			if (i == n - 1)
			{
				System.out.printf("%s\n",word[i]);
			}
			else
			{
				System.out.print("\n");
			}
			j = 0;
			num = 0;
		}

			return 0;
	}

}

