package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		char[][] zfc = new char[300][20];
		int[] sum = new int[300];

		str = new Scanner(System.in).nextLine();

		int i;
		int k;
		int l;
		int m;
		int j = 0;
		int n = 0;



		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ')
			{
			   str = tangible.StringFunctions.changeCharacter(str, i, '\0');
			   zfc[n] = (str.Substring(j));
			   n++;
			   j = i + 1;
			}
		}
		zfc[n] = (str.Substring(j));
		n++;

		for (k = 0;k < n;k++)
		{
			sum[k] = String.valueOf(zfc[k]).length();
		}

		System.out.printf("%d",sum[0]);

		for (k = 1;k < n;k++)
		{
			if (sum[k] != 0)
			{
			System.out.printf(",%d",sum[k]);
			}
		}
		return 0;
	}





}

